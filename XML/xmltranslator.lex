%{
#include "xmltranslator.tab.hpp"
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <vector>

using namespace std;	

int line = 1;
int col = 1;

/*
({a}|{b}|{d}|_)*_	        {printf("error at line %d, column %d: identifier \"%s\" cannot end with an underscore",line,col,yytext); exit(-1);}
({a}|{b})+({a}|{b}|{d}|_)*	{cout << "LITERAL" << endl; col+=yyleng;}
{d}+	                        {col+=yyleng;}
(({d}|"_")+({a}|{b}|{d}|_)*)	{printf("error at line %d, column %d: identifier \"%s\" must begin with a letter",line,col,yytext); exit(-1);}	
*/

%}

%option noyywrap

d [0-9]
a [a-z]
b [A-Z]
%%
" "
"<"		{return LANGLE;}
">"		{return RANGLE;}
"/"		{return SLASH;}
":"		{return COLON;}
"="		{return EQUALS;}
"\""	{return QUOTE;}
"RelativeLayout"			{return RELATIVELAYOUT;}
"TextView"					{return TEXTVIEW;}
"Button"					{return BUTTON;}
"xmlns"						{return XMLNS;}
"android"					{return ANDROID;}
"tools"						{return TOOLS;}
"layout_width"				{return LAYOUTWIDTH;}
"layout_height"				{return LAYOUTHEIGHT;}
"context"					{return CONTEXT;}
"id"						{return ID;}
"layout_alignParentRight"	{return LAYOUTALIGNPARENTRIGHT;}
"layout_alignParentLeft"	{return LAYOUTALIGNPARENTLEFT;}
"layout_alignParentTop"		{return LAYOUTALIGNPARENTTOP;}
"layout_marginRight"		{return LAYOUTMARGINRIGHT;}
"layout_marginTop"			{return LAYOUTMARGINTOP;}
"text"						{return TEXT;}
"layout_below"				{return LAYOUTBELOW;}
"layout_marginLeft"			{return LAYOUTMARGINLEFT;}
"onClick"					{return ONCLICK;}
\n	        {return NEWLINE;}


\".*\"		{return LITERAL;}

.	{printf("error at line %d, column %d: unrecognized symbol \"%s\"",line,col,yytext); exit(-1);}
%%

