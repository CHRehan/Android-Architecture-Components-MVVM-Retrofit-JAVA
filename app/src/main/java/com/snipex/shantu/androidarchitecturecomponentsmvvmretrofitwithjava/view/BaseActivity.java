package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.view;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.view_model.ArticleViewModel;

public abstract class BaseActivity extends AppCompatActivity {

    private ArticleViewModel articleViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        articleViewModel = ViewModelProviders.of(this).get(ArticleViewModel.class);

    }


    public ArticleViewModel getViewModel() {

        if (articleViewModel == null)
            articleViewModel = ViewModelProviders.of(this).get(ArticleViewModel.class);

        return articleViewModel;
    }
}
