package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text;
        String dizi[];
        Scanner scanner=new Scanner(System.in);
        System.out.println("İfadeyi giriniz: (GEÇERLİ İFADELER: X, ', (, ), [, ], \" ");
        text=scanner.nextLine();
        text=text.replace(" ","");
        dizi=text.split("");
        Stack stack=new Stack(text.length());
        boolean durum=true;




        for(int j=0;j< dizi.length;j++){
            String storage=dizi[j];

            if (storage.equals("("))
                stack.push(storage);


            if(storage.equals(")")) {
                String tut=stack.pop();
                if(!tut.equals("(")){
                    durum=false;
                }
            }

            if(storage.equals("["))
                stack.push(storage);


            if(storage.equals("]")) {
                String tut = stack.pop();
                if (!tut.equals("[")) {
                    durum = false;
                }
            }

            if (storage.equals("\"")){
                if(!stack.peek().equals(storage)) {
                    stack.push(storage);
                }
                else
                    stack.pop();
            }

            if (storage.equals("\'")){
                if(!stack.peek().equals(storage)) {
                    stack.push(storage);
                }
                else
                    stack.pop();
            }

        }
        for(String dizii :dizi){
            if(!(dizii.equals("\"") || dizii.equals("\'") || dizii.equals("X") || dizii.equals("(") || dizii.equals(")") || dizii.equals("[") || dizii.equals("]"))){
                durum=false;
            }
        }



        if(durum==true && stack.top_number<0){
            System.out.println("GEÇERLİ");
        }
        else {
            System.out.println("GEÇERSİZ");
        }



    }
}
