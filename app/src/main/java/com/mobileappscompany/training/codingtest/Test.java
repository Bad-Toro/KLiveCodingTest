package com.mobileappscompany.training.codingtest;

/**
 * Created by ferna on 3/16/2017.
 */

public class Test {

    public static void main(String[] args) {
        System.out.print("17th prime is: " + getNthPrime(17));
    }


    int getF(int n){

        if(n < 3) return 1;

        return getF(n-1) + getF(n-2);

    }

    int getFNR(int n){

        if(n < 3) return 1;

        int nM1 = 1;
        int nM2 = 1;
        int r = 0;

        for(int i = 3; i <= n; i++ ){
            r = nM1 + nM2;
            nM2 = nM1;
            nM1 = r;
        }

        return r;

    }


    String revS(String oS, String sep){

        StringBuilder mSB = new StringBuilder();

        String[] parts = oS.split(sep);

        for(int i = parts.length -1; i >= 0; i--){
            mSB.append(parts[i] + sep);
        }

        return mSB.toString();

    }

   static int  getNthPrime(int n){

        if(n < 3 ) return n+1;

        int imAt = 2;
        int nTT = 5;

        do {
            if(isPrime(nTT)){
                imAt++;
                if(imAt == n) return nTT;
            }
            nTT+=2;
        }while (true);

    }

    static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }


}
