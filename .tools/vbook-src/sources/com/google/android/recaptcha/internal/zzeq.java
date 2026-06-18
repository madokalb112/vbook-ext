package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;
import java.util.Timer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzeq extends o1a implements yb4 {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zza = zzesVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzeq(this.zza, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        e11.e0(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzei zzeiVar = zzesVar.zze;
                if (zzeiVar != null && zzeiVar.zzb() == 0) {
                    Timer timer = zzes.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzes.zza = null;
                }
                zzesVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return heb.a;
    }
}
