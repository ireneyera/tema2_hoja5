package arey.es.tema2_hoja5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Ejercicio2 extends AppCompatActivity {

    private ImageView myImageView;
    private int currentImage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        myImageView = (ImageView)findViewById(R.id.imageViewEj2);
    }

    public void changeImage(View v) {
        currentImage = (currentImage+1)%2;
        if (currentImage == 0) {
            myImageView.setImageResource(R.drawable.android2);
        } else {
            myImageView.setImageResource(R.drawable.android1);
        }

    }
}
