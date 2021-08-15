package com.java11developer.exam.review;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> testMap;
        testMap = new HashMap<>();
        testMap.put("1","abc");
        testMap.put("2","def");

        for(Map.Entry<String, String> mapEntry: testMap.entrySet()){
            System.out.println("key:" + mapEntry.getKey());
            System.out.println("value:" + mapEntry.getValue());
        }
    }
}
