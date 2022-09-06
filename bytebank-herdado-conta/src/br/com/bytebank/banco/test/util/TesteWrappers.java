package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {
        
        int[] idades = new int[5];

        String[] nomes = new String[5];
        
        int idade = 29;
        List<Integer> numeros = new ArrayList<Integer>();

        Integer idadeRef = Integer.valueOf(56); //autoboxing
        int valor = idadeRef.intValue();// unboxing

        String s = "10";
        //Integer numero = Integer.valueOf(s); // Parse string to int 


        int numero = Integer.parseInt(s);

        System.out.println(numero);



        /* 
        
        
        numeros.add(valor);
        numeros.add(15);
        numeros.add(23);
        numeros.add(6);
        numeros.add(5);
        numeros.add(589);
        numeros.add(568);
        numeros.add(89);

        numeros.add(idade);

        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println(numeros);

 */        
}
}