package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.rg8;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzal extends o1a implements yb4 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ rg8 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, rg8 rg8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = rg8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzal(this.zzd, this.zze, this.zzf, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.play.core.integrity.StandardIntegrityException */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r8 != r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (defpackage.tw1.H(r4, r7) != r3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:14:0x0024, B:16:0x0030, B:8:0x0016), top: B:41:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:13:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:6:0x0011). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.google.android.play.core.integrity.StandardIntegrityException {
        /*
            r7 = this;
            int r0 = r7.zzc
            r1 = 0
            r2 = 1
            xx1 r3 = defpackage.xx1.a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L14
            boolean r0 = r7.zzb
            long r4 = r7.zza
            defpackage.e11.e0(r8)
        L11:
            r8 = r0
            goto L7f
        L14:
            long r4 = r7.zza
            defpackage.e11.e0(r8)     // Catch: java.lang.Exception -> L1a
            goto L30
        L1a:
            r8 = move-exception
            goto L4b
        L1c:
            defpackage.e11.e0(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r2
        L22:
            if (r8 == 0) goto L83
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            r7.zza = r4     // Catch: java.lang.Exception -> L1a
            r7.zzc = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzan.zza(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 == r3) goto L81
        L30:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r0 = r7.zzd     // Catch: java.lang.Exception -> L1a
            ai1 r0 = r0.zzf()     // Catch: java.lang.Exception -> L1a
            bi1 r0 = (defpackage.bi1) r0     // Catch: java.lang.Exception -> L1a
            r0.Q(r8)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzao r0 = com.google.android.recaptcha.internal.zzao.zzc     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan.zzh(r8, r0)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzen r8 = r7.zze     // Catch: java.lang.Exception -> L1a
            r8.zza()     // Catch: java.lang.Exception -> L1a
            r8 = r1
            goto L22
        L4b:
            rg8 r0 = r7.zzf
            r0.a = r8
            boolean r0 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r0 == 0) goto L6c
            r0 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r0 = (com.google.android.play.core.integrity.StandardIntegrityException) r0
            int r0 = r0.getErrorCode()
            r6 = -100
            if (r0 == r6) goto L6e
            r6 = -18
            if (r0 == r6) goto L6e
            r6 = -12
            if (r0 == r6) goto L6e
            r6 = -8
            if (r0 == r6) goto L6e
            r6 = -3
            if (r0 == r6) goto L6e
        L6c:
            r0 = r1
            goto L6f
        L6e:
            r0 = r2
        L6f:
            if (r0 == 0) goto L82
            r7.zza = r4
            r7.zzb = r2
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = defpackage.tw1.H(r4, r7)
            if (r8 == r3) goto L81
            goto L11
        L7f:
            long r4 = r4 + r4
            goto L22
        L81:
            return r3
        L82:
            throw r8
        L83:
            heb r7 = defpackage.heb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
