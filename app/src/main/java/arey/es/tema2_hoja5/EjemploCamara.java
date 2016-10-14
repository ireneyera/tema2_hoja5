package arey.es.tema2_hoja5;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class EjemploCamara extends AppCompatActivity {

    private ImageView anImageView;
    public static final int TAKE_PICTURE_ACTION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_camara);

        anImageView = (ImageView)findViewById(R.id.imageViewExample);
    }

    public void takePicture(View v) {
        Intent anIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(anIntent, TAKE_PICTURE_ACTION);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("TAG", "onActivityResult");
        if ((resultCode == RESULT_OK) && (requestCode == TAKE_PICTURE_ACTION)){
            Bitmap anImageData = (Bitmap)data.getExtras().get("data");
            if (anImageData != null) {
                anImageView.setImageBitmap(anImageData);
            } else {
                Log.i("TAG", "null data");
            }
        }
    }
}
