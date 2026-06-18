package com.google.android.recaptcha.internal;

import defpackage.fw;
import defpackage.ifc;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzhg implements zzgx {
    public static final zzhg zza = new zzhg();

    private zzhg() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            ifc.c(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            ifc.c(4, 5, null);
            return;
        }
        Object[] objArrZzg = zzgdVar.zzc().zzg(fw.O0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e) {
            ifc.c(6, 15, e);
        }
    }
}
