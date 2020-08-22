package org.reactnative.fadingedge;

import android.content.Context;

import com.bosphere.fadingedgelayout.FadingEdgeLayout;
import com.facebook.react.bridge.ReadableMap;

public class FadingEdgeView extends FadingEdgeLayout {

    public FadingEdgeView(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        // noop
    }

    public void setFadeConfig(ReadableMap config) {
        final int sizeTop = config.getInt("top");
        final int sizeLeft = config.getInt("left");
        final int sizeBottom = config.getInt("bottom");
        final int sizeRight = config.getInt("right");

        final boolean fadeTop = sizeTop > 0;
        final boolean fadeLeft = sizeLeft > 0;
        final boolean fadeBottom = sizeBottom > 0;
        final boolean fadeRight = sizeRight > 0;

        setFadeEdges(fadeTop, fadeLeft, fadeBottom, fadeRight);
        setFadeSizes(sizeTop, sizeLeft, sizeBottom, sizeRight);
    }

}
