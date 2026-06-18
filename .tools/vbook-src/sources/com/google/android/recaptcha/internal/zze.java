package com.google.android.recaptcha.internal;

import defpackage.heb;
import defpackage.jt1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r11, long r12, defpackage.jt1 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zza
            if (r0 == 0) goto L14
            r0 = r14
            com.google.android.recaptcha.internal.zza r0 = (com.google.android.recaptcha.internal.zza) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.zze = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.google.android.recaptcha.internal.zza r0 = new com.google.android.recaptcha.internal.zza
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.zzc
            int r0 = r6.zze
            r7 = 3
            r1 = 2
            r2 = 1
            r8 = 0
            xx1 r9 = defpackage.xx1.a
            if (r0 == 0) goto L59
            if (r0 == r2) goto L41
            if (r0 == r1) goto L36
            if (r0 != r7) goto L30
            defpackage.e11.e0(r14)
            return r14
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r8
        L36:
            java.lang.String r10 = r6.zzf
            java.lang.Object r11 = r6.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            defpackage.e11.e0(r14)
            goto Lb4
        L41:
            long r12 = r6.zzb
            com.google.android.recaptcha.internal.zzen r10 = r6.zzg
            java.lang.String r11 = r6.zzf
            java.lang.Object r0 = r6.zza
            r2 = r0
            com.google.android.recaptcha.internal.zze r2 = (com.google.android.recaptcha.internal.zze) r2
            defpackage.e11.e0(r14)     // Catch: java.lang.Exception -> L50
            goto L78
        L50:
            r0 = move-exception
            r14 = r0
            r3 = r2
            r2 = r11
            r11 = r1
            r1 = r3
            r3 = r12
            r5 = r14
            goto L8e
        L59:
            defpackage.e11.e0(r14)
            com.google.android.recaptcha.internal.zzen r14 = r10.zza(r11)
            com.google.android.recaptcha.internal.zzb r0 = new com.google.android.recaptcha.internal.zzb     // Catch: java.lang.Exception -> L87
            r0.<init>(r10, r11, r8)     // Catch: java.lang.Exception -> L87
            r6.zza = r10     // Catch: java.lang.Exception -> L87
            r6.zzf = r11     // Catch: java.lang.Exception -> L87
            r6.zzg = r14     // Catch: java.lang.Exception -> L87
            r6.zzb = r12     // Catch: java.lang.Exception -> L87
            r6.zze = r2     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = defpackage.zib.o(r12, r0, r6)     // Catch: java.lang.Exception -> L87
            if (r0 == r9) goto Lc2
            r2 = r10
            r10 = r14
            r14 = r0
        L78:
            qm8 r14 = (defpackage.qm8) r14     // Catch: java.lang.Exception -> L50
            java.lang.Object r14 = r14.a     // Catch: java.lang.Exception -> L50
            defpackage.e11.e0(r14)     // Catch: java.lang.Exception -> L50
            com.google.android.recaptcha.internal.zzsi r14 = (com.google.android.recaptcha.internal.zzsi) r14     // Catch: java.lang.Exception -> L50
            if (r10 == 0) goto L86
            r10.zza()     // Catch: java.lang.Exception -> L50
        L86:
            return r14
        L87:
            r0 = move-exception
            r2 = r11
            r3 = r12
            r5 = r0
            r11 = r1
            r1 = r10
            r10 = r14
        L8e:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r0 = r5.getMessage()
            r12.<init>(r13, r14, r0)
            com.google.android.recaptcha.internal.zzbd r12 = com.google.android.recaptcha.internal.zzf.zza(r5, r12)
            if (r10 == 0) goto La4
            r10.zzb(r12)
        La4:
            r6.zza = r1
            r6.zzf = r2
            r6.zzg = r8
            r6.zze = r11
            java.lang.Object r10 = r1.zzi(r2, r3, r5, r6)
            if (r10 == r9) goto Lc2
            r11 = r1
            r10 = r2
        Lb4:
            r6.zza = r8
            r6.zzf = r8
            r6.zze = r7
            java.lang.Object r10 = r11.zzd(r10, r6)
            if (r10 != r9) goto Lc1
            goto Lc2
        Lc1:
            return r10
        Lc2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, jt1):java.lang.Object");
    }

    public abstract Object zzd(String str, jt1 jt1Var);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r10 != r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(long r10, com.google.android.recaptcha.internal.zzsc r12, defpackage.jt1 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            int r1 = r0.zzd
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 3
            r5 = 2
            r6 = 1
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L57
            if (r1 == r6) goto L45
            if (r1 == r5) goto L3b
            if (r1 != r4) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            defpackage.e11.e0(r13)
            goto Lb2
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r2
        L3b:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            defpackage.e11.e0(r13)
            goto L9d
        L45:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            defpackage.e11.e0(r13)     // Catch: java.lang.Exception -> L53
            r8 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            goto L77
        L53:
            r11 = move-exception
            r13 = r9
            r9 = r10
            goto L8a
        L57:
            defpackage.e11.e0(r13)
            com.google.android.recaptcha.internal.zzen r13 = r9.zzb()
            boolean r1 = r9.zza
            if (r1 == 0) goto L66
            r13.zza()
            return r3
        L66:
            com.google.android.recaptcha.internal.zzd r1 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L86
            r1.<init>(r9, r12, r2)     // Catch: java.lang.Exception -> L86
            r0.zza = r9     // Catch: java.lang.Exception -> L86
            r0.zze = r13     // Catch: java.lang.Exception -> L86
            r0.zzd = r6     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = defpackage.zib.o(r10, r1, r0)     // Catch: java.lang.Exception -> L86
            if (r10 == r7) goto Lb7
        L77:
            qm8 r10 = (defpackage.qm8) r10     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = r10.a     // Catch: java.lang.Exception -> L86
            defpackage.e11.e0(r10)     // Catch: java.lang.Exception -> L86
            r9.zza = r6     // Catch: java.lang.Exception -> L86
            if (r13 == 0) goto L89
            r13.zza()     // Catch: java.lang.Exception -> L86
            return r3
        L86:
            r10 = move-exception
            r11 = r10
            goto L8a
        L89:
            return r3
        L8a:
            r10 = 0
            r9.zza = r10
            r0.zza = r9
            r0.zze = r13
            r0.zzd = r5
            java.lang.Object r10 = r9.zzj(r11, r0)
            if (r10 == r7) goto Lb7
            r8 = r10
            r10 = r9
            r9 = r13
            r13 = r8
        L9d:
            r11 = r13
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto La5
            r9.zzb(r11)
        La5:
            r0.zza = r11
            r0.zze = r2
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r7) goto Lb7
            r9 = r11
        Lb2:
            pm8 r9 = defpackage.e11.I(r9)
            return r9
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, jt1):java.lang.Object");
    }

    public abstract Object zzf(String str, jt1 jt1Var);

    public Object zzg(zzbd zzbdVar, jt1 jt1Var) {
        return heb.a;
    }

    public abstract Object zzh(zzsc zzscVar, jt1 jt1Var);

    public Object zzi(String str, long j, Exception exc, jt1 jt1Var) {
        return heb.a;
    }

    public Object zzj(Exception exc, jt1 jt1Var) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public final boolean zzl() {
        return this.zza;
    }

    public void zzk(zzsr zzsrVar) {
    }
}
