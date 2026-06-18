package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.fc1;
import defpackage.gc1;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.wx1;
import defpackage.xx1;
import defpackage.yb4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzfq extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, jt1Var);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        heb hebVar = heb.a;
        e11.e0(obj);
        if (i != 0) {
            return hebVar;
        }
        vx1 vx1Var = (vx1) this.zze;
        while (true) {
            zzgd zzgdVar = this.zzb;
            if (zzgdVar.zza() < 0) {
                break;
            }
            if (zzgdVar.zza() >= this.zzc.size() || !wx1.k0(vx1Var)) {
                break;
            }
            zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
            try {
                zzft.zzf(this.zzd, zzufVar, this.zzb);
            } catch (Exception e) {
                zzufVar.zzk();
                gc1.I(zzufVar.zzg());
                fc1.D0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                zzft zzftVar = this.zzd;
                zzgd zzgdVar2 = this.zzb;
                this.zza = 1;
                Object objZzh = zzftVar.zzh(e, zzgdVar2, this);
                xx1 xx1Var = xx1.a;
                if (objZzh == xx1Var) {
                    return xx1Var;
                }
            }
        }
        return hebVar;
    }
}
