package com.example.piepser;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainPageIntent extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		Button btn2 = (Button) findViewById(R.id.Button01);
		btn2.setOnClickListener(this);
		Button btn3 = (Button) findViewById(R.id.Button02);
		btn3.setOnClickListener(this);
		Button btn4 = (Button) findViewById(R.id.button4);
		btn4.setOnClickListener(this);
		Button btn5 = (Button) findViewById(R.id.button3);
		btn5.setOnClickListener(this);
		Button btn6 = (Button) findViewById(R.id.button2);
		btn6.setOnClickListener(this);
		Button btn7 = (Button) findViewById(R.id.button5);
		btn7.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int x = v.getId();
		if(x == R.id.button1 || x == R.id.Button01 || x == R.id.Button02){
			Intent i = new Intent(this, GroupViewIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button4){
			Intent i = new Intent(this, ViewRequestIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button3){
			Intent i = new Intent(this, RemoveGroupIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button2){
			Intent i = new Intent(this, CreateGroupIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button5){
			Intent i = new Intent(this, SettingsIntent.class);
			startActivity(i);
		}
	}
	
}
