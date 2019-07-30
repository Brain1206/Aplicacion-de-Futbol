package Brain.Football.appestadiosfutbol;

import Brain.Football.appestadiosfutbol.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Switch;

public class Visor_img extends Activity implements OnClickListener {
 ImageView Visor,estadio,Balon,Cancha,Barra,Mex,Eur;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visor_img);
		Visor = (ImageView)findViewById(R.id.ivVisor);
		estadio = (ImageView)findViewById(R.id.ivestadio);
		Balon = (ImageView)findViewById(R.id.ivBalon);
		Cancha = (ImageView)findViewById(R.id.ivCancha);
		Barra = ( ImageView)findViewById(R.id.ivBarra);
		Mex = (ImageView)findViewById(R.id.ivMex);
		Eur = (ImageView)findViewById(R.id.ivEur);
		estadio.setOnClickListener(this);
		Balon.setOnClickListener(this);
		Cancha.setOnClickListener(this);
		Barra.setOnClickListener(this);
		Mex.setOnClickListener(this);
		Eur.setOnClickListener(this);
		
	}

	
	public void onClick(View v){
		
		switch(v.getId()){
		case R.id.ivBalon:
			Visor.setImageResource(R.drawable.d1);
			break;
		case R.id.ivBarra:
			Visor.setImageResource(R.drawable.d2);
			break;
		case R.id.ivCancha:
			Visor.setImageResource(R.drawable.d3);
			break;
		case R.id.ivestadio:
			Visor.setImageResource(R.drawable.d4);
			break;
		case R.id.ivEur:
			Visor.setImageResource(R.drawable.e1);
			break;
		case R.id.ivMex:
			Visor.setImageResource(R.drawable.e2);
			break;
		
			
		}
	}

}
