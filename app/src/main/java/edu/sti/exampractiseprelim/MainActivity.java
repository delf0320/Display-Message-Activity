package edu.sti.exampractiseprelim;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String TAG_clr = "Clear is Clicked!";
    private static final String TAG_sub = "Clear is Clicked!";

    public void clear(View v){
        EditText ed_clear = (EditText) findViewById(R.id.et_name);
        ed_clear.setText("");
        EditText ed_clear1 = (EditText) findViewById(R.id.et_bname);
        ed_clear1.setText("");
        Log.d(TAG_clr, "Clear Is Clicked!");
    }
    public void send(View v){

        Intent i = new Intent(this, DisplayMessage.class);

        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_bname = (EditText) findViewById(R.id.et_bname);

        String etname = et_name.getText().toString();
        String etbname = et_bname.getText().toString();

        i.putExtra("Username",etname);
        i.putExtra("Password",etbname);

        startActivity(i);

        Log.d(TAG_sub, "Submit Is Clicked!");

    }

}
