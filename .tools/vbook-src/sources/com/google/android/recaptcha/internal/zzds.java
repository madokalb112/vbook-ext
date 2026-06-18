package com.google.android.recaptcha.internal;

import defpackage.ah1;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzds extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzds(this.zzb, this.zzc, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.zza;
        e11.e0(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = ah1.b0(zzdtVar.zzi.zza().q(), new zzdh(zzdtVar, null), this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
