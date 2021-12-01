package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);

        ArrayList<Integer> lista3 = merge(lista, lista2);
        for(int i = 0; i <=lista3.size()-1; i++){
           System.out.println(lista3.get(i));
        }

        public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
            ArrayList<Integer> lista = new ArrayList<Integer>();
            ArrayList<Integer> ktora = new ArrayList<Integer>();
            int size1 = a.size();
            int size2 = b.size();
            int iterator = 0;
            int mniejszy = 0;
            if(size1 >= size2) {
                iterator = size2;
                ktora = a;
            }
            if(size2 >= size1) {
                iterator = size1;
                ktora = b;
            }

            for(int i = 0; i<=iterator-1; i++ ){
                lista.add(a.get(i));
                lista.add(b.get(i));
            }
            for(int i = iterator; i <=ktora.size()-1; i++){
                lista.add(ktora.get(i));
            }
            return lista;
        }