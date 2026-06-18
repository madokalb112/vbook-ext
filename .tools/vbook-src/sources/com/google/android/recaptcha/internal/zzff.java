package com.google.android.recaptcha.internal;

import defpackage.dp5;
import defpackage.ex1;
import defpackage.iw9;
import defpackage.jt1;
import defpackage.wx1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzff {
    private final dp5 zza;
    private final dp5 zzb;
    private final dp5 zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = ex1.a0(zzfc.zza);
        this.zzb = ex1.a0(zzfd.zza);
        this.zzc = ex1.a0(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, jt1 jt1Var) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e2) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzenVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return iw9.H(zzscVar.zzk(), false, "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, jt1 jt1Var) {
        return wx1.a0(new zzfb(this, str, zztoVar, null), jt1Var);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, jt1 jt1Var) {
        return zze(this, zzscVar, zzekVar, jt1Var);
    }
}
