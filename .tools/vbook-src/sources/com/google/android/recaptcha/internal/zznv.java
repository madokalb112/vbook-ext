package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zznv {
    public static final List zza(Object obj, long j) {
        zznk zznkVar = (zznk) zzps.zzf(obj, j);
        if (zznkVar.zzc()) {
            return zznkVar;
        }
        int size = zznkVar.size();
        zznk zznkVarZzd = zznkVar.zzd(size == 0 ? 10 : size + size);
        zzps.zzs(obj, j, zznkVarZzd);
        return zznkVarZzd;
    }
}
