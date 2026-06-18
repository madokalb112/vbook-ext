package com.google.android.recaptcha.internal;

import defpackage.jt1;
import defpackage.kt1;
import defpackage.qm8;
import defpackage.xx1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zza extends kt1 {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, jt1 jt1Var) {
        super(jt1Var);
        this.zzd = zzeVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == xx1.a ? objZzc : new qm8(objZzc);
    }
}
