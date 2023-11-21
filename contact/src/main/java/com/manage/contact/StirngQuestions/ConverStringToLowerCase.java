package com.manage.contact.StirngQuestions;

public class ConverStringToLowerCase {

    static String getString(String s){
        int i,n=s.length();
        char[] arr = s.toCharArray();
        int diff = 'a'-'A';
        for(i=0;i<n;i++){
            if(arr[i]>='a' && arr[i]<='b'){
               arr[i] = (char) (arr[i]-32);
            }
        } System.out.println(arr);
        return "data";
    }
    void print(){
        System.out.println("hy print");
    }

    public static void main(String[] args) {
        getString("Deepak Is King");
    }
}
