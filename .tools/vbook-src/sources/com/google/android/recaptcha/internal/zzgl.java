package com.google.android.recaptcha.internal;

import defpackage.ifc;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzgl implements zzgx {
    public static final zzgl zza = new zzgl();

    private zzgl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            ifc.c(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            ifc.c(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (objZza2 == null) {
            throw new zzce(4, 4, null);
        }
        if (!(objZza2 instanceof Integer) && !(objZza2 instanceof Short) && !(objZza2 instanceof Byte) && !(objZza2 instanceof Long) && !(objZza2 instanceof Double) && !(objZza2 instanceof Float) && !(objZza2 instanceof Boolean) && !(objZza2 instanceof Character) && !(objZza2 instanceof String)) {
            ifc.c(4, 7, null);
        } else {
            zzgdVar.zzi().zzb(str, objZza2.toString());
        }
    }
}
