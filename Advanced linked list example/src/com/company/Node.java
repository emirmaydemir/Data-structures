package com.company;

/**
 * JAVA DOCUMAN
 * Node sınıfı linked list yapısındaki ders bilgisini ve bir sonraki nodenin adresini gösteren next işaretçisini
 * kullanmamızı sağlayan sınıfıtır. Aynı zamanda circle list yapısı için ekstra bir semesterNext değişkeni kullanılmıştır.
 * visible ise erişime açılacak ve kapanacak ders nesneleri için kullanılır
 *  @author EMİR MUHAMMET AYDEMİR
 *  @since 26.03.2021
 */
public class Node {
    /**
     * Derslerin tutulduğu değişkendir
     */
    Dersler ders;
    /**
     * Bir sonraki nodenin adresinin tutulduğu değişkendir
     */
    public Node next;
    /**
     * circle linkedlist yapısını kullanmamız için kullandığımız aynı dönemden olan derslerin birbirini işaret
     * etmesini sağlayan derstir
     */
    public Node semesterNext;
    /**
     * Visible erişime açılacak ve kapanacak ders nesneleri için kullanılan boolean bir değişkendir
     */
    boolean visible=true;
}
