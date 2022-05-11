package ua.lviv.iot.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordsFinderTest {

    @Test
    void testFinderWithWords(){
        WordsFinder w = new WordsFinder();
        Assertions.assertEquals("r5r432ed r5y112 r5r4f3f3 r5r ", w.findWordsWithDecimal("r5r432ed r3dswcw r5y112 r5r4f3f3 r5r", 5));
    }
    @Test
    void testFinderWithoutWords(){
        WordsFinder w = new WordsFinder();
        Assertions.assertEquals("", w.findWordsWithDecimal("r5r r5r432ed r3dswcw r5/112 r5r4f3f3", 4));
    }



}