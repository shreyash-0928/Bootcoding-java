package com.bootcoding.HackerRank;

import java.util.Arrays;
import java.util.HashSet;

public class LonelyInteger {
    public static void main(String[] args) {

    }

    //BruteForce Approach     TC - O(N + N logN)
    public static int lonelyInteger1(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i = i + 2) {
            if (arr[i] != arr[i] + 1) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    // 1st Optimised Approach     TC - O(N) | SC - Increased
    public static int lonelyInteger2(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        for (int i : arr) {
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }
        for (int i : s) {
            return i;
        }
        return -1;
    }

    //Most Optimised Approach   TC - O(N)
    public static int lonelyInteger3(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }
        return result;
    }
}