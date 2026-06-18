package defpackage;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import org.jetbrains.compose.resources.AndroidContextProvider;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class pe {
    public static final void a(dd4 dd4Var, int i) {
        dd4Var.h0(1587247798);
        if (!dd4Var.V(i & 1, i != 0)) {
            dd4Var.Y();
        } else if (((Boolean) dd4Var.j(c95.a)).booleanValue()) {
            dd4Var.f0(-1890697985);
            Context context = AndroidContextProvider.a;
            AndroidContextProvider.a = (Context) dd4Var.j(he.b);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1890623988);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k7(i, 2);
        }
    }

    public static final Context b() {
        return InstrumentationRegistry.getInstrumentation().getContext();
    }
}
