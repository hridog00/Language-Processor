import java_cup.runtime.*;
import java.io.*;
%%
%{
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}
%}
%unicode
%cup
%line
%column
%%
"scanf"  { return new Symbol(sym.SCANF);}
"printf"  { return new Symbol(sym.PRINTF);}
"(.|[%][d])*\" { return new Symbol(sym.TEXTO);}
"while" { return new Symbol(sym.WHILE);}
"if" { return new Symbol(sym.IF);}
"else" {return new Symbol(sym.ELSE);}
"&&" {return new Symbol(sym.AND);}
"||" {return new Symbol(sym.OR);}
">=" {return new Symbol(sym.BIGGER_EQUAL);}
"<=" {return new Symbol(sym.SMALLER_EQUAL);}
">" {return new Symbol(sym.BIGGER);}
"<" {return new Symbol(sym.SMALLER);}
"==" {return new Symbol(sym.EQUAL);}
"!=" {return new Symbol(sym.NOT_EQUAL);}
"true" {return new Symbol(sym.TRUE);}
"false" {return new Symbol(sym.FALSE);}
"+" { return new Symbol(sym.MAS); }
"-" { return new Symbol(sym.MENOS); }
"*" { return new Symbol(sym.MULT); }
"/" { return new Symbol(sym.DIV); }
"%" { return new Symbol(sym.MOD); }
";" { return new Symbol(sym.PTOYCOMA); }
"(" { return new Symbol(sym.ABREPAR); }
")" { return new Symbol(sym.CIERRAPAR); }
"{" { return new Symbol(sym.ABRELLAVE); }
"}" { return new Symbol(sym.CIERRALLAVE); }
\'.\' { return new Symbol(sym.CARACTER); }
"void" { return new Symbol(sym.VOID); }
"return" { return new Symbol(sym.RETURN); }
"int" { return new Symbol(sym.INTEGER); }
"real" { return new Symbol(sym.REAL); }
"char" { return new Symbol(sym.CHAR); }
"bool" { return new Symbol(sym.BOOLEAN); }
"=" {return new Symbol(sym.ASIG); }
"[" { return new Symbol(sym.ABRECOR); }
"]" { return new Symbol(sym.CIERRACOR); }
":" { return new Symbol(sym.DOSPUNTOS); }
"," { return new Symbol(sym.COMA); }
[:digit:]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[:digit:]+\.[:digit:]+ { return new Symbol(sym.NUMREAL, new Float(yytext())); }
[:jletter:][:jletterdigit:]* { return new Symbol(sym.ID, yytext()); }
[ \t\r\n]+ {;}
