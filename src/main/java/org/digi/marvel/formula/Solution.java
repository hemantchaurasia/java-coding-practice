package org.digi.marvel.formula;

import java.util.HashMap;
import java.util.Map;

class Solution
{
    private Map<Integer, Integer> cache = new HashMap<>();

    public int f(int N) {
        if (N == 1) {
            return 1;
        }

        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int result = 1 + f(N - f(f(N - 1)));
        cache.put(N, result);
        return result;
    }

    public int run(int input) {
        int result = 0;
        if (input >= 1 && input <= 9999) {
            result = f(input+1);
        } else {
            result = -1;
        }
        System.out.println("The " + input + "th term of the sequence is: " + result);
        return result;
    }
}

