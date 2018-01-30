package com.example.android.bodyshapequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class SixthActivity extends AppCompatActivity {
    int bodyTypeIndicator;
    ImageButton yesButton;
    ImageButton noButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        /**
         * This method is called when the 'yes' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to a next screen
         */

        yesButton = (ImageButton) findViewById(R.id.button_yes);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bodyTypeIndicator = bodyTypeIndicator+1;
                Intent intent = new Intent(SixthActivity.this, EightActivity.class);
                startActivity(intent);
                yesButton.setEnabled(false);
            }
        });

        /**
         * This method is called when the 'no' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to a next screen
         */
        noButton = (ImageButton) findViewById(R.id.button_no);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bodyTypeIndicator = bodyTypeIndicator;
                Intent intent = new Intent(SixthActivity.this, SeventhActivity.class);
                startActivity(intent);
                noButton.setEnabled(false);
            }
        });

    }
}

