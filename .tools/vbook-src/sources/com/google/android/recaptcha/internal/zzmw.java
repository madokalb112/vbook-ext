package com.google.android.recaptcha.internal;

import defpackage.w58;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzmw implements zzog {
    private static final zzmw zza = new zzmw();

    private zzmw() {
    }

    public static zzmw zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final zzof zzb(Class cls) {
        if (!zznd.class.isAssignableFrom(cls)) {
            gp.l("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzof) zznd.zzu(cls.asSubclass(zznd.class)).zzh(3, null, null);
        } catch (Exception e) {
            w58.l("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final boolean zzc(Class cls) {
        return zznd.class.isAssignableFrom(cls);
    }
}
