package com.teasers.Primes;

public class SimplePrimeChecker {

    public static void main(String[] args) {
        System.out.println(isPrime(353));
    }

    private static boolean isPrime(long num){
        for (int i=2; i<num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
