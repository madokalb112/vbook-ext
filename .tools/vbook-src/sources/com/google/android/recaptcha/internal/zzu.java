package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.pm8;
import defpackage.qm8;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzu extends o1a implements yb4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzu(this.zzd, this.zze, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        zzse zzseVarZzj;
        Iterator it;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzseVarZzj = (zzse) this.zza;
            e11.e0(obj);
        } else {
            e11.e0(obj);
            if (!this.zzd.zzS()) {
                return new qm8(new pm8(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzseVarZzj = this.zzd.zzj();
            if (zzseVarZzj.zzi().zzd() == 0) {
                return new qm8(new pm8(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzseVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            Object objZzd = zzyVar.zzd(zzseVarZzj, this);
            xx1 xx1Var = xx1.a;
            if (objZzd == xx1Var) {
                return xx1Var;
            }
        }
        return new qm8(heb.a);
    }
}
