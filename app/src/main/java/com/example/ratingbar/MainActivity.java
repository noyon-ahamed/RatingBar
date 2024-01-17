package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   RatingBar ratingbar;
   TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ratingbar=findViewById(R.id.ratingbarid);
       textView=findViewById(R.id.textviewid);

       textView.setText("Value : "+ratingbar.getProgress());

       ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
           @Override
           public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               textView.setText("Value : "+rating);
           }
       });


    }
}