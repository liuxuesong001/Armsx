package com.jess.arms.http.imageloader.glide;

import android.content.Context;

import com.bumptech.glide.GlideBuilder;

/**
 *
 */
public interface AppliesOptions {
    /**
     * Lazily apply options to a {@link com.bumptech.glide.GlideBuilder} immediately before the Glide
     * singleton is created.
     *
     * <p> This method will be called once and only once per implementation. </p>
     *
     * @param context An Application {@link android.content.Context}.
     * @param builder The {@link com.bumptech.glide.GlideBuilder} that will be used to create Glide.
     */
    void applyOptions(Context context, GlideBuilder builder);
}
