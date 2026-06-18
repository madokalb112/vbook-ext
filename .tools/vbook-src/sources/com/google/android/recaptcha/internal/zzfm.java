package com.google.android.recaptcha.internal;

import defpackage.dp5;
import defpackage.ex1;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzfm {
    private final dp5 zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = ex1.a0(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.getClass();
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
