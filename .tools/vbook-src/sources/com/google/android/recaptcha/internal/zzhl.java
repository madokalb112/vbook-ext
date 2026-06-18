package com.google.android.recaptcha.internal;

import defpackage.ifc;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzhl implements zzgx {
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
            ifc.c(4, 3, null);
        } else {
            zzgdVar.zzc().zze(i, zzgdVar.zzc().zza(zzueVarArr[0]));
        }
    }
}
