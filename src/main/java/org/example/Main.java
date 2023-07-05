package org.example;

import org.example.myList.MyList;
import org.example.myList.StringList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList stringArr = new StringList();
        System.out.println("1) add + size");
        String a = stringArr.add("Hello");
        String b = stringArr.add("World");
        String c = stringArr.add("How are you?");
        System.out.println(stringArr);
        System.out.println("Check size: " + stringArr.size());

        System.out.println("2) add with index");
        stringArr.add(1, "asd");
        System.out.println(stringArr);

        stringArr.add(1, "asds");
        System.out.println(stringArr);

        System.out.println("3) set");
        stringArr.set(1, "ddsa");
        System.out.println(stringArr);

        System.out.println("4) remove by item");
        stringArr.remove("How are you?");
        System.out.println(stringArr);

        System.out.println("5) remove by index");
        stringArr.remove(1);
        System.out.println(stringArr);

        System.out.println("6) contains");
        System.out.println(stringArr.contains("Hello"));
        System.out.println(stringArr.contains("zxc"));

        System.out.println("7) indexOf element");
        System.out.println(stringArr.indexOf("asd"));

        System.out.println("8) lastIndexOf element");
        System.out.println(stringArr.lastIndexOf("asd"));

        System.out.println("9) get");
        System.out.println(stringArr.get(0));
        System.out.println(stringArr.get(1));
        System.out.println(stringArr.get(2));

        System.out.println("10) equals");

        MyList stringArrTest = new StringList();
        stringArrTest.add("Hello");
        stringArrTest.add("asd");
        stringArrTest.add("World");

        MyList stringArr2 = new StringList();

        System.out.println(stringArr.equals(stringArrTest));
        System.out.println(stringArr2.equals(stringArr));
//        System.out.println(stringArr.equals(null));

        System.out.println("11) isEmpty");
        System.out.println(stringArr.isEmpty());
        System.out.println(stringArr2.isEmpty());

        System.out.println("12) toArray");
        String[] arrTest = stringArr.toArray();
        System.out.println(Arrays.toString(arrTest));

        System.out.println("13) clear");
        stringArr.clear();
        System.out.println(stringArr);
    }
}