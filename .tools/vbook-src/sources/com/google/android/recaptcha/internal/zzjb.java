package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.xl7;
import defpackage.y86;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMapS = y86.S(new xl7(-4, zzba.zzo), new xl7(-12, zzba.zzp), new xl7(-6, zzba.zzk), new xl7(-11, zzba.zzm), new xl7(-13, zzba.zzq), new xl7(-14, zzba.zzr), new xl7(-2, zzba.zzl), new xl7(-7, zzba.zzs), new xl7(-5, zzba.zzt), new xl7(-9, zzba.zzu), new xl7(-8, zzba.zzE), new xl7(-15, zzba.zzn), new xl7(-1, zzba.zzv), new xl7(-3, zzba.zzx), new xl7(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMapS.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            linkedHashMapS.put(1, zzba.zzA);
            linkedHashMapS.put(2, zzba.zzB);
            linkedHashMapS.put(0, zzba.zzC);
            linkedHashMapS.put(3, zzba.zzD);
        }
        if (i >= 29) {
            linkedHashMapS.put(4, zzba.zzz);
        }
        return linkedHashMapS;
    }
}
