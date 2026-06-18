package com.google.android.recaptcha.internal;

import defpackage.ai1;
import defpackage.bi1;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzeb extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ ai1 zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, ai1 ai1Var, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzecVar;
        this.zzc = ai1Var;
        this.zzd = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzeb(this.zzb, this.zzc, this.zzd, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e;
        zzbq zzbqVar;
        zzdz zzdzVar;
        zzea zzeaVar;
        if (this.zza != 0) {
            try {
                e11.e0(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((bi1) zzebVar.zzc).o0(zzbdVar);
            }
        } else {
            e11.e0(obj);
            try {
                zzbqVar = zzbq.zza;
                zzdzVar = new zzdz(this.zzb);
                zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
            } catch (zzbd e3) {
                e = e3;
                zzebVar = this;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((bi1) zzebVar.zzc).o0(zzbdVar);
            }
            try {
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                xx1 xx1Var = xx1.a;
                if (obj == xx1Var) {
                    return xx1Var;
                }
            } catch (zzbd e4) {
                e = e4;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((bi1) zzebVar.zzc).o0(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return heb.a;
    }
}
