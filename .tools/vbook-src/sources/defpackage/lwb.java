package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lwb extends WebViewClient {
    public final /* synthetic */ owb a;

    public lwb(owb owbVar) {
        this.a = owbVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        tvb tvbVar;
        super.onPageFinished(webView, str);
        if (str == null || (tvbVar = this.a.e) == null) {
            return;
        }
        tvbVar.o(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        tvb tvbVar;
        tvb tvbVar2;
        super.onPageStarted(webView, str, bitmap);
        owb owbVar = this.a;
        if (bitmap != null && (tvbVar2 = owbVar.e) != null) {
            tvbVar2.k(new ng(bitmap));
        }
        if (str == null || (tvbVar = owbVar.e) == null) {
            return;
        }
        tvbVar.n(str, bitmap != null ? new ng(bitmap) : null);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        tvb tvbVar = this.a.e;
        if (tvbVar != null) {
            uriI = tvbVar.i(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }
        return uriI != null ? new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream((byte[]) ((uc6) uriI).a)) : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        tvb tvbVar = this.a.e;
        uc6 uc6VarI = tvbVar != null ? tvbVar.i(String.valueOf(str)) : null;
        if (uc6VarI != null) {
            return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream((byte[]) uc6VarI.a));
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
