package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pd5 {
    public static final /* synthetic */ ni5[] d;
    public final String a;
    public final ThreadLocal b;
    public final h42 c;

    static {
        a58 a58Var = new a58(pd5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        ug8.a.getClass();
        d = new ni5[]{a58Var};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [od5] */
    public pd5(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final int i = 0;
        final int i2 = 1;
        this.c = (h42) qx1.J(str, new q43(new kb4(this) { // from class: od5
            public final /* synthetic */ pd5 b;

            {
                this.b = this;
            }

            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                int i3 = i;
                int i4 = 1;
                pd5 pd5Var = this.b;
                switch (i3) {
                    case 0:
                        ey1 ey1Var = (ey1) obj;
                        ey1Var.getClass();
                        Log.w(ug8.a(pd5.class).g(), "CorruptionException in " + pd5Var.a + " DataStore running in process " + Process.myPid(), ey1Var);
                        return new pz6(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = pd5Var.a;
                        LinkedHashSet linkedHashSet = la9.a;
                        linkedHashSet.getClass();
                        jt1 jt1Var = null;
                        return gc1.Y(new ka9(context2, str2, ma9.a, new if4(linkedHashSet, jt1Var, i4), new c7(3, 4, jt1Var)));
                }
            }
        }), new kb4(this) { // from class: od5
            public final /* synthetic */ pd5 b;

            {
                this.b = this;
            }

            @Override // defpackage.kb4
            public final Object invoke(Object obj) {
                int i3 = i2;
                int i4 = 1;
                pd5 pd5Var = this.b;
                switch (i3) {
                    case 0:
                        ey1 ey1Var = (ey1) obj;
                        ey1Var.getClass();
                        Log.w(ug8.a(pd5.class).g(), "CorruptionException in " + pd5Var.a + " DataStore running in process " + Process.myPid(), ey1Var);
                        return new pz6(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = pd5Var.a;
                        LinkedHashSet linkedHashSet = la9.a;
                        linkedHashSet.getClass();
                        jt1 jt1Var = null;
                        return gc1.Y(new ka9(context2, str2, ma9.a, new if4(linkedHashSet, jt1Var, i4), new c7(3, 4, jt1Var)));
                }
            }
        }, 8).a(d[0], context);
    }
}
