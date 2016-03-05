package com.diandian.ycdyus.moneymanager.adapter;

import android.content.Context;

import com.diandian.ycdyus.moneymanager.model.MainListViewModel;

import java.util.List;

/**
 * Created by ycdyus on 2016/2/29.
 */
public class MainListViewAdapter extends CommonAdapter<MainListViewModel>{
    public MainListViewAdapter(Context context, List<MainListViewModel> mDatas, int itemLayoutId) {
        super(context, mDatas, itemLayoutId);
    }

    @Override
    public void convert(ViewHolders holder, MainListViewModel item) {

    }
}
