package arey.es.tema2_hoja5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ejercicio1 extends AppCompatActivity {

    public final static int MAXLENGTH = 4;

    private ImageView anImageView;
    private int imageCount = 0;

    private int[] imageArray = {R.drawable.android1, R.drawable.android2, R.drawable.android3, R.drawable.android4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        anImageView = (ImageView)findViewById(R.id.imageView1Ej1);
    }

    public void changeImage(View v) {
        if (++imageCount == MAXLENGTH) {
            imageCount = 0;
        }
        anImageView.setImageResource(imageArray[imageCount]);
    }
}
