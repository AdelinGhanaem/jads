package com.playwithheadandjvmgc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/4/16.
 */
public class Main {


    public static void main(String[] strings) {


        Executor executor = Executors.newFixedThreadPool(1);

        executor.execute(() -> {
            List<String> list = new ArrayList<String>();

            while (true) {
                try {
                    Thread.sleep(50);

                    String s = "In computer programming, SOLID (single responsibility, open-closed, Liskov substitution," +
                            " interface segregation and dependency inversion) is a mnemonic acronym introduced by Michael " +
                            "Feathers for the \"first five principles\" named by Robert C. Martin[1][2] in the early 2000s[3] " +
                            "that stands for five basic principles of object-oriented programming and design.";
                    list.add(s);
                   System.out.print("###");
                } catch (OutOfMemoryError error) {
                    System.out.println(error);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


    }


}
