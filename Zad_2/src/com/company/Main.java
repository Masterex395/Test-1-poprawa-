package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;


public class Main {
    public static String modify(String str){
        StringBuffer wynik = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        char c;
        String end;

        if(str.length()%2==0)
        {
            int polowa = str.length();
            c = str.charAt(polowa);
            wynik = sb.append(c);
            end = wynik.toString();
        }
        else
        {
            int polowa = ((str.length()-1) / 2);
            c = str.charAt(polowa);
            wynik = sb.append(c);
            end = wynik.toString();
        }
        return end;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String zadanie_2 = in.nextLine();
        System.out.println(modify(zadanie_2));
    }
}
