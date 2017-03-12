/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opconjuntos;
import java.util.*;
/**
 *
 * @author richi
 * @param <E>
 */
public class Conjunto <E>{
    private Set<E> java, android, ios;
    private FactoryHash<E> factory = new FactoryHash<>();
    
    public Conjunto (int n){
        java=factory.FactoryHash(n);
        android=factory.FactoryHash(n);
        ios=factory.FactoryHash(n);
    }
    
    public void add(E nombre, int lenguaje){
        if (lenguaje==0)
            java.add(nombre);
        if (lenguaje==1)
            android.add(nombre);
        if(lenguaje==2)
            ios.add(nombre);
    }
    
    //Dice si el conjunto java es subconjunto de andorid
    public boolean subJA(){
        return android.containsAll(java);
    }
    
    public Set<E> mayor(){
        return null;
    }
    
}
