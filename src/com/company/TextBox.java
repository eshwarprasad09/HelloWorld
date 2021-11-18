package com.company;

public class TextBox extends UIControl {
    public String text = "";
    public TextBox(){
        super(false);
        System.out.println("Textbox");
    }
    public void setText(String text){
        this.text = text;
    }
    @Override
    public String toString(){
        return text;
    }
    public void render(){
        System.out.println("This is TextBox render");
    }
    public void clear(){
        text="";
        System.out.println("Inside TextBox");
    }
}
