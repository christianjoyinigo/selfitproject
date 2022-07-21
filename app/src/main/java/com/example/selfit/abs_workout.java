package com.example.selfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.security.cert.PKIXRevocationChecker;

public class abs_workout extends YouTubeBaseActivity {

    Dialog sitUp, mountainClimber, abdominalCrunches, russianTwist, heelTouch, sideBridges, bicycleCrunch, plank, vUp, legRaises;
    TextView closeVid;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //to remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_abs_workout);

        sitUp=new Dialog(this);
        mountainClimber=new Dialog(this);
        abdominalCrunches=new Dialog(this);
        russianTwist=new Dialog(this);
        sideBridges=new Dialog(this);
        heelTouch=new Dialog(this);
        plank=new Dialog(this);
        vUp=new Dialog(this);
        legRaises=new Dialog(this);
        bicycleCrunch=new Dialog(this);

    }

    public void back_press (View v) {
        onBackPressed();
    }

    public void ShowPopup_SitUp (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        sitUp.setContentView(R.layout.activity_sit_up_abs);
        txtclose = (TextView) sitUp.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) sitUp.findViewById(R.id.btnFollow_sit_up_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                sitUp.dismiss();
            }
        });
        sitUp.show();


        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                sitUp.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);

                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("swOyWKk7Oko");
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




    public void ShowPopup_MountainClimber (View v2){
        TextView txtclose;
        ImageButton btnFollow;
        mountainClimber.setContentView(R.layout.activity_mountain_climber_abs);
        txtclose = (TextView) mountainClimber.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) mountainClimber.findViewById(R.id.btnFollow2);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                mountainClimber.dismiss();
            }
        });
        mountainClimber.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mountainClimber.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("wQq3ybaLZeA");
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

    public void ShowPopup_Abdominal (View viewAbdominal){
        TextView txtclose;
        ImageButton btnFollow;
        abdominalCrunches.setContentView(R.layout.activity_abdominal_crunches_abs);
        txtclose = (TextView) abdominalCrunches.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) abdominalCrunches.findViewById(R.id.btnFollow_abdominal_crunches_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewAbdominal) {
                abdominalCrunches.dismiss();
            }
        });
        abdominalCrunches.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abdominalCrunches.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("RUNrHkbP4Pc");
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


    public void ShowPopup_HeelTouch (View viewHeelTouch){
        TextView txtclose;
        ImageButton btnFollow;
        heelTouch.setContentView(R.layout.activity_heel_touch_abs);
        txtclose = (TextView) heelTouch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) heelTouch.findViewById(R.id.btnFollow_heel_touch_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewHeelTouch) {
                heelTouch.dismiss();
            }
        });
        heelTouch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heelTouch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("9bR-elyolBQ");
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


    public void ShowPopup_SideBridges (View viewSideBridges){
        TextView txtclose;
        ImageButton btnFollow;
        sideBridges.setContentView(R.layout.activity_side_bridges_abs);
        txtclose = (TextView) sideBridges.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) sideBridges.findViewById(R.id.btnFollow_side_bridges_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSideBridges) {
                sideBridges.dismiss();
            }
        });
        sideBridges.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sideBridges.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("7ytbYd4CK3o");
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


    public void ShowPopup_ShowRussianTwist (View viewRussianTwist){
        TextView txtclose;
        ImageButton btnFollow;
        russianTwist.setContentView(R.layout.activity_russian_twist_abs);
        txtclose = (TextView) russianTwist.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) russianTwist.findViewById(R.id.btnFollow_russian_twist_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewRussianTwist) {
                russianTwist.dismiss();
            }
        });
        russianTwist.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                russianTwist.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("DJQGX2J4IVw");
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

    public void ShowPopup_ShowPlank (View viewPlank){
        TextView txtclose;
        ImageButton btnFollow;
        plank.setContentView(R.layout.activity_plank_abs);
        txtclose = (TextView) plank.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) plank.findViewById(R.id.btnFollow_plank_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewPlank) {
                plank.dismiss();
            }
        });
        plank.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plank.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("Fcbw82ykBvY");
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

    public void ShowPopup_ShowV_Up (View viewVUp){
        TextView txtclose;
        ImageButton btnFollow;
        vUp.setContentView(R.layout.activity_vup_abs);
        txtclose = (TextView) vUp.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) vUp.findViewById(R.id.btnFollow_v_up_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewVUp) {
                vUp.dismiss();
            }
        });
        vUp.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vUp.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("5kvKmRGADlQ");
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

    public void ShowPopup_ShowLegRaises (View viewLegRaises){
        TextView txtclose;
        ImageButton btnFollow;
        legRaises.setContentView(R.layout.activity_leg_raise_abs);
        txtclose = (TextView) legRaises.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) legRaises.findViewById(R.id.btnFollow_leg_raise_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewVUp) {
                legRaises.dismiss();
            }
        });
        legRaises.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legRaises.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);


                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("dGKbTKLnym4");
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

    public void ShowPopup_BicycleCrunch (View v3){
        TextView txtclose;
        ImageButton btnFollow;
        bicycleCrunch.setContentView(R.layout.activity_bicycle_crunches_abs);
        txtclose = (TextView) bicycleCrunch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) bicycleCrunch.findViewById(R.id.btnFollow_bicycle_crunches_video);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                bicycleCrunch.dismiss();
            }
        });
        bicycleCrunch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bicycleCrunch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), abs_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView = findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("-nJkAJpQemI");
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