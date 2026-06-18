package com.google.android.recaptcha.internal;

import defpackage.lc3;
import defpackage.lc5;
import defpackage.yb4;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzfy extends zzfx {
    private final yb4 zza;
    private final String zzb;

    public zzfy(yb4 yb4Var, String str, Object obj) {
        super(obj);
        this.zza = yb4Var;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List arrayList;
        if (!lc5.Q(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                arrayList.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            arrayList = lc3.a;
        }
        zztfVarZzf.zze(arrayList);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        yb4 yb4Var = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        yb4Var.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
