package edu.adamumkc.leilashairmuseumhistory;

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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button search_button;
    Button museum_info_button;
    Button about_leila_button;
    Button home_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        search_button = (Button)findViewById(R.id.search_button);
        search_button.setOnClickListener(this);

        museum_info_button = (Button)findViewById(R.id.museum_info_button);
        museum_info_button.setOnClickListener(this);

        about_leila_button = (Button)findViewById(R.id.about_leila_button);
        about_leila_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.search_button:
                searchbuttonOnClick();
                break;

            case R.id.museum_info_button:
                museuminfobuttonOnClick();
                break;

            case R.id.about_leila_button:
                aboutleilabuttonOnClick();
                break;
        }
    }



    public void searchbuttonOnClick(){

        startActivity(new Intent(getApplicationContext(), search.class));
    }

    public void museuminfobuttonOnClick(){

        startActivity(new Intent(getApplicationContext(), museum_info.class));
    }

    public void aboutleilabuttonOnClick(){

        startActivity(new Intent(getApplicationContext(), about_leila.class));
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
