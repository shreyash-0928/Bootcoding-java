package com.bootcoding.leetcode;

import java.util.HashMap;

public class NthTribonacciNumber {
    private HashMap<Integer, Integer> cache = new HashMap<>();
    public int tribonacci(int n) {

        if(cache.containsKey(n))
            return cache.get(n);

        if(n==0){
            cache.put(n,0);
            return 0;

        }
        if(n==1 || n==2){
            cache.put(n,1);
            return 1;
        }

        int result = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        cache.put(n,result);
        return result;


    }
}
