package com.diandian.ycdyus.moneymanager.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.diandian.ycdyus.moneymanager.R;
import com.diandian.ycdyus.moneymanager.adapter.MainListViewAdapter;
import com.diandian.ycdyus.moneymanager.model.MainListViewModel;
import com.diandian.ycdyus.moneymanager.view.MyImageView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements MyImageView.MyImageViewMoveEvent {
    @ViewById
    ListView mainListview;
    @ViewById
    MyImageView myimageview;
    @ViewById
    ImageView ivMainFaces;
    private List<MainListViewModel> list;
    private MainListViewAdapter adapter;

    @AfterViews
    public void init() {
        getSupportActionBar().hide();
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MainListViewModel model = new MainListViewModel();
            list.add(model);
        }
        adapter = new MainListViewAdapter(this, list, R.layout.item_main_listview);
        mainListview.setAdapter(adapter);

        mainListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this, NewRecordActivity_.class));
            }
        });
        myimageview.setMoveEvent(this);
    }

    @Override
    public void onMoveEvent(int direction) {
        if (direction == MyImageView.DIRECTION_RIGHT) {
            myimageview.setImageResource(R.mipmap.d102);
        } else if (direction == MyImageView.DIRECTION_LEFT) {
            myimageview.setImageResource(R.mipmap.d103);
        } else if (direction == MyImageView.DIRECTION_UP) {
            myimageview.setImageResource(R.mipmap.d104);
        } else if (direction == MyImageView.DIRECTION_DOWN) {
            myimageview.setImageResource(R.mipmap.d105);
        } else if (direction == MyImageView.DIRECTION_CENTER) {
            myimageview.setImageResource(R.mipmap.d101);
        }
    }

    @Override
    public void onCenterClick() {
        ivMainFaces.setVisibility(View.GONE);
        myimageview.setImageResource(R.mipmap.d101);
    }

    @Override
    public void onCenterClickComplete(int direction) {
        switch (direction) {
            case 0:
                Log.e("HHHHHH", "UP");
                startActivity(new Intent(this, BudgetActivity_.class));
                break;
            case 1:
                Log.e("HHHHHH", "LEFT");
                startActivity(new Intent(this, BudgetActivity_.class));
                break;
            case 2:
                Log.e("HHHHHH", "RIGHT");
                startActivity(new Intent(this, BudgetActivity_.class));
                break;
            case 3:
                Log.e("HHHHHH", "DOWM");
                startActivity(new Intent(this, BudgetActivity_.class));
                break;
        }
        ivMainFaces.setVisibility(View.VISIBLE);
        myimageview.setImageResource(R.mipmap.d00);
    }

}