/**
 * Esse componente será usado pelo MainScreenComponent, portanto deve
 * possuir como DP o Retrofit.
 *
 * Faremos com que o Retrofit seja encapsulado e reutilizável.
 */

package com.cauealmeida.dagger2mvpreactive.data.component;

import com.cauealmeida.dagger2mvpreactive.data.module.AppModule;
import com.cauealmeida.dagger2mvpreactive.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
