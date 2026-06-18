package defpackage;

import android.webkit.ValueCallback;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nwb implements ValueCallback {
    public final /* synthetic */ ay0 a;

    public nwb(owb owbVar, ay0 ay0Var) {
        this.a = ay0Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        ay0 ay0Var = this.a;
        try {
            te5 te5Var = ue5.d;
            str.getClass();
            jg5 jg5VarG = nf5.g(te5Var.c(str));
            String strA = jg5VarG instanceof cg5 ? null : jg5VarG.a();
            if (strA == null) {
                strA = "";
            }
            ay0Var.resumeWith(strA);
        } catch (Throwable unused) {
        }
    }
}
