package com.example.colorpicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RGB extends Activity {
private EditText v1,v2,v3;
private String hex;
private Button Enter,Clear;
private int val1=0,val2=0,val3=0,RGB=0;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.r);

v1= ( EditText)findViewById(R.id.Value1);
v2= ( EditText)findViewById(R.id.Value2);
v3= ( EditText)findViewById(R.id.Value3);

Enter = (Button)findViewById(R.id.button1);
Clear = (Button)findViewById(R.id.button2);
Enter.setOnClickListener(new View.OnClickListener()
{
public void onClick(View v){
	convertValues();
}
}
);

Clear.setOnClickListener(new View.OnClickListener()
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
			val1=Integer.parseInt(v1.getText().toString());
			
		}
	
	
	if(v2.getText().length() > 0)
	{
		val2=Integer.parseInt(v2.getText().toString());
		
	}
	
	if (v3.getText().length() > 0)
	{
		val3=Integer.parseInt(v3.getText().toString());
		
	}
	RGB=(val1*65536)+(val2*256)+(val3);
	hex=Integer.toHexString(RGB);
	View v =findViewById(R.id.layout);
	v.setBackgroundColor(Color.argb(240, val1, val2, val3));
}

void reset()
{
v1.setText("0");
v2.setText("0");
v3.setText("0");
}
}




