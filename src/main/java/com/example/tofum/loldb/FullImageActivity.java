package com.example.tofum.loldb;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListActivity;

public class FullImageActivity extends Activity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        //gets champion's abilities and displays in a list
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

//        GridView gridView = (GridView) findViewById(R.id.gridView3);
//        gridView.setAdapter(new AbilityImageAdapter(FullImageActivity.this, position));
//        gridView.setVerticalSpacing(20);

        //sets the champion portrait
        ImageAdapter adapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.championOriginalPortrait[position]);

        TextView textView = (TextView) findViewById(R.id.textView);
        ChampionData championName = new ChampionData();
        textView.setText(championName.getChampionName(position));

        AbilityData data = new AbilityData();
        AbilityImageAdapter image = new AbilityImageAdapter(this, 0);

        CustomListAdapter cadapter = new CustomListAdapter(this, data.aatroxName, data.aatroxDesc, image.getSet());

        list = (ListView)findViewById(R.id.list);
        list.setAdapter(cadapter);





        //imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
