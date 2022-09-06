package br.com.bytebank.banco.test.util;

import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;

/**
 * NumeroDaContaComparator implements Comparator<Conta>
 */ 
public class NumeroDaContaComparator2 implements Comparator<Conta> {


    @Override
    public int compare(Conta c1, Conta c2) {
        
        
        
        return Integer.compare(c1.getNumero(), c2.getNumero());
        
        
    }
    
    
}