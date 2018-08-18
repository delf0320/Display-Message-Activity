package edu.sti.exampractiseprelim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayMessage extends AppCompatActivity { 

    String etname;
    String  etbname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent i = getIntent();
        etname = i.getStringExtra("Username");
        etbname= i.getStringExtra("Password");


        TextView tv_name = (TextView ) findViewById(R.id.tv_a);
        TextView tv_bname = (TextView ) findViewById(R.id.tv_b);

        tv_name.setText(etname.toString() + "\n");
        tv_bname.setText(etbname.toString());

         }
}
