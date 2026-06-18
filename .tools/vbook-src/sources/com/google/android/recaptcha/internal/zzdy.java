package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.kb4;
import defpackage.o1a;
import defpackage.xx1;
import defpackage.zib;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzdy extends o1a implements kb4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, jt1 jt1Var) {
        super(1, jt1Var);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new zzdy(this.zzb, this.zzc, jt1Var);
    }

    @Override // defpackage.kb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        e11.e0(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            Object objO = zib.o(j, zzdxVar, this);
            xx1 xx1Var = xx1.a;
            if (objO == xx1Var) {
                return xx1Var;
            }
        }
        return heb.a;
    }
}
