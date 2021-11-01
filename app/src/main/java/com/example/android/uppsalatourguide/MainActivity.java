package com.example.android.uppsalatourguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tempTextView, weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempTextView = (TextView) findViewById(R.id.temperature);
        weather = (TextView) findViewById(R.id.weather);
        findWeather();

        ArrayList<Subject> subject = new ArrayList<>();
        subject.add(new Subject(getString(R.string.eventsMain), R.drawable.event));
        subject.add(new Subject(getString(R.string.tasteMain), R.drawable.taste));
        subject.add(new Subject(getString(R.string.serviceMain), R.drawable.services));
        subject.add(new Subject(getString(R.string.placeMain), R.drawable.botanicgrden));

        SubjectAdapter subjectList = new SubjectAdapter(this, subject);
        ListView listView = (ListView) findViewById(R.id.listViewId);
        listView.setAdapter(subjectList);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            switch (position) {
                case 0:
                    Intent intentEvent = new Intent(MainActivity.this, Events.class);
                    startActivity(intentEvent);
                    break;
                case 1:
                    Intent intentTaste = new Intent(MainActivity.this, Taste.class);
                    startActivity(intentTaste);
                    break;
                case 2:
                    Intent intentServices = new Intent(MainActivity.this, Services.class);
                    startActivity(intentServices);
                    break;
                case 3:
                    Intent intentPlaces = new Intent(MainActivity.this, Places.class);
                    startActivity(intentPlaces);
                    break;
            }
        });
    }

    public void findWeather() {

        String url = "http://api.openweathermap.org/data/2.5/weather?q=Uppsala&appid=591dfcb4823d88ab64a1a551aee0f211&units=Imperial";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, response -> {
            try {
                JSONObject jsonResponse = new JSONObject(response);
                JSONObject jsonObjectMain = jsonResponse.getJSONObject("main");
                JSONArray jsonArray = jsonResponse.getJSONArray("weather");
                JSONObject jsonObjectWeather = jsonArray.getJSONObject(0);
                double temp = (jsonObjectMain.getDouble("temp") - 32) / 1.8000;
                int newTemp = (int) Math.round(temp);
                tempTextView.setText(String.valueOf(newTemp));
                String description = jsonObjectWeather.getString("description");
                weather.setText(description);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }, error -> {
        });
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(stringRequest);
    }
}
