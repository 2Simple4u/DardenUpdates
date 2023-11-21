package com.manage.contact.arrray;

public class printMissingNo {
    public static void main(String[] args) {
        int[] integer = {1,2,4};
        int i,n=integer.length;
        int m = n+1;
        System.out.println(n);
        int expectedtotalArraySum =m*(m+1)/2;
        System.out.println(expectedtotalArraySum);
        int totalSum =0;
        for(i=0;i<n;i++){
            totalSum += integer[i];
        }
        System.out.println(expectedtotalArraySum - totalSum);
    }
}
