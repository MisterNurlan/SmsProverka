package com.example.nurlan.smsproverka;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextLogin;
    TextView textView;
    EditText editTextPassowrd;
    Button enterbutton;
    String etloginString;
    String etpasswordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        enterbutton = (Button) findViewById(R.id.enterbutton);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextPassowrd = (EditText) findViewById(R.id.editTextPassowrd);
        textView = (TextView) findViewById(R.id.textView);

    }


    public void onClickEnter(View view) {
        etloginString = editTextLogin.getText().toString();
        etpasswordString = editTextPassowrd.getText().toString();
        if (etloginString.equals("") || (etpasswordString.equals(""))) {
            Toast t = Toast.makeText(this, "Поле ввода пусто, ввежите данные ", Toast.LENGTH_LONG);
            t.show();
        }  else {
            Intent i = new Intent(this, RegistraciyaActivity.class);
            startActivity(i);
        }
    }

    public void onClickZabylParol(View view) {
        Intent i = new Intent(this, ZabyliParolActivity.class);
        startActivity(i);
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
