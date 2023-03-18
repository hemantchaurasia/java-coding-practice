package org.digi.marvel.codility.sorting;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Distinct {
    public int solution(int[] A) {
        if(A.length == 0) { return 0; }
        
        int numOfDistinct = 1;
        Arrays.sort(A);
        
        for(int i=1; i<A.length; i++) {
            if(A[i] != A[i-1]) numOfDistinct++;
        }
        
        return numOfDistinct;
    }
}
