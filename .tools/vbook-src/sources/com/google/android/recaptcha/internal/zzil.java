package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzil extends o1a implements yb4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzjaVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzc = zzjaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzil(this.zzc, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[PHI: r7
  0x0055: PHI (r7v14 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zzb
            java.lang.String r1 = "RN"
            r2 = 3
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1d
            if (r0 == r3) goto L15
            defpackage.e11.e0(r7)
            if (r0 == r2) goto L55
            goto L6c
        L15:
            java.lang.Object r0 = r6.zza
            com.google.android.recaptcha.internal.zzja r0 = (com.google.android.recaptcha.internal.zzja) r0
            defpackage.e11.e0(r7)
            goto L3f
        L1d:
            defpackage.e11.e0(r7)
            goto L2e
        L21:
            defpackage.e11.e0(r7)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zzb = r4
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r5) goto L7b
        L2e:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r1)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r3
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r5) goto L7b
        L3f:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r4)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r0 = 0
            r6.zza = r0
            r6.zzb = r2
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r5) goto L7b
        L55:
            com.google.android.recaptcha.internal.zzja r0 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzij r0 = r0.zzq()
            r7.addJavascriptInterface(r0, r1)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r0 = 4
            r6.zzb = r0
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 != r5) goto L6c
            goto L7b
        L6c:
            com.google.android.recaptcha.internal.zzja r6 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzik r0 = new com.google.android.recaptcha.internal.zzik
            r0.<init>(r6)
            r7.setWebViewClient(r0)
            heb r6 = defpackage.heb.a
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzil.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
