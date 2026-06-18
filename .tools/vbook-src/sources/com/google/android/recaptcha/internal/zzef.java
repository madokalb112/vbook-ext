package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, defpackage.jt1 r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, jt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r12.zza.zzn(r15, (long) r13, r0) != r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb(long r13, defpackage.jt1 r15) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L13
            r0 = r15
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.zzb
            int r1 = r0.zzd
            heb r2 = defpackage.heb.a
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L46
            if (r1 == r4) goto L38
            if (r1 != r3) goto L31
            com.google.android.recaptcha.internal.zzef r12 = r0.zze
            defpackage.e11.e0(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            goto L95
        L2e:
            r13 = move-exception
            goto L9d
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            r12 = 0
            return r12
        L38:
            double r12 = r0.zza
            com.google.android.recaptcha.internal.zzef r14 = r0.zze
            defpackage.e11.e0(r15)     // Catch: com.google.android.recaptcha.internal.zzbd -> L43
            r10 = r12
            r12 = r14
            r13 = r10
            goto L84
        L43:
            r13 = move-exception
            r12 = r14
            goto L9d
        L46:
            defpackage.e11.e0(r15)
            com.google.android.recaptcha.internal.zzcm r15 = r12.zzb
            com.google.android.recaptcha.internal.zzcj r1 = com.google.android.recaptcha.internal.zzcm.zzb()
            boolean r15 = defpackage.lc5.Q(r15, r1)
            if (r15 != 0) goto La4
            com.google.android.recaptcha.internal.zzcm r15 = r12.zzb
            com.google.android.recaptcha.internal.zzci r1 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r15 = defpackage.lc5.Q(r15, r1)
            if (r15 == 0) goto L62
            goto La4
        L62:
            com.google.android.recaptcha.internal.zzck r15 = com.google.android.recaptcha.internal.zzcm.zzc()
            r12.zzb = r15
            double r13 = (double) r13
            com.google.android.recaptcha.internal.zzdt r15 = r12.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r6 = r6 * r13
            r0.zze = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r8 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r13 = r13 * r8
            r0.zza = r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            long r6 = (long) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            java.lang.Object r15 = r15.zzo(r6, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            if (r15 == r5) goto L9c
        L84:
            com.google.android.recaptcha.internal.zzsc r15 = (com.google.android.recaptcha.internal.zzsc) r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r12.zzc = r15     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            com.google.android.recaptcha.internal.zzdt r1 = r12.zza     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            long r13 = (long) r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r0.zze = r12     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r0.zzd = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            java.lang.Object r13 = r1.zzn(r15, r13, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            if (r13 == r5) goto L9c
        L95:
            com.google.android.recaptcha.internal.zzcj r13 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            r12.zzb = r13     // Catch: com.google.android.recaptcha.internal.zzbd -> L2e
            return r2
        L9c:
            return r5
        L9d:
            com.google.android.recaptcha.internal.zzci r14 = com.google.android.recaptcha.internal.zzcm.zza()
            r12.zzb = r14
            throw r13
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, jt1):java.lang.Object");
    }
}
