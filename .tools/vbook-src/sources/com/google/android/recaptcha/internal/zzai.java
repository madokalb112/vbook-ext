package com.google.android.recaptcha.internal;

import defpackage.ah1;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        ah1.J(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3);
    }
}
