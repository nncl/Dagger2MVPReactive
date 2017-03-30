package com.cauealmeida.dagger2mvpreactive;

import android.app.Application;

import com.cauealmeida.dagger2mvpreactive.data.component.DaggerNetComponent;
import com.cauealmeida.dagger2mvpreactive.data.component.NetComponent;
import com.cauealmeida.dagger2mvpreactive.data.module.AppModule;
import com.cauealmeida.dagger2mvpreactive.data.module.NetModule;

/**
 * Created by logonrm on 29/03/2017.
 */

public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
