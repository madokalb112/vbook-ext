package com.google.android.recaptcha.internal;

import defpackage.zf2;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzex {
    private final zzfm zza;

    public /* synthetic */ zzex(zzfm zzfmVar, int i, zf2 zf2Var) {
        this.zza = new zzfm();
    }

    public final zzew zza(String str) throws zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
