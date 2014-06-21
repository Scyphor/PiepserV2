package com.example.piepser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SettingsIntent extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(this);
}

	@Override
	public void onClick(View v) {
		int x = v.getId();
		if(x == R.id.button1){
			Intent i = new Intent(this, MainPageIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button2){
			Intent i = new Intent(this, MainPageIntent.class);
			startActivity(i);
		}
		
	}
}
