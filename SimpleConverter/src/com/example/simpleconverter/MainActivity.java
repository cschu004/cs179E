package com.example.simpleconverter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.simpleconverter.R;



public class MainActivity extends Activity {

private EditText v1,v2;
private Button Convert;
private Button Reset;
private double val1=0,val2=0;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

v1= ( EditText)findViewById(R.id.Value1);
v2= ( EditText)findViewById(R.id.Value2);
Convert = (Button)findViewById(R.id.convert);
Reset = (Button)findViewById(R.id.reset);
Convert.setOnClickListener(new View.OnClickListener()
{
public void onClick(View v)
{
convertValues();
}
}
);

Reset.setOnClickListener(new View.OnClickListener()
{
public void onClick(View v)
{
reset();
}
}
);
}

 
void convertValues()
{

if (v1.getText().length() > 0)
{
val1=Double.parseDouble(v1.getText().toString());
val2=InchToCm(val1);
}
else if(v2.getText().length() > 0)
{
val2=Double.parseDouble(v2.getText().toString());
val1=CmToInch(val2);
}
else
Toast.makeText(this,"please enter a value",Toast.LENGTH_LONG).show();
v1. setText(Double.toString(val1));
v2. setText(Double.toString(val2));

}

double InchToCm(double val)
{return(val/2.54);}
double CmToInch(double val)
{return(val*2.54);}

void reset()
{
v1.setText("");
v2.setText("");
}
}

