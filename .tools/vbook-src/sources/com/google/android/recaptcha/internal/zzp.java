package com.google.android.recaptcha.internal;

import defpackage.dp5;
import defpackage.ex1;
import defpackage.gc1;
import defpackage.heb;
import defpackage.jt1;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final dp5 zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i = zzav.zza;
        this.zzb = ex1.a0(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, jt1 jt1Var) {
        zzen zzenVarZzb = zzz.zzb(this, str);
        String strZza = zzg().zza();
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(strZza);
        zztfVarZzf.zze(gc1.Y(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, jt1 jt1Var) {
        zzen zzenVarZzc = zzz.zzc(this);
        int length = zzseVar.zzl().length();
        heb hebVar = heb.a;
        if (length == 0) {
            this.zzc = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return hebVar;
        }
        zzbf zzbfVarZzg = zzg();
        Map mapSingletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzseVar.zzl());
        mapSingletonMap.getClass();
        zzbfVarZzg.zzb(mapSingletonMap);
        zzenVarZzc.zza();
        return hebVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }
}
