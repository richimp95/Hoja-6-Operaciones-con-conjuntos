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
    private Set<E> java, android, ios, aux;
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
        if(java.size()>android.size())
            if(java.size()>ios.size())
                return java;
            else
                return ios;
        if(android.size()>ios.size())
            return android;
        return null;
    }
    
    //Indica la experiencia en java pero no en android
    public Set<E> ExpJnoA(){
        aux.clear();
        aux.addAll(java);
        aux.removeAll(android);
        return aux;
    }
    
    // Indica desarrolladores en todas las areas
    public Set<E> ExpAll(){
        aux.clear();
        aux.addAll(java);
        aux.retainAll(ios);
        aux.retainAll(android);
        return aux;
    }
    
    //Experiencia Android Ios pero no java
    public Set<E> ExpAInoJ(){
        aux.clear();
        aux.addAll(ios);
        aux.retainAll(android);
        aux.removeAll(java);
        return aux;
    }
    
    //Experiencia Android O Ios pero no java
    public Set<E> ExpAoI(){
        aux.clear();
        aux.addAll(ios);
        aux.removeAll(android);
        aux.addAll(android);
        aux.removeAll(java);
        return aux;
    }
}
