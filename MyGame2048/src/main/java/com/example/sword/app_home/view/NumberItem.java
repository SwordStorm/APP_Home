package com.example.sword.app_home.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Sword on 2016/3/21.
 */
public class NumberItem extends FrameLayout {

    private TextView mTv;
    private int number;
    private int textNumber;

    public NumberItem(Context context) {
        super(context);
        initView(0);

    }

    public NumberItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(0);
    }
    public NumberItem(Context context,int number) {
        super(context);
        initView(0);
    }

    private void initView(int number) {
        setBackgroundColor(Color.GRAY);

        mTv = new TextView(getContext());
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        params.setMargins(5, 5, 5, 5);
        mTv.setGravity(Gravity.CENTER);

        setTextNumber(number);

        addView(mTv, params);

        this.number= number;

    }
    public int getNumber(){
        return  number;
    }


    public void setTextNumber(int num) {
        number = num;
        if(num==0)
            mTv.setText("");
        else
            mTv.setText(num+"");
        switch(num){
            case 0:
                mTv.setBackgroundColor(0x00000000); //ARGB
                break;
            case 2:
                mTv.setBackgroundColor(0xFFFFF5EE);

                break;
            case 4:
                mTv.setBackgroundColor(0xFFFFEC8B);

                break;
            case 8:
                mTv.setBackgroundColor(0xFFFFE4C4);
                break;
            case 16:
                mTv.setBackgroundColor(0xFFFFDAB9);
                break;
            case 32:
                mTv.setBackgroundColor(0xFFFFC125);
                break;
            case 64:
                mTv.setBackgroundColor(0xFFFFB6C1);
                break;
            case 128:
                mTv.setBackgroundColor(0xFFFFA500);
                break;
            case 256:
                mTv.setBackgroundColor(0xFFFF83FA);
                break;
            case 512:
                mTv.setBackgroundColor(0xFFFF7F24);
                break;
            case 1024:
                mTv.setBackgroundColor(0xFFFF6A6A);
                break;
            case 2048:
                mTv.setBackgroundColor(0xFFFF1493);
                break;
            case 4096:
                mTv.setBackgroundColor(0xFFFF3030);
                break;

        }
    }
}
