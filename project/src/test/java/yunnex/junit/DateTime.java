package yunnex.junit;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public  class  DateTime {


    /**
     * 获取当前日期
     */
    public static String setToday(){
            //获取当前日期
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String endtime =sdf.format(today);
        return endtime;
    }

    /**
     * 获取从当前日期到30天之前这段时间
     * @return
     */
    public static String todayThirtyDay(){
        Date today=new Date();
        //获取三十天前日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar theCa = Calendar.getInstance();
        theCa.setTime(today);
        theCa.add(theCa.DATE, -30);//最后一个数字30可改，30天的意思
        Date start = theCa.getTime();
        String startDate = sdf.format(start);//三十天之前日期
        return startDate;
    }

}
