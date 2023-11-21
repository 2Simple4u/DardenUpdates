package com.manage.contact.StirngQuestions;

public class TestCode {

    public static String replaceValues(String inputString) {
//         = null;
        String result =  inputString.replaceAll(" ","%20");
        return result;
    }
    public static void main(String[] args) {
        replaceValues("Srinivasa Reddy Challa");
        System.out.println( replaceValues("Srinivasa Reddy Challa"));
    }


}
