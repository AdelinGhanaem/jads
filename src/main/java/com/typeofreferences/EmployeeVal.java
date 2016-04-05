package com.typeofreferences;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/4/16.
 */
public class EmployeeVal {
    private String programmer;

    public EmployeeVal(String programmer) {

        this.programmer = programmer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeVal that = (EmployeeVal) o;

        return !(programmer != null ? !programmer.equals(that.programmer) : that.programmer != null);

    }

    @Override
    public int hashCode() {
        return programmer != null ? programmer.hashCode() : 0;
    }
}
