package com.github.jaxrs2.experiments.injectable.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alex.dobjanschi
 * @since 11:53 AM 3/23/13
 */
@Path("/url-preview")
@Produces(MediaType.APPLICATION_JSON)
public class URLPreviewResource {

    @GET
    public URLPreviewDTO preview(
            @Context PreviewService previewService,
            @QueryParam("target") String targetUrl) {

        if (targetUrl == null || targetUrl.isEmpty()) {
            throw new IllegalArgumentException("No target url specified");
        }
        return previewService.doPreview(targetUrl);
    }
}
