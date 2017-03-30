package com.cauealmeida.dagger2mvpreactive.mainscreen;

import com.cauealmeida.dagger2mvpreactive.data.model.Post;

import java.util.List;

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);
        void showError(String message);
        void showComplete();
    }

    interface Presenter {
        void loadPosts();
    }
}
