package com.example.nurlan.smsproverka;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class ZabyliParolActivity extends AppCompatActivity {
    Spinner sp;
    TextView tw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zabyli_parol);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sp = (Spinner) findViewById(R.id.spinner);
        tw = (TextView) findViewById(R.id.twpochta);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zabylparol, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        tw = (TextView) findViewById(R.id.twpochta);
        //noinspection SimplifiableIfStatement
        if (id == R.id.pochta) {
            int p = sp.getSelectedItemPosition();

            switch (p){
                case 0:
                    tw.setText("Зима");
                    break;
                case 1:
                    tw.setText("Зима");
                    break;
                case 2:
                    tw.setText("Весна");
                    break;
                case 3:
                    tw.setText("Весна");
                    break;
                case 4:
                    tw.setText("Весна");
                    break;

            }
        }

        return super.onOptionsItemSelected(item);
    }





}
