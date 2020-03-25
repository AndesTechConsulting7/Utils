package org.andestech.learning.sber2020.utils;

public class ABSUtils {

    public static String normalizeName(String n){
        n = n.trim();
        String s1 = n.substring(0,1).toUpperCase();
        String s2 = n.substring(1).toLowerCase();
        return s1+s2;
        // return n.trim().toUpperCase();
    }
}
