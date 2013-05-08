package com.example.colorpicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;



public class Values extends Activity {
	private String message;
	private TextView text;
	private int color;
	Button button;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.values);
		addListenerOnButton();
		
		message=getIntent().getExtras().getString("Color");
		text= (TextView)findViewById(R.id.textView1);
		text.setText(message);
		//View v =findViewById(R.id.layout);
		//color=Integer.parseInt(message);
		//v.setBackgroundColor(color);
	}
	public void addListenerOnButton() {
		 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, ColorPick.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
}
