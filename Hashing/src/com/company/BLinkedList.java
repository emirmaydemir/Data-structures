package com.company;

public class BLinkedList {
    Node head =null;


    public void add(String anahtar,String deger){
        if (head==null){
            head=new Node();
            head.key=anahtar;
            head.value=deger;
            head.next=null;
        }
        else {
            Node node=new Node();
            node.key=anahtar;
            node.value=deger;
            node.next=null;
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }

    }

    public int size(){
        Node temp=head;
        int boyut=0;
        while (temp!=null){
            boyut++;
            temp = temp.next;
        }
        return boyut;
    }

    public boolean remove(String anahtar){
        boolean state=false;
        Node current=head;
        Node temp=null;

        if(current.key.equals(anahtar)){
            temp=current.next;
            head=temp;
            state=true;
        }

        else{
            while (current.next!=null){
                if (current.next.key.equals(anahtar)) {
                    temp = current.next;
                    current.next = temp.next;
                    temp.next = null;
                    state = true;
                    break;

                }
                current=current.next;
            }
        }

        return state;
    }

    public void search(String anahtar){
        Node temp = head;
        int sayac=1;
        Boolean durum=false;
        while (temp != null) {
            if (temp.key.equals(anahtar)){
                System.out.println("Aranan numara: "+temp.value);
                durum=true;
            }
            temp=temp.next;
        }
        if(durum!=true){
            System.out.println("Aranan numaraya ait isim bulunamadı");
        }
    }

    public void keys() throws InterruptedException {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.key);
            Thread.sleep(1000);
            temp=temp.next;
        }
    }



}
