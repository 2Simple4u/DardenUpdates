package com.manage.contact.StirngQuestions;

public class RemoveWithSpace {

    public static void main(String[] args) {
        String str= "MY NAme is ";
        char[] chars = str.toCharArray();
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll(" ",""));
        StringBuilder stringBuilder= new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(chars[i] != ' '){
                stringBuilder.append(chars[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
