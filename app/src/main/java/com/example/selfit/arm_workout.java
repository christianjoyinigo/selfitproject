package com.example.selfit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class arm_workout extends YouTubeBaseActivity {

    Dialog shoulderStretch, armRaises, sideArmRaise, armCircle, floorTricepDip, punches, tricepStretch, armCurlCrunch, armPronePushup, reverseAngel;
    TextView closeVid;
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_arm_workout);

        shoulderStretch=new Dialog(this);
        armRaises=new Dialog(this);
        sideArmRaise=new Dialog(this);
        armCircle=new Dialog(this);
        floorTricepDip=new Dialog(this);
        punches=new Dialog(this);
        tricepStretch=new Dialog(this);
        armCurlCrunch=new Dialog(this);
        armPronePushup=new Dialog(this);
        reverseAngel=new Dialog(this);


    }

    public void back_press (View v) {
        onBackPressed();
    }

    public void ShowPopup_shoulderStretch (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        shoulderStretch.setContentView(R.layout.activity_arm_shoulder_stretch);
        txtclose = (TextView) shoulderStretch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) shoulderStretch.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                shoulderStretch.dismiss();
            }
        });
        shoulderStretch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                shoulderStretch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("9k0EN2RCGgU");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_armRaises (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        armRaises.setContentView(R.layout.activity_arm_raises);
        txtclose = (TextView) armRaises.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) armRaises.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                armRaises.dismiss();
            }
        });
        armRaises.show();
    }

    public void ShowPopup_sideArmRaise (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        sideArmRaise.setContentView(R.layout.activity_arm_side_raise);
        txtclose = (TextView) sideArmRaise.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) sideArmRaise.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                sideArmRaise.dismiss();
            }
        });
        sideArmRaise.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                sideArmRaise.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("9k0EN2RCGgU");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_armCircle (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        armCircle.setContentView(R.layout.activity_arm_circles);
        txtclose = (TextView) armCircle.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) armCircle.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                armCircle.dismiss();
            }
        });
        armCircle.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                armCircle.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("h6GkzSA5tTc");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_floorTricepDip (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        floorTricepDip.setContentView(R.layout.activity_floor_tricep_dips);
        txtclose = (TextView) floorTricepDip.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) floorTricepDip.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                floorTricepDip.dismiss();
            }
        });
        floorTricepDip.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                floorTricepDip.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("geNkbcZ6qDo");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_punches (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        punches.setContentView(R.layout.activity_arm_punches);
        txtclose = (TextView) punches.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) punches.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                punches.dismiss();
            }
        });
        punches.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                punches.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("reeBHtZJ1ts");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_tricepStretch (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        tricepStretch.setContentView(R.layout.activity_arm_triceps_stretch);
        txtclose = (TextView) tricepStretch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) tricepStretch.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                tricepStretch.dismiss();
            }
        });
        tricepStretch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                tricepStretch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("L9IGOcrdcFk");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_armCurlCrunch (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        armCurlCrunch.setContentView(R.layout.activity_arm_curl_crunch);
        txtclose = (TextView) armCurlCrunch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) armCurlCrunch.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                armCurlCrunch.dismiss();
            }
        });
        armCurlCrunch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                armCurlCrunch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("pxsOe8MJq68");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_armPronePushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        armPronePushup.setContentView(R.layout.activity_arm_prone_pushup);
        txtclose = (TextView) armPronePushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) armPronePushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                armPronePushup.dismiss();
            }
        });
       armPronePushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                armPronePushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("Rr43jMaoJ9g");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }

    public void ShowPopup_reverseAngel (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        reverseAngel.setContentView(R.layout.activity_arm_reverse_angels);
        txtclose = (TextView) reverseAngel.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) reverseAngel.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                reverseAngel.dismiss();
            }
        });
        reverseAngel.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                reverseAngel.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), arm_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("0qLP2RNKX4A");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Toast.makeText(getApplicationContext(),
                                "Initialization Failed", Toast.LENGTH_LONG).show();

                    }
                };
                youTubePlayerView.initialize("AIzaSyCFZZYQOnoh_Kz4GGeWVD34HzZGefSHuxM",listener);
            }
        });
    }
}