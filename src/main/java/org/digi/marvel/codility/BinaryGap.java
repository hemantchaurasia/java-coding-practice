package org.digi.marvel.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinaryGap {
    public static int solution(int N) {
        // write your code in Java SE 8
        
        int max_gap = 0;
        int current_gap =0;
        boolean counting = false; 
        
        // Using the "concept of bit manipulation" and "& operation"
        
        while( N !=0 ){
        
            if(counting == false){    // for the first "1"   
                if( (N&1) == 1){      // note: cannot use n&1 withoug "()"
                    counting = true;  // start to count
                }
            }
            else{                    // counting = true
                if( (N&1) ==0){      // note: cannot use n&1 withoug "()"
                    current_gap ++;  
                }
                else{ // N & 1 == 1
                    max_gap = Math.max(max_gap, current_gap);
                    current_gap = 0; // reset
                }
            }
            
            N = N >> 1; // shift by one (right side) 
                        // note: cannot just write "N >> 1"
        }
        
        return max_gap;
    }
    public static void main (String [] arg) {
        int [] A = {50, 222, 49, 52, 25};
        int finalResult=0;
        List<Integer> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        boolean[] numbersThatHaveBeenAdded = new boolean[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {

                String iNumber = String.valueOf(A[i]);
                String jNumber = String.valueOf(A[j]);
                if (iNumber.charAt(0) == jNumber.charAt(0)
                        && iNumber.charAt(iNumber.length()-1) == jNumber.charAt(jNumber.length()-1)) {

                    if (!numbersThatHaveBeenAdded[i]) {
                        result.add(A[i]);
                        numbersThatHaveBeenAdded[i] = true;
                    }
                    if (!numbersThatHaveBeenAdded[j]) {
                        result.add(A[j]);
                        numbersThatHaveBeenAdded[j] = true;
                    }
                    result2.add(A[i]+A[j]);
                }

            }
        }
if (!result2.isEmpty()) {

} else {

}
        System.out.println("Result:" + Collections.max(result2));
    }

}
