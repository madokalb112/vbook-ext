package com.google.android.recaptcha.internal;

import defpackage.dx1;
import defpackage.w58;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzjh {
    private boolean zza;
    private long zzb;
    private long zzc;

    public static zzjh zzb() {
        zzjh zzjhVar = new zzjh();
        zzjhVar.zze();
        return zzjhVar;
    }

    public static zzjh zzc() {
        return new zzjh();
    }

    private final long zzg() {
        return this.zza ? (System.nanoTime() - this.zzc) + this.zzb : this.zzb;
    }

    public final String toString() {
        String str;
        long jZzg = zzg();
        TimeUnit timeUnit = jZzg / 86400000000000L > 0 ? TimeUnit.DAYS : jZzg / 3600000000000L > 0 ? TimeUnit.HOURS : jZzg / 60000000000L > 0 ? TimeUnit.MINUTES : jZzg / 1000000000 > 0 ? TimeUnit.SECONDS : jZzg / 1000000 > 0 ? TimeUnit.MILLISECONDS : jZzg / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZzg / r2.convert(1L, timeUnit)));
        switch (zzjg.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                w58.a();
                return null;
        }
        return dx1.h(str2, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzjh zzd() {
        this.zzb = 0L;
        this.zza = false;
        return this;
    }

    public final zzjh zze() {
        zzjf.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zzjh zzf() {
        long jNanoTime = System.nanoTime();
        zzjf.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb = (jNanoTime - this.zzc) + this.zzb;
        return this;
    }
}
