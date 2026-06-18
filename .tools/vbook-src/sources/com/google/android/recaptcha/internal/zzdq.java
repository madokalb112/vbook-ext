package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.ib4;
import defpackage.rl5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzdq extends rl5 implements ib4 {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // defpackage.ib4
    public final Object invoke() throws zzbd {
        int i = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
