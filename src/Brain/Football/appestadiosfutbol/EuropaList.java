package Brain.Football.appestadiosfutbol;

import Brain.Football.appestadiosfutbol.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class EuropaList extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.europa_lista);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.brain, menu);
		return true;
	}

}
