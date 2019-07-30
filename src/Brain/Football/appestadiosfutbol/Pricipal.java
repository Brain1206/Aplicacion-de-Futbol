package Brain.Football.appestadiosfutbol;

import Brain.Football.appestadiosfutbol.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pricipal extends Activity {
	EditText eNombre, eApellido;
    TextView tVer;
    Button insertar, ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricipal);
        insertar = (Button)findViewById(R.id.insertar);
        ver = (Button)findViewById(R.id.ver);
        eNombre = (EditText)findViewById(R.id.nombre);
        eApellido = (EditText)findViewById(R.id.edad);
        tVer = (TextView)findViewById(R.id.tver);
        
        
    }

   
    	

   public void Insertar(View v){
	   String nombre = eNombre.getText().toString();
	   String apellido = eApellido.getText().toString();
	   Personas p = new Personas(Pricipal.this);
	   p.abrirSqlite();
	   p.insertar(nombre, apellido, 0);
	   p.cerrarSqlite();
   }
   public void Ver(View v){
   	Personas p = new Personas(Pricipal.this);
   	p.abrirSqlite();
   	String datos = p.ver();
   	p.cerrarSqlite();
   	tVer.setText(datos);
   }



    }


