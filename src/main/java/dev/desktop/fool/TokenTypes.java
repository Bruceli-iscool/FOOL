package dev.desktop.fool;

enum TokenType {
    // Single character tokens
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    // multi-character tokens
    BANG, BANG_EQUAL, EQUAL, EQUAL_TO, GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // literals
    IDENTIFIER, STRING, NUMBER,

    // keywords
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NONE, OR,
    PRINT, RETURN, SUPER, THIS, TRUE, VAR, WHILE, EOF

}