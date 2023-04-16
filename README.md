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
* Вызов функции (function_call):
```
ID(parameters);
```

### Вспомогающие конструкции:
> Данные конструкции не могут использоваться самостоятельно и являются частью основных конструкций
* Выражение (expression): ID, NUMBER, STRING, BOOL_VAR, function_call, math or bool expression
* Математическое выражение (math expression)
> Порядок операций соответсвует порядку из других ЯП, например Java
* Параметры объявления функции (function_parameters): null, list of(TYPE ID)
* Параметры вызова функции (parameters): null, list of(expression)


### Токены:
* FUNCTION_TYPE: void, TYPE
* TYPE: Integer, String, Boolean
* ID: идентификатор, всегда начинающийся с латинской буквы. Далее могут следовать также буквы, цифры или подчёркивания.
* NUMBER: целое число число от 0 до ∞
* BOOL_VAR: true, false

## Примеры
### Пример №1. Инициализация переменных и вызов функций
Input: code
```
let void main() {
    String first := "Hello";
    String second := "World";
    print(first + second);
}
```

Output: tree 
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
