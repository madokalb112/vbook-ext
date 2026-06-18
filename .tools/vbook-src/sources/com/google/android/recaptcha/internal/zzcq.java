package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import defpackage.ah1;
import defpackage.jt1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, jt1 jt1Var) {
        return zzcv.zzh(zza(application), str, j, null, null, null, jt1Var, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzas.zza(ah1.x(zza(application).zzd().zza(), null, new zzco(application, str, j, null), 3));
    }

    public static final Object zzd(Application application, String str, jt1 jt1Var) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, jt1Var, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(ah1.x(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
