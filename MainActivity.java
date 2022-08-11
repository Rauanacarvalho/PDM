package br.edu.ifpb.listaapprauana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView ListaDoramas;
    private ArrayAdapter ListaDoramasAdapter;
    private String[] doramas = {"Doom at your service", "Alchemy of souls", "Youth of may", "The devil's judge", "Happiness", "Big mouth", "Uncontrollably fond", "Run on", "Find me in your memory", "She would never know"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ListaDoramas = (ListView) findViewById(R.id.ListaDoramas);
        this.ListaDoramasAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,doramas);

        this.ListaDoramas.setAdapter(ListaDoramasAdapter);

        this.ListaDoramas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("Doramas", doramas[i]);

            }
        });
    }
}
