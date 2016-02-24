package com;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/17/16.
 */
public class EaslyAbuseTreeSetWithMutableObjects {


    public static void main(String[] args) {

        Set<IamMutable> iamMutableSet = new TreeSet<>();

        iamMutableSet.add(new IamMutable("1"));
        iamMutableSet.add(new IamMutable("2"));
        iamMutableSet.add(new IamMutable("3"));

        //this item should not be saved it duplicated and already existing element !
        iamMutableSet.add(new IamMutable("3"));
        System.out.println(iamMutableSet.size());

        Iterator<IamMutable> iamMutableIterator = iamMutableSet.iterator();

        iamMutableSet.iterator().forEachRemaining(new Consumer<IamMutable>() {
            @Override
            public void accept(IamMutable iamMutable) {
                iamMutable.setSomeProperty("1");
            }
        });
        iamMutableSet.iterator().forEachRemaining(new Consumer<IamMutable>() {
            @Override
            public void accept(IamMutable iamMutable) {

                System.out.println(iamMutable);
            }

        });
        System.out.println("How come there are duplicate elements in a set ?!!!!!!");


    }

    static class IamMutable implements Comparable<IamMutable> {

        private String someProperty;

        public IamMutable(String someProperty) {
            this.someProperty = someProperty;
        }

        public void setSomeProperty(String someProperty) {
            this.someProperty = someProperty;
        }

        public String getSomeProperty() {
            return someProperty;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof IamMutable)) return false;
            IamMutable that = (IamMutable) o;
            return !(someProperty != null ? !someProperty.equals(that.someProperty) : that.someProperty != null);
        }

        @Override
        public int hashCode() {
            return someProperty != null ? someProperty.hashCode() : 0;
        }

        @Override
        public int compareTo(IamMutable o) {
            if (o != null && o.getSomeProperty() != null) {
                return someProperty.compareTo(o.getSomeProperty());
            }
            return -1;
        }

        @Override
        public String toString() {
            return "IamMutable{" +
                    "someProperty='" + someProperty + '\'' +
                    '}';
        }
    }
}
