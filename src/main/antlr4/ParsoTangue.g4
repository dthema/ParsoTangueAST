grammar ParsoTangue;

/*
 * Parser Rules
 */
program                 : function+ EOF;

function                : LET function_type ID '(' (parameter_var (',' parameter_var)*)* ')'
                            '{' function_blocks_list (return END)? '}';
function_blocks_list    : block*;
return                  : RETURN expression;

if_statement            : IF statement (elif_statement | else_statement)?;
elif_statement          : ELSE if_statement;
else_statement          : ELSE ('{' block* '}' | block);
statement               : '(' bool_expr ')' ('{' block* '}' | block);

block                   : declaration END
                        | assigment END
                        | function_call END
                        | if_statement;

parameter_var           : TYPE ID;
declaration             : TYPE assigment;
assigment               : ID ASSIGMENT expression;

expression              : math_expr | bool_expr;

bool_expr               : bool_expr_or_bool_var
                          | '(' bool_expr ')' bool_op_with_expr*
                          | bool_expr_var bool_op_with_expr*
                          | number_bool_expr
                          | string_bool_expr;
bool_op_with_expr       : second_bool_operator bool_expr_or_bool_var;
bool_expr_or_bool_var   : ('(' bool_expr ')' | bool_expr_var);

number_bool_expr        : number_expr_var first_bool_operator number_expr_var
                        | number_expr_var second_bool_operator number_expr_var;
string_bool_expr        : string_expr_var bool_operator string_expr_var;
bool_expr_var           : function_call | ID | BOOL_VAR;

math_expr               : number_math_expr | string_math_expr;

number_math_expr        : number_expr_var
                        | '(' number_math_expr ')'
                        | number_math_expr first_math_operator number_math_expr
                        | number_math_expr second_math_operator number_math_expr
                        | negative_math_expr;
negative_math_expr      : '-' number_math_expr;

string_math_expr        : string_plus* string_expr_var;
string_plus             : string_expr_var PLUS;

number_expr_var         : ID | NUMBER | function_call;
string_expr_var         : ID | STRING | function_call;

function_call           : ID '(' function_parameters_list? ')';
function_parameters_list: (function_parameter (',' function_parameter)*);
function_parameter      : function_var | function_call;
function_var            : ID | NUMBER | STRING | BOOL_VAR | expression;
function_type           : VOID | TYPE;

bool_operator           : first_bool_operator | second_bool_operator;
first_bool_operator     : GT | LS | GT_EQ | LS_EQ;
second_bool_operator    : EQ | NOT_EQ;

first_math_operator     : MULTIPLY | DIV | MOD;
second_math_operator    : PLUS | MINUS;

/*
 * Lexer Rules
 */
STRING                  : ('"' ( ~[\\"\r\n] | '\\' ~[\r\n] )* '"')
                        | (['] ( ~[\\'\r\n] | '\\' ~[\r\n] )* [']);

LET                     : 'let';
RETURN                  : 'return';
IF                      : 'if';
ELSE                    : 'else';
END                     : ';';
ASSIGMENT               : ':=';

TYPE                    : 'Integer' | 'String' | 'Boolean';
VOID                    : 'void';

BOOL_VAR                : 'true' | 'false';
GT_EQ                   : '>=';
LS_EQ                   : '<=';
EQ                      : '==';
NOT_EQ                  : '!=';
GT                      : '>';
LS                      : '<';
NOT                     : '!';

MULTIPLY                : '*';
DIV                     : '/';
MOD                     : '%';
PLUS                    : '+';
MINUS                   : '-';

ID                      : LETTER (LETTER | DIGIT | '_')*;

fragment LETTER         : 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G'
                        | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N'
                        | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U'
                        | 'V' | 'W' | 'X' | 'Y' | 'Z' | 'a' | 'b'
                        | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i'
                        | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p'
                        | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w'
                        | 'x' | 'y' | 'z';

NUMBER                  : DIGIT+;
fragment DIGIT          : [0-9];

WHITESPACE              : [ \n\t\r]* -> skip;