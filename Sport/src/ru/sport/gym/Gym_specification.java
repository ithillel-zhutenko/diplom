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
	            		 
	              startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/#q=" + "��� ���")));}
	            	 else if (str.equals("ru.startandroid.intent.action.showspecRazvodka")) {
	            		 startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/#q=" + "�������� ��������"))); 
	            	 }
	            }
	          });
		    (findViewById(R.id.button2)).setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	            	String str = getIntent().getAction();
	            	 if (str.equals("ru.startandroid.intent.action.showspecGimLega")) {
	              startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/results?search_query=" + "��� ���")));}
	            	 else if (str.equals("ru.startandroid.intent.action.showspecRazvodka")) {
	            		 startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/results?search_query=" + "�������� ��������"))); 
	            	 }
	            }
	          });
	        
		    String str = getIntent().getAction();
		    if (str.equals("ru.startandroid.intent.action.showspecGimLega")) {
		    	TextView myTextView = (TextView) findViewById(R.id.textView1);
		        myTextView.setText("��� ��� � ��� ������� ���������� �� ��������� �����. ����������� ���������� ������� �� ��������, �������� ���� �� ������� � ������ � ��������� �� ������� ����������� � �������� �������.");
		        
		        ImageView mImageView;
		        mImageView = (ImageView) findViewById(R.id.imageView1);
		        mImageView.setImageResource(R.drawable.zhimvszhim_3);
		        
		    }else if (str.equals("ru.startandroid.intent.action.showspecRazvodka")) {
		    	TextView myTextView = (TextView) findViewById(R.id.textView1);
		        myTextView.setText("�������� �������� ���� ����� ����������� ����������(����� ���� ����) ��� �������� ������� ����. ����������� � �������������� � ��������� ����������.");
		         
		        ImageView mImageView;
		        mImageView = (ImageView) findViewById(R.id.imageView1);
		        mImageView.setImageResource(R.drawable.grud3);
		    }
		    
		    }
	 }

