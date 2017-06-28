package sarveshchavan777.inrerface2;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

import sarveshchavan777.inrerface2.application.AppController;


public class Category extends Activity {
    ImageView imageView;
    TextView tv,tvPersonality,tvSports,tvGeography,tvScience,tvArts,tvEntertainment;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    DemoHelperClass demoHelperClass;
   /* private AdView mAdView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        //initialize
        imageView = (ImageView) findViewById(R.id.leftcategory);
        imageView1 = (ImageView) findViewById(R.id.image1);
        imageView2 = (ImageView) findViewById(R.id.image2);
        imageView3 = (ImageView) findViewById(R.id.image3);
        imageView4 = (ImageView) findViewById(R.id.image4);
        imageView5 = (ImageView) findViewById(R.id.image5);
        imageView6 = (ImageView) findViewById(R.id.image6);

        tv = (TextView) findViewById(R.id.textviewcategory);
        tvPersonality = (TextView) findViewById(R.id.Personality);
        tvSports = (TextView) findViewById(R.id.Sports);
        tvGeography = (TextView) findViewById(R.id.Geography);
        tvScience = (TextView) findViewById(R.id.Science);
        tvArts = (TextView) findViewById(R.id.Arts);
        tvEntertainment = (TextView) findViewById(R.id.Entertainment);
        tv.setText("Select Category");

      /*  //admob
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/




        //typefaces
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/shablagooital.ttf");
        tv.setTypeface(typeface);
        tvPersonality.setTypeface(typeface);
        tvSports.setTypeface(typeface);
        tvGeography.setTypeface(typeface);
        tvScience.setTypeface(typeface);
        tvArts.setTypeface(typeface);
        tvEntertainment.setTypeface(typeface);

       //animations
        imageView1.startAnimation(inFromLeftAnimation());
        imageView2.startAnimation(inFromRightAnimation());
        imageView3.startAnimation(inFromLeftAnimation());
        imageView4.startAnimation(inFromRightAnimation());
        imageView5.startAnimation(inFromLeftAnimation());
        imageView6.startAnimation(inFromRightAnimation());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent=new Intent(Category.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,SecoundSlidingMain.class);
                startActivity(intent);
                demoHelperClass = new DemoHelperClass(Category.this);
                SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
                demoHelperClass.optimiseDatabase();
                finish();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,SportsSlidingMain.class);
                startActivity(intent);
                demoHelperClass = new DemoHelperClass(Category.this);
                SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
                demoHelperClass.optimiseDatabase();
                finish();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,GeoSlidingMain.class);
                startActivity(intent);
                demoHelperClass = new DemoHelperClass(Category.this);
                SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
                demoHelperClass.optimiseDatabase();
                finish();

            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,ScienceSlidingMain.class);
                startActivity(intent);
                demoHelperClass = new DemoHelperClass(Category.this);
                SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
                demoHelperClass.optimiseDatabase();
                finish();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,ArtsSlidingMain.class);
                startActivity(intent);
                demoHelperClass = new DemoHelperClass(Category.this);
                SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
                demoHelperClass.optimiseDatabase();
                finish();
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,EntertainmentSlidingMain.class);
                startActivity(intent);
                demoHelperClass = new DemoHelperClass(Category.this);
                SQLiteDatabase sqLiteDatabase = demoHelperClass.getWritableDatabase();
                demoHelperClass.optimiseDatabase();
                finish();
            }
        });

/*
        final   int []imageArray6={R.drawable.entarteinment2,R.drawable.entarteinment22};
        final Handler handler6 = new Handler();
        Runnable runnable6 = new Runnable() {
            int i=0;
            public void run() {
                imageView6.setImageResource(imageArray6[i]);

                i++;
                if(i>imageArray6.length-1)
                {
                    i=0;
                }
                handler6.postDelayed(this, 800);  //for interval...
            }
        };
        handler6.postDelayed(runnable6, 4000); //for initial delay..*/
    }

        private Animation inFromRightAnimation() {

            Animation inFromRight = new TranslateAnimation(
                    Animation.RELATIVE_TO_PARENT, +1.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f,
                    Animation.RELATIVE_TO_PARENT, 0.0f);
            inFromRight.setDuration(600);
            inFromRight.setInterpolator(new AccelerateInterpolator());
            return inFromRight;
        }
    private Animation inFromLeftAnimation() {
        Animation inFromLeft = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, -1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f);
        inFromLeft.setDuration(600);
        inFromLeft.setInterpolator(new AccelerateInterpolator());
        return inFromLeft;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       Intent intent=new Intent(Category.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}