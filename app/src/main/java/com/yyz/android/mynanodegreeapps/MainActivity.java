package com.yyz.android.mynanodegreeapps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //btn=(Button)findViewById(R.id.button2);
       // btn.setOnClickListener(this);
        int[] ids = {R.id.button, R.id.button2, R.id.button3,R.id.button4,R.id.button5,R.id.button6};
        for (int id:ids) {
            Button b = (Button) findViewById(id);
            b.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View v) {

        Context context = getApplicationContext();
        String text="This button will launch " ;
        switch (v.getId()) {
            case R.id.button:
                text +="Spotify Streamer" ;
                break;
            case R.id.button2:
                text+="Scores App";
                break;
            case R.id.button3:
                text+="Library App";
                break;
            case R.id.button4:
                text+="Build It Bigger";
                break;
            case R.id.button5:
                text+="XYZ Reader";
                break;
            case R.id.button6:
                text+="My Capstone App";
                break;
            default:break;

        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
