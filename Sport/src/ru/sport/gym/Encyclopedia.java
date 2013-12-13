package ru.sport.gym;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Encyclopedia extends Activity {
	String[] names = { "Грудь","Спина","Ноги","Трицепс","Бицепс","Дэльта"};

		  /** Called when the activity is first created. */
		  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.encycl);

		    // находим список
		    ListView lvMain = (ListView) findViewById(R.id.lvMain);

		    // создаем адаптер
		    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        android.R.layout.simple_list_item_1, names);

		    // присваиваем адаптер списку
		    lvMain.setAdapter(adapter);
		    lvMain.setOnItemClickListener(new OnItemClickListener() {
		        public void onItemClick(AdapterView<?> parent, View view,
		            int position, long id) {
		        	switch (position) {	
		            case 0:
		            	 Intent intent = new Intent("ru.startandroid.intent.action.showGRUD");
		                 startActivity(intent);
			              break;
		            case 1:
		            	Intent intent1 = new Intent("ru.startandroid.intent.action.showSPIN");
		                 startActivity(intent1);
			              break;
		            case 2:
		            	Intent intent2 = new Intent("ru.startandroid.intent.action.showNOGI");
		                 startActivity(intent2);
			              break;
		            case 3:
		            	Intent intent3 = new Intent("ru.startandroid.intent.action.showTRICEPS");
		                 startActivity(intent3);
			              break;
		            case 4:
		            	Intent intent4 = new Intent("ru.startandroid.intent.action.showBICEPS");
		                 startActivity(intent4);
			              break;
		            case 5:
		            	Intent intent5 = new Intent("ru.startandroid.intent.action.showDELTA");
		                 startActivity(intent5);
			              break;
		            default:
		              break;
		        }
		        }});

		  }
}
