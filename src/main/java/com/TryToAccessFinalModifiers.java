package com;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * Created by adelin.ghanayem@cayetanogaming.com on 2/8/16.
 */
public class TryToAccessFinalModifiers {


    private final String string = "asdasd";


    public static void main(String[] args) {
        TryToAccessFinalModifiers tryToAccessFinalModifiers = cloneObject(new TryToAccessFinalModifiers());
        System.out.println(tryToAccessFinalModifiers);
        assert tryToAccessFinalModifiers !=null;
        assert tryToAccessFinalModifiers.equals(new TryToAccessFinalModifiers());
    }

    private static <T> T cloneObject(T obj) {
        try {
            Object clone = obj.getClass().newInstance();
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.get(obj) == null || Modifier.isFinal(field.getModifiers())) {
                    continue;
                }
                if (field.getType().isPrimitive() || field.getType().equals(String.class)
                        || field.getType().getSuperclass().equals(Number.class)
                        || field.getType().equals(Boolean.class)) {
                    field.set(clone, field.get(obj));
                } else {
                    Object childObj = field.get(obj);
                    if (childObj == obj) {
                        field.set(clone, clone);
                    } else {
                        field.set(clone, cloneObject(field.get(obj)));
                    }
                }
            }
            return (T) clone;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




    private static<T,F> void copy(T clone, F obj){
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.get(obj) == null || Modifier.isFinal(field.getModifiers())) {
                    continue;
                }
                if (field.getType().isPrimitive() || field.getType().equals(String.class)
                        || field.getType().getSuperclass().equals(Number.class)
                        || field.getType().equals(Boolean.class)) {
                    field.set(clone, field.get(obj));
                } else {
                    Object childObj = field.get(obj);
                    if (childObj == obj) {
                        field.set(clone, clone);
                    } else {
                        field.set(clone, cloneObject(field.get(obj)));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TryToAccessFinalModifiers)) return false;

        TryToAccessFinalModifiers that = (TryToAccessFinalModifiers) o;

        return !(string != null ? !string.equals(that.string) : that.string != null);

    }

    @Override
    public int hashCode() {
        return string != null ? string.hashCode() : 0;
    }
}
