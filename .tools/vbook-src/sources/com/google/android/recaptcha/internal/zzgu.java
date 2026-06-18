package com.google.android.recaptcha.internal;

import defpackage.ifc;
import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzgu implements zzgx {
    public static final zzgu zza = new zzgu();

    private zzgu() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            ifc.c(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            ifc.c(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            ifc.c(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof String) {
                objZza = zzgdVar.zzh().zza((String) objZza);
            }
            zzgdVar.zzc().zze(i, Array.newInstance((Class<?>) zzgc.zza(objZza), iIntValue));
        } catch (Exception e) {
            ifc.c(6, 21, e);
        }
    }
}
