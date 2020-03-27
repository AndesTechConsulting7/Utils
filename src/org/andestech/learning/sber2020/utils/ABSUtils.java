package org.andestech.learning.sber2020.utils;

import java.util.Collection;
import java.util.List;

public class ABSUtils {

    public static void printColl(Collection list)
    {
        for (Object o: list) System.out.print(o + ", ");
        System.out.println("\b\b.");
    }

    public static void echo(String s, int N)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <N ; i++) sb.append(s);
        System.out.println(sb.toString());

    }

    public static void echo() { echo("-", 70);}

    public static String normalizeName(String n){
        n = n.trim();
        String s1 = n.substring(0,1).toUpperCase();
        String s2 = n.substring(1).toLowerCase();
        return s1+s2;
        // return n.trim().toUpperCase();
    }
}
