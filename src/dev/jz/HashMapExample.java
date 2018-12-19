package dev.jz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        int hash = new Object().hashCode();
        System.out.println(String.format("%x",hash));
        int a = hash>>16;
        System.out.println(String.format("%x",a));

        int b = hash ^ a;
        System.out.println(String.format("%x",b));

        Map c = new HashMap();

        List d = new ArrayList();
    }
}
