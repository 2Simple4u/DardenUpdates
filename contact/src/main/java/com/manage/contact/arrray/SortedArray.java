package com.manage.contact.arrray;

import java.util.Stack;

public class SortedArray {

    public static void main(String[] args) {
        int[] integer = {1,2,1,4};
        int i,n=integer.length;
        boolean isSorted = true;
        for (i=1;i<n;i++){
            if(integer[i]<integer[i-1]){
                isSorted = false;
            }
        }
        if (isSorted){
            System.out.println("is sorted");
        }else {
            System.out.println("not sorted");
        }
        Stack<Integer> integers = new Stack<>();
        for (i=0;i<n;i++){
            if(integers.isEmpty() || integer[i]>=integers.peek()){
                integers.push(integer[i]);
            }else {
                break;
            }
        }
        if(integers.size()==integer.length){
            System.out.println("sorted array");
        }else {
            System.out.println("not sorted array");
        }


    }
}
