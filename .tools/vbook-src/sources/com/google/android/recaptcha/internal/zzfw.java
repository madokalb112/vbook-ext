package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.ah1;
import defpackage.vx1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzfw {
    private final WebView zza;
    private final vx1 zzb;

    public zzfw(WebView webView, vx1 vx1Var) {
        this.zza = webView;
        this.zzb = vx1Var;
    }

    public final void zzb(String str, String... strArr) {
        ah1.J(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
