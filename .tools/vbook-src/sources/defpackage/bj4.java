package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bj4 extends WebViewClient {
    public final /* synthetic */ String a;
    public final /* synthetic */ zi1 b;
    public final /* synthetic */ zi1 c;

    public bj4(String str, zi1 zi1Var, zi1 zi1Var2) {
        this.a = str;
        this.b = zi1Var;
        this.c = zi1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
        String str;
        Object[] objArr = 0;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url != null && (str = this.a) != null) {
            String string = url.toString();
            string.getClass();
            if (iw9.K(string, str, false)) {
                ah1.S(hc3.a, new yw3((Object) new uc6(b52.a(this.b)), (Object) url, (jt1) (objArr == true ? 1 : 0), 14));
                Intent intent = new Intent();
                zi1 zi1Var = this.c;
                Intent intent2 = zi1Var.getIntent();
                zi1Var.setResult(-1, intent.setData(intent2 != null ? intent2.getData() : null));
                zi1Var.finish();
                return true;
            }
        }
        return false;
    }
}
