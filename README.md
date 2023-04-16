# ParsoTangueAST

В данном проекте представлен парсер формального языка ParsoTangue, позволяющий строить AST на основе кода.

## Правила синтаксиса

### Основные конструкции:
* Объявление функций:
```
let FUNCTION_TYPE ID(function_parameters) {... other constructions ...}
```
* Объявление переменных:
```
TYPE ID := expression;
```
* Инициализация переменных:
```
ID := expression;
```
* Блок условия:
```
if (bool_expression) {...}
if (bool_expression) {...} else {...}
if (bool_expression) {...} else if (bool_expression) {...} else {...}
```
* Вызов функции (function_call):
```
ID(parameters);
```

### Вспомогающие конструкции:
> Данные конструкции не могут использоваться самостоятельно и являются частью основных конструкций
> Порядок операций соответсвует порядку из других ЯП, например Java
* Выражение (expression): ID, NUMBER, STRING, BOOL_VAR, function_call, math or bool expression
  * Математическое выражение (math_expression): number or string math expression
    * Арифметическое выражениие (number_math_expression): 
      * -number_math_expression
      * (number_math_expression)
      * number_math_expression *(\*, /, %, +, -)* number_math_expression
      * number_variable
    * Строковое мат. выражение (string_math_expression): 
      * string_variable + string_variable + ...
      * string_variable
  * Логическое выражение (bool_expression): 
    * (bool_expression)
    * *((bool_expression), bool_variable)* *(==, !=)* *((bool_expression), bool_variable)*
    * number_variable *(>=, <=, >, <, ==, !=)* number_variable
    * string_variable *(>=, <=, >, <, ==, !=)* string_variable
    * bool_variable
* Числовая переменная (number_variable): ID, NUMBER, function_call
* Строковая переменная (string_variable): ID, STRING, function_call
* Логическая переменная (bool_variable): ID, BOOL_VAR, function_call
* Параметры объявления функции (function_parameters): null, list of(TYPE ID)
* Параметры вызова функции (parameters): null, list of(expression)


### Токены:
* FUNCTION_TYPE: void, TYPE
* TYPE: Integer, String, Boolean
* ID: идентификатор, всегда начинающийся с латинской буквы. Далее могут следовать также буквы, цифры или подчёркивания
* NUMBER: целое число число от 0 до ∞
* STRING: "(любой символ кроме ")", '(любой символ кроме ')'
* BOOL_VAR: true, false

## Примеры
### Пример №1. Инициализация переменных и вызов функций
Input:
```
let void main() {
    String first := "Hello";
    String second := "World";
    print(first + second);
}
```

Output: 
```
program
 └─function
    ├─id: main
    ├─returned type: void
    └─blocks
       ├─declaration
       │  ├─type: String
       │  └─assigment
       │     ├─id: first
       │     └─math expression
       │        └─string expression
       │           └─string variable
       │              └─"Hello"
       ├─declaration
       │  ├─type: String
       │  └─assigment
       │     ├─id: second
       │     └─math expression
       │        └─string expression
       │           └─string variable
       │              └─"World"
       └─function call
          ├─id: print
          └─parameters
             └─math expression
                └─number math expression
                   ├─number math expression
                   │  └─number variable
                   │     └─id: first
                   ├─operator: +
                   └─number math expression
                      └─number variable
                         └─id: second
```
### Пример №2. Выражения и условные блоки
Input:
```
let Boolean check_range(Integer x, Integer a, Integer b) {
  return a <= x;
}

let void main() {
  Integer temp := 36;
  Integer c_first := read();
  Integer bSecond := read();
  if (checkRange(c_first, bSecond)) {
    print("Yes!");
  } else if (checkRange(
      c_first * 20,
      bSecond * 30 + 20 - (10 + temp % 10)) == (temp >= 36) == (c_first != bSecond)) {
    print("Maybe!");
  } else {
    print("No!");
  }
}
```

Output:
```
program
 └─function
    ├─id: check_range
    ├─returned type: Boolean
    ├─parameters
    │  ├─parameter
    │  │  ├─id: x
    │  │  └─type: Integer
    │  ├─parameter
    │  │  ├─id: a
    │  │  └─type: Integer
    │  ├─parameter
    │  │  ├─id: b
    │  │  └─type: Integer
    │  ├─blocks
    │  └─return
    │     └─bool expression
    │        ├─number variable
    │        │  └─id: a
    │        ├─operator: <=
    │        └─number variable
    │           └─id: x
    └─function
       ├─id: main
       ├─returned type: void
       └─blocks
          ├─declaration
          │  ├─type: Integer
          │  └─assigment
          │     ├─id: temp
          │     └─math expression
          │        └─number math expression
          │           └─number variable
          │              └─36
          ├─declaration
          │  ├─type: Integer
          │  └─assigment
          │     ├─id: c_first
          │     └─math expression
          │        └─number math expression
          │           └─number variable
          │              └─function call
          │                 └─id: read
          ├─declaration
          │  ├─type: Integer
          │  └─assigment
          │     ├─id: bSecond
          │     └─math expression
          │        └─number math expression
          │           └─number variable
          │              └─function call
          │                 └─id: read
          └─if
             ├─bool expression
             │  └─bool variable
             │     └─function call
             │        ├─id: checkRange
             │        └─parameters
             │           ├─c_first
             │           └─bSecond
             ├─function call
             │  ├─id: print
             │  └─parameters
             │     └─"Yes!"
             └─if else
                ├─bool expression
                │  ├─bool variable
                │  │  └─function call
                │  │     ├─id: checkRange
                │  │     └─parameters
                │  │        ├─math expression
                │  │        │  └─number math expression
                │  │        │     ├─number math expression
                │  │        │     │  └─number variable
                │  │        │     │     └─id: c_first
                │  │        │     ├─operator: *
                │  │        │     └─number math expression
                │  │        │        └─number variable
                │  │        │           └─20
                │  │        └─math expression
                │  │           └─number math expression
                │  │              ├─number math expression
                │  │              │  ├─number math expression
                │  │              │  │  ├─number math expression
                │  │              │  │  │  └─number variable
                │  │              │  │  │     └─id: bSecond
                │  │              │  │  ├─operator: *
                │  │              │  │  └─number math expression
                │  │              │  │     └─number variable
                │  │              │  │        └─30
                │  │              │  ├─operator: +
                │  │              │  └─number math expression
                │  │              │     └─number variable
                │  │              │        └─20
                │  │              ├─operator: -
                │  │              └─number math expression
                │  │                 └─number math expression
                │  │                    ├─number math expression
                │  │                    │  └─number variable
                │  │                    │     └─10
                │  │                    ├─operator: +
                │  │                    └─number math expression
                │  │                       ├─number math expression
                │  │                       │  └─number variable
                │  │                       │     └─id: temp
                │  │                       ├─operator: %
                │  │                       └─number math expression
                │  │                          └─number variable
                │  │                             └─10
                │  ├─operator: ==
                │  ├─bool expression
                │  │  ├─number variable
                │  │  │  └─id: temp
                │  │  ├─operator: >=
                │  │  └─number variable
                │  │     └─36
                │  ├─operator: ==
                │  └─bool expression
                │     ├─bool variable
                │     │  └─id: c_first
                │     ├─operator: !=
                │     └─bool variable
                │        └─id: bSecond
                ├─function call
                │  ├─id: print
                │  └─parameters
                │     └─"Maybe!"
                └─else
                   └─function call
                      ├─id: print
                      └─parameters
                         └─"No!"
```
