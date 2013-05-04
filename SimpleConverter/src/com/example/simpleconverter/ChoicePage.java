


	package com.example.simpleconverter;

	import android.app.Activity;
	import android.content.Context;
	import android.content.Intent;
	import android.os.Bundle;
	import android.widget.Button;
	import android.view.View;
	import android.view.View.OnClickListener;
	 
	public class ChoicePage extends Activity {
	 
		Button button;
	 
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.choice_page);
			addListenerOnButton();
			addListenerOnButton2();
			addListenerOnButton3();
		}
	 
		public void addListenerOnButton() {
	 
			final Context context = this;
	 
			button = (Button) findViewById(R.id.button1);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, MainActivity.class);
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
	 
				    Intent intent = new Intent(context, MilesKilo.class);
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
	 
				    Intent intent = new Intent(context, YardMeter.class);
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		}

}
