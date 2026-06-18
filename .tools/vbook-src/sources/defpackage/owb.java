package defpackage;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class owb {
    public final WebView a;
    public final String b;
    public final String c;
    public final uf4 d;
    public tvb e;
    public final HashMap f;

    public owb(Context context) {
        context.getClass();
        WebView webView = new WebView(context);
        this.a = webView;
        String strConcat = "jsi_".concat(bw9.z0(8, wm9.p()));
        this.b = strConcat;
        this.c = "_callNativeFunction";
        this.d = new uf4(webView);
        this.f = new HashMap();
        webView.setWebViewClient(new lwb(this));
        webView.setWebChromeClient(new mwb(this));
        webView.addJavascriptInterface(this, strConcat);
    }

    public final Object a(String str, o1a o1aVar) {
        ay0 ay0Var = new ay0(1, bx1.J(o1aVar));
        ay0Var.u();
        this.a.evaluateJavascript(iw9.H(str, false, this.c, xv5.p("window.", this.b, ".callback")), new nwb(this, ay0Var));
        return ay0Var.s();
    }

    public final void b(String str) {
        tvb tvbVar = this.e;
        if (tvbVar != null) {
            tvbVar.n(str, null);
        }
        this.a.loadUrl(str);
    }

    @JavascriptInterface
    public final Object callback(String str) {
        pm8 pm8Var;
        str.getClass();
        try {
            List list = nf5.e(ue5.d.c(str)).a;
            String strA = nf5.g((mf5) list.get(0)).a();
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 1; i < size; i++) {
                jg5 jg5VarG = nf5.g((mf5) list.get(i));
                String strA2 = jg5VarG instanceof cg5 ? null : jg5VarG.a();
                if (strA2 != null) {
                    arrayList.add(strA2);
                }
            }
            wd5 wd5Var = (wd5) this.f.get(strA);
            if (wd5Var != null) {
                Object[] array = arrayList.toArray(new Object[0]);
                wd5Var.a(Arrays.copyOf(array, array.length));
            }
            pm8Var = null;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        Throwable thA = qm8.a(pm8Var);
        if (thA != null) {
            thA.printStackTrace();
        }
        if (pm8Var != null) {
            return null;
        }
        return pm8Var;
    }
}
