package com;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/16/16.
 */
public final class User implements Cloneable {


    private String name;
    private boolean isActive;
    private String userId;
    private Address address;


    // can be constructed using this constructor ONLY !
    public User(String name, boolean isActive, String userId, Address address) {
        this.name = name;
        this.isActive = isActive;
        this.userId = userId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getUserId() {
        return userId;
    }

    public Address getAddress() {
        return address;
    }

    protected Object cloneMe() throws CloneNotSupportedException {
        return super.clone();
    }
}
