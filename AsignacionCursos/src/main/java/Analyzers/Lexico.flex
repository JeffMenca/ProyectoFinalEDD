/*Seccion codigo de usuario*/
package Analyzers;
import java_cup.runtime.*;
import Objects.*;
import java.io.Reader;
import java.util.ArrayList;
%%

/*Seccion configuracion*/
%class Lexico
%cup
%unicode
%line
%column
%public

//Metodos
%{
      private Symbol symbol(int type, String lexema) {
        return new Symbol(type, new Token(lexema, yyline + 1, yycolumn + 1));
      }
%}

//Palabras reservadas y tokens validos
ENTERO=([0-9]+)
PARENTESISA=("(")
PARENTESISB=(")")
COMA=(",")
PUNTOCOMA=(";")
ESTUDIANTE = ("Estudiante")
USUARIO = ("Usuario")
TIPOESTUDIANTE = ("estudiante")
TIPOCOLABORADOR = ("colaborador")
CATEDRATICO = ("Catedratico")
EDIFICIO = ("Edificio")
SALON = ("Salon")
CURSO = ("Curso")
HORARIO = ("Horario")
ASIGNAR = ("Asignar")
STRING = "\""[^["\""]]+"\""
STRINGSINCOMILLA = [:jletterdigit:]+
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]

%%

/*Seccion Reglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}
{ENTERO} { return symbol(sym.ENTERO,yytext());}
{PARENTESISA} {return symbol(sym.PARENTESISA,yytext()); }
{PARENTESISB} {return symbol(sym.PARENTESISB,yytext()); }
{COMA} {return symbol(sym.COMA,yytext()); }
{PUNTOCOMA} {return symbol(sym.PUNTOCOMA,yytext()); }
{ESTUDIANTE} {return symbol(sym.ESTUDIANTE,yytext()); }
{USUARIO} {return symbol(sym.USUARIO,yytext()); }
{TIPOESTUDIANTE} {return symbol(sym.TIPOESTUDIANTE,yytext()); }
{TIPOCOLABORADOR} {return symbol(sym.TIPOCOLABORADOR,yytext()); }
{CATEDRATICO} {return symbol(sym.CATEDRATICO,yytext()); }
{EDIFICIO} {return symbol(sym.EDIFICIO,yytext()); }
{SALON} {return symbol(sym.SALON,yytext()); }
{CURSO} {return symbol(sym.CURSO,yytext()); }
{HORARIO} {return symbol(sym.HORARIO,yytext()); }
{ASIGNAR} {return symbol(sym.ASIGNAR,yytext()); }
{STRING} {return symbol(sym.STRING,yytext()); }
{STRINGSINCOMILLA} {return symbol(sym.STRINGSINCOMILLA,yytext()); }
}

/*Errores y signos encontrados*/
[^] {
  return symbol(sym.error,yytext()); }