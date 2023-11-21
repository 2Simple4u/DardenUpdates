package com.manage.contact.abstactclass;

public class ClassExtendingAbstractClass extends AbstactAddClass implements interfaceClass,AnotherInterface{
    @Override
    void printData() {
    }

    public static void main(String[] args) {
        ClassExtendingAbstractClass classExtendingAbstractClass = new ClassExtendingAbstractClass();
        classExtendingAbstractClass.printData();
        classExtendingAbstractClass.ddata();

//        abstactAddClass.print();
    }

    @Override
    public void ddata() {
        System.out.println("interface");
    }

    @Override
    public void ddataa() {

    }
}

