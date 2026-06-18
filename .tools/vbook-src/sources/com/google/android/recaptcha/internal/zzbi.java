package com.google.android.recaptcha.internal;

import defpackage.ah1;
import defpackage.iw0;
import defpackage.li3;
import defpackage.nh2;
import defpackage.vx1;
import defpackage.wx1;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbi {
    private final vx1 zza = wx1.o();
    private final vx1 zzb;
    private final vx1 zzc;
    private final vx1 zzd;

    public zzbi() {
        iw0 iw0VarB = wx1.b(new li3(Executors.newSingleThreadExecutor()));
        ah1.J(iw0VarB, null, null, new zzbh(null), 3);
        this.zzb = iw0VarB;
        this.zzc = wx1.b(nh2.c);
        iw0 iw0VarB2 = wx1.b(new li3(Executors.newSingleThreadExecutor()));
        ah1.J(iw0VarB2, null, null, new zzbg(null), 3);
        this.zzd = iw0VarB2;
    }

    public final vx1 zza() {
        return this.zzc;
    }

    public final vx1 zzb() {
        return this.zza;
    }

    public final vx1 zzc() {
        return this.zzd;
    }

    public final vx1 zzd() {
        return this.zzb;
    }
}
