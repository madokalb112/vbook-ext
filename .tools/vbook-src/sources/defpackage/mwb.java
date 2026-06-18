package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mwb extends WebChromeClient {
    public final /* synthetic */ owb a;

    public mwb(owb owbVar) {
        this.a = owbVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        tvb tvbVar = this.a.e;
        if (tvbVar != null) {
            tvbVar.j(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        tvb tvbVar;
        super.onReceivedIcon(webView, bitmap);
        if (bitmap == null || (tvbVar = this.a.e) == null) {
            return;
        }
        tvbVar.k(new ng(bitmap));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        tvb tvbVar = this.a.e;
        if (tvbVar != null) {
            if (str == null) {
                str = "";
            }
            tvbVar.h(str);
        }
    }
}
