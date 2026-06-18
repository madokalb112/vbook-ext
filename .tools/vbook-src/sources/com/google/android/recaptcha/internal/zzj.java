package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.qm8;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzj extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j, zzsc zzscVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzeVar;
        this.zzc = j;
        this.zzd = zzscVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzj(this.zzb, this.zzc, this.zzd, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objZze;
        int i = this.zza;
        e11.e0(obj);
        if (i != 0) {
            objZze = ((qm8) obj).a;
        } else {
            zze zzeVar = this.zzb;
            long j = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j, zzscVar, this);
            xx1 xx1Var = xx1.a;
            if (objZze == xx1Var) {
                return xx1Var;
            }
        }
        return new qm8(objZze);
    }
}
