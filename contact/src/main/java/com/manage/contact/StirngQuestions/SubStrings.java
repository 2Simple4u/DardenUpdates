package com.manage.contact.StirngQuestions;

public class SubStrings {
    public static void main(String[] args) {
        String s = "abc";
        int i,j,n=s.length();
        for (i=0;i<=n;i++){
            for (j=i+1;j<=n;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
