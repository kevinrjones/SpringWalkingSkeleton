package com.pluralsight.jacket.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 30/06/2015.
 */
public class Entry {

    String url;
    boolean isArchived;
    boolean isFavourite;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setIsFavourite(boolean isFavourite) {
        this.isFavourite = isFavourite;
    }

}
