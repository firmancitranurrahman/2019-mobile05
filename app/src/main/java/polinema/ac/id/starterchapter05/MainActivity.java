package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.activitiies.ActivityTugas;
import polinema.ac.id.starterchapter05.activitiies.DynamicActivity;
import polinema.ac.id.starterchapter05.activitiies.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleStaticFragment(View view) {
        Intent intent = new Intent(this, StaticActivity.class);
        startActivity(intent);
    }

    public void handleDynamicFragment(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }

    public void handleButtonPraktikum(View view) {
        Intent intent = new Intent(this, ActivityTugas.class);
        startActivity(intent);

    }
}
