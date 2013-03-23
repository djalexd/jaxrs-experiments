package com.github.jaxrs2.experiments.injectable.endpoints;

import com.google.common.collect.ImmutableList;

/**
 * A null object pattern implementation of PreviewService.
 *
 * @author alex.dobjanschi
 * @since 11:59 AM 3/23/13
 */
public class NoOpPreviewService implements PreviewService {

    @Override
    public URLPreviewDTO doPreview(String targetUrl) {
        return new URLPreviewDTO(targetUrl, null, ImmutableList.<String>of());
    }
}
