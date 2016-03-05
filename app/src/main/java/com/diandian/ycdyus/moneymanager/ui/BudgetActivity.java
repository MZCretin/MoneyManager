package com.diandian.ycdyus.moneymanager.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.diandian.ycdyus.moneymanager.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_budget)
public class BudgetActivity extends AppCompatActivity {

    @ViewById
    Button ivBudgetBudget;
    @ViewById
    Button ivBudgetTarget;
    @ViewById
    ImageView ivNewBuegetBack;

    @AfterViews
    public void init() {
        getSupportActionBar().hide();

        ivBudgetBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BudgetActivity.this,BudgetManagerActivity_.class));
            }
        });

        ivBudgetTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ivNewBuegetBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BudgetActivity.this.finish();
            }
        });
    }
}
