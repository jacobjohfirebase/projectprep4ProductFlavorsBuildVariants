package com.examplemobileappcompany.projectprep4productflavorsbuildvariants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);


        textView.setText(R.string.type);
        String buildInfo = textView.getText().toString();
        textView.setText("The build variant is: " + buildInfo);
    }
}
