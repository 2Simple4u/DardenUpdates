package com.manage.contact;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.HashMap;

@AllArgsConstructor
@EqualsAndHashCode
public class CollectionMap {
    int i;
    String name ;
    public static void main(String[] args) {
        HashMap<CollectionMap,Integer> map = new HashMap<>();
//        CollectionMap c = new CollectionMap(10,"ram");
//        CollectionMap c2 = new CollectionMap(10,"ram");
        map.put(new CollectionMap(10,"ram"),10);
        map.put(new CollectionMap(10,"ram"),10);
        System.out.println(map.size());

    }

}


