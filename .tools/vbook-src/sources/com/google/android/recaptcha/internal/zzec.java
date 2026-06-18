package com.google.android.recaptcha.internal;

import defpackage.ah1;
import defpackage.ai1;
import defpackage.bi1;
import defpackage.heb;
import defpackage.jt1;
import defpackage.lc5;
import defpackage.p7c;
import defpackage.xx1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private ai1 zzc = p7c.d();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(defpackage.kb4 r5, defpackage.jt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzdv
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzdv r0 = (com.google.android.recaptcha.internal.zzdv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdv r0 = new com.google.android.recaptcha.internal.zzdv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.zza
            int r6 = r0.zzc
            r1 = 1
            if (r6 == 0) goto L2e
            if (r6 != r1) goto L27
            com.google.android.recaptcha.internal.zzbn r5 = r0.zzd
            defpackage.e11.e0(r4)
            goto L43
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r4)
            com.google.android.recaptcha.internal.zzbn r4 = new com.google.android.recaptcha.internal.zzbn
            r4.<init>()
            r0.zzd = r4
            r0.zzc = r1
            java.lang.Object r5 = r5.invoke(r0)
            xx1 r6 = defpackage.xx1.a
            if (r5 == r6) goto L51
            r5 = r4
        L43:
            r5.zzc()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r5.zza(r4)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzl(kb4, jt1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:25:0x0062, B:30:0x0075, B:31:0x007e), top: B:52:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(long r9, defpackage.jt1 r11) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzdw
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzdw r0 = (com.google.android.recaptcha.internal.zzdw) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdw r0 = new com.google.android.recaptcha.internal.zzdw
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.zzb
            int r1 = r0.zzd
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            long r8 = r0.zza
            com.google.android.recaptcha.internal.zzec r10 = r0.zze
            defpackage.e11.e0(r11)     // Catch: java.lang.Exception -> L2f
            goto L62
        L2f:
            r8 = move-exception
            goto L82
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r4
        L37:
            long r9 = r0.zza
            com.google.android.recaptcha.internal.zzec r8 = r0.zze
            defpackage.e11.e0(r11)
            goto L4e
        L3f:
            defpackage.e11.e0(r11)
            r0.zze = r8
            r0.zza = r9
            r0.zzd = r3
            java.lang.Object r11 = r8.zzn(r9, r0)
            if (r11 == r5) goto Lb9
        L4e:
            com.google.android.recaptcha.internal.zzdy r11 = new com.google.android.recaptcha.internal.zzdy     // Catch: java.lang.Exception -> L7f
            r11.<init>(r9, r8, r4)     // Catch: java.lang.Exception -> L7f
            r0.zze = r8     // Catch: java.lang.Exception -> L7f
            r0.zza = r9     // Catch: java.lang.Exception -> L7f
            r0.zzd = r2     // Catch: java.lang.Exception -> L7f
            java.lang.Object r11 = r8.zzl(r11, r0)     // Catch: java.lang.Exception -> L7f
            if (r11 == r5) goto Lb9
            r6 = r9
            r10 = r8
            r8 = r6
        L62:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Exception -> L2f
            long r0 = r11.longValue()     // Catch: java.lang.Exception -> L2f
            long r8 = r8 - r0
            r0 = 500(0x1f4, double:2.47E-321)
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 < 0) goto L75
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            return r10
        L75:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzc     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzar     // Catch: java.lang.Exception -> L2f
            r8.<init>(r9, r11, r4)     // Catch: java.lang.Exception -> L2f
            throw r8     // Catch: java.lang.Exception -> L2f
        L7f:
            r9 = move-exception
            r10 = r8
            r8 = r9
        L82:
            boolean r9 = r8 instanceof com.google.android.recaptcha.internal.zzbd
            if (r9 == 0) goto L8a
            r4 = r8
            com.google.android.recaptcha.internal.zzbd r4 = (com.google.android.recaptcha.internal.zzbd) r4
        L8a:
            if (r4 != 0) goto L99
            com.google.android.recaptcha.internal.zzbd r4 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzar
            java.lang.String r8 = r8.getMessage()
            r4.<init>(r9, r11, r8)
        L99:
            com.google.android.recaptcha.internal.zzcm r8 = r10.zzf
            com.google.android.recaptcha.internal.zzci r9 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r8 = defpackage.lc5.Q(r8, r9)
            if (r8 != 0) goto Lb3
            com.google.android.recaptcha.internal.zzcm r8 = r10.zzf
            com.google.android.recaptcha.internal.zzck r9 = com.google.android.recaptcha.internal.zzcm.zzc()
            boolean r8 = defpackage.lc5.Q(r8, r9)
            if (r8 == 0) goto Lb2
            goto Lb3
        Lb2:
            throw r4
        Lb3:
            com.google.android.recaptcha.internal.zzbd r8 = r10.zzd
            if (r8 == 0) goto Lb8
            r4 = r8
        Lb8:
            throw r4
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzm(long, jt1):java.lang.Object");
    }

    private final Object zzn(long j, jt1 jt1Var) {
        boolean zQ = lc5.Q(this.zzf, zzcm.zzb);
        heb hebVar = heb.a;
        if (!zQ && !lc5.Q(this.zzf, zzcm.zzc) && (!lc5.Q(this.zzf, zzcm.zzd) || zzo(this.zzd))) {
            this.zzf = zzcm.zzc;
            bi1 bi1VarD = p7c.d();
            this.zzc = bi1VarD;
            ah1.J(this.zzg.zza(), null, null, new zzeb(this, bi1VarD, j, null), 3);
        }
        return hebVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (lc5.Q(zzbdVar.zzb(), zzbb.zzd) || lc5.Q(zzbdVar.zzb(), zzbb.zze) || lc5.Q(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, defpackage.jt1 r22) throws com.google.android.recaptcha.internal.zzbd {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, jt1):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, jt1 jt1Var) {
        Object objZzn = zzn(j, jt1Var);
        return objZzn == xx1.a ? objZzn : heb.a;
    }
}
