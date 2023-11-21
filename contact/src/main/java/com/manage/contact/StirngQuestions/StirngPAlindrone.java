package com.manage.contact.StirngQuestions;

public class StirngPAlindrone {

    public static Boolean isPAlindrone(String str){
        int i,length =str.length()-1;
        String revStr="";
        for(i=length;i>=0;i--){
            revStr = revStr+str.charAt(i);
        }
        if (revStr.equals(str)) {
            return true;
        }else return false;
    }
    public static void main(String args[]){
        if(isPAlindrone("abaa")){
            System.out.println("is palindrone");
        }else System.out.println("not a plaindrone");
    }
}
