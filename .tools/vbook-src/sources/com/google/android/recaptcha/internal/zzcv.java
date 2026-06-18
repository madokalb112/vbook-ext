package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.ex1;
import defpackage.jt1;
import defpackage.lc5;
import defpackage.r07;
import defpackage.u07;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final r07 zzb = u07.a();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        this.zza = application;
        int i = 1;
        this.zze = new zzl(null, i, 0 == true ? 1 : 0);
        int i2 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(0 == true ? 1 : 0, i, 0 == true ? 1 : 0)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i3 = 0; i3 < 13; i3++) {
            zzaw zzawVar = zzawVarArr[i3];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (lc5.Q(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) throws zzbd {
        if (j < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (hs1.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return lc5.Q(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, jt1 jt1Var, int i, Object obj) {
        if ((i & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzcvVar.zzg(str, j, null, zzbiVar2, zzchVar2, jt1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, int r7, defpackage.yb4 r8, defpackage.jt1 r9) throws com.google.android.recaptcha.RecaptchaException {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            defpackage.e11.e0(r9)     // Catch: java.lang.Exception -> L27 com.google.android.recaptcha.internal.zzbd -> L29
            goto L4d
        L27:
            r6 = move-exception
            goto L59
        L29:
            r6 = move-exception
            goto L71
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L32:
            defpackage.e11.e0(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r5 = r5.zzk(r6, r9, r7)
            r6 = 6
            com.google.android.recaptcha.internal.zzen r6 = r5.zzf(r6)
            r0.zzd = r6     // Catch: java.lang.Exception -> L52 com.google.android.recaptcha.internal.zzbd -> L54
            r0.zzc = r2     // Catch: java.lang.Exception -> L52 com.google.android.recaptcha.internal.zzbd -> L54
            java.lang.Object r9 = r8.invoke(r5, r0)     // Catch: java.lang.Exception -> L52 com.google.android.recaptcha.internal.zzbd -> L54
            xx1 r5 = defpackage.xx1.a
            if (r9 == r5) goto L51
            r5 = r6
        L4d:
            r5.zza()     // Catch: java.lang.Exception -> L27 com.google.android.recaptcha.internal.zzbd -> L29
            return r9
        L51:
            return r5
        L52:
            r5 = move-exception
            goto L56
        L54:
            r5 = move-exception
            goto L6e
        L56:
            r4 = r6
            r6 = r5
            r5 = r4
        L59:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r5 = r7.zzc()
            throw r5
        L6e:
            r4 = r6
            r6 = r5
            r5 = r4
        L71:
            r5.zzb(r6)
            com.google.android.recaptcha.RecaptchaException r5 = r6.zzc()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, yb4, jt1):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String string = UUID.randomUUID().toString();
        int i2 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) ex1.a0(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(java.lang.String r18, long r19, com.google.android.recaptcha.internal.zzcn r21, com.google.android.recaptcha.internal.zzbi r22, com.google.android.recaptcha.internal.zzch r23, defpackage.jt1 r24) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof com.google.android.recaptcha.internal.zzcs
            if (r2 == 0) goto L17
            r2 = r1
            com.google.android.recaptcha.internal.zzcs r2 = (com.google.android.recaptcha.internal.zzcs) r2
            int r3 = r2.zzg
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.zzg = r3
            goto L1c
        L17:
            com.google.android.recaptcha.internal.zzcs r2 = new com.google.android.recaptcha.internal.zzcs
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.zze
            int r3 = r2.zzg
            r4 = 1
            r5 = 2
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r3 == 0) goto L57
            if (r3 == r4) goto L3e
            if (r3 != r5) goto L38
            java.lang.Object r0 = r2.zza
            r2 = r0
            r07 r2 = (defpackage.r07) r2
            defpackage.e11.e0(r1)     // Catch: java.lang.Throwable -> L35
            goto Lb2
        L35:
            r0 = move-exception
            goto Lba
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            return r6
        L3e:
            long r3 = r2.zzd
            java.lang.Object r0 = r2.zzc
            r07 r0 = (defpackage.r07) r0
            com.google.android.recaptcha.internal.zzch r8 = r2.zzi
            com.google.android.recaptcha.internal.zzbi r9 = r2.zzj
            java.lang.String r10 = r2.zzh
            java.lang.Object r11 = r2.zza
            com.google.android.recaptcha.internal.zzcv r11 = (com.google.android.recaptcha.internal.zzcv) r11
            defpackage.e11.e0(r1)
            r1 = r0
            r15 = r8
            r14 = r9
            r9 = r11
            r11 = r3
            goto L7f
        L57:
            defpackage.e11.e0(r1)
            r07 r1 = r0.zzb
            r2.zza = r0
            r3 = r18
            r2.zzh = r3
            r2.zzb = r6
            r8 = r22
            r2.zzj = r8
            r9 = r23
            r2.zzi = r9
            r2.zzc = r1
            r10 = r19
            r2.zzd = r10
            r2.zzg = r4
            java.lang.Object r4 = r1.p(r2)
            if (r4 == r7) goto Lbe
            r14 = r8
            r15 = r9
            r11 = r10
            r9 = r0
            r10 = r3
        L7f:
            com.google.android.recaptcha.internal.zzch r0 = com.google.android.recaptcha.internal.zzch.zza     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = defpackage.lc5.Q(r15, r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L89
            r0 = 3
            goto L94
        L89:
            com.google.android.recaptcha.internal.zzch r0 = com.google.android.recaptcha.internal.zzch.zzb     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = defpackage.lc5.Q(r15, r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L93
            r0 = 4
            goto L94
        L93:
            r0 = r5
        L94:
            com.google.android.recaptcha.internal.zzct r8 = new com.google.android.recaptcha.internal.zzct     // Catch: java.lang.Throwable -> Lb8
            r16 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lb8
            r2.zza = r1     // Catch: java.lang.Throwable -> Lb8
            r2.zzh = r6     // Catch: java.lang.Throwable -> Lb8
            r2.zzb = r6     // Catch: java.lang.Throwable -> Lb8
            r2.zzj = r6     // Catch: java.lang.Throwable -> Lb8
            r2.zzi = r6     // Catch: java.lang.Throwable -> Lb8
            r2.zzc = r6     // Catch: java.lang.Throwable -> Lb8
            r2.zzg = r5     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r9.zzj(r10, r0, r8, r2)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == r7) goto Lbe
            r2 = r1
            r1 = r0
        Lb2:
            com.google.android.recaptcha.internal.zzdc r1 = (com.google.android.recaptcha.internal.zzdc) r1     // Catch: java.lang.Throwable -> L35
            r2.q(r6)
            return r1
        Lb8:
            r0 = move-exception
            r2 = r1
        Lba:
            r2.q(r6)
            throw r0
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, jt1):java.lang.Object");
    }
}
