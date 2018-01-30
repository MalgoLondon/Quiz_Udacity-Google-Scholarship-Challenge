package com.example.android.bodyshapequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int bodyTypeIndicator = 0;
    Button startButton;
    String nameValue;



    private static RadioGroup radioG;


    public static final String NAME = "nameValue";
    public static final String SCORE = "bodyTypeIndicator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * This method is called when the 'start' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to a next screen
         */
        radioG = (RadioGroup) findViewById(R.id.rgroup_female_male);
        startButton = findViewById(R.id.button_start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bodyTypeIndicator = bodyTypeIndicator;
                EditText submitName = findViewById(R.id.insert_name_view);
                nameValue = submitName.getText().toString();
                RadioButton radioFemale = findViewById(R.id.radio_female);
                RadioButton radioMale = findViewById(R.id.radio_male);

                if (radioFemale.isChecked()) {
                    Toast.makeText(getApplicationContext(), "You are starting the quiz for female bodytypes", Toast.LENGTH_LONG).show();
                    Intent intentMain = new Intent(MainActivity.this, FirstActivity.class);
                    intentMain.putExtra(NAME, nameValue);
                    intentMain.putExtra(SCORE, bodyTypeIndicator);
                    startActivity(intentMain);
                }
                else if (radioMale.isChecked()){
                    Toast.makeText(getApplicationContext(), "You are starting the quiz for male bodytypes", Toast.LENGTH_LONG).show();
                    Intent intentMain = new Intent(MainActivity.this, FirstActivity.class);
                    intentMain.putExtra(NAME, nameValue);
                    intentMain.putExtra(SCORE, bodyTypeIndicator);
                    startActivity(intentMain);
                 }
                 else {
                    Toast.makeText(getApplicationContext(), "Please choose gender", Toast.LENGTH_LONG).show();

                }
            }

        });
    }
}

