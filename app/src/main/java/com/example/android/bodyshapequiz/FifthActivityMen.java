package com.example.android.bodyshapequiz;


/**
 * Created by malgo on 31/01/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class FifthActivityMen extends AppCompatActivity {

    public static final String NAME = "nameValue";
    public static final String SCORE = "bodyTypeIndicator";
    //declare variables and statics
    int bodyTypeIndicator;
    String nameValue;
    ImageButton yesButton;
    ImageButton noButton;

    //perform action on creation of the page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_men);

        /*
         * This method is called when the 'yes' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to the next screen
         */

        yesButton = findViewById(R.id.button_yes);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set body type indicator to a new value
                bodyTypeIndicator = bodyTypeIndicator + 1;

                //Open next Activity and pass on the name and the body type indicator score.
                Intent intentFirstYes = new Intent(FifthActivityMen.this, SixthActivityMen.class);
                intentFirstYes.putExtra(NAME, nameValue);
                intentFirstYes.putExtra(SCORE, bodyTypeIndicator);
                startActivity(intentFirstYes);
                yesButton.setEnabled(false);
            }
        });

        /**
         * This method is called when the 'no' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to the next screen
         */
        noButton = findViewById(R.id.button_no);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set body type indicator to a new value
                bodyTypeIndicator = bodyTypeIndicator + 2;

                //Open next Activity and pass on the name and the score.
                Intent intentFirstNo = new Intent(FifthActivityMen.this, SeventhActivityMen.class);
                intentFirstNo.putExtra(NAME, nameValue);
                intentFirstNo.putExtra(SCORE, bodyTypeIndicator);
                startActivity(intentFirstNo);
                noButton.setEnabled(false);
            }
        });


    }


}

