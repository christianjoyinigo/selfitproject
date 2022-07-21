package com.example.selfit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class Reminder extends AppCompatActivity {


    TimePicker timePicker;
    String strTime;
    TextView alarmSets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        this.setTitle("Reminder");

        SharedPreferences sharedPreferences = getSharedPreferences("alarmData", MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        strTime = sharedPreferences.getString("alarmValue", "");



        timePicker = findViewById(R.id.timepicker);

        findViewById(R.id.setAlarm).setOnClickListener(v->{
            Calendar calendar = Calendar.getInstance();

            if (Build.VERSION.SDK_INT >= 23){
                calendar.set(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        timePicker.getHour(),
                        timePicker.getMinute(),
                        0

                );

                int hr = timePicker.getHour();
                String extTime = "";

                if (hr > 12){
                    hr = hr-12;
                    extTime = "PM";

                    if (timePicker.getMinute() < 10) {
                        strTime = String.valueOf(hr) + ":0" + timePicker.getMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }else{
                        strTime = String.valueOf(hr) + ":" + timePicker.getMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }
                }else{
                    extTime = "AM";
                    if (timePicker.getMinute() < 10) {
                        strTime = String.valueOf(hr) + ":0" + timePicker.getMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }else{
                        strTime = String.valueOf(hr) + ":" + timePicker.getMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }
                }

            }else{
                calendar.set(
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        timePicker.getCurrentHour(),
                        timePicker.getCurrentMinute(),
                        0

                );

                int hr = timePicker.getCurrentHour();
                String extTime = "";

                if (hr > 12){
                    hr = hr-12;
                    extTime = "PM";
                    if (timePicker.getCurrentMinute() < 10) {
                        strTime = String.valueOf(hr) + ":0" + timePicker.getCurrentMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }else{
                        strTime = String.valueOf(hr) + ":" + timePicker.getCurrentMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }
                }else{
                    extTime = "AM";
                    if (timePicker.getCurrentMinute() < 10) {
                        strTime = String.valueOf(hr) + ":0" + timePicker.getCurrentMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }else{
                        strTime = String.valueOf(hr) + ":" + timePicker.getCurrentMinute() + " " + extTime;
                        edit.putString("alarmValue", strTime);
                        edit.commit();
                    }
                }


            }

            setAlarm(calendar.getTimeInMillis());

        });

        findViewById(R.id.cancelAlarm).setOnClickListener(v->{
            AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            Intent intent = new Intent(this, alarmreceiver.class);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0 , intent, 0);

            if (alarmManager == null){
                alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            }

            alarmManager.cancel(pendingIntent);
            Toast.makeText(this, "Alarm Cancelled", Toast.LENGTH_SHORT).show();

            strTime = "HH:MM AM/PM";
            edit.putString("alarmValue", strTime);
            edit.commit();

        });

        findViewById(R.id.popUpAlarmSet).setOnClickListener(v->{
            popUpAlarm();
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.reminder);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.workout:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.reminder:
                        return true;
                }
                return false;
            }
        });
    }
    
    @Override
    protected void onResume(){
        super.onResume();
        
        SharedPreferences sharedPreferences = getSharedPreferences("alarmData", MODE_PRIVATE);
        String noData = sharedPreferences.getString("alarmValue", "");



        final View showUp = getLayoutInflater().inflate(R.layout.popup_set_alarm, null);

        strTime = noData;

        TextView alarmSet = showUp.findViewById(R.id.sets);
        alarmSet.setText(noData);
        alarmSet.setText(strTime);



    }
    
    @Override
    protected  void onPause(){
        super.onPause();
        
        SharedPreferences sharedPreferences = getSharedPreferences("alarmData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        final View popUp = getLayoutInflater().inflate(R.layout.popup_set_alarm, null);

        alarmSets = popUp.findViewById(R.id.sets);

        editor.putString("alarmValue", alarmSets.getText().toString());
        editor.putString("alarmValue", strTime);
        editor.apply();
    }

    public void popUpAlarm(){
        SharedPreferences sharedPreferences = getSharedPreferences("alarmData", MODE_PRIVATE);
        AlertDialog dialog;
        AlertDialog.Builder adBuilder = new AlertDialog.Builder(this);
        final View showUp = getLayoutInflater().inflate(R.layout.popup_set_alarm, null);
        String get = sharedPreferences.getString("alarmValue", "");
        alarmSets = showUp.findViewById(R.id.sets);

        alarmSets.setText(get);

        adBuilder.setView(showUp);
        dialog = adBuilder.create();
        dialog.show();

    }

    private void setAlarm(long timeInMillis) {

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(this, alarmreceiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);

        alarmManager.setRepeating(AlarmManager.RTC, timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent);

        Toast.makeText(this, "Alarm set Successful", Toast.LENGTH_SHORT).show();

    }
}
