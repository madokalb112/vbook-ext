package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class b52 {
    public static final /* synthetic */ ni5[] a;
    public static final z08 b;

    static {
        z48 z48Var = new z48(b52.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        ug8.a.getClass();
        a = new ni5[]{z48Var};
        b = qx1.J(iw9.H("org.publicvalue.multiplatform.oidc.oidcsession.preferences_pb", false, "preferences_pb", ""), null, null, 14);
    }

    public static final h42 a(Context context) {
        context.getClass();
        return (h42) b.a(a[0], context);
    }
}
