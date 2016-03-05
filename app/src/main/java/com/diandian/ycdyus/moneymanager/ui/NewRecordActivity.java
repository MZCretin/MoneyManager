package com.diandian.ycdyus.moneymanager.ui;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.diandian.ycdyus.moneymanager.R;
import com.diandian.ycdyus.moneymanager.adapter.NewRecordGridViewAdapter;
import com.diandian.ycdyus.moneymanager.adapter.NewRecordViewPagerAdapter;
import com.diandian.ycdyus.moneymanager.model.NewRecordGridViewModel;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

@EActivity(R.layout.activity_new_record)
public class NewRecordActivity extends AppCompatActivity {

    @ViewById
    ImageView ivNewRecordBack;
    @ViewById
    ViewPager vpNewRecord;
    private NewRecordViewPagerAdapter adapter;

    private List<View> list;

    @AfterViews
    public void init(){
        getSupportActionBar().hide();
        initViewPagerData();
    }

    //初始化ViewPager的数据
    private void initViewPagerData() {
        list = new ArrayList<>();
        for (int i = 0;i < 2;i++){
            View view = getLayoutInflater().inflate(R.layout.layout_gridview_viewpager,null);
            GridView gridView = (GridView) view.findViewById(R.id.gridview_viewpager);
            List<NewRecordGridViewModel> gvList = new ArrayList<>();
            gvList.add(new NewRecordGridViewModel("购物娱乐",R.mipmap.ic_handcart));
            gvList.add(new NewRecordGridViewModel("交通出行",R.mipmap.ic_bus));
            gvList.add(new NewRecordGridViewModel("饮食",R.mipmap.ic_bowl));
            gvList.add(new NewRecordGridViewModel("日常生活",R.mipmap.ic_home));
            gvList.add(new NewRecordGridViewModel("人情往来",R.mipmap.ic_gift));
            gvList.add(new NewRecordGridViewModel("其他", R.mipmap.ic_other));
            NewRecordGridViewAdapter gvAdapter = new NewRecordGridViewAdapter(this,gvList,R.layout.item_new_record_gridview);
            gridView.setAdapter(gvAdapter);
            list.add(view);
        }
        adapter = new NewRecordViewPagerAdapter(list);
        vpNewRecord.setAdapter(adapter);
    }
}
