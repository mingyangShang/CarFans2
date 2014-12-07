package com.smy.carfans.controller;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ab.view.sliding.AbSlidingPageView;
import com.ab.view.sliding.AbSlidingPlayView;
import com.smy.carfans.R;
import com.smy.carfans.global.CommonTools;


public class IndexActivity extends Activity {

    private AbSlidingPlayView playView;

    public final int PLAYVIEW_SIZE = 5; //上方滑动广告的个数

    private final LinearLayout.LayoutParams play_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

    private final int[] PLAY_IMG =  new int[]{
            R.drawable.newcar1,R.drawable.newcar2,R.drawable.newcar3,R.drawable.newcar4,R.drawable.newcar1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        initViews();
        initData();
    }


    //初始化控件
    private void initViews() {
        //初始化滑动广告view
        this.playView = (AbSlidingPlayView) findViewById(R.id.mAbSlidingPlayView);
        this.playView.setOnItemClickListener(new AbSlidingPlayView.AbOnItemClickListener() {
            @Override
            public void onClick(int i) {
                CommonTools.showMsg(IndexActivity.this, "clicked");
            }
        });
    }

    //得到数据
    private void initData() {
        for(int i=0;i<PLAYVIEW_SIZE;++i){
            ImageView img = new ImageView(this);
            img.setLayoutParams(play_params);
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            img.setImageResource(PLAY_IMG[i]);
            this.playView.addView(img);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }
}
