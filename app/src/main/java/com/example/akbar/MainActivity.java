

package com.example.akbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;
/*import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;*/




public class MainActivity<var> extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lv_listView = (ListView) findViewById(R.id.lv_listView); //listView
    /*String[] a_1stSource = new String[5];
    a_1stSource[0] = "Water";
    a_1stSource[1] = "Vegetables";
    a_1stSource[2] = "Snake";
    a_1stSource[3] = "Food";
    a_1stSource[4] = "whatever";*/


    String[] a_1stSource = {
        "water",
        "vegetables",
        "Snake",
        "Food"
    };/*
    public String[] something() {
        //super(context, DB_NAME, null, DB_VER);
        String[] a_1stSource = {
                "water",
                "vegetables",
                "Snake",
                "Food"
        };
        Context context = this;
        return a_1stSource;
    }*/

    private Object ArrayAdapter;
    private Object adapter =  ArrayAdapter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        //attachBaseContext();
        setContentView(R.layout.activity_main);
        //context = this;

        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())){

            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
        }


        //adapter = ArrayAdapter<>(this,android.R.layout.simple_list_item_1, a_1stSource);
        //a_1stView = findViewById(R.id.a_1stView); // id is 7
        //ArrayAdapter adapter = setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, a_1stSource));
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.food));
        //attachBaseContext(context);
        //MainActivity lv_listView;
        lv_listView.setAdapter(adapter);
        lv_listView.getOnItemClickListener(AdapterView.OnItemClickListener{getParent(),findViewById(7),id ->
                Toast.makeText(getApplicationContext(), getParent().getString(R.array.food),Toast.LENGTH_SHORT).show()}; //idk how to get it to be str
        View tv_emptyTextView = null; // tv_emptyTextView should come from layout\activity_main   and not be null
        lv_listView.setEmptyView(tv_emptyTextView);



       // a_1stView.setAdapter(adapter);

            /*Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Material Search");
            toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

            MaterialSearchView searchView = (MaterialSearchView)findViewById(R.id.search_view);*/


    }

    /*private ArrayAdapter setListAdapter(ArrayAdapter<String> stringArrayAdapter) {
        return null;
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.activity_main,menu);
        MenuItem item = menu.findItem(R.id.action_search); //id is 6
        MenuItem search = menu.findItem(R.menu.activity_main);
        int action_search = 0; //this shouldn't work
        MenuItem searchView = search.setActionView(action_search);

        searchView.setOnMenuItemClickListener(searchView.setOnMenuItemClickListener());
        return super.onCreateOptionsMenu(menu);

    }

    /*public String[] something() {
        //super(context, DB_NAME, null, DB_VER);
        String[] a_1stSource = {
                "water",
                "vegetables",
                "Snake",
                "Food"
        };
        Context context = this;
        return a_1stSource;
    }*/


    private void doMySearch(String query) {


    }

    private void setSupportActionBar(Toolbar toolbar) {


    }

    //private Context context;
}




