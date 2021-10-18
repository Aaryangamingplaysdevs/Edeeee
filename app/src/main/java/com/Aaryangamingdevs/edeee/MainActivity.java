package com.Aaryangamingdevs.edeee;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.inputmethodservice.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
    private EditText edit1;
	private Button but1;
	private TextView text1;

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	
		edit1 = findViewById(R.id.edit1);
		but1 = findViewById(R.id.but1);
	    text1 = findViewById(R.id.text1);
		
		but1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				text1.setText(edit1.getText().toString());
			}
			
		});
}}
