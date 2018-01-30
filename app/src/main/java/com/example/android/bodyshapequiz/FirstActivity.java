package com.example.android.bodyshapequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    //declare variables and statics
    int bodyTypeIndicator;
    String nameValue;
    ImageButton yesButton;
    ImageButton noButton;
    ImageButton equalButton;

    public static final String NAME = "nameValue";
    public static final String SCORE = "bodyTypeIndicator";

    //perform action on creation of the page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //Get name and body type score from previous Activity.
        Bundle intentMain = getIntent().getExtras();
        nameValue = intentMain.getString(NAME);
        bodyTypeIndicator = intentMain.getInt(SCORE);

        //Sets welcome text using user's name.
        TextView nameUser = findViewById(R.id.welcome_view);
        nameUser.setText( getString(R.string.comment_first_activity_welcome) + nameValue + "!" + getString(R.string.comment_first_activity));

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
                Intent intentFirstYes = new Intent(FirstActivity.this, SecondActivity.class);
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
                Intent intentFirstNo = new Intent(FirstActivity.this, ThirdActivity.class);
                intentFirstNo.putExtra(NAME, nameValue);
                intentFirstNo.putExtra(SCORE, bodyTypeIndicator);
                startActivity(intentFirstNo);
                noButton.setEnabled(false);
            }
        });
        /**
         * This method is called when the 'equal' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to a next screen
         */
        equalButton = findViewById(R.id.button_equal);
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set body type indicator to a new value
                bodyTypeIndicator = bodyTypeIndicator + 3;
                //Open next Activity and pass on the name and the body type indicator score.
                Intent intentFirstEqual = new Intent(FirstActivity.this, FourthActivity.class);
                intentFirstEqual.putExtra(NAME, nameValue);
                intentFirstEqual.putExtra(SCORE, bodyTypeIndicator);
                startActivity(intentFirstEqual);
            }
        });

    }



}


