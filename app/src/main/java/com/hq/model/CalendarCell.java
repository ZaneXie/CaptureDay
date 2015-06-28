package com.hq.model;

import android.graphics.Paint;

import android.graphics.Rect;

import com.hq.myapplication.Calendar;

/**
 * Created by heqing on 2015/6/27.
 */
public class CalendarCell {
    private static final String TAG = "CalendarCell";
    protected Rect mBound;
    protected int mDayOfMonth;
    protected Paint mPaint = new Paint(Paint.SUBPIXEL_TEXT_FLAG
            | Paint.ANTI_ALIAS_FLAG);

    public CalendarCell(int dayOfMonth, Rect rect)
    {
        mDayOfMonth = dayOfMonth;
        mBound = rect;
    }


}
