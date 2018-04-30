package com.example.android.bodyshapequiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

public class EmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);

    }

    public void submitEmail(View view) {
        EditText submitEmail = (EditText) findViewById(R.id.emailsubmit);
        String emailValue = submitEmail.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"malgo.babiarz.wardrobe@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "More information about body shapes");
        intent.putExtra(Intent.EXTRA_TEXT, "Please send more information about my body shape to: " + emailValue);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


}