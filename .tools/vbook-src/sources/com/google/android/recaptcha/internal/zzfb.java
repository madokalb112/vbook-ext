package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzfb extends o1a implements yb4 {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzfb(this.zza, this.zzb, this.zzc, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws zzbd {
        e11.e0(obj);
        try {
            if (zzff.zzb(this.zza).zzb(this.zzb)) {
                return this.zza.zzg().zza(this.zzb, this.zzc);
            }
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e2.getMessage());
        }
    }
}
