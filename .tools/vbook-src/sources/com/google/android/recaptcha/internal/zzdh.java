package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzdh extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzdtVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzdh(this.zzb, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        e11.e0(obj);
        if (i != 0) {
            return obj;
        }
        int iZza = new zzbs(mg4.b).zza(this.zzb.zzr());
        zzdt zzdtVar = this.zzb;
        String str = zzdtVar.zza;
        String packageName = zzdtVar.zzr().getPackageName();
        String strZzd = this.zzb.zzb.zzd();
        zzbf zzbfVarZzt = this.zzb.zzt();
        int i2 = Build.VERSION.SDK_INT;
        String strZza = zzbfVarZzt.zza();
        zztn zztnVarZzf = zzto.zzf();
        zztnVarZzf.zzt(str);
        zztnVarZzf.zzq(packageName);
        zztnVarZzf.zzu(iZza);
        zztnVarZzf.zzr("18.6.1");
        zztnVarZzf.zzs(strZzd);
        zztnVarZzf.zzf(String.valueOf(i2));
        zztnVarZzf.zze(strZza);
        zzto zztoVar = (zzto) zztnVarZzf.zzk();
        zzdt zzdtVar2 = this.zzb;
        zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
        String strZzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object objZzc = zzffVarZzg.zzc(strZzb, zztoVar, this);
        xx1 xx1Var = xx1.a;
        return objZzc == xx1Var ? xx1Var : objZzc;
    }
}
