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

public class leg_workout extends YouTubeBaseActivity {

    Dialog lunge, sideLunge, curstyLunges, adductorStretch, sideLegCircle, spineLumbar, legLift, quadStretch, frogPress, kneeHops;
    TextView closeVid;
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_leg_workout);

        lunge=new Dialog(this);
        sideLunge=new Dialog(this);
        curstyLunges=new Dialog(this);
        adductorStretch=new Dialog(this);
        sideLegCircle=new Dialog(this);
        spineLumbar=new Dialog(this);
        legLift=new Dialog(this);
        quadStretch=new Dialog(this);
        frogPress=new Dialog(this);
        kneeHops=new Dialog(this);



    }

    public void back_press (View v) {
        onBackPressed();
    }

    public void ShowPopup_lunge (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        lunge.setContentView(R.layout.activity_leg_lunge);
        txtclose = (TextView) lunge.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) lunge.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                lunge.dismiss();
            }
        });
        lunge.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                lunge.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("Z_0p0I8B4EU");
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

    public void ShowPopup_sideLunge (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        sideLunge.setContentView(R.layout.activity_leg_side_lunges);
        txtclose = (TextView) sideLunge.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) sideLunge.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                sideLunge.dismiss();
            }
        });
        sideLunge.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                sideLunge.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("tlUg1DXhHm8");
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

    public void ShowPopup_curstyLunges (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        curstyLunges.setContentView(R.layout.activity_leg_cursty_lunges);
        txtclose = (TextView) curstyLunges.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) curstyLunges.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                curstyLunges.dismiss();
            }
        });
        curstyLunges.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                curstyLunges.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("-rTyKlHjYT8");
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

    public void ShowPopup_adductorStretch (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        adductorStretch.setContentView(R.layout.activity_leg_adductor_stretch);
        txtclose = (TextView) adductorStretch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) adductorStretch.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                adductorStretch.dismiss();
            }
        });
        adductorStretch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                adductorStretch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("MjFb2MyaNjs");
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

    public void ShowPopup_sideLegCircle (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        sideLegCircle.setContentView(R.layout.activity_leg_side_circles);
        txtclose = (TextView) sideLegCircle.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) sideLegCircle.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                sideLegCircle.dismiss();
            }
        });
        sideLegCircle.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                sideLegCircle.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("VgysBPnVJWg");
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

    public void ShowPopup_spineLumbar (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        spineLumbar.setContentView(R.layout.activity_leg_spine_lumbar_twist);
        txtclose = (TextView) spineLumbar.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) spineLumbar.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                spineLumbar.dismiss();
            }
        });
        spineLumbar.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                spineLumbar.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("ryNlb_0GmAw");
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

    public void ShowPopup_legLift (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        legLift.setContentView(R.layout.activity_leg_bottom_leg_lift);
        txtclose = (TextView) legLift.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) legLift.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                legLift.dismiss();
            }
        });
        legLift.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                legLift.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("Dm1GSX1vItY");
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

    public void ShowPopup_quadStretch (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        quadStretch.setContentView(R.layout.activity_leg_quad_stretch);
        txtclose = (TextView) quadStretch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) quadStretch.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                quadStretch.dismiss();
            }
        });
        quadStretch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                quadStretch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("TfcRyYf7WLg");
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

    public void ShowPopup_frogPress (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        frogPress.setContentView(R.layout.activity_leg_frog_press);
        txtclose = (TextView) frogPress.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) frogPress.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                frogPress.dismiss();
            }
        });
        frogPress.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                frogPress.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("JvA7t9xKWgg");
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

    public void ShowPopup_kneeHops (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        kneeHops.setContentView(R.layout.activity_leg_lunge_kneehops);
        txtclose = (TextView) kneeHops.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) kneeHops.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                kneeHops.dismiss();
            }
        });
        kneeHops.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                kneeHops.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), leg_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("NSy3QKsZ7uI");
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