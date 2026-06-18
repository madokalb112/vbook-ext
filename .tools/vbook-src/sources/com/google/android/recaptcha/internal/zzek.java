package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzek {
    private final String zza;
    private String zzb;
    private String zzc;
    private final Context zzd;
    private final zzeo zze;
    private String zzf;
    private Integer zzg;
    private final int zzh;

    private zzek(zzek zzekVar) {
        this(zzekVar.zza, zzekVar.zzb, zzekVar.zzc, zzekVar.zzh, zzekVar.zzd, zzekVar.zze);
        this.zzf = zzekVar.zzf;
        this.zzg = zzekVar.zzg;
    }

    public final zzek zza() {
        return new zzek(this);
    }

    public final zzek zzb(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final zzek zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(zztx zztxVar) {
        this.zze.zza(zztxVar);
    }

    public final zzen zzf(int i) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzcc zzccVar = new zzcc();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzen(i, this.zza, this.zzh, str, str2, str3, null, this.zze, zzccVar, context, num);
    }

    public /* synthetic */ zzek(String str, String str2, String str3, int i, Context context, zzeo zzeoVar, zf2 zf2Var) {
        this(str, str2, str3, i, context, zzeoVar);
    }

    private zzek(String str, String str2, String str3, int i, Context context, zzeo zzeoVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzh = i;
        this.zzd = context;
        this.zze = zzeoVar;
    }
}
