package com.distributed.systems.num4;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPEmailClient {
    private static InetAddress host;
    private static final int PORT = 1234;
    private static String name;
    private static Scanner networkInput, userEntry;
    private static PrintWriter networkOutput;

    public static void main(String[] args) throws IOException {
        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException uhEx) {
            System.out.println("Host ID not found!");
            System.exit(1);
        }

        userEntry = new Scanner(System.in);

        do {
            System.out.print("\nEnter name ('Dave' or 'Karen'): ");
            name = userEntry.nextLine();
        } while (!name.equals("Dave") && !name.equals("Karen"));

        talkToServer();
    }


    private static void talkToServer() throws IOException {
        Socket socket = new Socket(host, PORT);
        networkOutput = new PrintWriter(socket.getOutputStream(),true);
        networkInput = new Scanner(socket.getInputStream());
        new Thread(() -> {
            while (true) {
                while (networkInput.hasNext()) {
                    System.out.println(networkInput.nextLine());
                }
            }
        }).start();
        while (true) {
            System.out.println("Enter read or write command ?");
            String command = userEntry.nextLine();
            if ("read".equals(command))
                doRead();
            else if ("write".equals(command))
                doSend();
            else
                System.out.println("Invalid command '" + command + "' Enter command 'read' or 'write' :");
        }

    }


    private static void doSend() {
        System.out.println("\nEnter 1-line message: ");
        String message = userEntry.nextLine();
        networkOutput.println(name);
        networkOutput.println("send");
        networkOutput.println(message);
        networkOutput.flush();
    }


    private static void doRead() {
        System.out.println("\nSending a print command  ");
        networkOutput.println(name);
        networkOutput.println("read");

    }
}