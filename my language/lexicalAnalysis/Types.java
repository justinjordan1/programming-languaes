package lexicalAnalysis;

public enum Types {
    //DATTA TYPES
    GEORGE, INTERGER, STRING, MATRIX, CHAR, DOS,

    // INITIRALIZATION
    ASSIGMENT, VAR, ARRAyLISTTOKEN, MATRIXTOKEN, ARRAYTOKEN, MATRIXSIZE,

    //LOOPING
    WHILE, INDEFINITLEYPREFORM, WHILETHISISBASICALLYTRUE, FOR, FOREACH, LOOPINCREMENTPLUS, LOOPINCREMENTMINUS,
    PERCENTERROR,

    //operators
    PLUS, PLUS_PLUS, MINUS, MINUS_MINUS, INVERSE, MULTIPLY, DIVIDE,
    EXPONENTIATE, AND, OR, NOT, MINUS_UNARY,

    //conditionals
    IF, ELSEIF, ELSE,
    //

    //Tokens
    OBRACKET, CBRACKET, OPAREN, CPAREN, OARRAYLIST, SEMI_COLON,
}