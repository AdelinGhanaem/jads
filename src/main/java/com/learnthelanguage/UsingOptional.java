package com.learnthelanguage;

import java.util.Optional;

/**
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 12/15/15.
 */
public class UsingOptional {

    public static void main(String[] args) {
        OrderService orderService = null;
        Order order = orderService.get("someId").orElseThrow(OrderNotFoundException::new);
        if(order != null){
            //TODO: implement some logic here ...
        }
    }

    private static class OrderNotFoundException extends RuntimeException {


    }
}


interface OrderService {
    Optional<Order> get(String id);
}


class Order {
    String id;
}
