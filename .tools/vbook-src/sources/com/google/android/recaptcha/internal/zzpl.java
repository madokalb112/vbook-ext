package com.google.android.recaptcha.internal;

import defpackage.ifc;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzle zzleVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i) throws zznn {
        int iZzd = zzovVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzh(obj, i2, zzovVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zze(obj, i2, zzovVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzg(obj, i2, zzovVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    zzd(obj, i2, zzovVar.zzf());
                    return true;
                }
                ifc.a();
            }
            return false;
        }
        Object objZzb = zzb();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            ifc.h("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzovVar, i5)) {
        }
        if ((i4 | 4) == zzovVar.zzd()) {
            zzf(obj, i2, zzc(objZzb));
            return true;
        }
        ifc.h("Protocol message end-group tag did not match expected tag.");
        return false;
    }
}
