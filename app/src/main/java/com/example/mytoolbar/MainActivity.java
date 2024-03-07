package com.example.mytoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolBar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.tool_bar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.Help) Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
        else if(id==R.id.seach) Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
        else if(id==R.id.home) Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();


        return true;
    }
}