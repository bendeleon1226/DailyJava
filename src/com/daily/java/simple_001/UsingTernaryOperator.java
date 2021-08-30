package com.daily.java.simple_001;

public class UsingTernaryOperator {
    public static void main (String[] args){
        UsingTernaryOperator uto = new UsingTernaryOperator();
        System.out.println("getMax(5,3): "+ uto.getMax(5,3));
        System.out.println("getMin(5,3): "+ uto.getMin(5,3));
    }
    private int getMax(int num1, int num2){
        return num1>num2?num1:num2;
    }
    private int getMin(int num1, int num2){
        return num1>num2?num2:num1;
    }
}
