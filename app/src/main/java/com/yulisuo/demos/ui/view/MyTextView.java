package com.yulisuo.demos.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatTextView;

import com.yulisuo.demos.utils.MLog;

public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);

        if (widthMode == MeasureSpec.EXACTLY) {
            MLog.i(null,"width mode:EXACTLY, size:%s", widthSize);
        } else if (widthMode == MeasureSpec.AT_MOST) {
            MLog.i(null,"width mode:AT_MOST, size:%s", widthSize);
        } else if (widthMode == MeasureSpec.UNSPECIFIED) {
            MLog.i(null,"width mode:UNSPECIFIED, size:%s", widthSize);
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
