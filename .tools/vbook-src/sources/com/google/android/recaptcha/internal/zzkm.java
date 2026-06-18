package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzkm {
    private static final Map zza;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        zzb(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        zzb(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        zzb(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        zzb(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        zzb(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        zzb(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        zzb(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        zzb(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        zzb(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        zza = Collections.unmodifiableMap(linkedHashMap);
        Collections.unmodifiableMap(linkedHashMap2);
    }

    public static Class zza(Class cls) {
        cls.getClass();
        Class cls2 = (Class) zza.get(cls);
        return cls2 == null ? cls : cls2;
    }

    private static void zzb(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
