package com.java.designpattern.creational.singleton;

public class DBSingletonDemo {
    public static void main(String[] args){
        DBSingleton dbSingleton = DBSingleton.getInstance();
        System.out.println(dbSingleton);

        DBSingleton anotherdbSingleton = DBSingleton.getInstance();
        System.out.println(anotherdbSingleton);

        if(dbSingleton == anotherdbSingleton){
            System.out.println("dbSingleton and anotherdbSingleton are pointing to the same Object");
        }
    }
}
