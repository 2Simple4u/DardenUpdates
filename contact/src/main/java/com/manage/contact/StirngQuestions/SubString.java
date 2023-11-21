package com.manage.contact.StirngQuestions;

public class SubString {

    public static String getString(String s){
        int i,j,n=s.length();

        for(i=0; i<n; i++)
            for(j=i+1; j<=n;j++)
                System.out.println(s.substring(i,j));


        return "data";
    }
    public static void SubString(String str, int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)

                // Please refer below article for details
                // of substr in Java
                // https://www.geeksforgeeks.org/java-lang-string-substring-java/
                System.out.println(str.substring(i, j));
    }



    public static void main(String[] args) {
//        String str ="abc";
//        SubString(str,str.length());
        getString("abc");
//        String s = new String("Bicycle");
//        int iBegin = 1;
//        char iEnd = 3;
//        System.out.println(s.substring(iBegin, iEnd));
    }
}
