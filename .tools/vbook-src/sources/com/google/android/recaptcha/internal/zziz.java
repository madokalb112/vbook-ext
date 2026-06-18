package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zziz extends o1a implements yb4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zziz(this.zzc, this.zzd, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (defpackage.zib.o(20000, r6, r5) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r6.zzc(r1, r5) != r3) goto L21;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.zzb
            r1 = 2
            r2 = 1
            xx1 r3 = defpackage.xx1.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 == r1) goto L14
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zzbd r0 = (com.google.android.recaptcha.internal.zzbd) r0
            defpackage.e11.e0(r6)
            goto L68
        L14:
            defpackage.e11.e0(r6)     // Catch: java.lang.Exception -> L18
            goto L6d
        L18:
            r6 = move-exception
            goto L40
        L1a:
            defpackage.e11.e0(r6)     // Catch: java.lang.Exception -> L18
            goto L2b
        L1e:
            defpackage.e11.e0(r6)
            com.google.android.recaptcha.internal.zzja r6 = r5.zzc     // Catch: java.lang.Exception -> L18
            r5.zzb = r2     // Catch: java.lang.Exception -> L18
            java.lang.Object r6 = r6.zzx(r5)     // Catch: java.lang.Exception -> L18
            if (r6 == r3) goto L67
        L2b:
            com.google.android.recaptcha.internal.zziy r6 = new com.google.android.recaptcha.internal.zziy     // Catch: java.lang.Exception -> L18
            com.google.android.recaptcha.internal.zzja r0 = r5.zzc     // Catch: java.lang.Exception -> L18
            com.google.android.recaptcha.internal.zzen r2 = r5.zzd     // Catch: java.lang.Exception -> L18
            r4 = 0
            r6.<init>(r0, r2, r4)     // Catch: java.lang.Exception -> L18
            r5.zzb = r1     // Catch: java.lang.Exception -> L18
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r5 = defpackage.zib.o(r0, r6, r5)     // Catch: java.lang.Exception -> L18
            if (r5 != r3) goto L6d
            goto L67
        L40:
            r6.getMessage()
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzV
            java.lang.String r4 = r6.getMessage()
            r0.<init>(r1, r2, r4)
            com.google.android.recaptcha.internal.zzbd r0 = com.google.android.recaptcha.internal.zzf.zza(r6, r0)
            com.google.android.recaptcha.internal.zzja r6 = r5.zzc
            com.google.android.recaptcha.internal.zzcb r6 = r6.zzm()
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zza
            r5.zza = r0
            r2 = 3
            r5.zzb = r2
            java.lang.Object r6 = r6.zzc(r1, r5)
            if (r6 != r3) goto L68
        L67:
            return r3
        L68:
            com.google.android.recaptcha.internal.zzen r5 = r5.zzd
            r5.zzb(r0)
        L6d:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
