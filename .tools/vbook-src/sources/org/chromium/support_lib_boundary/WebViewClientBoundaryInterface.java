package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface WebViewClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onPageCommitVisible(WebView webView, String str);

    void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler);

    boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest);
}
