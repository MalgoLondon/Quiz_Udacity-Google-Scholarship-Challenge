package com.example.android.bodyshapequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by malgo on 05/02/2018.
 */

public class NinthActivityMen extends AppCompatActivity {
Button emailButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_men);

/**
 * This method is called when the 'submit' button is clicked
 * it sets the variable bodyTypeIndicator to a new value
 * it switches to a next screen
 */
        emailButton = findViewById(R.id.button_more);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NinthActivityMen.this, EmailActivity.class);
                startActivity(intent);
            }
        });

    }
}
