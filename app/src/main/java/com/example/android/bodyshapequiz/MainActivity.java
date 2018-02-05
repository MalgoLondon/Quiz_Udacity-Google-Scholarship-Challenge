package com.example.android.bodyshapequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String NAME = "nameValue";
    public static final String SCORE = "bodyTypeIndicator";
    private static RadioGroup radioG;
    int bodyTypeIndicator = 0;
    Button startButton;
    String nameValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * This method is called when the 'start' button is clicked
         * it sets the variable bodyTypeIndicator to a new value
         * it switches to a next screen
         */
        radioG = findViewById(R.id.rgroup_female_male);
        startButton = findViewById(R.id.button_start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //body type indicator is initiated in the main screen and passed on without change
                bodyTypeIndicator = bodyTypeIndicator;
                //name submitted by the user needs to get extracted to be passed on to the next activity
                EditText submitName = findViewById(R.id.insert_name_view);
                nameValue = submitName.getText().toString();

                //based on the checked value of the radio buttons, a different quiz will be open after clicking "Start" button
                RadioButton radioFemale = findViewById(R.id.radio_female);
                RadioButton radioMale = findViewById(R.id.radio_male);

                //opening quiz for women (passing name and body shape indicator on to the next activity)
                if (radioFemale.isChecked()) {
                    Toast.makeText(getApplicationContext(), "You are starting the quiz for female bodytypes", Toast.LENGTH_LONG).show();
                    Intent intentMain = new Intent(MainActivity.this, FirstActivity.class);
                    intentMain.putExtra(NAME, nameValue);
                    intentMain.putExtra(SCORE, bodyTypeIndicator);
                    startActivity(intentMain);
                }
                //opening quiz for men (passing name and body shape indicator on to the next activity)
                else if (radioMale.isChecked()) {
                    Toast.makeText(getApplicationContext(), "You are starting the quiz for male bodytypes", Toast.LENGTH_LONG).show();
                    Intent intentMainM = new Intent(MainActivity.this, FirstActivityMen2.class);
                    intentMainM.putExtra(NAME, nameValue);
                    intentMainM.putExtra(SCORE, bodyTypeIndicator);
                    startActivity(intentMainM);
                }
                //message to the user: gender must be selected
                else {
                    Toast.makeText(getApplicationContext(), "Please choose gender", Toast.LENGTH_LONG).show();

                }
            }

        });
    }
}

