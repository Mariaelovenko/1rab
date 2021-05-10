package org.example.lexer;

import java.util.Arrays;

public class Lexer {
    private String str;

    public Lexer(String str) {
        this.str = str;
        str = str.replaceAll("\\s+", " ");
        for(String token: str.split(" ")) {
            tokenizer(token);
        }
    }

    public void tokenizer(String convert) {
        if (convert.matches("\\d+")) {
            System.out.println(convert + " : " + Types.NUMBER);
        } else if (convert.matches("[a-zA-Z]+")) {
            System.out.println(convert + " : " + Types.VAR);
        } else if (convert.matches("[+*-]")) {
            System.out.println(convert + " : " + Types.MATH_OP);
        } else if (convert.contains("=")) {
            System.out.println(convert + " : " + Types.EQ_SIGN);
        } else if (convert.matches("\\W")) {
            System.out.println(convert + " : " + Types.SEMICOLON);
        }
    }
}
