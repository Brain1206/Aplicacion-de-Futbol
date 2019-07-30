package Brain.Football.appestadiosfutbol;



import Brain.Football.appestadiosfutbol.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Estadio extends Activity implements OnClickListener{
 Button btn1,btn2,button1,button2;
 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_estadio);
		btn1 = (Button) findViewById(R.id.btn1);
		btn1.setOnClickListener(this);
		btn2 = (Button) findViewById(R.id.btn2);
		btn2.setOnClickListener(this);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);
	}


 @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.brain, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		case R.id.btn1:
			Intent i=new Intent (Estadio.this,MainActivity.class);
			startActivity(i);
			break;
			
		case R.id.btn2:
			Intent r=new Intent (Estadio.this,Signos.class);
			startActivity(r);
			break;
			
		case R.id.button1:
			Intent a=new Intent (Estadio.this,Pricipal.class);
			startActivity(a);
			break;
			
		case R.id.button2:
			Intent b=new Intent (Estadio.this,Visor_img.class);
			startActivity(b);
			break;
			
		}

		}
		
	}


