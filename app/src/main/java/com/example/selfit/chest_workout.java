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
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class chest_workout extends YouTubeBaseActivity {

    Dialog dynamicChest, pushup, inclinePushup, hinduPushup, cobraStretch, kneePushup, lungeKneeHops, chestPressPulse, straggeredPushup, wallPushup;
    TextView closeVid;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_chest_workout);

        dynamicChest=new Dialog(this);
        pushup=new Dialog(this);
        inclinePushup=new Dialog(this);
        hinduPushup=new Dialog(this);
        cobraStretch=new Dialog(this);
        kneePushup=new Dialog(this);
        lungeKneeHops=new Dialog(this);
        chestPressPulse=new Dialog(this);
        straggeredPushup=new Dialog(this);
        chestPressPulse=new Dialog(this);
        wallPushup=new Dialog(this);
    }

    public void back_press (View v) {
        onBackPressed();
    }

    public void ShowPopup_dynamicChest (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        dynamicChest.setContentView(R.layout.activity_dynamic_chest);
        txtclose = (TextView) dynamicChest.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) dynamicChest.findViewById(R.id.btnFollow_dynamic_chest);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dynamicChest.dismiss();
            }
        });
        dynamicChest.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                dynamicChest.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);
                
                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });
                
                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("kLmWN3Qsj0A");
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

    public void ShowPopup_pushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        pushup.setContentView(R.layout.activity_pushup_chest);
        txtclose = (TextView) pushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) pushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                pushup.dismiss();
            }
        });
        pushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                pushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("R08gYyypGto");
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

    public void ShowPopup_inclinePushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        inclinePushup.setContentView(R.layout.activity_incline_pushup_chest);
        txtclose = (TextView) inclinePushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) inclinePushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                inclinePushup.dismiss();
            }
        });
        inclinePushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                inclinePushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("3WUUeM07i_Q");
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

    public void ShowPopup_hinduPushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        hinduPushup.setContentView(R.layout.activity_chest_hindu_pushup);
        txtclose = (TextView) hinduPushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) hinduPushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                hinduPushup.dismiss();
            }
        });
        hinduPushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                hinduPushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("HE0ijmUc6Og");
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

    public void ShowPopup_cobraStretch (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        cobraStretch.setContentView(R.layout.activity_chest_cobra_stretch);
        txtclose = (TextView) cobraStretch.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) cobraStretch.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                cobraStretch.dismiss();
            }
        });
        cobraStretch.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                cobraStretch.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("z21McHHOpAg");
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

    public void ShowPopup_kneePushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        kneePushup.setContentView(R.layout.activity_chest_knee_pushup);
        txtclose = (TextView) kneePushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) kneePushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                kneePushup.dismiss();
            }
        });
        kneePushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                kneePushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("jWxvty2KROs");
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

    public void ShowPopup_lungeKneeHops (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        lungeKneeHops.setContentView(R.layout.activity_chest_lunge_knee_hops);
        txtclose = (TextView) lungeKneeHops.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) lungeKneeHops.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                lungeKneeHops.dismiss();
            }
        });
        lungeKneeHops.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                lungeKneeHops.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("VSgej87ULzU");
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

    public void ShowPopup_chessPressPulse (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        chestPressPulse.setContentView(R.layout.activity_chest_press_pulse);
        txtclose = (TextView) chestPressPulse.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) chestPressPulse.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                chestPressPulse.dismiss();
            }
        });
        chestPressPulse.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                chestPressPulse.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("Fz4oo1vFo9M");
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

    public void ShowPopup_straggeredPushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
        straggeredPushup.setContentView(R.layout.activity_chest_straggered_pushup);
        txtclose = (TextView) straggeredPushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) straggeredPushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                straggeredPushup.dismiss();
            }
        });
        straggeredPushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                straggeredPushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("JWNTTiAQMhc");
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

    public void ShowPopup_wallPushup (View viewSitUp){
        TextView txtclose;
        ImageButton btnFollow;
       wallPushup.setContentView(R.layout.activity_chest_wall_pushup);
        txtclose = (TextView) wallPushup.findViewById(R.id.txtclose);
        btnFollow= (ImageButton) wallPushup.findViewById(R.id.btnFollow);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewSitUp) {
                wallPushup.dismiss();
            }
        });
        wallPushup.show();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                wallPushup.dismiss();
                setContentView(R.layout.activity_video_player);
                closeVid=findViewById(R.id.vid_close);

                closeVid.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                        Intent intent= new Intent(getApplicationContext(), chest_workout.class);
                        startActivity(intent);
                    }
                });

                youTubePlayerView=findViewById(R.id.youtube_player_view);
                YouTubePlayer.OnInitializedListener listener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        youTubePlayer.loadVideo("EOf3cGIQpA4");
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