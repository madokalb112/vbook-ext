package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzin extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzin(this.zzb, this.zzc, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.zzF(r0, r3) == r2) goto L13;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.zza
            r1 = 1
            xx1 r2 = defpackage.xx1.a
            defpackage.e11.e0(r4)
            if (r0 == 0) goto Ld
            if (r0 == r1) goto L17
            goto L2a
        Ld:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r1
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r2) goto L2d
        L17:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r1)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r0 = r3.zzc
            r1 = 2
            r3.zza = r1
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzja.zzu(r4, r0, r3)
            if (r3 != r2) goto L2a
            goto L2d
        L2a:
            heb r3 = defpackage.heb.a
            return r3
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
