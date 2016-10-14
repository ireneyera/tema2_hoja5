package arey.es.tema2_hoja5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

import java.util.Calendar;

public class Ejercicio4 extends AppCompatActivity {

    public static final String TAG = "Ejercicio4";
    private DatePicker aDatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4);

        aDatePicker = (DatePicker)findViewById(R.id.datePicker);


        Calendar aCalendar = Calendar.getInstance();
        aDatePicker.init(aCalendar.get(Calendar.YEAR), aCalendar.get(Calendar.MONTH), aCalendar.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                        Log.i(TAG, "Fecha seleccionada " + aDatePicker.getDayOfMonth() + "/" + aDatePicker.getMonth() + "/" +
                        aDatePicker.getYear());
                    }
                });
    }
}
