package teamtreehouse.com.stormy.UI;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ArrayAdapter;

import java.util.Arrays;

import teamtreehouse.com.stormy.R;
import teamtreehouse.com.stormy.adapters.DayAdapter;
import teamtreehouse.com.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mdays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        // 1st param is the array we wanna use this case parcelables
        // 2nd param is the length of it
        // 3rd param is the type of the array that we want to convert
        mdays = Arrays.copyOf(parcelables,parcelables.length,Day[].class);


        DayAdapter adapter = new DayAdapter(this, mdays);
        setListAdapter(adapter);

    }

}
