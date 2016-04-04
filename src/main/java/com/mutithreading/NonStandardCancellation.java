package com.mutithreading;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/19/16.
 */
public class NonStandardCancellation {


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket =new ServerSocket();

        Socket socket = new Socket();
        socket.bind(new InetSocketAddress(5012));

        Socket socket1 = new Socket("127.0.0.1",5012);

        socket.connect(new InetSocketAddress(5012));


        ThreadWriter threadWriter = new ThreadWriter(socket1);
        threadWriter.start();

        ThreadReader threadReader = new ThreadReader(socket);
        threadReader.start();
    }

    static class ThreadWriter extends Thread {
        private Socket socket;

        public ThreadWriter(Socket socket) {
            this.socket = socket;
        }


        @Override
        public void run() {

            OutputStream outputStream = null;
            try {
                outputStream = socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (true) {
                try {
                    Thread.sleep(1000);
                    outputStream.write("Hello".getBytes());
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted !");
                } catch (IOException e) {
                    System.out.println(Thread.currentThread().getName() + " socket was closed ! ");
                }
            }
        }
    }

    static class ThreadReader extends Thread {


        private Socket socket;

        public ThreadReader(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream inputStream = socket.getInputStream();
                byte[] bytes = new byte[64];
                while (inputStream.read(bytes) != -1) {
                    System.out.println(bytes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void interrupt() {
            try {
                socket.close();
            } catch (IOException exceptino) {

            } finally {
                super.interrupt();
            }
        }
    }

}
