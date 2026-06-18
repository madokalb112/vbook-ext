package defpackage;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ji8 {
    public final qu a;
    public final jx1 b;

    public ji8(qu quVar, jx1 jx1Var) {
        quVar.getClass();
        jx1Var.getClass();
        this.a = quVar;
        this.b = jx1Var;
    }

    public static final URL a(ji8 ji8Var) {
        ji8Var.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        qu quVar = ji8Var.a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(quVar.a).appendPath("settings");
        vb vbVar = quVar.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", vbVar.c).appendQueryParameter("display_version", vbVar.b).build().toString());
    }
}
