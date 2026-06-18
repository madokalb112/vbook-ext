package com.google.android.recaptcha.internal;

import java.util.HashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzgf {
    private final zzge zza;
    private final HashMap zzb;
    private final zzfw zzc;
    private final zzcg zzd;

    public zzgf(zzfw zzfwVar, zzcg zzcgVar, zzbo zzboVar) {
        this.zzc = zzfwVar;
        this.zzd = zzcgVar;
        zzge zzgeVar = new zzge();
        this.zza = zzgeVar;
        HashMap map = new HashMap();
        this.zzb = map;
        zzgeVar.zzd(Token.WITHEXPR, map);
    }

    public final zzge zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(Token.WITHEXPR, this.zzb);
    }

    public final zzcg zzc() {
        return this.zzd;
    }

    public final zzfw zzd() {
        return this.zzc;
    }

    public final void zze(int i, Object obj) {
        this.zzb.put(Integer.valueOf(i - 2), obj);
    }
}
