package vodafone.codality.examples;

import java.util.*;

class AbsDistinct {
    public static int solution(int[] A) {
        
        // using "Set"
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<A.length; i++){
            // note: using "Math.abs(int)"
            if( set.contains( Math.abs(A[i]) ) == false ){
                set.add( Math.abs(A[i]) );
            }
            else{
                // do nothing (already existed in the set)
            }
        }
        
        return set.size();
     }

     public static void main (String [] arg) {
         System.out.println("Result is:" + solution(new int[] {1, 3, 4, 6}));
     }

}
