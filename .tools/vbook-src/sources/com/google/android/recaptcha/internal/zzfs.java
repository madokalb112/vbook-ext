package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzfs extends o1a implements yb4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzfs(this.zzd, this.zze, this.zzf, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r0.zzh(r7, r1, r6) != r2) goto L20;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zzc
            r1 = 1
            xx1 r2 = defpackage.xx1.a
            if (r0 == 0) goto L1c
            if (r0 == r1) goto Le
            defpackage.e11.e0(r7)
            goto L82
        Le:
            java.lang.Object r0 = r6.zzb
            com.google.android.recaptcha.internal.zzjh r0 = (com.google.android.recaptcha.internal.zzjh) r0
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzub r1 = (com.google.android.recaptcha.internal.zzub) r1
            defpackage.e11.e0(r7)     // Catch: java.lang.Exception -> L1a
            goto L5d
        L1a:
            r7 = move-exception
            goto L6f
        L1c:
            defpackage.e11.e0(r7)
            com.google.android.recaptcha.internal.zzgd r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbn r0 = new com.google.android.recaptcha.internal.zzbn
            r0.<init>()
            r7.zza = r0
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzkh r0 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch: java.lang.Exception -> L1a
            byte[] r7 = r0.zzj(r7)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzub r7 = com.google.android.recaptcha.internal.zzub.zzi(r7)     // Catch: java.lang.Exception -> L1a
            r7.zzf()     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzft r0 = r6.zze     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzhx r0 = com.google.android.recaptcha.internal.zzft.zzb(r0)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zztz r0 = r0.zza(r7)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzjh r3 = com.google.android.recaptcha.internal.zzjh.zzb()     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzft r4 = r6.zze     // Catch: java.lang.Exception -> L1a
            java.util.List r0 = r0.zzi()     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzgd r5 = r6.zzd     // Catch: java.lang.Exception -> L1a
            r6.zza = r7     // Catch: java.lang.Exception -> L1a
            r6.zzb = r3     // Catch: java.lang.Exception -> L1a
            r6.zzc = r1     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzft.zzc(r4, r0, r5, r6)     // Catch: java.lang.Exception -> L1a
            if (r0 == r2) goto L81
            r1 = r7
            r0 = r3
        L5d:
            r0.zzf()     // Catch: java.lang.Exception -> L1a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L1a
            long r3 = r0.zza(r7)     // Catch: java.lang.Exception -> L1a
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Exception -> L1a
            r7.<init>(r3)     // Catch: java.lang.Exception -> L1a
            r1.zzf()     // Catch: java.lang.Exception -> L1a
            goto L82
        L6f:
            com.google.android.recaptcha.internal.zzft r0 = r6.zze
            com.google.android.recaptcha.internal.zzgd r1 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r6 = com.google.android.recaptcha.internal.zzft.zzd(r0, r7, r1, r6)
            if (r6 != r2) goto L82
        L81:
            return r2
        L82:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
