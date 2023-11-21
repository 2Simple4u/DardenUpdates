package com.manage.contact.number;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddingSquareOfOddNoUsingJava8 {

    public static void print(){
    }
    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        var data = list.stream().filter(e->e%2==0).mapToInt(m->m*m).sum();
        System.out.println(data);
        System.out.println();
        AddingSquareOfOddNoUsingJava8.print("nam");
    }
}
