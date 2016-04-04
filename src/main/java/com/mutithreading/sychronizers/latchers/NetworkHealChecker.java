package com.mutithreading.sychronizers.latchers;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/24/15.
 */
public class NetworkHealChecker extends BaseHealthChecker {
    @Override
    void doSomething() {

        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.getServiceName() + " is Up");
    }


}
