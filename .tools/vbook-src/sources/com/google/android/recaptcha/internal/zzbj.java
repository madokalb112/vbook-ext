package com.google.android.recaptcha.internal;

import defpackage.bw9;
import defpackage.j39;
import defpackage.t1c;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strH0 = bw9.h0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strH02 = bw9.h0(10, String.valueOf(this.zzc));
        return j39.n(j39.q("avgExecutionTime: ", strH0, " us| maxExecutionTime: ", strH02, " us| totalTime: "), bw9.h0(10, String.valueOf(this.zzb)), " us| #Usages: ", bw9.h0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return t1c.O(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
