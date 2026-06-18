package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzfh extends o1a implements yb4 {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzfh(this.zza, this.zzb, this.zzc, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        zzew zzewVarZza = null;
        try {
            try {
                try {
                    zzewVarZza = zzfj.zza(this.zza).zza(this.zzb.zzd());
                    zzewVarZza.zzc();
                    zzewVarZza.zze(this.zzc.zzd());
                    zzsr zzsrVar = (zzsr) zzewVarZza.zza(zzsr.zzi());
                    zzewVarZza.zzd();
                    return zzsrVar;
                } catch (zzbd e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e2.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th;
        }
    }
}
