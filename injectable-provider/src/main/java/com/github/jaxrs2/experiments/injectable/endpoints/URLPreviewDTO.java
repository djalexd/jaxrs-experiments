package com.github.jaxrs2.experiments.injectable.endpoints;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author alex.dobjanschi
 * @since 11:54 AM 3/23/13
 */
public class URLPreviewDTO {

    private String originalUrl;

    private String title;
    private List<String> imageUrls;

    private URLPreviewDTO() {}
    public URLPreviewDTO(String originalUrl, String title, List<String> imageUrls) {
        this.originalUrl = originalUrl;
        this.title = title;
        this.imageUrls = ImmutableList.copyOf(imageUrls);
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
