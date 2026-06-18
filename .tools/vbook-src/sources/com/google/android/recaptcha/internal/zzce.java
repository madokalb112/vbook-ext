package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int i, int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zztd zztdVarZzf = zzte.zzf();
        zztdVarZzf.zzq(i2);
        zztdVarZzf.zzr(i);
        this.zzb = zztdVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
