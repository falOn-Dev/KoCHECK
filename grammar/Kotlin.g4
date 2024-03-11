grammar Kotlin;

// Literals
Identifier: [a-zA-Z_][a-zA-Z_0-9]*;
IntLiteral: [0-9]+;
FloatLiteral: [0-9]+'.'[0-9]+;
StringLiteral: '"' (~["\r\n])* '"';
BooleanLiteral: 'true' | 'false';

// Operators
MathOperator: '+' | '-' | '*' | '/';
ComparisonOperator: '==' | '!=' | '<' | '<=' | '>' | '>=';
LogicalOperator: '&&' | '||';
UnaryOperator: '-' | '!';
AssignmentOperator: '=';
IncrementOperator: '++' | '--';

// Whitespace and comments
Comment: '//' ~[\r\n]* -> skip;
MultiLineComment: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;


program: statement* EOF;

statement: functionDeclaration
            | expression
            | variableDeclaration
            | classDeclaration
            | interfaceDeclaration
            | objectDeclaration
            | 'if' '(' expression ')' block ('else' block)?
         ;

variableDeclaration: ('val' | 'var') Identifier (':' type('?'?))? '=' expression;

type: 'Int' | 'Float' | 'String' | Identifier;

expression: assignment
            | Identifier
            | IntLiteral
            | FloatLiteral
            | StringLiteral
            | BooleanLiteral
            | expression MathOperator expression
            | expression ComparisonOperator expression
            | expression LogicalOperator expression
            | UnaryOperator expression
            | expression IncrementOperator
            | '(' expression ')'
            | functionCall
          ;

functionCall: Identifier '(' parameterList? ')';

argument: (Identifier(':' type)?);

parameterList: (argument (',' argument)*);

assignment: Identifier AssignmentOperator expression;

functionDeclaration: 'fun' Identifier '(' parameterList? ')' (':' type)? block;

block: '{' statement* '}';

classDeclaration: 'class' Identifier (':' Identifier)? block;

interfaceDeclaration: 'interface' Identifier (':' Identifier)? block;

objectDeclaration: 'object' Identifier (':' Identifier)? block;



