package com.google.android.recaptcha.internal;

import defpackage.ai1;
import defpackage.bi1;
import defpackage.e11;
import defpackage.heb;
import defpackage.jt1;
import defpackage.o1a;
import defpackage.rg8;
import defpackage.vx1;
import defpackage.xx1;
import defpackage.yb4;
import defpackage.zib;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzam extends o1a implements yb4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new zzam(this.zzc, this.zzd, jt1Var);
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        rg8 rg8Var = this.zzb;
        try {
            if (rg8Var != 0) {
                rg8 rg8Var2 = (rg8) this.zza;
                e11.e0(obj);
                rg8Var = rg8Var2;
                this = this;
            } else {
                e11.e0(obj);
                rg8 rg8Var3 = new rg8();
                zzal zzalVar = new zzal(this.zzc, this.zzd, rg8Var3, null);
                this.zza = rg8Var3;
                this.zzb = 1;
                Object objO = zib.o(60000L, zzalVar, this);
                xx1 xx1Var = xx1.a;
                rg8Var = rg8Var3;
                this = objO;
                if (objO == xx1Var) {
                    return xx1Var;
                }
            }
        } catch (Exception e) {
            ai1 ai1VarZzf = this.zzc.zzf();
            Throwable th = (Throwable) rg8Var.a;
            if (th == null) {
                th = e;
            }
            ((bi1) ai1VarZzf).o0(th);
            this.zzc.zze = zzao.zza;
            this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
        }
        return heb.a;
    }
}
