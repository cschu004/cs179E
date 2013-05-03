rm ./testme ./lex.yy.c
bison -d xmltranslator.ypp
flex xmltranslator.lex
g++ -o testme xmltranslator.tab.cpp lex.yy.c
./testme