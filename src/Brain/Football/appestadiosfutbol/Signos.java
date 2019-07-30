package Brain.Football.appestadiosfutbol;



import Brain.Football.appestadiosfutbol.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Signos extends Activity implements View.OnClickListener{

	private TextView tvDisplayDate;
	private DatePicker dpResult;
	private Button btnChangeDate;
	RatingBar ratingbar1;
    Button button;

	private int year = 1990;
	private int month;
	private int day;
	
	private int Acuario = R.drawable.a1;
	private int	Pisis = R.drawable.a2;
	private int Aries = R.drawable.a3;
	private int	Tauro = R.drawable.a4;
	private int	Geminis = R.drawable.b1;
	private int Cancer = R.drawable.b2;
	private int	Leo = R.drawable.b3;
	private int	Virgo = R.drawable.b4;
	private int	Libra = R.drawable.ij;
	private int	Escorpion = R.drawable.im;
	private int	Saguitario = R.drawable.j;
	private int	Capricornio = R.drawable.x;
	
	private ImageView signo;
	private TextView respuesta;
	

	static final int DATE_DIALOG_ID = 999;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signos);
		signo = (ImageView) findViewById(R.id.signo);
		respuesta = (TextView) findViewById(R.id.serie);
		iniciarElementos();
		setCurrentDateOnView();
		addListenerOnButton();

	}

	// display current date
	public void setCurrentDateOnView() {

		tvDisplayDate = (TextView) findViewById(R.id.tvDate);
		/*dpResult = (DatePicker) findViewById(R.id.dpResult);

		final Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);*/

		// set current date into textview
		tvDisplayDate.setText(new StringBuilder()
			// Month is 0 based, just add 1
			.append(month + 1).append("-").append(day).append("-")
			.append(year).append(" "));

		// set current date into datepicker
		/*dpResult.init(year, month, day, null);*/
		

	}
	 public void iniciarElementos(){
	        ratingbar1=(RatingBar)findViewById(R.id.ratingBar1);
	        button=(Button)findViewById(R.id.button);
	        //Performing action on Button Click
	        button.setOnClickListener(this);
	    }
	 public void onClick(View arg0) {
	        String rating=String.valueOf(ratingbar1.getRating());
	        Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
	    }

	public void addListenerOnButton() {

		btnChangeDate = (Button) findViewById(R.id.btnChangeDate);

		btnChangeDate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				showDialog(DATE_DIALOG_ID);
				Toast.makeText(getApplicationContext(), "Elige La fecha del Estadio Que lo Inaguraron", Toast.LENGTH_LONG).show();

			}

		});

	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
		   // set date picker as current date
		   return new DatePickerDialog(this, datePickerListener, 
                         year, month,day);
		}
		return null;
	}

	private DatePickerDialog.OnDateSetListener datePickerListener 
                = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
			year = selectedYear;
			month = selectedMonth;
			day = selectedDay;

			// set selected date into datepicker also
			
			/*dpResult.init(year, month, day, null);*/
			
			tvDisplayDate.setText(new StringBuilder().append(month + 1)
					   .append("-").append(day).append("-").append(year)
					   .append(" "));
			if(month == 0 ){
				Toast.makeText(getApplicationContext(), "Estadio Omnilife", Toast.LENGTH_LONG).show();
				signo.setImageResource(Acuario);
				respuesta.setText("El Estadio Omnilife fue inaugurado en el año 2010 destacando por sobre todos los estadios de México");
			}
			else if(month == 1){
				Toast.makeText(getApplicationContext(), "Territorio Santos Modelos", Toast.LENGTH_LONG).show();
				signo.setImageResource(Pisis);
				respuesta.setText("Inaugurado en 1993 y remodelado en 2014 y 2011, el ‘Huracán’ como también es conocido, es un estadio de primer mundo, con butacas estratégicamente acomodadas para disfrutar de los partidos de futbol sin necesidad de moverte o estar incómodo");
			}
			else if(month == 2){
				Toast.makeText(getApplicationContext(), "Estadio Azteca", Toast.LENGTH_LONG).show();
				signo.setImageResource(Aries);
				respuesta.setText("Que no se puede decir de este estadio que no se haya dicho antes. Histórico, gigante, y uno de los más emblemáticos no sólo en la historia del futbol mexicano, sino del futbol mundial.");
			}
			else if(month == 3){
				Toast.makeText(getApplicationContext(), "Estadio BBVA Bancomer", Toast.LENGTH_LONG).show();
				signo.setImageResource(Tauro);
				respuesta.setText("El nuevo estadio del Monterrey es simplemente una joya arquitectónica de primer mundo y el gran esfuerzo que Grupo FEMSA, se ve reflejado en como quedó el inmueble, simplemente el mejor de México. Cuenta con la impresionante capacidad para 51 mil aficionados.");
			}
			else if(month == 4){
				Toast.makeText(getApplicationContext(), "Santiago Bernabeu", Toast.LENGTH_LONG).show();
				signo.setImageResource(Geminis);
				respuesta.setText("Es el estadio del Real Madrid, uno de los dos equipos más importantes de España y del mundo. Los merengues juegan sus partidos de local allí desde 1947 y tiene una capacidad para 80.400 fanáticos.");
			}
			else if(month == 5){
				Toast.makeText(getApplicationContext(), "Giuseppe Meazza", Toast.LENGTH_LONG).show();
				signo.setImageResource(Cancer);
				respuesta.setText("Ubicado en la ciudad de Milán, en Italia, es compartido por los dos equipos locales: el A.C. Milan y el Internazionale. Su capacidad es de 80.000 espectadores y se lo llama San Siro, siendo uno de los estadios más grandes del país.");
			}
			else if(month == 6){
				Toast.makeText(getApplicationContext(), "Wembley", Toast.LENGTH_LONG).show();
				signo.setImageResource(Leo);
				respuesta.setText("Localizado en la ciudad de Londres y es el estadio más emblemático de Inglaterra. También se lo llama Nuevo Wembley porque una gran parte fue demolida y reconstruida entre 2003 y 2007. ");
			}
			else if(month == 7){
				Toast.makeText(getApplicationContext(), "Allianz Arena", Toast.LENGTH_LONG).show();
				signo.setImageResource(Virgo);
				respuesta.setText("Un paseo por Munich debe incluir esta parada. El Allianz Arena es el estadio del Bayern Munich y el 1860 Munich. Tiene toda la tecnología imaginada, siendo de los estadios más modernos del mundo. ");
			}
			else if(month == 8){
				Toast.makeText(getApplicationContext(), "Estadio Maracaná(Río de Janeiro)", Toast.LENGTH_LONG).show();
				signo.setImageResource(Libra);
				respuesta.setText("Es un estadio remodelado actualmente para mundial 2015");
			}
			else if(month == 9){
				Toast.makeText(getApplicationContext(), "Estadio Monumental(Lima)", Toast.LENGTH_LONG).show();
				signo.setImageResource(Escorpion);
				respuesta.setText("esun estadio muy grande y el popular del pais");
			}
			else if(month == 10){
				Toast.makeText(getApplicationContext(), "Estadio Mane Garrincha(Brasilia)", Toast.LENGTH_LONG).show();
				signo.setImageResource(Saguitario);
				respuesta.setText("es nuevo estadio porque actualmente se jugo el mundial");
			}
			else if(month == 11){
				Toast.makeText(getApplicationContext(), "Estadio Morumbí(Sao Paulo)", Toast.LENGTH_LONG).show();
				signo.setImageResource(Capricornio);
				respuesta.setText("Un estadio muy bonito y fue remodelado actualmente");
			}
			
		}
	};

}