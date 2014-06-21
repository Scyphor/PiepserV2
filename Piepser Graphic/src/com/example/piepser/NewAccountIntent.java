package com.example.piepser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewAccountIntent extends Activity implements OnClickListener{

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_account);
		
		Button btn1 = (Button) findViewById(R.id.button2);
		btn1.setOnClickListener(this);
		Button btn2 = (Button) findViewById(R.id.button1);
		btn2.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button2){
			Intent i = new Intent(this, PiepserMain.class);
			startActivity(i);
		}
		else if(v.getId() == R.id.button1){
			Intent i = new Intent(this, PiepserMain.class);
			startActivity(i);
		}
		
	}

}
