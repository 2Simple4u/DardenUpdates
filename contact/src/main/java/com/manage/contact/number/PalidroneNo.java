package com.manage.contact.number;

class PalinDroneNo {

    public static Boolean IsPalindrone(int num){
        int remainder;
        int reversedNum =0;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num  = num/10;
        }if(reversedNum == originalNum){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        if(IsPalindrone(123)){
            System.out.println("is palindrone");
        }else System.out.println("not a palindrone");

    }
}
