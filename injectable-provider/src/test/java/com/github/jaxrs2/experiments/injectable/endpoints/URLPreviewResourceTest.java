package com.github.jaxrs2.experiments.injectable.endpoints;

import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import static org.fest.assertions.api.Assertions.*;
import org.junit.Test;

/**
 * @author alex.dobjanschi
 * @since 12:05 PM 3/23/13
 */
public class URLPreviewResourceTest extends JerseyTest {

    public URLPreviewResourceTest() {
        super("com.github.jaxrs2.experiments.injectable.endpoints");
    }

    @Test
    public void should_preview_a_target_url() {
        // when
        WebResource resource = resource();
        // then
        final URLPreviewDTO response = resource.path("/url-preview")
                .queryParam("target", "http://google.com")
                .get(URLPreviewDTO.class);
        // assert
        assertThat(response.getOriginalUrl()).isEqualTo("http://google.com");
        assertThat(response.getTitle()).isNull();
        assertThat(response.getImageUrls()).isEmpty();
    }

    @Test(expected = UniformInterfaceException.class)
    public void should_respond_with_badRequest_for_missing_target_url() {
        // when
        WebResource resource = resource();
        // then
        resource.path("/url-preview").get(URLPreviewDTO.class);
        // assert
    }
}
