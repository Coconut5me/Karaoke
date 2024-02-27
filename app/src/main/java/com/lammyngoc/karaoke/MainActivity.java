package com.lammyngoc.karaoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import com.lammyngoc.karaoke.adapter.SongAdapter;
import com.lammyngoc.karaoke.model.Love;
import com.lammyngoc.karaoke.model.Song;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TabHost tabSong;
    ListView lvSong,lvLove;
    ImageButton btnLike, btnDislike;
    SongAdapter songAdapter;
    Song selectedSong = null;
    ArrayList<Song> songList;
    Love love;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        makeFakeData();
        addControl();
        addEvent();
    }

    private void addEvent() {
    }

    private void addControl() {
        tabSong=findViewById(R.id.tabSong);
        tabSong.setup();

        //Tạo tab 1
        TabHost.TabSpec tab1 = tabSong.newTabSpec("tab1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("ALL");
        tabSong.addTab(tab1);

        //Tạo tab 2
        TabHost.TabSpec tab2 = tabSong.newTabSpec("tab2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("LOVE");
        tabSong.addTab(tab2);

        tabSong.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
        @Override
        public void onTabChanged(String s) {
            Toast.makeText(MainActivity.this,
                    "Tab " + s + " selected, index: " + tabSong.getCurrentTab(),
                    Toast.LENGTH_LONG).show();
        }
        });
    }

    private void makeFakeData() {
        songAdapter.add(new Song("53102","ẢI CHI LĂNG","Lưu Hữu Phước - Mai Văn Bộ Nguyên T NGuyên"));
        songAdapter.add(new Song("50070","AI CHO EM TÌNH YÊU","NGỌC LÊ"));
        songAdapter.add(new Song("50012","AI CHO TÔI TÌNH YÊU","TRÚC PHƯƠNG"));
        songAdapter.add(new Song("52859","AI ĐI NGOÀI SƯƠNG GIÓ","Nguyễn Hữu Thiết"));
        songAdapter.add(new Song("50038","AI ĐƯA EM VỀ","NGUYỄN ÁNH CHÍNH"));
        songAdapter.add(new Song("50210","AI LÊN XỨ HOA ĐÀO","HOÀNG NGUYÊN"));

        love = new Love();
    }

    private void addViews() {
        lvSong = findViewById(R.id.lvSong);
        songAdapter = new SongAdapter(
                MainActivity.this,
                R.layout.song_item, songList);
        lvSong.setAdapter(songAdapter);
        lvLove = findViewById(R.id.lvLove);
    }


 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem menuItem=menu.findItem(R.id.action_search);
        SearchView searchView=(SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type song name here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }*/
}