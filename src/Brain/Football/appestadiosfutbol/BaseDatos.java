package Brain.Football.appestadiosfutbol;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {

	public BaseDatos(Context context) {
		super(context, "myPrimera.db", null, 1);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql="Create table persona(nombre Text, apellido Text);";
		db.execSQL(sql);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		
		
	}

}
