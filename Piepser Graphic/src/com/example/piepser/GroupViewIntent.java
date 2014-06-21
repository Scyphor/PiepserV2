package com.example.piepser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GroupViewIntent extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group_view);
		
		Button btn1 = (Button) findViewById(R.id.button3);
		btn1.setOnClickListener(this);
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(this);
		Button btn3 = (Button) findViewById(R.id.button4);
		btn3.setOnClickListener(this);
		Button btn4 = (Button) findViewById(R.id.button5);
		btn4.setOnClickListener(this);
		Button btn5 = (Button) findViewById(R.id.button6);
		btn5.setOnClickListener(this);
		Button btn6 = (Button) findViewById(R.id.button7);
		btn6.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int x = v.getId();
		if(x == R.id.button3){
			Intent i = new Intent(this, RemoveMembersIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button2){
			Intent i = new Intent(this, NewMembersIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button4){
			Intent i = new Intent(this, MainPageIntent.class);
			startActivity(i);
		}
		else if(x == R.id.button5 || x == R.id.button6 || x == R.id.button7){
			Intent i = new Intent(this, MemberSpecificIntent.class);
			startActivity(i);
		}
	}
}
