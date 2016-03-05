package com.diandian.ycdyus.moneymanager.ui;

import android.support.v7.app.AppCompatActivity;

import com.diandian.ycdyus.moneymanager.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_budget_manager)
public class BudgetManagerActivity extends AppCompatActivity {
    @AfterViews
    public void init(){
        getSupportActionBar().hide();
    }
}
