package Brain.Football.appestadiosfutbol;



import Brain.Football.appestadiosfutbol.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
	TabHost tabHost;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tabHost = getTabHost();
		
		TabSpec ts1= tabHost.newTabSpec("page1");
		ts1.setIndicator("Estadios Mexico");
		ts1.setContent(new Intent(this, App_Est.class));
		tabHost.addTab(ts1);
		
		TabSpec ts2= tabHost.newTabSpec("page2");
		ts2.setIndicator("Estadios America");
		ts2.setContent(new Intent(this, AppList2.class));
		tabHost.addTab(ts2);
		
		TabSpec ts3= tabHost.newTabSpec("page3");
		ts3.setIndicator("Estadios Europa");
		ts3.setContent(new Intent(this, EuropaList.class));
		tabHost.addTab(ts3);
		
		
		
		
		
		
	}


}
