package com.google.android.recaptcha.internal;

import defpackage.ai1;
import defpackage.bi1;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.kb4;
import defpackage.o1a;
import defpackage.xx1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzea extends o1a implements kb4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ ai1 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, ai1 ai1Var, jt1 jt1Var) {
        super(1, jt1Var);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = ai1Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new zzea(this.zzc, this.zzd, this.zze, jt1Var);
    }

    @Override // defpackage.kb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVarZzf;
        int i = this.zzb;
        xx1 xx1Var = xx1.a;
        try {
            if (i == 0) {
                e11.e0(obj);
                zzenVarZzf = this.zzc.zzb.zzf(41);
                zzdt zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                obj = zzdtVar.zzo(j, this);
                if (obj != xx1Var) {
                }
                return xx1Var;
            }
            zzenVarZzf = (zzen) this.zza;
            if (i != 1) {
                e11.e0(obj);
                zzenVarZzf.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(((bi1) this.zze).Q(heb.a));
            }
            e11.e0(obj);
            zzsc zzscVar = (zzsc) obj;
            this.zzc.zze = zzscVar;
            zzdt zzdtVar2 = this.zzc.zza;
            long j2 = this.zzd;
            this.zza = zzenVarZzf;
            this.zzb = 2;
            if (zzdtVar2.zzn(zzscVar, j2, this) == xx1Var) {
                return xx1Var;
            }
            zzenVarZzf.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((bi1) this.zze).Q(heb.a));
        } catch (zzbd e) {
            this.zzc.zzd = e;
            zzenVarZzf.zzb(e);
            throw e;
        }
    }
}
