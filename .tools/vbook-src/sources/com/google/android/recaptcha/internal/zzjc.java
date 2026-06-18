package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzjc extends o1a implements yb4 {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, jt1 jt1Var) {
        super(2, jt1Var);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzjc(this.zza, this.zzb, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        WebView webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
