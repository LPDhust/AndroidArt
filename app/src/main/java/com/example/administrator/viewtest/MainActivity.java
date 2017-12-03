package com.example.administrator.viewtest;

import android.support.v4.widget.ViewDragHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int mLastX;
    private int mLastY;

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        View view = findViewById(R.id.drag_view);
//       // int[] location = new int[2];
//       // view.getLocationOnScreen(location);
//        mLastX = (int) view.getX();
//        mLastY = (int) view.getY();
//        view.setOnTouchListener(this);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        int x = (int) motionEvent.getRawX();
//        int y = (int) motionEvent.getRawY();
//        switch (motionEvent.getAction()){
//            case MotionEvent.ACTION_DOWN:{
//                break;
//            }
//            case MotionEvent.ACTION_MOVE:{
//                int deltaX = x - mLastX;
//                int deltaY = y - mLastY;
//               // int translationX = (int) ViewDragHelper.getTranslationX(this)
//                break;
//            }
//            case MotionEvent.ACTION_UP:{
//                break;
//            }
//            default:
//                break;
//        }
//        return false;
//    }
}
