package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import defpackage.sc3;
import defpackage.xl7;
import defpackage.y86;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return sc3.a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapS = y86.S(new xl7(0, zzqi.NET_CAPABILITY_MMS), new xl7(1, zzqi.NET_CAPABILITY_SUPL), new xl7(2, zzqi.NET_CAPABILITY_DUN), new xl7(3, zzqi.NET_CAPABILITY_FOTA), new xl7(4, zzqi.NET_CAPABILITY_IMS), new xl7(5, zzqi.NET_CAPABILITY_CBS), new xl7(6, zzqi.NET_CAPABILITY_WIFI_P2P), new xl7(7, zzqi.NET_CAPABILITY_IA), new xl7(8, zzqi.NET_CAPABILITY_RCS), new xl7(9, zzqi.NET_CAPABILITY_XCAP), new xl7(10, zzqi.NET_CAPABILITY_EIMS), new xl7(11, zzqi.NET_CAPABILITY_NOT_METERED), new xl7(12, zzqi.NET_CAPABILITY_INTERNET), new xl7(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new xl7(14, zzqi.NET_CAPABILITY_TRUSTED), new xl7(15, zzqi.NET_CAPABILITY_NOT_VPN));
        linkedHashMapS.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapS.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            linkedHashMapS.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapS.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            linkedHashMapS.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapS.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            linkedHashMapS.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            linkedHashMapS.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMapS.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapS.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMapS.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapS.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapS.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapS;
    }
}
