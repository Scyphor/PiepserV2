package com.example.piepser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewMembersIntent extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group_view_newmember);
		
		Button btn1 = (Button) findViewById(R.id.button2);
		btn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button2){
			Intent i = new Intent(this, GroupViewIntent.class);
			startActivity(i);
		}
		
	}
	
	
}
