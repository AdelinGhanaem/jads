package com;

import java.util.List;
import java.util.Scanner;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 11/11/15.
 */
public class Main {

    private static boolean flag = false;
    private static int B = 0;
    private static int H = 0;

//    static {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            B = scanner.nextInt();
//            scanner.nextLine();
//            H = scanner.nextInt();
//            if (H < 0 || B < 0 || H < -100 || H > 100 || B < -100 || B > 100) {
//                System.out.println("java.lang.Exception: Breadth and height must be positive");
//            } else {
//                flag = true;
//            }
//
//        } catch (Exception e) {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//
//        }
//
//    }

    public static void main(String arg[]) {
//                           "".sub
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // out instance is no more used and should be garbage collected !!!
        // However this will not happen as inner instance is still alive i.e used, not null !
        // and outer will be kept in memory until inner is destroyed
        outer = null;

        //
//        inner = null;

        //kick out garbage collector
        System.gc();

    }
}
