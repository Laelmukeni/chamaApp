package com.example.walael.testapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        GridLayout largeGrid = (GridLayout)findViewById(R.id.GridLayout);
        setSingleEvent(largeGrid);


        //get Intent from MainActivity
        TextView displayText = (TextView) findViewById(R.id.firstDisplay);
        String display = getIntent().getStringExtra("word");
        displayText.setText(display);


    }



    private void setSingleEvent(GridLayout largeGrid) {
        //loop all chuld items in largeGrid
        for(int i =0; i < largeGrid.getChildCount(); i++){

            //every child item is cardview, thus, to locate the position of a single child item
            CardView cardview = (CardView)largeGrid.getChildAt(i);
            final int final_int = i;
            //ABOVE: to get the integer of the child's position

            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //Intent to start another activity
                    Intent intent1 = new Intent(HomeActivity.this, ChamaProfile_Activity.class);
                    intent1.putExtra("Child_info", "This is corresponding Activity "+final_int);
                    startActivity(intent1);



                }
            });
        }
    }
}
