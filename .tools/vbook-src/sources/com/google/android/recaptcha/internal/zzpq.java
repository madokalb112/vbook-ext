package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzpq extends zzpr {
    public zzpq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzc(Object obj, long j, boolean z) {
        if (zzps.zzb) {
            zzps.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzps.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzd(Object obj, long j, byte b) {
        if (zzps.zzb) {
            zzps.zzD(obj, j, b);
        } else {
            zzps.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final boolean zzg(Object obj, long j) {
        return zzps.zzb ? zzps.zzt(obj, j) : zzps.zzu(obj, j);
    }
}
