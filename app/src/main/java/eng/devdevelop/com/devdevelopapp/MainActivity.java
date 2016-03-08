package eng.devdevelop.com.devdevelopapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageButton btncamera = (ImageButton) findViewById(R.id.imageCamera);
    }

    public void GotoCameraActivity(View view){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);

    }

}
