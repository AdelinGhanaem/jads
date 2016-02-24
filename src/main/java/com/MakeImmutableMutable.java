package com;

import java.lang.reflect.Field;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/17/16.
 */
public class MakeImmutableMutable {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        Player player = new Player("Adelin", 18);

        //Consider this method can be executed from different thread !
        justChangeIt(player);

        System.out.println(player);
    }

    private static void justChangeIt(Player player) throws NoSuchFieldException, IllegalAccessException {
        Field  field = player.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(player,"asd");
    }
}
