package com.example.piepser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RemoveMembersIntent extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group_view_remove_member);
		
		Button btn1 = (Button) findViewById(R.id.button5);
		btn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button5){
			Intent i = new Intent(this, GroupViewIntent.class);
			startActivity(i);
		}
		
	}
	
	
}
