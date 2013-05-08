#include <iostream>
#include <vector>
#include <string>

using namespace std;

class row{
	string type;
	string name;
	int x_coord;
	int y_coord;
	string text;
	string onclick;
	
	public:
	row(){
		type="";
		name="";
		x_coord=-1;
		y_coord=-1;
		text="";
		onclick="";
		}
	row( string type, string name, int x_coord, int y_coord, string text,	string onclick){
		type=type;
		name=name;
		x_coord=x_coord;
		y_coord=y_coord;
		text=text;
		onclick=onclick;
	}
	string Type(){return type;}
	string Type(string t){ type = t; return type;}
	string Name(){return name;}
	string Name(string s){ name = s; return name;}
	int X_coord(){return x_coord;}
	int X_coord(int x){x_coord = x; return x_coord;}
	int Y_coord(){return y_coord;}
	int Y_coord(int y){y_coord = y; return y_coord;}
	string Text(){return text;}
	string Text(string t){text = t; return text;}
	string Onclick(){ return onclick;}
	string Onclick(string o){ onclick = o; return onclick;}
	void clear(){
		type="";
		name="";
		x_coord=-1;
		y_coord=-1;
		text="";
		onclick="";
		}
	void print(){
		cout << "type: " << type << " name: " << name << " x_coord: " << x_coord << " y_coord: " << y_coord << " text: " << text << " onclick: "<< onclick  << endl;
	}
};

class table{
		vector < row > sym;
	public:
		table() {}
		void insert(row r){
			sym.push_back(r);
		}
		void print(){
			for( int i = 0; i < sym.size(); i++)
				sym[i].print();
			}
		int size(){return sym.size();}

			
};