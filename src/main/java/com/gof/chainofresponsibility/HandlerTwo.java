package com.gof.chainofresponsibility;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class HandlerTwo implements Handler {


    private Handler handler;


    @Override
    public Response handle(Request request) {

        if (caHandler()) {
            System.out.println(request);
            return new Response();
        } else {
            return handler.handle(request);
        }
    }

    private boolean caHandler() {
        return false;
    }
}
