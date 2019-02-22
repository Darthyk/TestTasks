package com.darthyk;

public class TranspositedStringApplication {
    public static void main(String... args) {
        if(SymbolFrequency.getSymbolFrequency(args[0]).equals(SymbolFrequency.getSymbolFrequency(args[1]))) {
            System.out.println("Strings " + args[0] + " and " + args[1] + " have the same symbols");
        } else {
            System.out.println("Strings " + args[0] + " and " + args[1] + " don't have the same symbols");
        }
    }
}
