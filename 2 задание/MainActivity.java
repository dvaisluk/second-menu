package com.example.md172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_manu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.first:

                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.second:

                startActivity(new Intent(this, MainActivity2.class));
                break;
            case R.id.Third:

                startActivity(new Intent(this, MainActivity3.class));
                break;
            case R.id.Fourth:

                startActivity(new Intent(this, MainActivity4.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
