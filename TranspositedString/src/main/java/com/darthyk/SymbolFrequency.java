package com.darthyk;

import java.util.HashMap;
import java.util.Map;

public class SymbolFrequency {
    public static Map<Character, Integer> getSymbolFrequency(final String str) {
        Map<Character, Integer> symbolCount = new HashMap<>();
        for(int index = 0; index < str.length(); index++) {
            if(!symbolCount.containsKey(str.charAt(index))) {
                symbolCount.put(str.charAt(index), 1);
            } else if (symbolCount.containsKey(str.charAt(index))) {
                symbolCount.put(str.charAt(index), symbolCount.get(str.charAt(index)) + 1);
            }
        }

        return symbolCount;
    }
}
