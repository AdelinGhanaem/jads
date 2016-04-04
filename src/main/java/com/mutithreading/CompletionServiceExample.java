package com.mutithreading;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/4/16.
 */
public class CompletionServiceExample {

    private ExecutorService executorService = Executors.newFixedThreadPool(10);
    private CompletionService<ImageData> completionService = new ExecutorCompletionService<ImageData>(executorService);


    public static void main(String[] args) {
        CompletionServiceExample completionServiceExample = new CompletionServiceExample();
        try {
            completionServiceExample.render();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void render() throws Exception {


        List<ImageInfo> info = new ArrayList<>();
        info.add(new ImageInfo());
        info.add(new ImageInfo());
        info.add(new ImageInfo());
        info.add(new ThrowsException());
        info.add(new TakesLongTime());

        final int[] counter = {0};
        for (ImageInfo imageInfo : info) { //submit all task
            completionService.submit(new Callable<ImageData>() {
                @Override
                public ImageData call() throws Exception {
                    return imageInfo.downloadImage(1000, "Downloading image data .... " + counter[0]++);
                }
            });
        }


        for (int t = 0, n = info.size(); t < n; t++) {
            try {
                Future<ImageData> f = completionService.take();
                ImageData imageData = f.get();
                renderImage(imageData);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        executorService.shutdown();
    }


    private Exception launderThrowable(Throwable cause) throws ExecutionException {
        return null;
    }

    private void renderImage(ImageData imageData) {
        System.out.println("Image render ... ");
    }


    class ThrowsException extends ImageInfo {
        @Override
        public ImageData downloadImage(int millis, String whatToPrint) {
            throw new IllegalArgumentException();
        }
    }

    class TakesLongTime extends ImageInfo {
        @Override
        public ImageData downloadImage(int millis, String whatToPrint) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return super.downloadImage(millis, whatToPrint);
        }
    }


}
