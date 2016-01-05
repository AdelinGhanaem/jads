package com.concurrency;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/4/16.
 */
class ImageInfo {

    public ImageData downloadImage(int millis, String whatToPrint) {


        try {
            System.out.println(whatToPrint);
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ImageData();
    }
}
