package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ha9 extends ConnectivityManager.NetworkCallback {
    public static final ha9 a = new ha9();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static void b() {
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        kb4 kb4Var = (kb4) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        ha9 ha9Var = a;
                        NetworkCapabilities networkCapabilities = d;
                        ha9Var.getClass();
                        arrayList.add(new xl7(kb4Var, a(networkRequest, networkCapabilities) ? yp1.a : new zp1(7)));
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        xl7 xl7Var = (xl7) obj;
                        ((kb4) xl7Var.a).invoke((aq1) xl7Var.b);
                    }
                    return;
                }
                cp4.k().d(f1c.a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        cp4.k().d(f1c.a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (lc5.Q(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        cp4.k().d(f1c.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        cp4.k().d(f1c.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((kb4) it.next()).invoke(new zp1(7));
            }
        }
    }
}
