package ru.sport.gym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Type_muscles extends Activity {
	 public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.encycl);
		    String str = getIntent().getAction();
		    if (str.equals("ru.startandroid.intent.action.showGRUD"))
		    {
		    	String[] names = {"��� ����","��������"};
		    	 ListView lvMain = (ListView) findViewById(R.id.lvMain);

				    // ������� �������
				    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				        android.R.layout.simple_list_item_1, names);

				    // ����������� ������� ������
				    lvMain.setAdapter(adapter);
				    lvMain.setOnItemClickListener(new OnItemClickListener() {
				        public void onItemClick(AdapterView<?> parent, View view,
				            int position, long id) {
				        	switch (position) {	
				            case 0:
				            	 Intent intent = new Intent("ru.startandroid.intent.action.showspecGimLega");
				                 startActivity(intent);
					              break;
				            case 1:
				            	Intent intent1 = new Intent("ru.startandroid.intent.action.showspecRazvodka");
				                 startActivity(intent1);
					              break;
				            default:
					              break;
				        	}
				        }});
		    }else
		    	if (str.equals("ru.startandroid.intent.action.showSPIN")){
		    		String[] names = {"�������� ����","���� � �����"};
			    	 ListView lvMain = (ListView) findViewById(R.id.lvMain);

					    // ������� �������
					    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					        android.R.layout.simple_list_item_1, names);

					    // ����������� ������� ������
					    lvMain.setAdapter(adapter);
		    	}
		    	else
			    	if (str.equals("ru.startandroid.intent.action.showNOGI")){
			    		String[] names = {"������","��� ���������"};
				    	 ListView lvMain = (ListView) findViewById(R.id.lvMain);

						    // ������� �������
						    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
						        android.R.layout.simple_list_item_1, names);

						    // ����������� ������� ������
						    lvMain.setAdapter(adapter);
			    	}
			    	else
				    	if (str.equals("ru.startandroid.intent.action.showTRICEPS")){
				    		String[] names = {"���������� ���","�������������� ���"};
					    	 ListView lvMain = (ListView) findViewById(R.id.lvMain);

							    // ������� �������
							    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
							        android.R.layout.simple_list_item_1, names);

							    // ����������� ������� ������
							    lvMain.setAdapter(adapter);
				    	}
				    	else
					    	if (str.equals("ru.startandroid.intent.action.showBICEPS")){
					    		String[] names = {"�����","��� ������"};
						    	 ListView lvMain = (ListView) findViewById(R.id.lvMain);

								    // ������� �������
								    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
								        android.R.layout.simple_list_item_1, names);

								    // ����������� ������� ������
								    lvMain.setAdapter(adapter);
					    	}
					    	else
						    	if (str.equals("ru.startandroid.intent.action.showDELTA")){
						    		String[] names = {"��� � �����","��� ��������"};
							    	 ListView lvMain = (ListView) findViewById(R.id.lvMain);

									    // ������� �������
									    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
									        android.R.layout.simple_list_item_1, names);

									    // ����������� ������� ������
									    lvMain.setAdapter(adapter);
						    	}
}
}