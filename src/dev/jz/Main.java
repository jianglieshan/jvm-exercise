package dev.jz;

import sun.jvm.hotspot.debugger.cdbg.FunctionType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public void greeting(Function<Integer,String> a,int b){
        a.apply(b);

    }

    public static void main(String[] args) {

        System.out.println(String.format("%x",-100));
        System.out.println(String.format("%x",100));

        Function<String,String> a = Function.identity();
        String res = a.apply("sdf");
        List<String> array = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            array.add("a");
        }

    }
}
