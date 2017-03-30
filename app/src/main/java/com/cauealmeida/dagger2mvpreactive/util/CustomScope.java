package com.cauealmeida.dagger2mvpreactive.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Escopo personalizado que será utilizado pelo MainScreenComponent e MainScreenModule,
 * pois não é possível dois componentes compartilharem o mesmo escopo: NetComp e MainScrComp sob
 * o @Singleton
 */

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}
