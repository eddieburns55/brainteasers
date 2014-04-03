package com.teasers.Primes;

import java.util.List;

/**
 * Created by eburns-admin on 4/3/2014.
 */
public class SophisticatedPrimeChecker {
    public static void main(String[] args) {
        System.out.println();
        int num = 7919;
        final int[] nums = generateNumsUpTo(num);
        final int[] primesUpToNum = eliminateNonPrimes(nums);
        System.out.println(isPrime(primesUpToNum, 7918));
    }

    private static boolean isPrime(int[] primes, int num){
        for (int prime : primes){
            if (num % prime == 0){
                return false;
            }
        }
        return true;
    }

    private static int[] generateNumsUpTo(int num){
        int[] allNums = new int[num+1];
        return allNums;
    }

    private static int[] eliminateNonPrimes(int[] nums) {
        int primeCount = 0;
        nums[0] = -1;
        nums[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                primeCount++;
                int p = i;
                int p2 = p * 2;
                for (int j = 3; p2 < nums.length; j++) {
                    nums[p2] = -1;
                    p2 = p * j;
                }
            }
        }

        int[] primes = new int[primeCount];
        int primeIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                primes[primeIdx] = i;
                primeIdx++;
            }
        }

        return primes;
    }
}
