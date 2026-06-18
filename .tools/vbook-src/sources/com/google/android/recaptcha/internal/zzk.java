package com.google.android.recaptcha.internal;

import defpackage.ah1;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.ml2;
import defpackage.o1a;
import defpackage.pm8;
import defpackage.qm8;
import defpackage.vm7;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzk extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, jt1Var);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object pm8Var;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            e11.e0(obj);
        } else {
            e11.e0(obj);
            vx1 vx1Var = (vx1) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(ah1.x(vx1Var, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            ml2[] ml2VarArr = (ml2[]) arrayList.toArray(new ml2[0]);
            ml2[] ml2VarArr2 = (ml2[]) Arrays.copyOf(ml2VarArr, ml2VarArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = vm7.L(ml2VarArr2, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((qm8) it2.next()).a instanceof pm8)) {
                    zzenVar.zza();
                    pm8Var = heb.a;
                    break;
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            pm8Var = new pm8(zzbdVar);
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            pm8Var = new pm8(zzbdVar2);
        }
        return new qm8(pm8Var);
    }
}
