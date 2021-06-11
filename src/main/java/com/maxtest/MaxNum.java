package com.maxtest;

public class MaxNum<E extends Comparable <E>> {
    // Method to find max number using compareTo method
    public E testMax(E x, E y, E z) {
        E max =  x;
        if (y.compareTo(max)>0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
             max = z;
        }
       return max;
    }
}

