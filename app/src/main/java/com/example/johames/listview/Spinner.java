package com.example.johames.listview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Spinner extends Activity {

    android.widget.Spinner spinner;
    String[] spinnerlista = {"Seleccionar", "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (android.widget.Spinner)findViewById(R.id.SpinneR);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.lista, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adaptador);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        Toast toast1 = Toast.makeText(getApplicationContext(), spinnerlista[position], Toast.LENGTH_LONG);
                        toast1.show();
                        break;
                    case 2:
                        Toast toast2 = Toast.makeText(getApplicationContext(), spinnerlista[position], Toast.LENGTH_LONG);
                        toast2.show();
                        break;
                    case 3:
                        Toast toast3 = Toast.makeText(getApplicationContext(), spinnerlista[position], Toast.LENGTH_LONG);
                        toast3.show();
                        break;
                    case 4:
                        Toast toast4 = Toast.makeText(getApplicationContext(), spinnerlista[position], Toast.LENGTH_LONG);
                        toast4.show();
                        break;
                    case 5:
                        Toast toast5 = Toast.makeText(getApplicationContext(), spinnerlista[position], Toast.LENGTH_LONG);
                        toast5.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spinner, menu);
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
