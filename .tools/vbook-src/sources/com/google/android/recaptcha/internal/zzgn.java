package com.google.android.recaptcha.internal;

import defpackage.fw;
import defpackage.gc1;
import defpackage.ifc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzgn implements zzgx {
    public static final zzgn zza = new zzgn();

    private zzgn() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzue) it.next()).zzR()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (!zzb(fw.O0(zzueVarArr))) {
            ifc.c(4, 5, null);
            return;
        }
        for (zzue zzueVar : zzueVarArr) {
            zzgdVar.zzc().zzb(zzueVar.zzi());
        }
    }
}
