package arey.es.tema2_hoja5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Ejercicio3 extends AppCompatActivity {

    public static final String TAG = "Ejercicio3";

    private TimePicker aTimePicker;
    private TextView aTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        aTimePicker = (TimePicker)findViewById(R.id.timePickerEj3);
        aTextView = (TextView)findViewById(R.id.textViewEj3);

        // Inicialización de la hora actual
        Calendar currentCalendar = Calendar.getInstance();
        aTimePicker.setCurrentHour(currentCalendar.get(Calendar.HOUR_OF_DAY));
        aTimePicker.setCurrentMinute(currentCalendar.get(Calendar.MINUTE));

        aTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Log.i(TAG, "La hora seleccionada es: " + aTimePicker.getCurrentHour() + ":" + aTimePicker.getCurrentMinute());
            }
        });
    }

    public void getTime(View v) {
        aTextView.setText("La hora seleccionada es: " + aTimePicker.getCurrentHour() + ":" + aTimePicker.getCurrentMinute());
    }
}
