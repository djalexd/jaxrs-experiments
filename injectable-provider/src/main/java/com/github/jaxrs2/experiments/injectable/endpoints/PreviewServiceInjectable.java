package com.github.jaxrs2.experiments.injectable.endpoints;

import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.PerRequestTypeInjectableProvider;

import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

/**
 * Provides an instance of {@link PreviewService}.
 *
 * @author alex.dobjanschi
 * @since 11:58 AM 3/23/13
 */
@Provider
public class PreviewServiceInjectable extends PerRequestTypeInjectableProvider<Context, PreviewService> {

    public PreviewServiceInjectable() {
        super(PreviewService.class);
    }

    @Override
    public Injectable<PreviewService> getInjectable(ComponentContext ic, Context context) {
        return new Injectable<PreviewService>() {
            @Override
            public PreviewService getValue() {
                return new NoOpPreviewService();
            }
        };
    }
}
