package com.diandian.ycdyus.moneymanager.model;

/**
 * Created by ycdyus on 2016/2/29.
 */
public class NewRecordGridViewModel {
    private int resId;
    private String des;

    public NewRecordGridViewModel(String des, int resId) {
        this.des = des;
        this.resId = resId;
    }

    public NewRecordGridViewModel() {
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
