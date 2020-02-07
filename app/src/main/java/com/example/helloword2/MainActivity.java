package com.example.helloword2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = new TextView(this);
        view.setText("Hallo ?");
       // setContentView(view);

        EditText edt = new EditText(this);
        edt.setText("Share ur story");
       // setContentView(edt);

        Button btn = new Button(this);
        btn.setText("SAVE");
       // setContentView(btn);

    }
}
