package com.concurrency;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 1/4/16.
 */
public class FutureRenderer {

    private ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        FutureRenderer futureRenderer = new FutureRenderer();
        futureRenderer.render("Adelin4u! ");
    }


    private void render(CharSequence charSequence) {


        final List<ImageInfo> imageInfos = scanFromImageInfo(charSequence);


        Callable<List<ImageData>> listCallable = new Callable<List<ImageData>>() {
            @Override
            public List<ImageData> call() throws Exception {
                List<ImageData> result
                        = new ArrayList<ImageData>();
                for (ImageInfo imageInfo : imageInfos) {
                    result.add(imageInfo.downloadImage(1000, "Downloading image data .... "));
                }
                return result;
            }
        };

        //here we submit the task to start running but in a different thread.
        Future<List<ImageData>> listFuture = executor.submit(listCallable);


        //
        renderText(charSequence);

        try {
            List<ImageData> imageDatas = listFuture.get();
            for (ImageData imageData : imageDatas) {
                imageData.printImage();
            }
        } catch (InterruptedException e) {
            //What da hell ?!
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        if(!listFuture.isCancelled()){
            listFuture.cancel(false);
        }

        executor.shutdown();

    }


    private List<ImageInfo> scanFromImageInfo(CharSequence charSequence) {
        return new ArrayList<ImageInfo>() {{
            add(new ImageInfo());
            add(new ImageInfo());
            add(new ImageInfo());
        }};
    }


    private void renderText(CharSequence charSequence) {
        System.out.println("Text is being rendered ! ");
    }
}
