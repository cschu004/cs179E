package com.example.simplecalculator;
import com.example.simplecalculator.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add extends Activity {
	
	private EditText v1,v2,v3;
	private Button Add;
	private Button Reset;
	private double val1=0,val2=0,val3=0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);

	v1= ( EditText)findViewById(R.id.Value1);
	v2= ( EditText)findViewById(R.id.Value2);
	v3= ( EditText)findViewById(R.id.Value3);
	Add = (Button)findViewById(R.id.button1);
	Reset = (Button)findViewById(R.id.button2);
	Add.setOnClickListener(new View.OnClickListener()
	{
	public void onClick(View v)
	{
	add();
	}
	}
	);

	Reset.setOnClickListener(new View.OnClickListener()
	{
	public void onClick(View v)
	{
	clear();
	}
	}
	);
	}

	 
	void add()
	{

	val1=Double.parseDouble(v1.getText().toString());
	val2=Double.parseDouble(v2.getText().toString());
	val3=val1+val2;
	v3. setText(Double.toString(val3));
	}
	
	

	void clear()
	{
	v1.setText("");
	v2.setText("");
	v3.setText("");
	}
}


