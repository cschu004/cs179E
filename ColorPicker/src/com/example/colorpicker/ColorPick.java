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

public class ColorPick extends Activity{

	private Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15;
	private int val1=0,val2=0,val3=0,RGB=0;
	
	Button button;	
	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.color);
		
		addListenerOnButton1();
		addListenerOnButton2();
		addListenerOnButton3();
		addListenerOnButton4();
		addListenerOnButton5();
		addListenerOnButton6();
		addListenerOnButton7();
		addListenerOnButton8();
		addListenerOnButton9();
		addListenerOnButton10();
		addListenerOnButton11();
		addListenerOnButton12();
		addListenerOnButton13();
		addListenerOnButton14();
		addListenerOnButton15();
	
	
		
	}
	
	public void addListenerOnButton1() {
		 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Values.class);
			    intent.putExtra("Color", "0xFFFFFF");   
                            startActivity(intent);   
 
			}
 
		});
	}
 
	
		public void addListenerOnButton2() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button2);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xFFFF99");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton3() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button3);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xFFFF33");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton4() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button4);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xCCFF99");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton5() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button5);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0x99FF33");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton6() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button6);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0x009900");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton7() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button7);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0x99FFFF");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton8() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button8);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0x0080FF");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton9() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button9);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0x0000FF");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		public void addListenerOnButton10() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button10);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xFF66FF");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		
		public void addListenerOnButton11() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button11);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xCC00CC");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		
		public void addListenerOnButton12() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button12);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xFF0000");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		
		public void addListenerOnButton13() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button13);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0xC0C0C0");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		
		public void addListenerOnButton14() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button14);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Values.class);
				    intent.putExtra("Color", "0x404040");   
	                            startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		
		public void addListenerOnButton15() {
			 
			final Context context = this;
	 
			button = (Button)findViewById(R.id.button15);
	 
			button.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
					
				    Intent intent = new Intent(context, Values.class);
	                intent.putExtra("Color", "0x000000");            
				    startActivity(intent);   
	 
				}
	 
			});
	 
		
	}
		


	
}
