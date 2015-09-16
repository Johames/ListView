package com.example.johames.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListviewIMG extends Activity {

    ListViewAdapter ListaCursoAdapter;
    ListView lv_ListaCursos;
    String[] titulo = new String[]{
            "titulo1",
            "titulo2",
            "titulo3",
            "titulo4",
    };

    int[] imagenes = {
            R.drawable.icon01,
            R.drawable.icon02,
            R.drawable.images,
            R.drawable.troll
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_img);

        lv_ListaCursos = (ListView) findViewById(R.id.johann);
        ListaCursoAdapter = new ListViewAdapter(this,titulo,imagenes);
        lv_ListaCursos.setAdapter(ListaCursoAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_listview_img, menu);
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
