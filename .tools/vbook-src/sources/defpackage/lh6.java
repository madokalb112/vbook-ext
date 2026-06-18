package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lh6 {
    public static final Object b = new Object();
    public static lh6 c;
    public oj1 a;

    public static lh6 b() {
        lh6 lh6Var;
        synchronized (b) {
            ex1.E("MlKitContext has not been initialized", c != null);
            lh6Var = c;
            ex1.C(lh6Var);
        }
        return lh6Var;
    }

    public static lh6 c(Context context) {
        lh6 lh6Var;
        synchronized (b) {
            ex1.E("MlKitContext is already initialized", c == null);
            lh6 lh6Var2 = new lh6();
            c = lh6Var2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListW = new c85(context, new uf4(MlKitComponentDiscoveryService.class, 11)).w();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            j31 j31Var = hj1.j;
            arrayList.addAll(arrayListW);
            arrayList2.add(ni1.c(context, Context.class, new Class[0]));
            arrayList2.add(ni1.c(lh6Var2, lh6.class, new Class[0]));
            oj1 oj1Var = new oj1(arrayList, arrayList2, j31Var);
            lh6Var2.a = oj1Var;
            oj1Var.s(true);
            lh6Var = c;
        }
        return lh6Var;
    }

    public final Object a(Class cls) {
        ex1.E("MlKitContext has been deleted", c == this);
        ex1.C(this.a);
        return this.a.a(cls);
    }
}
