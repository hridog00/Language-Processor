import java_cup.runtime.*;
import java.io.*;
%%
%{
 private TablaSimbolos tabla;
 public Yylex(Reader in, TablaSimbolos t){
 this(in);
 this.tabla = t;
 }
 public TablaSimbolos getTabla(){
 	return tabla;
 }
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}
 private static int etiquetaActual=0;
 private String nuevaEtiqueta(){
 	return "etiqJF_"+(++etiquetaActual);
 }
 
%}
%unicode
%cup
%line
%column
%%

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
\'.\' { return new Symbol(sym.CARACTER, new String(yytext())); }
\".*\" { return new Symbol(sym.TEXTO, new String(yytext())); }
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
"read" { return new Symbol(sym.READ); }
"print" { return new Symbol(sym.PRINT); }
"//"([a-zA-Z]*[ ]*[0-9]*)* { return new Symbol(sym.COMENTARIO, new String(yytext())); }
[:digit:]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[:digit:]+\.[:digit:]+ { return new Symbol(sym.NUMREAL, new Float(yytext())); }
[:jletter:][:jletterdigit:]* {
	Simbolo s;
	s=new Simbolo(yytext(),null);
		return new Symbol(sym.ID,s);
	}
[ \t\r\n]+ {;}
. { System.out.println("Error en léxico."+yytext()+"-"); }

