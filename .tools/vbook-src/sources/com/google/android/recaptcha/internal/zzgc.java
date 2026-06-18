package com.google.android.recaptcha.internal;

import defpackage.ex1;
import defpackage.ifc;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzgc {
    public static final Class zza(Object obj) throws zzce {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            ifc.c(4, 6, null);
            return null;
        }
        if (!(obj instanceof String)) {
            ifc.c(4, 5, null);
            return null;
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i = zzav.zza;
            if (((zzfu) ex1.a0(zzgb.zza).getValue()).zzb(str)) {
                return cls2;
            }
            ifc.c(6, 47, null);
            return null;
        } catch (Exception e) {
            ifc.c(6, 8, e);
            return null;
        }
    }
}
