package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i);
        Object zzbjVar = concurrentHashMap.get(numValueOf);
        if (zzbjVar == null) {
            zzbjVar = new zzbj();
        }
        zzbj zzbjVar2 = (zzbj) zzbjVar;
        zzbjVar2.zzg(zzbjVar2.zzb() + 1);
        zzbjVar2.zzf(zzbjVar2.zzd() + j);
        zzbjVar2.zze(Math.max(j, zzbjVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzbjVar2);
    }
}
