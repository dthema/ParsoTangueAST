program                 = {function, white_space}+;

function                = "let", space, function_type, space, identifier, white_space, 
                                "(", {white_space, parameter_var, {white_space, ",", white_space, parameter_var}}, ")",
                                        white_space, "{", white_space, 
                                                {block, space}, ["return", space, expression, white_space],
                                        "}";

block                   = declaration
                        | assigment
                        | function_call
                        | if_statement;

if_statement            = "if", white_space, statement, [white_space, elif_statement | else_statement];
elif_statement          = "else", space, if_statement;
else_statement          = "else", statement;
statement               = "(", white_space, bool_expr, white_space, ")", white_space,
                                ("{", white_space, {block, white_space}, "}")
                                | (block, space);

parameter_var           = type, space, identifier;
declaration             = type, space, assigment;
assigment               = identifier, white_space, ":=", white_space, expression;

expression              = math_expr | bool_expr;
bool_expr               = digit_bool_expr | string_bool_expr;

digit_bool_expr         = bool_expr_var | hard_digit_bool_expr
                        | (digit_bool_expr, white_space, second_bool_operator, white_space, hard_digit_bool_expr)
                        | (hard_digit_bool_expr, white_space, second_bool_operator, white_space, digit_bool_expr);

hard_digit_bool_expr    = digit_expr_var
                        | (hard_digit_bool_expr, white_space, first_bool_operator, white_space, digit_expr_var)
                        | digit_bool_expr_var;

string_bool_expr        = bool_expr_var | hard_string_bool_expr
                        | (string_bool_expr, white_space, second_bool_operator, white_space, hard_string_bool_expr)
                        | (hard_string_bool_expr, white_space, second_bool_operator, white_space, string_bool_expr);

hard_string_bool_expr   = string_expr_var
                        | (hard_string_bool_expr, white_space, first_bool_operator, white_space, string_expr_var)
                        | string_bool_expr_var;

string_bool_expr_var    = ("(", white_space, string_bool_expr, white_space, ")");
digit_bool_expr_var     = ("(", white_space, digit_bool_expr, white_space, ")");
bool_expr_var           = "true" | "false" | identifier | function_call;

math_expr               = digit_math_expr 
                        | ({string_expr_var, white_space, "+", white_space},
                                string, {white_space, "+", white_space, string_expr_var});

digit_math_expr         = hard_math_expr
                        | (digit_math_expr, white_space, second_math_operator, white_space, hard_math_expr);

hard_math_expr          = digit_math_expr_var
                        | (hard_math_expr, white_space, first_math_operator, white_space, digit_math_expr_var);

digit_math_expr_var     = digit_expr_var
                        | ("(", white_space, digit_math_expr, white_space, ")");

digit_expr_var          = identifier | function_call | digit;
string_expr_var         = identifier | function_call | string;

function_call           = identifier, white_space,
                                "(", { white_space, identifier, {white_space, ",", white_space, identifier}}, ")";

identifier              = letter, {letter | digit | "_"};

function_type           = "void" | type;
type                    = "Integer" | "String" | "Boolean";

string                  = ('"', sequence, '"') | ("'", sequence. "'");
sequence                = {letter | symbol | digit}+;
symbol                  = "[" | "]" | "{" | "}" | "(" | ")" | "<" | ">"
                        | "=" | "|" | "." | "," | ";" | "-" | "#" | "$"
                        | "_" | ":" | "/" | "\" | "!" | "@" | "%" | "&"
                        | "+" | "*" | "?" | "\n" | "\t" | "\r" | "\f" | "\b" | " " ;

letter                  = "A" | "B" | "C" | "D" | "E" | "F" | "G"
                        | "H" | "I" | "J" | "K" | "L" | "M" | "N"
                        | "O" | "P" | "Q" | "R" | "S" | "T" | "U"
                        | "V" | "W" | "X" | "Y" | "Z" | "a" | "b"
                        | "c" | "d" | "e" | "f" | "g" | "h" | "i"
                        | "j" | "k" | "l" | "m" | "n" | "o" | "p"
                        | "q" | "r" | "s" | "t" | "u" | "v" | "w"
                        | "x" | "y" | "z" ;

any_operator            = math_operator | bool_operator;
math_operator           = first_math_operator | second_math_operator;
first_math_operator     = "*" | "/" | "%";
second_math_operator    = "-" | "-";

bool_operator           = first_bool_operator | second_bool_operator;
first_bool_operator     = "<=" | ">=" | "<" | ">";
second_bool_operator    = "==" | "!=";

number                  = {digit};
digit                   = "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9";

space                   = {" "}+;
white_space             = {" "};