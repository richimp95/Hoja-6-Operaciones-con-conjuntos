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
public class FactoryHash <E> {
    public Set<E> FactoryHash(int n){
        if (n==0)
            return new  HashSet<>();
        if (n==1)
            return new TreeSet<>();
        if (n==2)
            return new LinkedHashSet<>();  
        else
            return null;
    }
}
