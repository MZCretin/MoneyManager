package com.diandian.ycdyus.moneymanager.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.diandian.ycdyus.moneymanager.R;
import com.diandian.ycdyus.moneymanager.model.NewRecordGridViewModel;

import java.util.List;

/**
 * Created by ycdyus on 2016/2/29.
 */
public class NewRecordGridViewAdapter extends CommonAdapter<NewRecordGridViewModel>{
    public NewRecordGridViewAdapter(Context context, List<NewRecordGridViewModel> mDatas, int itemLayoutId) {
        super(context, mDatas, itemLayoutId);
    }

    @Override
    public void convert(ViewHolders holder, NewRecordGridViewModel item) {
        ((ImageView)holder.getView(R.id.iv_item_new_record_gridview_icon)).setImageResource(item.getResId());
        ((TextView)holder.getView(R.id.tv_item_new_record_gridview_des)).setText(item.getDes());
    }
}
