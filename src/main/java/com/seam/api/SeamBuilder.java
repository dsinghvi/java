/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seam.api;

import com.seam.api.core.ClientOptions;
import com.seam.api.core.Environment;

public final class SeamBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private Environment environment = Environment.DEFAULT;

    public SeamBuilder apiKey(String apiKey) {
        this.clientOptionsBuilder.addHeader("Authorization", "Bearer " + apiKey);
        return this;
    }

    public SeamBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public SeamBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public Seam build() {
        clientOptionsBuilder.environment(this.environment);
        return new Seam(clientOptionsBuilder.build());
    }
}
