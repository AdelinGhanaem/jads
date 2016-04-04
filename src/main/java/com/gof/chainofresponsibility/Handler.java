package com.gof.chainofresponsibility;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public interface Handler {


    Response handle(Request request);

}
