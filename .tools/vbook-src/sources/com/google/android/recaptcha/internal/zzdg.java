package com.google.android.recaptcha.internal;

import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.vua;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;
import defpackage.zib;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzdg extends o1a implements yb4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar = this.zzb;
        try {
            if (zzenVar != 0) {
                zzen zzenVar2 = (zzen) this.zza;
                e11.e0(obj);
                zzenVar = zzenVar2;
            } else {
                e11.e0(obj);
                zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                obj = zib.o(j, zzdfVar, this);
                xx1 xx1Var = xx1.a;
                zzenVar = zzenVarZzf;
                if (obj == xx1Var) {
                    return xx1Var;
                }
            }
            return (zzsr) obj;
        } catch (zzbd e) {
            zzbd zzbdVarZzs = this.zzc.zzs(e, e);
            zzenVar.zzb(zzbdVarZzs);
            throw zzbdVarZzs;
        } catch (vua e2) {
            zzbd zzbdVarZzs2 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
            zzenVar.zzb(zzbdVarZzs2);
            throw zzbdVarZzs2;
        } catch (Exception e3) {
            zzbd zzbdVarZzs3 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzZ, e3.getMessage()));
            zzenVar.zzb(zzbdVarZzs3);
            throw zzbdVarZzs3;
        }
    }
}
