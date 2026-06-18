package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ey3 implements vb0 {
    public static final AtomicReference a = new AtomicReference();

    public final void a(boolean z) {
        synchronized (gy3.k) {
            try {
                ArrayList arrayList = new ArrayList(gy3.l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    gy3 gy3Var = (gy3) obj;
                    if (gy3Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gy3Var.i.iterator();
                        while (it.hasNext()) {
                            gy3 gy3Var2 = ((dy3) it.next()).a;
                            if (!z) {
                                ((yg2) gy3Var2.h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
