package com.darthyk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymbolFrequencyTest {
    private enum TestData {
        FIRST("Test", "steT"),
        SECOND("SomeWheRe", "WhemeSoeR"),
        THIRD("One Two,", ",neO woT"),
        FOURTH("test", "TEST"),
        FIFTH("One", "one"),
        SIXTH(" two ", "two"),
        SEVENTH("Word", 4),
        EIGHTH("One Word Two", 12);

        private String str1;
        private String str2;
        private int symbolCount;

        TestData(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        TestData(String str1, int symbolCount) {
            this.str1 = str1;
            this.symbolCount = symbolCount;
        }

        public String getStr1() {
            return this.str1;
        }

        public String getStr2() {
            return this.str2;
        }

        public int getSymbolCount() {
            return this.symbolCount;
        }
    }

    @Test
    public void testSingleWordSymbolCount() {
        Assertions.assertEquals(TestData.SEVENTH.getStr1().length(), TestData.SEVENTH.getSymbolCount());
    }

    @Test
    public void testMultipleWordsSymbolCount() {
        Assertions.assertEquals(TestData.EIGHTH.getStr1().length(), TestData.EIGHTH.getSymbolCount());
    }

    @Test
    public void testSimpleCapitalSymbolTransposition() {
        Assertions.assertEquals(SymbolFrequency.getSymbolFrequency(TestData.FIRST.getStr1()), SymbolFrequency.getSymbolFrequency(TestData.FIRST.getStr2()));
    }

    @Test
    public void testMultipleCapitalSymbolTransposition() {
        Assertions.assertEquals(SymbolFrequency.getSymbolFrequency(TestData.SECOND.getStr1()), SymbolFrequency.getSymbolFrequency(TestData.SECOND.getStr2()));
    }

    @Test
    public void testSpacesSymbolTransposition() {
        Assertions.assertEquals(SymbolFrequency.getSymbolFrequency(TestData.THIRD.getStr1()), SymbolFrequency.getSymbolFrequency(TestData.THIRD.getStr2()));
    }

    @Test
    public void testMultipleCapitalSymbolTranspositionError() {
        Assertions.assertNotEquals(SymbolFrequency.getSymbolFrequency(TestData.FOURTH.getStr1()), SymbolFrequency.getSymbolFrequency(TestData.FOURTH.getStr2()));
    }

    @Test
    public void testSingleCapitalSymbolTranspositionError() {
        Assertions.assertNotEquals(SymbolFrequency.getSymbolFrequency(TestData.FIFTH.getStr1()), SymbolFrequency.getSymbolFrequency(TestData.FIFTH.getStr2()));
    }

    @Test
    public void testMultipleSpacesSymbolTransposition() {
        Assertions.assertNotEquals(SymbolFrequency.getSymbolFrequency(TestData.SIXTH.getStr1()), SymbolFrequency.getSymbolFrequency(TestData.SIXTH.getStr2()));
    }
}
