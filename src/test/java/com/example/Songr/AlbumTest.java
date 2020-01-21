package com.example.Songr;

import org.junit.jupiter.api.*;


public class AlbumTest {
    @Test
    public void testConstructor(){
        Album test = new Album("test","test",1,1,"test");
        Assertions.assertEquals("test",test.title);
    }
}