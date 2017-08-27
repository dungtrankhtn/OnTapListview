package com.tqd.quocdung.ontaplistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvlFruity;
    ArrayList<Fruity> fruityArrayList;
    FruityAdapter adapter;
    EditText edtSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();
        adapter = new FruityAdapter(this, R.layout.fruity_layout,fruityArrayList);
        lvlFruity.setAdapter(adapter);

    }

    private void Mapping() {
        lvlFruity = (ListView) findViewById(R.id.listviewFruity);
        fruityArrayList = new ArrayList<>();

        fruityArrayList.add(new Fruity( R.drawable.cam,"Cam","Cam sành"));
        fruityArrayList.add(new Fruity(R.drawable.cherry,"Cherry", "Cherry đỏ"));
        fruityArrayList.add(new Fruity(R.drawable.dau, "Dâu", "Dâu tây Đà Lạc"));
        fruityArrayList.add(new Fruity(R.drawable.dua,"Dừa", "Dừa sáp"));
        fruityArrayList.add(new Fruity(R.drawable.nho,"Nho", "Nho mỹ"));
        fruityArrayList.add(new Fruity(R.drawable.thanhlong, "Thanh long", "Thanh long Bình Thuận"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menuSearch:
                String text;
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
