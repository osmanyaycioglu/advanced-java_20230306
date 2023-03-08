package org.training.advanced.java.generics.usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsageRunner {
    public static void main(String[] args) {
        List<String> sL = Arrays.asList("osman",
                                        "mehmet",
                                        "ali");

        List<Object> oL = Arrays.asList("osman",
                                        "ayşe");

        List<A> aL = new ArrayList<>();
        aL.add(new A());
        aL.add(new A());
        aL.add(new B());
        aL.add(new C());


        List<B> bL = new ArrayList<>();
        bL.add(new B());
        bL.add(new B());
        bL.add(new B());
        bL.add(new C());

        List<C> cL = new ArrayList<>();
        cL.add(new C());
        cL.add(new C());
        cL.add(new C());
        cL.add(new C());
        cL.add(new C());

        // show1(aL); not okay
        // show1(bL); not okay
        // show1(sL); not okay
        show1(oL);
        // ---------------
        show2(aL);
        show2(bL);
        show2(cL);
        show2(sL);
        show2(oL);
        // ----
//        show3(bL); not okay
//        show3(cL); not okay
//        show3(oL); not okay
//        show3(sL); not okay
        show3(aL);

        show4(bL);
        // show4(aL); not okay

        show5(aL);
        show5(bL);
        show5(cL);
        // show5(oL); // not okay
        // show5(sL); // okay

        show6(aL);
        show6(bL);
        show6(cL);
        show6(oL);
        // show6(sL); // okay

        show7(aL);
        // show7(bL); // not okay
        // show7(cL); // not okay
        show7(oL);
        // show6(sL); // okay

        show8(aL);
        show8(bL);
        // show8(cL); // not okay
        show8(oL);
        // show8(sL); // okay

    }

    public static void show8(List<? super B> objectsParam) {
        for (Object object : objectsParam) {
            System.out.println(object);
        }
        // objectsParam.add(new A()); // not okay
        // objectsParam.add(new Object()); // not okay
        objectsParam.add(new B());
        objectsParam.add(new C());

    }

    public static void show7(List<? super A> objectsParam) {
        for (Object object : objectsParam) {
            System.out.println(object);
        }
        objectsParam.add(new A());
        // objectsParam.add(new Object()); // not okay
        objectsParam.add(new B());
        objectsParam.add(new C());

    }

    public static void show6(List<? super C> objectsParam) {
        for (Object object : objectsParam) {
            System.out.println(object);
        }
        // objectsParam.add(new A()); // not okay
        // objectsParam.add(new Object()); // not okay
        // objectsParam.add(new B()); // not okay
        objectsParam.add(new C());

    }


    public static void show5(List<? extends A> objectsParam) {
        for (A object : objectsParam) {
            System.out.println(object);
        }
        A a = objectsParam.get(0);

//        objectsParam.add(new A()); not okay
//        objectsParam.add(new Object()); not okay
//        objectsParam.add(new B()); not okay
//        objectsParam.add(new C()); not okay

    }


    public static void show4(List<B> objectsParam) {
        for (B object : objectsParam) {
            System.out.println(object);
        }
    }


    public static void show3(List<A> objectsParam) {
        for (A object : objectsParam) {
            System.out.println(object);
        }
    }

    public static void show1(List<Object> objectsParam) {
        for (Object object : objectsParam) {
            System.out.println(object);
        }
    }

    public static void show2(List<?> objectsParam) {
        for (Object object : objectsParam) {
            System.out.println(object);
        }
    }


}
