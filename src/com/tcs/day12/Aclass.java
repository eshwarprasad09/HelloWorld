package com.tcs.day12;

public class Aclass extends AbstractClass implements InterfaceClass{

    @Override
    void print() {
        System.out.println("abstract method print");
    }

    @Override
    void show() {
        System.out.println("Interface method print");
    }

    @Override
    public void printline() {
        System.out.println("In Interface method print");
    }

    @Override
    public void showline() {
        System.out.println("In Interface method line");
    }

    public static void main(String[] args){
        Aclass aclass = new Aclass();
        aclass.print();
        aclass.show();
        aclass.printline();
        aclass.showline();
    }
}
