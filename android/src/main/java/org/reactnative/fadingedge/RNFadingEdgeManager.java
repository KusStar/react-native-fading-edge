package org.reactnative.fadingedge;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNFadingEdgeManager extends ViewGroupManager<FadingEdgeView> {
    private static final String REACT_CLASS = "RNFadingEdge";
    private static final String PROP_CONFIG = "config";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected FadingEdgeView createViewInstance(ThemedReactContext reactContext) {
        return new FadingEdgeView(reactContext);
    }

    @ReactProp(name = PROP_CONFIG)
    public void setFadeConfig(FadingEdgeView view, ReadableMap config) {
        view.setFadeConfig(config);
    }
}
