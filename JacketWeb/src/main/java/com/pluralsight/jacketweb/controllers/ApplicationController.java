package com.pluralsight.jacketweb.controllers;

import ninja.Result;
import ninja.Results;
import ninja.cache.NinjaCache;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by kevin on 06/07/2015.
 */
@Singleton
public class ApplicationController {


    private NinjaCache ninjaCache;

    @Inject
    public ApplicationController(NinjaCache ninjaCache) {
        this.ninjaCache = ninjaCache;
    }

    public Result index() {


        String test = ninjaCache.get("posts", String.class);
        return Results.html();

    }
}