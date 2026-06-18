package com.google.android.recaptcha.internal;

import defpackage.ah1;
import defpackage.heb;
import defpackage.ifc;
import defpackage.jt1;
import defpackage.vx1;
import defpackage.wx1;
import defpackage.xx1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzft implements zzfo {
    private final vx1 zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(vx1 vx1Var, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = vx1Var;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            ifc.c(5, 2, null);
            return;
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk != 1) {
            zzbk.zza(iZzk - 2, jZza);
        } else {
            gp.l("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, jt1 jt1Var) {
        Object objA0 = wx1.a0(new zzfq(zzgdVar, list, this, null), jt1Var);
        return objA0 == xx1.a ? objA0 : heb.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, jt1 jt1Var) {
        Object objA0 = wx1.a0(new zzfr(exc, zzgdVar, this, null), jt1Var);
        return objA0 == xx1.a ? objA0 : heb.a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        ah1.J(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
