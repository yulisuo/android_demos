package com.yulisuo.demos.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import com.yulisuo.demos.R;
import com.yulisuo.demos.utils.MLog;

public class TextViewActivity extends AppCompatActivity {

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, TextViewActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        setTitle("TextView Demo");

        initViews();
    }

    private void initViews() {
        final TextView tv = findViewById(R.id.textView);
//        tv.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                if (tv.getWidth() > 0) {
//                    tv.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//
//                    MLog.i(null,"text width:%s", tv.getWidth());
//
//                    ViewGroup.LayoutParams layoutParams = tv.getLayoutParams();
//                    int layoutParamsWidth = layoutParams.width;
//                    MLog.i(null,"layoutParamsWidth:%s", layoutParamsWidth);
//                }
//            }
//        });

        Drawable[] drawable = tv.getCompoundDrawables();
// 数组下表0~3,依次是:左上右下
        drawable[1].setBounds(50, 50, 400, 200);
        tv.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);
    }
}