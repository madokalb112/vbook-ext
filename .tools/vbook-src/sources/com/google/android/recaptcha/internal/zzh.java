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
final class zzh extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, jt1Var);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        zzen zzenVarZzf;
        if (this.zza != 0) {
            zzenVarZzf = (zzen) this.zze;
            e11.e0(obj);
        } else {
            e11.e0(obj);
            vx1 vx1Var = (vx1) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(ah1.x(vx1Var, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            ml2[] ml2VarArr = (ml2[]) arrayList.toArray(new ml2[0]);
            ml2[] ml2VarArr2 = (ml2[]) Arrays.copyOf(ml2VarArr, ml2VarArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = vm7.L(ml2VarArr2, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((qm8) it.next()).a;
            if (!(obj2 instanceof pm8)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVarZzf != null) {
            zzenVarZzf.zza();
        }
        return zzsiVar;
    }
}
