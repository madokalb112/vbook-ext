package com.google.android.recaptcha.internal;

import defpackage.lc3;
import defpackage.lc5;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listAsList;
        if (!lc5.Q(method.getName(), this.zzb)) {
            return false;
        }
        zzfz zzfzVar = this.zza;
        if (objArr != null) {
            listAsList = Arrays.asList(objArr);
            listAsList.getClass();
        } else {
            listAsList = lc3.a;
        }
        zzfzVar.zzb(listAsList);
        return true;
    }
}
