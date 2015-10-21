package teamtreehouse.com.stormy.weather;

import teamtreehouse.com.stormy.R;

/**
 * Created by joaoelvas on 20/10/15.
 */
public class Forecast {

    private Current mCurrent;
    private Hour[] mHours;
    private Day[] mDays;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHour() {
        return mHours;
    }

    public void setHourlyForecast(Hour[] hours) {
        mHours = hours;
    }

    public Day[] getDays() {
        return mDays;
    }

    public void setDailyForecast(Day[] days) {
        mDays = days;
    }

    public Hour[] getDailyForecast() {
        return mHours;
    }

    public static int getIconId(String iconString) {

        // clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night.
        int iconId = R.drawable.clear_day;

        if (iconString.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        } else if (iconString.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        } else if (iconString.equals("rain")) {
            iconId = R.drawable.rain;
        } else if (iconString.equals("snow")) {
            iconId = R.drawable.snow;
        } else if (iconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        } else if (iconString.equals("wind")) {
            iconId = R.drawable.wind;
        } else if (iconString.equals("fog")) {
            iconId = R.drawable.fog;
        } else if (iconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        } else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        } else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }
}