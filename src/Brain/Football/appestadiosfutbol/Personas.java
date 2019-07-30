package Brain.Football.appestadiosfutbol;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Personas {

	Context contextoEjecucion;
	BaseDatos creador;
	SQLiteDatabase mDatos;
	private String comentario;
	

public Personas (Context c){
	contextoEjecucion = c;
}
public Personas abrirSqlite(){
	creador = new BaseDatos (contextoEjecucion);
	mDatos = creador.getWritableDatabase();
	return this;
}
public long insertar(String nombre, String apellido, int edad){
	ContentValues c = new ContentValues();
	c.put ("nombre", nombre);
	c.put ("apellido", apellido);
	return mDatos.insert("persona", null, c);
}
public String ver(){
	String datos="";
	creador = new BaseDatos (contextoEjecucion);
	mDatos = creador.getReadableDatabase();
	String sql = ("Select * from persona");
	Cursor cur = mDatos.rawQuery(sql, null);
	int i=0;
	cur.moveToFirst();
	do{
		datos+= cur.getString(0) + " " + cur.getString(1) +  "\n";
	}while (cur.moveToNext());
	return datos;
		
	}
public void cerrarSqlite(){
	
	creador.close();
	
}
}
