package com.company;

public class UIControl {
    public boolean isEnabled ;
    public UIControl(boolean isEnabled){
        this.isEnabled = isEnabled;
    }
    public void enable(){
        isEnabled = true;
    }
    public  void diable(){
        isEnabled = false;
    }
    public boolean isEnable(){
        return isEnabled;
    }
    public void render(){

    }
    public void clear(){
        System.out.println("Inside UI control");
    }
}
