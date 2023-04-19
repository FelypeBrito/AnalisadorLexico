package analisador;

import static analisador.Token.*;
%%
%class Lexer
%type Token

L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r]

%{
public String lexeme;
}
{WHITE} {/*Ignore*/}

/* Pula linha */
( *\n*) {lexeme = yytext(); return LINHA;}

/* Operadores Aritméticos */
( "+" | "-" | "*" | "/" | "%" ) {lexeme = yytext(); return OPERADOR_ARITMETICO;}

/* Operadores Lógicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme = yytext(); return OPERADOR_LOGICO;}

/* Operadores Relacionais */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return OP_RELACIONAL;}

/* Operadores Atribuição */
( "*=" | "-=" | "*=" | "/=" | "%=" | "++" | "--" | "=" ) {lexeme = yytext(); return OP_ATRIBUICAO;}

/* Operadores Booleanos */
( true | false ) {lexeme = yytext(); return OP_BOOLEANO;}

/* Separadores */
( "(" | ")" | "{" | "}" | "[" | "]" | ";" | "," | "." | "\"" ) {lexeme = yytext(); return SEPARADOR;}

/* Caracteres Especiais */
/*( \b | "\t" | "\n" | "\f" ) {lexeme = yytext(); return ESPECIAL;}*/

/* Comentarios */ 
("$$"(.)*) {lexeme = yytext(); return COMENTARIO;}

/* Marcador de inicio do algoritmo */
( "inicio" ) {lexeme = yytext(); return INICIO;}

/* Marcador de fim do algoritmo */
( "fim" ) {lexeme = yytext(); return FIM;}

/* Marcador de inicio de bloco */
( "ini_bloco" ) {lexeme = yytext(); return MARCADOR_INICIO;}

/* Marcador de fim de bloco */
( "fim_bloco" ) {lexeme = yytext(); return MARCADOR_FIM;}

/* Marcador Biblioteca  */
( "&bilbicisco" ) {lexeme = yytext(); return BIBLIOTECA;}

/* Identificar a escrita na tela  */
( "escreva" ) {lexeme = yytext(); return ESCREVA;}

/* Identificar a leitura na tela  */
( "leia" ) {lexeme = yytext(); return LEIA;}

/* Identificar a porta  */
( "porta" ) {lexeme = yytext(); return PORTA;}

/* Identificar a configuracao de tela  */
( "config" ) {lexeme = yytext(); return CONFIG;}

/* Identificar a configuracao da senha secreta  */
( "secreta" ) {lexeme = yytext(); return SECRETA;}

/* Identificar a configuracao console  */
( "console" ) {lexeme = yytext(); return CONSOLE;}

/* Identificar a configuracao das interfaces  */
( "interface" ) {lexeme = yytext(); return INTERFACE;}

/* Identificar o IP  */
( "ip" ) {lexeme = yytext(); return IP;}

/* Identificar o gateway padrao  */
( "gateway_padrao" ) {lexeme = yytext(); return GATEWAY_PADRAO;}

/* 7 palavras reservadas da linguagem Swigol */
( exibir_interface | exibir_mac | exibir_vlan | exibir_ram | exibir_nvram 
| exibir_flash | copia_ram_nvram ) {lexeme = yytext(); return PALAVRA;}

{L}({L}|{D})* {lexeme= yytext(); return ID;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return NUMERO;}
 
 . {return ERROR;}
