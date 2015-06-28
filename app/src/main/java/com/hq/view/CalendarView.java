package com.hq.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.Calendar;

/**
 * Created by heqing on 2015/6/27.
 */
public class CalendarView extends ImageView{

    private static final  String TAG = "CalenderView";
    private Calendar mNowCalender;

    public CalendarView(Context context) {
        super(context);
    }

    public CalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private boolean initCalendarView()
    {

        return true;
    }
}
