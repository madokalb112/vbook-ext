package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzaj extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzanVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzanVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzaj(this.zzb, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        e11.e0(obj);
        if (i == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzanVar = this.zzb;
            this.zza = 1;
            Object objZze = zzanVar.zze(this);
            xx1 xx1Var = xx1.a;
            if (objZze == xx1Var) {
                return xx1Var;
            }
        }
        return heb.a;
    }
}
