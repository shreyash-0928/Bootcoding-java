package com.bootcoding.leetcode;

import java.util.*;

public class FibonacciNumber {
    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        cache.put(n, fib(n - 1) + fib(n - 2));
        return cache.get(n);
    }
}

