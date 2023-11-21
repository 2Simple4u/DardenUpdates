package com.manage.contact.number;

public class PrimeNo {

    public static void main(String[] args) {
        int i, j;
        boolean prime = true;
        int no = 5;
//        for (i=2;i<=100;i++){
//           prime = true;
//            for(j=2;j<i;j++){
//                if(i%j == 0){
//                    prime = false;
//                    break;
//                }
//            }if(prime){
//                System.out.println(i);
//            }
//        }

        for (i = 2; i < no; i++) {
            if (no % i == 0) {
                prime = false;
//                break;
            }
        }
        if (prime) {
            System.out.println(no);
        }else System.out.println("not a prime no");

    }
}
