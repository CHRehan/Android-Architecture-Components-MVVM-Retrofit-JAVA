package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.view_model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.repository.ArticleRepository;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.response.ArticleResponse;

public class ArticleViewModel extends AndroidViewModel {

    private ArticleRepository articleRepository;

    public ArticleViewModel(@NonNull Application application) {
        super(application);
        articleRepository = new ArticleRepository();
    }

    public LiveData<ArticleResponse> getArticleResponseLiveData() {
        return articleRepository.getMovieArticles("movies", "84a7decf3110498ea372bd16dd0601e8");
    }
}
