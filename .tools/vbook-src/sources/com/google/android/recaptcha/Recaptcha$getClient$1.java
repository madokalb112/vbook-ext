package com.google.android.recaptcha;

import defpackage.jt1;
import defpackage.kt1;
import defpackage.qm8;
import defpackage.xx1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Recaptcha$getClient$1 extends kt1 {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, jt1 jt1Var) {
        super(jt1Var);
        this.zzb = recaptcha;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM1getClientBWLJW6A = this.zzb.m1getClientBWLJW6A(null, null, 0L, this);
        return objM1getClientBWLJW6A == xx1.a ? objM1getClientBWLJW6A : new qm8(objM1getClientBWLJW6A);
    }
}
