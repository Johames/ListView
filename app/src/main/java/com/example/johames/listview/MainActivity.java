package com.example.johames.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    private ListView lista;
    private ArrayAdapter ListaCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(ListView)findViewById(R.id.listView);
        String Valuesxml[] = getResources().getStringArray(R.array.array);
        ListaCursos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Valuesxml);
        lista.setOnItemClickListener(this);
        lista.setAdapter(ListaCursos);



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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        switch (i){
            case 0:
                Intent ListviewIMG = new Intent(MainActivity.this, ActivityList.class);
                startActivity(ListviewIMG);
                break;
            case 1:
                Intent Listview = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(Listview);
                break;
            case 2:
                Intent Spinner = new Intent(MainActivity.this, Spinner.class);
                startActivity(Spinner);
                break;
            case 3:
                Intent Drawer = new Intent(MainActivity.this, Main22Activity.class);
                startActivity(Drawer);
                break;
        }

    }
}
