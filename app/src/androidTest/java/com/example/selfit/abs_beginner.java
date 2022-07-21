package com.example.selfit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class abs_beginner extends AppCompatActivity {


    ImageButton backButton;
    Dialog myDialog;
    Dialog myDialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_abs_beginner);

        backButton=findViewById(R.id.back_button);

        myDialog=new Dialog(this);
        myDialog2=new Dialog(this);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void ShowPopup (View v1){
        TextView txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.activity_incline_pushup_abs);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        btnFollow= (Button) myDialog.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

    public void ShowPopup2 (View v2){
        TextView txtclose2;
        Button btnFollow2;
        myDialog2.setContentView(R.layout.activity_mountain_climber_abs);
        txtclose2 = (TextView) myDialog2.findViewById(R.id.txtclose2);
        btnFollow2= (Button) myDialog2.findViewById(R.id.btnFollow2);
        txtclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                myDialog2.dismiss();
            }
        });
        myDialog2.show();

        btnFollow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View y2) {
                Intent intent= new Intent(getApplicationContext(), youtube_player_mountain_climber.class);
                startActivity(intent);

                }
        });
    }
}