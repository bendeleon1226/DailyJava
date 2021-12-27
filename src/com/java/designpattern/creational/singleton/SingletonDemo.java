package com.java.designpattern.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args){
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherRuntimeInstance = Runtime.getRuntime();
        System.out.println(anotherRuntimeInstance);

        if(singletonRuntime == anotherRuntimeInstance){
            System.out.println("singletonRuntime and anotherRuntimeInstance are pointing to the same Object");
        }
    }
}
