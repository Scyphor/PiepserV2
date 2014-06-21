package com.example.piepser;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PiepserMain extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
		
        Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button1);
        btn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button3){
		    Intent i = new Intent(this, MainPageIntent.class);
		    startActivity(i);
		}
		else if(v.getId() == R.id.button1){
			Intent i = new Intent(this, NewAccountIntent.class);
		    startActivity(i);
		}
	}

}
