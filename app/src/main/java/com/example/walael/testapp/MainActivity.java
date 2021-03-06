package com.example.walael.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.edittext);

        Button button = (Button) findViewById(R.id.button);
        //button to have an action - start new Activity(HomeActivity)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("word", editText.getText().toString());
                startActivity(intent);
            }
        });

        //ADDITION:
        //Also, for the code of AsynchTask, and that for signing in while homepage is in the background.
        //(You could start with any, as I add the other activities)




    }




}
