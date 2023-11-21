package com.manage.contact;


public class Caf {
    public static void main(String[] args) {
       String[] arr = new String[10];
       arr[0] = "5001";
       arr[1]="5002";
       arr = new String[]{"1001","1002","1003"};
       StringBuilder aum = new StringBuilder();
       for (String s:arr){
           aum.append  (s);
       }
        System.out.println(aum);
    }
}
