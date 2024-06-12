package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // Handler to delay navigation to the main screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Navigate to the main screen after the delay
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close the IntroActivity
            }
        }, 2000); // Delay for 2 seconds
    }
}
