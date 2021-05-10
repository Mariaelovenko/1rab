package org.example;

import org.example.lexer.Lexer;

public class TestLexer {
    public static void main(String[] args) {
        new Lexer("ac + bji 67 = 10");
        new Lexer("a - bg = 35");
    }
}
