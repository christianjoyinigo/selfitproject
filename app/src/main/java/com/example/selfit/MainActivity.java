package com.example.selfit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotificationChannel();

        this.setTitle("Workout");

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.workout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.workout:
                        return true;
                    case R.id.reminder:
                        startActivity(new Intent(getApplicationContext()
                                ,Reminder.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    private void createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "SelFit";
            String desc = "SelFit: Fitness Application";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("SelFit", name, importance);
            channel.setDescription(desc);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);

        }

    }

    public void abs(View view) {
        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
        startActivity(intent);
    }

    public void chest(View view) {
        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
        startActivity(intent);
    }

    public void arm(View view) {
        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
        startActivity(intent);
    }

    public void legs(View view) {
        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
        startActivity(intent);
    }
}