package com.manage.contact.StirngQuestions;


import java.util.Arrays;

public class FirstCapitalLetter {

    public static String getString(String s){
        String words[]=s.split("\\s");
        String newString="";
        for(String w:words){
            String first = w.substring(0,1);
            String rest = w.substring(1);
            newString += first.toUpperCase()+rest+" ";
        }
        return newString.trim();

    }
    public static String capitalizeWord(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord.trim();
    }

    public static void main(String[] args) {

        System.out.println( getString("the deepak is king"));
        System.out.println( capitalizeWord("the deepak is dig"));
    }
}
