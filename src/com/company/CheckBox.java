package com.company;

public class CheckBox extends  UIControl{
    public CheckBox(){
        super(true);
    }
    public final void render(){
        System.out.println("This is CheckBox Render");
    }
}
