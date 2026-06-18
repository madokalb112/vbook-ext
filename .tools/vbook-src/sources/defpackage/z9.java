package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z9 implements do0, ba, ll2 {
    public final /* synthetic */ aa a;

    @Override // defpackage.do0
    public void d(vy1 vy1Var) {
        aa aaVar = this.a;
        synchronized (aaVar) {
            try {
                if (((do0) aaVar.c) instanceof mt2) {
                    ((ArrayList) aaVar.a).add(vy1Var);
                }
                ((do0) aaVar.c).d(vy1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ll2
    public void e(s58 s58Var) {
        aa aaVar = this.a;
        js8 js8Var = js8.f;
        js8Var.m("AnalyticsConnector now available.");
        y9 y9Var = (x9) s58Var.get();
        lp8 lp8Var = new lp8(y9Var, 12);
        c85 c85Var = new c85();
        y9 y9Var2 = y9Var;
        js8 js8VarA = y9Var2.a("clx", c85Var);
        if (js8VarA == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            js8VarA = y9Var2.a("crash", c85Var);
            if (js8VarA != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (js8VarA == null) {
            js8Var.z("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        js8Var.m("Registered Firebase Analytics listener.");
        int i = 0;
        lp8 lp8Var2 = new lp8(7, false);
        y91 y91Var = new y91(lp8Var);
        synchronized (aaVar) {
            try {
                ArrayList arrayList = (ArrayList) aaVar.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    lp8Var2.d((vy1) obj);
                }
                c85Var.b = lp8Var2;
                c85Var.a = y91Var;
                aaVar.c = lp8Var2;
                aaVar.b = y91Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ba
    public void i(Bundle bundle) {
        ((ba) this.a.b).i(bundle);
    }
}
