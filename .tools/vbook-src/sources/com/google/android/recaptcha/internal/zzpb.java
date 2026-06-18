package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe zzpeVar, zzpd zzpdVar) {
        this.zza = zzpeVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        if (i >= zzpeVar.zzb) {
            return !zzpeVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzpe zzpeVar = this.zza;
        return i < zzpeVar.zzb ? (zzpa) zzpeVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            gp.j("remove() was called before next()");
            return;
        }
        this.zzc = false;
        this.zza.zzo();
        int i = this.zzb;
        zzpe zzpeVar = this.zza;
        if (i >= zzpeVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzpeVar.zzm(i);
        }
    }
}
