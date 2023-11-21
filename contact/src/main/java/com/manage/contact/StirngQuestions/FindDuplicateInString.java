package com.manage.contact.StirngQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindDuplicateInString {
    public static void main(String[] args) {
        String s = "deeppak";
        int i,n=s.length();
        HashMap<Character,Integer> stringIntegerHashMap = new LinkedHashMap<>();
        for(i=0;i<n;i++){
            if(!stringIntegerHashMap.containsKey(s.charAt(i))){
                stringIntegerHashMap.put(s.charAt(i),1);
            }else
                stringIntegerHashMap.put(s.charAt(i),stringIntegerHashMap.get(s.charAt(i))+1);
            }
        stringIntegerHashMap.entrySet()
                .stream()
                .filter((e)-> e.getValue()>1)
                .forEach((a)-> System.out.println(a.getKey()+" "+a.getValue()));


    }
}
