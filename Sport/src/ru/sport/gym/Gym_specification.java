package ru.sport.gym;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Gym_specification extends Activity {
	Button button1;
	  Button button2;
	 public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.specification);
		    
		    (findViewById(R.id.button1)).setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	            	String str = getIntent().getAction();
	            	 if (str.equals("ru.startandroid.intent.action.showspecGimLega")) {
	            		 
	              startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/#q=" + "Жим лёжа")));}
	            	 else if (str.equals("ru.startandroid.intent.action.showspecRazvodka")) {
	            		 startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/#q=" + "Разводка гантелей"))); 
	            	 }
	            }
	          });
		    (findViewById(R.id.button2)).setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	            	String str = getIntent().getAction();
	            	 if (str.equals("ru.startandroid.intent.action.showspecGimLega")) {
	              startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/results?search_query=" + "Жим лёжа")));}
	            	 else if (str.equals("ru.startandroid.intent.action.showspecRazvodka")) {
	            		 startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/results?search_query=" + "Разводка гантелей"))); 
	            	 }
	            }
	          });
	        
		    String str = getIntent().getAction();
		    if (str.equals("ru.startandroid.intent.action.showspecGimLega")) {
		    	TextView myTextView = (TextView) findViewById(R.id.textView1);
		        myTextView.setText("Жим лёжа — это базовое упражнение со свободным весом. Выполняющий упражнение ложится на скамейку, опускает гриф до касания с грудью и поднимает до полного выпрямления в локтевом суставе.");
		        
		        ImageView mImageView;
		        mImageView = (ImageView) findViewById(R.id.imageView1);
		        mImageView.setImageResource(R.drawable.zhimvszhim_3);
		        
		    }else if (str.equals("ru.startandroid.intent.action.showspecRazvodka")) {
		    	TextView myTextView = (TextView) findViewById(R.id.textView1);
		        myTextView.setText("Разводка гантелей лежа самое эффективное упражнение(после жима лежа) для развития грудных мышц. Выполняется в горизонтальном и наклонном положениях.");
		         
		        ImageView mImageView;
		        mImageView = (ImageView) findViewById(R.id.imageView1);
		        mImageView.setImageResource(R.drawable.grud3);
		    }
		    
		    }
	 }

