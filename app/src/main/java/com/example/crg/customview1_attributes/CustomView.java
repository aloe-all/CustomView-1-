package com.example.crg.customview1_attributes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by crg on 16-6-9.
 */
public class CustomView extends View {
    private static final String TAG = CustomView.class.getSimpleName();

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomView, R.attr.defStyleAttr_custom, R.style.customview_style);
        String str = null;
        int textSize = 0;
        int textColor = 0;
        int n = typedArray.getIndexCount();
        for (int i = 0; i < n; i++){
            switch (typedArray.getIndex(i)){
                case R.styleable.CustomView_android_text:
                    str = typedArray.getString(typedArray.getIndex(i));
                    break;
                case R.styleable.CustomView_textsize:
                    textSize = typedArray.getInteger(typedArray.getIndex(i), 1);
                    break;
                case R.styleable.CustomView_textcolor:
                    textColor = typedArray.getInteger(typedArray.getIndex(i), 1);
                    break;

            }
        }
        Log.d(TAG, ">>>>>>>>>>>>>>>>> str: " + str);
        Log.d(TAG, ">>>>>>>>>>>>>>>>> textSize: " + textSize);
        Log.d(TAG, ">>>>>>>>>>>>>>>>> textColor: " + textColor);
        //xml布局文件的值通过Log打出来


        //资源回收
        typedArray.recycle();
    }
}
