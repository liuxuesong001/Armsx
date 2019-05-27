package com.jess.arms.http.imageloader.glide;

import android.content.Context;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.module.LibraryGlideModule;

/**
 *
 */
public abstract class AppGlideModule extends LibraryGlideModule implements AppliesOptions {
    /**
     * Returns {@code true} if Glide should check the AndroidManifest for {@link// GlideModule}s.
     *
     * <p>Implementations should return {@code false} after they and their dependencies have migrated
     * to Glide's annotation processor.
     *
     * <p>Returns {@code true} by default.
     */
    public boolean isManifestParsingEnabled() {
        return true;
    }

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        // Default empty impl.
    }
}
