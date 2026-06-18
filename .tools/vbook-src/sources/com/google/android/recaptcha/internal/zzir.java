package com.google.android.recaptcha.internal;

import defpackage.jt1;
import defpackage.kt1;
import defpackage.qm8;
import defpackage.xx1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzir extends kt1 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, jt1 jt1Var) {
        super(jt1Var);
        this.zzb = zzjaVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == xx1.a ? objZzh : new qm8(objZzh);
    }
}
