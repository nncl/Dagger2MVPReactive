package com.cauealmeida.dagger2mvpreactive.data.component;

import com.cauealmeida.dagger2mvpreactive.data.module.MainScreenModule;
import com.cauealmeida.dagger2mvpreactive.mainscreen.MainActivity;
import com.cauealmeida.dagger2mvpreactive.util.CustomScope;

import dagger.Component;

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity mainActivity);
}
