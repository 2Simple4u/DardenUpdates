package com.manage.contact.arrray;

import java.util.HashSet;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] array ={2,3,5,6,4,6,2,4};
        int i,j,n=array.length;
        for (i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(array[i]==array[j]){
//                    System.out.println(array[i]);
                    break;
                }
            }
        }
        HashSet<Integer> integers = new HashSet<>();
        for (i=0;i<n;i++) {
            if (integers.contains(array[i]) && !integers.isEmpty()) {
                System.out.println(array[i]);
            }integers.add(array[i]);
        }
    }
}
