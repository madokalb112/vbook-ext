package com.google.android.recaptcha.internal;

import defpackage.fc1;
import defpackage.fw;
import defpackage.lc3;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzhy {
    private List zza = lc3.a;

    public final long zza(long[] jArr) {
        Iterator it = fc1.I0(this.zza, fw.N0(jArr)).iterator();
        if (!it.hasNext()) {
            sy3.p("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = fw.N0(jArr);
    }
}
