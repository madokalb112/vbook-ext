package com.google.android.recaptcha.internal;

import defpackage.fc1;
import defpackage.ifc;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) throws zzce {
        if (str.length() == 0) {
            ifc.c(3, 17, null);
            return null;
        }
        try {
            zzhv zzhvVar = new zzhv(this.zza.zza(fc1.a1(list)), 255L, zzhv.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) (str.charAt(i) ^ ((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            ifc.c(3, 18, e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        zztz zztzVarZzb = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), jZza);
        return zztzVarZzb;
    }
}
