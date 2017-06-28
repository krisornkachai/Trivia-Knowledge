package sarveshchavan777.inrerface2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public  class EntertainmentSlidingMain extends AppCompatActivity {
    private ViewPager mPager;
    private SlidingTabLayout mTabs;
    int numboftabs =3;
    public int icon[] = {R.drawable.strawberry1, R.drawable.strawberry2, R.drawable.strawberry3};
    public String[] text= {"easy", "medium","hard"};
    ImageView leftdifficultyent;
    TextView textViewDifficultyent,easyent,mediument,hardent;
    //mainactivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entertainmentslidingmain);
        leftdifficultyent=(ImageView)findViewById(R.id.leftdifficultyent);
        textViewDifficultyent=(TextView)findViewById(R.id.textviewdifficultyent);
        easyent=(TextView)findViewById(R.id.easyent);
        mediument=(TextView)findViewById(R.id.mediument);
        hardent=(TextView)findViewById(R.id.hardent);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/shablagooital.ttf");
        textViewDifficultyent.setTypeface(typeface);
        easyent.setTypeface(typeface);
        mediument.setTypeface(typeface);
        hardent.setTypeface(typeface);
        leftdifficultyent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(EntertainmentSlidingMain.this,Category.class);
                startActivity(intent);
                finish();
            }
        });

        mPager=(ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(new MyPageerAdapterEntertainment(getSupportFragmentManager(),icon,numboftabs,getApplicationContext()));

        mTabs=(SlidingTabLayout)findViewById(R.id.tabs);
        mTabs.setCustomTabView(R.layout.customtablayoutentertainment,R.id.textTab);
        mTabs.setDistributeEvenly(true);
        mTabs.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.entartenment));
        mTabs.setSelectedIndicatorColors(ContextCompat.getColor(getApplicationContext(),R.color.colorAccent));
        mTabs.setViewPager(mPager);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(this,Category.class);
        startActivity(intent);
        finish();
    }
}