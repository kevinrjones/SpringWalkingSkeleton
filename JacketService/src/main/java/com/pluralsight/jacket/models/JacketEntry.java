package com.pluralsight.jacket.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 30/06/2015.
 */
public class JacketEntry {

    String url;
    List<String> tags;
    boolean isArchived;
    boolean isFavourite;

    public JacketEntry(String url, boolean isArchived, boolean isFavourite) {
        this.url = url;
        tags = new ArrayList<String>();
        this.isArchived = isArchived;
        this.isFavourite = isFavourite;
    }

    public JacketEntry(String url) {
        this.url = url;
        tags = new ArrayList<String>();
        this.isArchived = false;
        this.isFavourite = false;
    }

    public String getUrl() {
        return url;
    }

    public void ToggleFavoutite() {
        isFavourite = !isFavourite;
    }

    public void ToggleArchive() {
        isArchived = !isArchived;
    }

    public void addTag(String tag) {
        // todo: tag should not exist in list already
        tags.add(tag);
    }

    public void removeTag(String tag) {
        // todo: tag should exist in list already
        tags.remove(tag);
    }
}
