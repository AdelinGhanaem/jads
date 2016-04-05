package com.typeofreferences;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/4/16.
 */
public class Employee {

    private String vinoth;

    public Employee(String vinoth) {

        this.vinoth = vinoth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return !(vinoth != null ? !vinoth.equals(employee.vinoth) : employee.vinoth != null);

    }

    @Override
    public int hashCode() {
        return vinoth != null ? vinoth.hashCode() : 0;
    }
}
