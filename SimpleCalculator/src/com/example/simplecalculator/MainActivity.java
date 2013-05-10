package com.example.simplecalculator;

import com.example.simplecalculator.MainActivity;
import com.example.simplecalculator.R;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button button;
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
		addListenerOnButton2();
		addListenerOnButton3();
		addListenerOnButton4();
	}
 
	public void addListenerOnButton() {
 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Add.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
	public void addListenerOnButton2() {
		 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button2);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Subtract.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
	public void addListenerOnButton3() {
		 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button3);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Multiply.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}


public void addListenerOnButton4() {
	 
	final Context context = this;

	button = (Button) findViewById(R.id.button4);

	button.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {

		    Intent intent = new Intent(context, Divide.class);
                        startActivity(intent);   

		}

	});

}

}