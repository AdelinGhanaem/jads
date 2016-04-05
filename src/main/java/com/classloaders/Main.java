package com.classloaders;

import com.typeofreferences.Employee;
import com.typeofreferences.EmployeeVal;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 4/4/16.
 */
public class Main {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

//        HashMap<Employee, EmployeeVal> aMap = new
//                HashMap<Employee, EmployeeVal>();
//
//        Employee emp = new Employee("Vinoth");
//        EmployeeVal val = new EmployeeVal("Programmer");
//
//        aMap.put(emp, val);
//
//        emp = null;
//
//        System.gc();
//        System.out.println("Size of Map " + aMap.size());



//
//        WeakHashMap<Employee, EmployeeVal> aMap =
//                new WeakHashMap<>();
//
//        Employee emp = new Employee("Vinoth");
//        EmployeeVal val = new EmployeeVal("Programmer");
//
//        aMap.put(emp, val);
//
//        emp = null;
//
//        System.gc();
//        int count = 0;
//        while (0 != aMap.size()) {
//            ++count;
//            System.gc();
//        }
//
//        System.out.println("Took " + count
//                + " calls to System.gc() to result in weakHashMap size of : "
//                + aMap.size());


//        HashMap<Employee, EmployeeVal> map =
//                new HashMap<Employee, EmployeeVal>();
//        WeakReference<HashMap<Employee, EmployeeVal>> aMap =
//                new WeakReference<HashMap<Employee, EmployeeVal>>(
//                        map);
//
//        map = null;
//
//        while (null != aMap.get()) {
//            aMap.get().put(new Employee("Vinoth"),
//                    new EmployeeVal("Programmer"));
//            System.out.println("Size of aMap " + aMap.get().size());
//            System.gc();
//        }
//        System.out.println("Its garbage collected");

        try {


            List<GarbageCollectorMXBean> gcMxBeans = ManagementFactory.getGarbageCollectorMXBeans();

            for (GarbageCollectorMXBean gcMxBean : gcMxBeans) {
                System.out.println(gcMxBean.getName());
                System.out.println(gcMxBean.getObjectName());
            }

        } catch (RuntimeException re) {
            throw re;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        }

    }


}
