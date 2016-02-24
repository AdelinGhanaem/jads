package com.concurrency.taskcancelation;

import com.problems.ThreadLocalExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/7/16.
 */
public class ProducerConsumerExample<T> {


    private static final int MAX_BUFFER_SIZE = 10;

    public static void main(String[] args) {

        final ProducerConsumerExample<String> buffer = new ProducerConsumerExample<>();


        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (buffer.hasSomethingToConsume()) {
                    System.out.println("Hey there is some objects to be consumed ;) : ");
                    System.out.println("and we print:" + buffer.consume());
                }
                System.out.println("Ops turns out there is nothing to be consumed so we wait :( ! ");
                notifyAll();
                try {
                    wait(); //wait untill something is produced !
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread producedThread = new Thread(new Runnable() {
            @Override
            public void run() {
                if (!buffer.isFull()) {
                    buffer.produce("This is produced by:" + Thread.currentThread().getName());
                    notifyAll();
                } else {
                    try {
                        wait();// wait until something is consumed and there is some free space !
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
    }


    private Queue<T> queue = new LinkedList<>();


    public synchronized T consume() {
        return queue.poll();
    }

    public synchronized void produce(T t) {
        queue.add(t);
    }

    public synchronized boolean hasSomethingToConsume() {
        return !queue.isEmpty();
    }

    public synchronized boolean isFull() {
        return queue.size() == MAX_BUFFER_SIZE;
    }


}
