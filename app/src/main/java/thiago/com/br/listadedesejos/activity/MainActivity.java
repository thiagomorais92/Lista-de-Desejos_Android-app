package thiago.com.br.listadedesejos.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import thiago.com.br.listadedesejos.R;
import thiago.com.br.listadedesejos.adapter.AdaptadorDeDesejos;
import thiago.com.br.listadedesejos.model.Desejo;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dos_desejos);
        mListView = (ListView) findViewById(R.id.listaDeDesejos);
        List<Desejo> desejos = new ArrayList<Desejo>();
        mListView.setAdapter(new AdaptadorDeDesejos(this,desejos));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.action_addDesejo:
                Intent it = new Intent(MainActivity.this,NovoDesejoActivity.class);
                startActivity(it);
        }
    }
}
