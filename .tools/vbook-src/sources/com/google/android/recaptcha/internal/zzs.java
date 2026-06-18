package com.google.android.recaptcha.internal;

import defpackage.ah1;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.qm8;
import defpackage.vm7;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;
import defpackage.yd5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzs extends o1a implements yb4 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, jt1Var);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        e11.e0(obj);
        if (i == 0) {
            vx1 vx1Var = (vx1) this.zzd;
            ArrayList arrayList = new ArrayList();
            this.zzb.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                arrayList2.add(ah1.J(vx1Var, null, null, new zzr((zzy) obj3, this.zzc, arrayList, null), 3));
            }
            yd5[] yd5VarArr = (yd5[]) arrayList2.toArray(new yd5[0]);
            yd5[] yd5VarArr2 = (yd5[]) Arrays.copyOf(yd5VarArr, yd5VarArr.length);
            this.zza = 1;
            Object objA0 = vm7.a0(yd5VarArr2, this);
            xx1 xx1Var = xx1.a;
            if (objA0 == xx1Var) {
                return xx1Var;
            }
        }
        return new qm8(this.zzb.zzq(this.zzc));
    }
}
