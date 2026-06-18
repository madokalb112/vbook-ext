package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import defpackage.ah1;
import defpackage.dp5;
import defpackage.ex1;
import defpackage.fc1;
import defpackage.gc1;
import defpackage.jt1;
import defpackage.y86;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final dp5 zzd;
    private final dp5 zze;
    private final dp5 zzf;
    private final dp5 zzg;
    private final dp5 zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = ex1.a0(zzdm.zza);
        this.zze = ex1.a0(zzdn.zza);
        this.zzf = ex1.a0(zzdo.zza);
        this.zzg = ex1.a0(zzdp.zza);
        this.zzh = ex1.a0(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r11, long r12, defpackage.jt1 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, jt1):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return fc1.Z0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) ex1.a0(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, defpackage.jt1 r9) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            defpackage.e11.e0(r9)     // Catch: java.lang.Exception -> L27 defpackage.vua -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L52
        L27:
            r6 = move-exception
            goto L63
        L29:
            r6 = move-exception
            goto L75
        L2b:
            r6 = move-exception
            goto L87
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L34:
            defpackage.e11.e0(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r1 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r1)
            com.google.android.recaptcha.internal.zzl r5 = r5.zzc     // Catch: java.lang.Exception -> L59 defpackage.vua -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzd = r9     // Catch: java.lang.Exception -> L59 defpackage.vua -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzc = r2     // Catch: java.lang.Exception -> L59 defpackage.vua -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            java.lang.Object r5 = r5.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L59 defpackage.vua -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            xx1 r6 = defpackage.xx1.a
            if (r5 == r6) goto L58
            r4 = r9
            r9 = r5
            r5 = r4
        L52:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L27 defpackage.vua -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r5.zza()     // Catch: java.lang.Exception -> L27 defpackage.vua -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            return r9
        L58:
            return r6
        L59:
            r5 = move-exception
            r6 = r5
            goto L62
        L5c:
            r5 = move-exception
            r6 = r5
            goto L74
        L5f:
            r5 = move-exception
            r6 = r5
            goto L86
        L62:
            r5 = r9
        L63:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            throw r7
        L74:
            r5 = r9
        L75:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            throw r7
        L86:
            r5 = r9
        L87:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, jt1):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j, jt1 jt1Var) {
        return ah1.b0(this.zzi.zza().q(), new zzdg(this, str, j, zzspVar, null), jt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r10, long r11, defpackage.jt1 r13) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r13)     // Catch: java.lang.Exception -> L46 defpackage.vua -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            goto L43
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.e11.e0(r13)
            com.google.android.recaptcha.internal.zzdl r3 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L46 defpackage.vua -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            r8 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r8)     // Catch: java.lang.Exception -> L46 defpackage.vua -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            r0.zzc = r2     // Catch: java.lang.Exception -> L46 defpackage.vua -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            java.lang.Object r9 = defpackage.zib.o(r6, r3, r0)     // Catch: java.lang.Exception -> L46 defpackage.vua -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            xx1 r10 = defpackage.xx1.a
            if (r9 != r10) goto L43
            return r10
        L43:
            heb r9 = defpackage.heb.a
            return r9
        L46:
            r0 = move-exception
            r9 = r0
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r11 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r12 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r11, r12, r9)
            throw r10
        L56:
            r0 = move-exception
            r9 = r0
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r11 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r12 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r11, r12, r9)
            throw r10
        L66:
            r0 = move-exception
            r9 = r0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzo(long r6, defpackage.jt1 r8) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L33
            com.google.android.recaptcha.internal.zzen r5 = r0.zze
            com.google.android.recaptcha.internal.zzdt r6 = r0.zzd
            defpackage.e11.e0(r8)     // Catch: java.lang.Exception -> L2a defpackage.vua -> L2c com.google.android.recaptcha.internal.zzbd -> L2e
            goto L5b
        L2a:
            r7 = move-exception
            goto L6a
        L2c:
            r7 = move-exception
            goto L81
        L2e:
            r7 = move-exception
            r8 = r5
            r5 = r6
            goto L96
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L39:
            defpackage.e11.e0(r8)
            com.google.android.recaptcha.internal.zzek r8 = r5.zzb
            r1 = 22
            com.google.android.recaptcha.internal.zzen r8 = r8.zzf(r1)
            com.google.android.recaptcha.internal.zzds r1 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L5f defpackage.vua -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r1.<init>(r5, r8, r2)     // Catch: java.lang.Exception -> L5f defpackage.vua -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzd = r5     // Catch: java.lang.Exception -> L5f defpackage.vua -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zze = r8     // Catch: java.lang.Exception -> L5f defpackage.vua -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzc = r3     // Catch: java.lang.Exception -> L5f defpackage.vua -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            java.lang.Object r6 = defpackage.zib.o(r6, r1, r0)     // Catch: java.lang.Exception -> L5f defpackage.vua -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            xx1 r7 = defpackage.xx1.a
            if (r6 == r7) goto L5e
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r4
        L5b:
            com.google.android.recaptcha.internal.zzsc r8 = (com.google.android.recaptcha.internal.zzsc) r8     // Catch: java.lang.Exception -> L2a defpackage.vua -> L2c com.google.android.recaptcha.internal.zzbd -> L2e
            return r8
        L5e:
            return r7
        L5f:
            r6 = move-exception
            r7 = r6
            goto L68
        L62:
            r6 = move-exception
            r7 = r6
            goto L7f
        L65:
            r6 = move-exception
            r7 = r6
            goto L96
        L68:
            r6 = r5
            r5 = r8
        L6a:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r2 = r7.getMessage()
            r8.<init>(r0, r1, r2)
            com.google.android.recaptcha.internal.zzbd r6 = r6.zzs(r7, r8)
            r5.zzb(r6)
            throw r6
        L7f:
            r6 = r5
            r5 = r8
        L81:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r2 = r7.getMessage()
            r8.<init>(r0, r1, r2)
            com.google.android.recaptcha.internal.zzbd r6 = r6.zzs(r7, r8)
            r5.zzb(r6)
            throw r6
        L96:
            com.google.android.recaptcha.internal.zzbb r6 = r7.zzb()
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r6 = defpackage.lc5.Q(r6, r0)
            if (r6 == 0) goto La6
            com.google.android.recaptcha.internal.zzbd r7 = r5.zzs(r7, r7)
        La6:
            r8.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, jt1):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iO = y86.O(gc1.M(listZzk, 10));
            if (iO < 16) {
                iO = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e) {
            zzenVarZzf.zzb(e);
        } catch (Exception e2) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
