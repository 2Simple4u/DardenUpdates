package com.manage.contact.arrray;

import java.util.Arrays;
import java.util.HashSet;

class RemovingDuplicateFromArray {
    public static void main(String[] args) {
        int[] array ={2,3,5,6,4,6,2,4};
//        var data = Arrays.stream(array).distinct().toArray();
        int i,j,n=array.length;
        int[] temp = new int[n];
        HashSet<Integer> arraySet = new HashSet<>();
        for (i=0;i<n;i++){
            arraySet.add(array[i]);
        }
      arraySet.stream().forEach(integer -> System.out.print(integer));
//        Arrays.stream(data).forEach(d-> System.out.println(d));
    }
}
