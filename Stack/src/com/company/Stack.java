package com.company;

public class Stack {
    int top_number;
    int size;
    String array[];

    public Stack(int size){
        this.size=size;
        array=new String[size];
        top_number=-1;
    }


    void push(String ch){
        if(top_number==size-1){
            System.out.println("Full");
        }
        else{
            top_number++;
            array[top_number]=ch;
        }
    }
    String pop(){
        if(top_number<0){
            System.out.println("Null");
            return "";
        }
        else{
            String ch=array[top_number];
            top_number--;
            return ch;
        }
    }

    String peek(){
        if(top_number<0){
            return "A";
        }
        else{
            String ch=array[top_number];
            return ch;
        }
    }



}
