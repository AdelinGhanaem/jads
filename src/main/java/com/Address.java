package com;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/16/16.
 */
public class Address {

    private  int number;
    private  String address;

    public Address(int number, String address) {
        this.number = number;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
