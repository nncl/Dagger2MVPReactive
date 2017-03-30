package com.cauealmeida.dagger2mvpreactive.data.module;

import com.cauealmeida.dagger2mvpreactive.mainscreen.MainScreenContract;
import com.cauealmeida.dagger2mvpreactive.util.CustomScope;

import dagger.Provides;

public class MainScreenModule {
    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
