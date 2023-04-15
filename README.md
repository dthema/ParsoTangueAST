# ParsoTangueAST

В данном проекте представлен парсер формального языка ParsoTangue, позволяющий строить AST на основе кода.

## Код
Список возможных конструкций:
* объявление функций: *let FUNCTION_TYPE ID(PARAMETERS){...}*
* Инициализация переменных: *TYPE ID := EXPRESSION;*
* Выражение (EXPRESSION): ID, NUMBER, STRING...
* скоро дополнится

Токены:
* FUNCTION_TYPE: void, TYPE
* TYPE: Integer, String, Boolean
* ID: идентификатор, всегда начинающийся с латинской буквы. Далее могут следовать также буквы, цифры или подчёркивания.
* NUMBER: число от 0 до \infty

## Примеры
