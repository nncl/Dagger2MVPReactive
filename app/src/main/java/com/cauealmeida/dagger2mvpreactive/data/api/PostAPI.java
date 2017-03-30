package com.cauealmeida.dagger2mvpreactive.data.api;

import com.cauealmeida.dagger2mvpreactive.data.model.Post;

import java.util.List;
import rx.Observable;

import retrofit2.http.GET;

public interface PostAPI {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}
