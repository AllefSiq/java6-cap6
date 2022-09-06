package br.com.bytebank.banco.test.util;

import java.util.Comparator;

import br.com.bytebank.banco.modelo.Conta;

/**
 * NumeroDaContaComparator implements Comparator<Conta>
 */ 
public class NumeroDaContaComparator implements Comparator<Conta> {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Conta c1, Conta c2) {
        
        
        
        return Integer.compare(c1.getNumero(), c2.getNumero());
        
        //return c1.getNumero() - c2.getNumero();

        /*
         
        if (c1.getNumero() < c2.getNumero()) {
            return -1;
        }
        
        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }
        
        return 0;
        */
    }
    
    
}