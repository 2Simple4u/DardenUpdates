package com.manage.contact.StirngQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String str = "DeepakD";
        String StrLower = str.toLowerCase();
        int i,n=str.length();
        HashSet<Character> characters = new LinkedHashSet<>();
        for (i=0;i<n;i++){
            if(!characters.isEmpty() && characters.contains(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
            characters.add(str.charAt(i));
        }
        characters.stream().forEach((e)-> System.out.print(e));
    }
}
