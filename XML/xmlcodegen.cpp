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
		x_coord=0;
		y_coord=0;
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
		x_coord=0;
		y_coord=0;
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

vector<string> printdirectory( string s){

		DIR *dir;
		struct dirent *ent;
		struct dirent *ent2;
		vector<string> vec;
		const char* tmp = s.c_str();
		
		if ((dir = opendir (tmp)) != NULL) {
  			while ((ent = readdir (dir)) != NULL) {
  	  			string tmp = ent->d_name;
  	  			if( tmp != "."  and tmp != ".."){
  	  				vec.push_back(s + "/" + tmp);
  					}
  				}
  		closedir (dir);
		}
		return vec; 

}


vector<string> iterativeprint(vector<string>v){
		vector <string> vec = v;
		vector<string> tmp;
		for(int i = 0; i < vec.size(); i++){
			tmp = printdirectory(vec[i]);
			vec.insert(vec.end(), tmp.begin(), tmp.end());			
		}
		return vec;

}

void cleanup( vector<string> allfiles, vector<string> &xmlfiles, vector<string> &javafiles){
	
	for( int i = 0; i < allfiles.size(); i++){
			if(allfiles[i].find("layout/") != std::string::npos and allfiles[i].substr(allfiles[i].size()-4) == ".xml"){
				xmlfiles.push_back(allfiles[i]);
			}
			else if(allfiles[i].find("src/") != std::string::npos and allfiles[i].substr(allfiles[i].size()-5) == ".java"){
				javafiles.push_back(allfiles[i]);
			}
	}
}