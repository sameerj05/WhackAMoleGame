package com.example.whackymole;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9;
    TextView timertxt, scoretxt;
    Button startbtn;
    public static int score = 0;
    float hznB = 0f;
    float verB = 0f;
    ConstraintLayout layout;
    MainActivity mn;
    private final Random rand = new Random();
    final ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 1.5f, 1f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mn = MainActivity.this;
        setContentView(R.layout.activity_main);
        startbtn = findViewById(R.id.startbtn);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);

        timertxt = findViewById(R.id.timertxt);
        scoretxt = findViewById(R.id.scoretxt);
        hide();

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;

                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            synchronized (this) {
                                wait(5000);

                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        createMole();
                                        //timertxt.setText("GAME OVER!");
                                        //hide();

                                    }
                                });
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();
            }
        });

    }
    public void gameOver() {
        new Handler(Looper.getMainLooper()).post(new Runnable(){
            @Override
            public void run() {
                timertxt.setText("GAME OVER!");
                hide();
            }
        });

    }
    public boolean displayMole(int chance) {
        boolean done=false;
        new Handler(Looper.getMainLooper()).post(new Runnable(){
            @Override
            public void run() {
                switch (chance) {
                    case 1:
                        imageView1.setImageResource(R.drawable.startmoney);
                        imageView1.setVisibility(View.VISIBLE);
                        imageView1.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView1.setVisibility(View.INVISIBLE);
                        imageView1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            //    imageView1.setVisibility(View.VISIBLE);
                                imageView1.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView1.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });
                        break;
                    case 2:
                        imageView2.setImageResource(R.drawable.startmoney);
                        imageView2.setVisibility(View.VISIBLE);
                        imageView2.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView2.setVisibility(View.INVISIBLE);
                        imageView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            //    imageView2.setVisibility(View.VISIBLE);
                                imageView2.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView2.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();





                            }
                        });
                        break;
                    case 3:
                        imageView3.setImageResource(R.drawable.startmoney);
                        imageView3.setVisibility(View.VISIBLE);
                        imageView3.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView3.setVisibility(View.INVISIBLE);
                        imageView3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            //    imageView3.setVisibility(View.VISIBLE);
                                imageView3.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView3.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });

                        break;
                    case 4:
                        imageView4.setImageResource(R.drawable.startmoney);
                        imageView4.setVisibility(View.VISIBLE);
                        imageView4.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView4.setVisibility(View.INVISIBLE);
                        imageView4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            //    imageView4.setVisibility(View.VISIBLE);
                                imageView4.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView4.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();

                            }
                        });

                        break;
                    case 5:
                        imageView5.setImageResource(R.drawable.startmoney);
                        imageView5.setVisibility(View.VISIBLE);
                        imageView5.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView5.setVisibility(View.INVISIBLE);
                        imageView5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                          //      imageView5.setVisibility(View.VISIBLE);
                                imageView5.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView5.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });

                        break;
                    case 6:
                        imageView6.setImageResource(R.drawable.startmoney);
                        imageView6.setVisibility(View.VISIBLE);
                        imageView6.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView6.setVisibility(View.INVISIBLE);
                        imageView6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                           //     imageView6.setVisibility(View.VISIBLE);
                                imageView6.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView6.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });

                        break;
                    case 7:
                        imageView7.setImageResource(R.drawable.startmoney);
                        imageView7.setVisibility(View.VISIBLE);
                        imageView7.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView7.setVisibility(View.INVISIBLE);
                        imageView7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                               // imageView7.setVisibility(View.VISIBLE);
                                imageView7.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                scaleAnimation.setDuration(400);
                                doNothing();
                                imageView7.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });

                        break;
                    case 8:
                        imageView8.setImageResource(R.drawable.startmoney);
                        imageView8.setVisibility(View.VISIBLE);
                        imageView8.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView8.setVisibility(View.INVISIBLE);
                        imageView8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            //    imageView8.setVisibility(View.VISIBLE);
                                imageView8.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                doNothing();
                                scaleAnimation.setDuration(400);
                                imageView8.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });

                        break;
                    case 9:
                        imageView9.setImageResource(R.drawable.startmoney);
                        imageView9.setVisibility(View.VISIBLE);
                        imageView9.startAnimation(scaleAnimation);
                        scaleAnimation.setDuration(800);
                        doNothing();
                        imageView9.setVisibility(View.INVISIBLE);
                        imageView9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                            //    imageView9.setVisibility(View.VISIBLE);
                                imageView9.setImageResource(R.drawable.thumbsup);
                                view.startAnimation(scaleAnimation);
                                doNothing();
                                scaleAnimation.setDuration(400);
                                imageView9.setVisibility(view.INVISIBLE);
                                score++;
                                createTally();


                            }
                        });

                        break;
                }

                System.out.println("Score =" + score);
                scoretxt.setText(valueOf(score));
            }
        });
        done = true;
        return done;
    }




    public void hide() {
        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
        imageView7.setVisibility(View.INVISIBLE);
        imageView8.setVisibility(View.INVISIBLE);
        imageView9.setVisibility(View.INVISIBLE);

    }


    public void doNothing() {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 3;

            @Override
            public void run() {

                if (counter > 0) {
                    counter--;
                } else {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 100, 4000);
    }

    public void createMole() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 60;

            @Override
            public void run() {

                int chance;

                System.out.println("Bring me ma money!");
                if (counter > 0) {
                    System.out.println(" Timer in Thread :" + counter + " seconds");
                    timertxt.setText(counter + " seconds");
                    counter--;
                    chance = rand.nextInt(10);
                    System.out.println("Chance = " + chance);
                    if (displayMole(chance)) {
                        System.out.println("Mole displayed");
                    }

                } else {

                    System.out.println("Score =" + score);

                    System.out.println("Game over");
                    gameOver();
                    timer.cancel();
                }

            }

        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    public void createTally(){

        layout = findViewById(R.id.layout);
        ImageView check = new ImageView(MainActivity.this);
        check.setId(View.generateViewId());
        check.setImageResource(R.drawable.tally);
        ConstraintLayout.LayoutParams params1 = new ConstraintLayout.LayoutParams(50, 50);

        check.setLayoutParams(params1);
        layout.addView(check);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(layout);
        constraintSet.connect(check.getId(), ConstraintSet.TOP, layout.getId(), ConstraintSet.TOP);
        constraintSet.connect(check.getId(), ConstraintSet.BOTTOM, layout.getId(), ConstraintSet.BOTTOM);
        constraintSet.connect(check.getId(), ConstraintSet.LEFT, layout.getId(), ConstraintSet.LEFT);
        constraintSet.connect(check.getId(), ConstraintSet.RIGHT, layout.getId(), ConstraintSet.RIGHT);

        constraintSet.setVerticalBias(check.getId(), (float) hznB);
        constraintSet.setHorizontalBias(check.getId(), (float)verB);
        constraintSet.applyTo(layout);

        hznB+=0.6;

         if(hznB > 1.2){
           verB+=0.05;
            hznB = 0;
        }
    }
    /*
    public void TimeAdjustment (int counter){
        Random random = new Random();
        int countT = counter;
        int rand = random.nextInt(11)+1;
        if(rand == 3 || rand ==5 ){




        }

    }
    */

}