package com.google.android.recaptcha.internal;

import defpackage.ifc;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzhs implements zzgx {
    public static final zzhs zza = new zzhs();

    private zzhs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 2) {
            if (length == 0) {
                zzgdVar.zzc().zze(i, new zzbn());
                return;
            } else {
                ifc.c(4, 3, null);
                return;
            }
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
        if (true != (objZza2 instanceof zzbn)) {
            objZza2 = null;
        }
        zzbn zzbnVar = (zzbn) objZza2;
        if (zzbnVar == null) {
            ifc.c(4, 5, null);
            return;
        }
        byte[] bArrZzd = zzev.zza(zzgdVar.zzb(), zzbnVar).zzd();
        zzgdVar.zzi().zzb(str, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}
