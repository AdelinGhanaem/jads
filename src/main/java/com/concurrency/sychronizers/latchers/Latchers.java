package com.concurrency.sychronizers.latchers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/24/15.
 */
public class Latchers {


    private List<BaseHealthChecker> checkerList = new ArrayList<>();

    private CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) {


    }



}
