package dev.jz;

import java.util.function.BiConsumer;

public class ExceptionHandleExample {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int key = 0;

        process(a,key,(v,k)->System.out.println(v/k));
    }

    private static void process(int[] a, int key, BiConsumer<Integer,Integer> consumer) {
        for (int i = 0; i < a.length; i++) {
            consumer.accept(i,key);
        }
    }


}
