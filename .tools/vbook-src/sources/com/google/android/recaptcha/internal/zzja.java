package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import defpackage.ah1;
import defpackage.ai1;
import defpackage.bi1;
import defpackage.dp5;
import defpackage.ex1;
import defpackage.fc1;
import defpackage.heb;
import defpackage.jt1;
import defpackage.lc5;
import defpackage.vua;
import defpackage.xx1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzja extends zze {
    public ai1 zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final dp5 zzk;
    private final dp5 zzl;
    private final dp5 zzm;
    private final dp5 zzn;
    private final dp5 zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i = zzav.zza;
        this.zzk = ex1.a0(zzis.zza);
        this.zzl = ex1.a0(zzit.zza);
        this.zzm = ex1.a0(zziu.zza);
        this.zzn = ex1.a0(zziv.zza);
        this.zzo = ex1.a0(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, defpackage.jt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            com.google.android.recaptcha.internal.zzja r4 = r0.zzd
            defpackage.e11.e0(r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            goto L4a
        L28:
            r5 = move-exception
            goto L5c
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L30:
            defpackage.e11.e0(r6)
            dp5 r6 = r4.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            java.lang.Object r6 = r6.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            com.google.android.recaptcha.internal.zzek r1 = r4.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            java.lang.Object r6 = r6.zzd(r5, r1, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            xx1 r5 = defpackage.xx1.a
            if (r6 != r5) goto L4a
            return r5
        L4a:
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            com.google.android.recaptcha.internal.zzbi r5 = r4.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            vx1 r5 = r5.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            com.google.android.recaptcha.internal.zzin r0 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            r0.<init>(r4, r6, r2)     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            r6 = 3
            defpackage.ah1.J(r5, r2, r2, r0, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L28
            goto L65
        L5c:
            ai1 r4 = r4.zzA()
            bi1 r4 = (defpackage.bi1) r4
            r4.o0(r5)
        L65:
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, jt1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzF(java.lang.String r10, defpackage.jt1 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L32
            java.lang.String r9 = r0.zzf
            java.lang.String r10 = r0.zze
            com.google.android.recaptcha.internal.zzja r1 = r0.zzd
            defpackage.e11.e0(r11)     // Catch: java.lang.Exception -> L2f
            r4 = r9
            r9 = r1
        L2d:
            r5 = r10
            goto L64
        L2f:
            r0 = move-exception
            r9 = r0
            goto L76
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r2
        L38:
            defpackage.e11.e0(r11)
            com.google.android.recaptcha.internal.zzek r11 = r9.zzj
            r1 = 26
            com.google.android.recaptcha.internal.zzen r11 = r11.zzf(r1)
            r9.zzp = r11
            dp5 r11 = r9.zzl     // Catch: java.lang.Exception -> L70
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzbr r11 = (com.google.android.recaptcha.internal.zzbr) r11     // Catch: java.lang.Exception -> L70
            java.lang.String r11 = r11.zza()     // Catch: java.lang.Exception -> L70
            r0.zzd = r9     // Catch: java.lang.Exception -> L70
            r0.zze = r10     // Catch: java.lang.Exception -> L70
            r0.zzf = r11     // Catch: java.lang.Exception -> L70
            r0.zzc = r3     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = r9.zzw(r0)     // Catch: java.lang.Exception -> L70
            xx1 r1 = defpackage.xx1.a
            if (r0 == r1) goto L75
            r4 = r11
            r11 = r0
            goto L2d
        L64:
            r3 = r11
            android.webkit.WebView r3 = (android.webkit.WebView) r3     // Catch: java.lang.Exception -> L70
            java.lang.String r6 = "text/html"
            java.lang.String r7 = "utf-8"
            r8 = 0
            r3.loadDataWithBaseURL(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L70
            goto L95
        L70:
            r0 = move-exception
            r10 = r0
            r1 = r9
            r9 = r10
            goto L76
        L75:
            return r1
        L76:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r11 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r11, r0, r9)
            com.google.android.recaptcha.internal.zzen r9 = r1.zzp
            if (r9 == 0) goto L8a
            r9.zzb(r10)
        L8a:
            r1.zzp = r2
            ai1 r9 = r1.zzA()
            bi1 r9 = (defpackage.bi1) r9
            r9.o0(r10)
        L95:
            heb r9 = defpackage.heb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, jt1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzG(java.lang.String r11, defpackage.jt1 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.zza
            int r1 = r0.zzc
            heb r2 = defpackage.heb.a
            r3 = 2
            r4 = 0
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L37
            if (r1 != r3) goto L31
            java.lang.String r10 = r0.zze
            com.google.android.recaptcha.internal.zzja r11 = r0.zzd
            defpackage.e11.e0(r12)
            goto L77
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r4
        L37:
            java.lang.String r11 = r0.zze
            com.google.android.recaptcha.internal.zzja r10 = r0.zzd
            defpackage.e11.e0(r12)
            goto L5a
        L3f:
            defpackage.e11.e0(r12)
            com.google.android.recaptcha.internal.zzcb r12 = r10.zzg
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r8 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r1 = new com.google.android.recaptcha.internal.zzje[]{r1, r7, r8}
            r0.zzd = r10
            r0.zze = r11
            r0.zzc = r5
            java.lang.Object r12 = r12.zzb(r1, r0)
            if (r12 == r6) goto L98
        L5a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L63
            return r2
        L63:
            com.google.android.recaptcha.internal.zzcb r12 = r10.zzg
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r10
            r0.zze = r11
            r0.zzc = r3
            java.lang.Object r12 = r12.zzc(r1, r0)
            if (r12 != r6) goto L74
            goto L98
        L74:
            r9 = r11
            r11 = r10
            r10 = r9
        L77:
            bi1 r12 = defpackage.p7c.d()
            r11.zza = r12
            com.google.android.recaptcha.internal.zzek r12 = r11.zzj
            r12.zzc(r10)
            r10 = 42
            com.google.android.recaptcha.internal.zzen r10 = r12.zzf(r10)
            com.google.android.recaptcha.internal.zzbi r12 = r11.zzq
            vx1 r12 = r12.zza()
            com.google.android.recaptcha.internal.zziz r0 = new com.google.android.recaptcha.internal.zziz
            r0.<init>(r11, r10, r4)
            r10 = 3
            defpackage.ah1.J(r12, r4, r4, r0, r10)
            return r2
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, jt1):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final ai1 zzA() {
        ai1 ai1Var = this.zza;
        if (ai1Var != null) {
            return ai1Var;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(fc1.a1(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, jt1 jt1Var) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        if (r12 == r8) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6 A[Catch: Exception -> 0x0039, PHI: r10 r11
  0x00c6: PHI (r10v11 ??) = (r10v22 ??), (r10v23 ??) binds: [B:42:0x00c4, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r11v9 ??) = (r11v18 ??), (r11v19 ??) binds: [B:42:0x00c4, B:23:0x0046] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0039, blocks: (B:16:0x0034, B:45:0x0104, B:23:0x0046, B:43:0x00c6, B:41:0x00b4), top: B:53:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzsh] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zztp] */
    /* JADX WARN: Type inference failed for: r9v0 */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(java.lang.String r11, defpackage.jt1 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, jt1):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, jt1 jt1Var) {
        if (lc5.Q(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r5.zzc(r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, defpackage.jt1 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.e11.e0(r7)
            goto L5b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2f:
            defpackage.e11.e0(r7)
            goto L6b
        L33:
            defpackage.e11.e0(r7)
            boolean r7 = r6.zzT()
            xx1 r1 = defpackage.xx1.a
            if (r7 == 0) goto L5e
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L5e
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4b
            goto L5e
        L4b:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r5 = r5.zzG(r6, r0)
            if (r5 == r1) goto L6a
        L5b:
            heb r5 = defpackage.heb.a
            return r5
        L5e:
            com.google.android.recaptcha.internal.zzcb r5 = r5.zzg
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r5 = r5.zzc(r6, r0)
            if (r5 != r1) goto L6b
        L6a:
            return r1
        L6b:
            com.google.android.recaptcha.internal.zzbd r5 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r6 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r7 = com.google.android.recaptcha.internal.zzba.zzav
            r5.<init>(r6, r7, r2)
            pm8 r6 = new pm8
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, jt1):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, jt1 jt1Var) {
        exc.getMessage();
        ai1 ai1Var = (ai1) this.zze.remove(str);
        if (ai1Var != null) {
            ((bi1) ai1Var).o0(exc);
        }
        return heb.a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, jt1 jt1Var) {
        return ((exc instanceof vua) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(jt1 jt1Var) {
        return ah1.b0(this.zzq.zzb().q(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), jt1Var);
    }

    public final Object zzx(jt1 jt1Var) throws Throwable {
        Object objB0 = ah1.b0(this.zzq.zzb().q(), new zzil(this, null), jt1Var);
        return objB0 == xx1.a ? objB0 : heb.a;
    }
}
