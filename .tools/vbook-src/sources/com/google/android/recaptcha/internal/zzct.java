package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.xx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzct extends o1a implements yb4 {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, jt1Var);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzek zzekVar;
        zzcn zzcnVar;
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            e11.e0(obj);
        } else {
            e11.e0(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zzdcVarZza = zzcv.zza(this.zzd, this.zze);
            if (zzdcVarZza != null) {
                return zzdcVarZza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVarZze = this.zzg;
            if (zzcnVarZze == null) {
                zzcnVarZze = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            zzcnVar = zzcnVarZze;
            long j = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVar;
            this.zzb = 1;
            Object objZzb = zzcnVar.zzb(j, this);
            xx1 xx1Var = xx1.a;
            if (objZzb == xx1Var) {
                return xx1Var;
            }
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
