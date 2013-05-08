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
"TextView"					{yylval.val = strdup(yytext); return TEXTVIEW;}
"Button"					{yylval.val = strdup(yytext); return BUTTON;}
"xmlns"						{yylval.val = strdup(yytext); return XMLNS;}
"android"					{yylval.val = strdup(yytext); return ANDROID;}
"tools"						{yylval.val = strdup(yytext); return TOOLS;}
"layout_width"				{yylval.val = strdup(yytext); return LAYOUTWIDTH;}
"layout_height"				{yylval.val = strdup(yytext); return LAYOUTHEIGHT;}
"context"					{yylval.val = strdup(yytext); return CONTEXT;}
"id"						{yylval.val = strdup(yytext); return ID;}
"layout_alignParentRight"	{yylval.val = strdup(yytext); return LAYOUTALIGNPARENTRIGHT;}
"layout_alignParentLeft"	{yylval.val = strdup(yytext); return LAYOUTALIGNPARENTLEFT;}
"layout_alignParentTop"		{yylval.val = strdup(yytext); return LAYOUTALIGNPARENTTOP;}
"layout_alignParentBottom"	{yylval.val = strdup(yytext); return LAYOUTALIGNPARENTBOTTOM;}
"layout_marginRight"		{yylval.val = strdup(yytext); return LAYOUTMARGINRIGHT;}
"layout_marginLeft"			{yylval.val = strdup(yytext); return LAYOUTMARGINLEFT;}
"layout_marginBottom"		{yylval.val = strdup(yytext); return LAYOUTMARGINBOTTOM;}
"layout_marginTop"			{yylval.val = strdup(yytext); return LAYOUTMARGINTOP;}
"text"						{yylval.val = strdup(yytext); return TEXT;}
"layout_below"				{yylval.val = strdup(yytext); return LAYOUTBELOW;}
"onClick"					{yylval.val = strdup(yytext); return ONCLICK;}
\n


\".*\"		{yylval.val = strdup(yytext); return LITERAL;}

.	{printf("error at line %d, column %d: unrecognized symbol \"%s\"",line,col,yytext); exit(-1);}
%%

