package es.tuespiral.u4.p1.iteradores;

import java.util.*;

public class PruebaIteradores {
    public static void main(String[] args) {
        List beatles = Arrays.asList("John", "Paul", "Ringo", "George");
        Iterator iter = beatles.iterator();
        
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
