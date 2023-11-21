package com.manage.contact.StirngQuestions;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Deepak-is:m";
        int i ,n=s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (i=n-1;i>=0;i--){
            stringBuilder.append(s.charAt(i));
        }
        String revString = stringBuilder.toString();

        String words[]=s.split("\\s");
        String newString="";
        for(String w:words){
            String first = w.substring(0,1);
            String rest = w.substring(1);
            newString += first.toUpperCase()+rest+" ";
        }
        System.out.println(stringBuilder.toString());
    }
}
