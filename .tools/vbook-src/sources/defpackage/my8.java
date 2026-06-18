package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class my8 implements ly8 {
    public final m62 a;
    public final qt b;

    public my8(m62 m62Var, qt qtVar) {
        this.a = m62Var;
        this.b = qtVar;
    }

    public final ArrayList a(String str) {
        n92 n92Var = this.a.H;
        n92Var.getClass();
        str.getClass();
        pc2 pc2Var = pc2.a;
        List listC = new i82(n92Var, str, 10L, new pb2(29)).c();
        ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((nc2) it.next()).a);
        }
        return arrayList;
    }

    public final boolean b() {
        qt qtVar = this.b;
        return ((Boolean) qtVar.J.c(qt.T[34], qtVar)).booleanValue();
    }

    public final boolean c() {
        qt qtVar = this.b;
        return ((Boolean) qtVar.K.c(qt.T[35], qtVar)).booleanValue();
    }

    public final void d(String str) {
        n92 n92Var = this.a.H;
        n92Var.getClass();
        str.getClass();
        ((qj) ((yf1) n92Var).a).q(690331520, "DELETE FROM DbSearch\nWHERE key = ?", new e82(str, 21));
        n92Var.w(690331520, new oc2(0));
    }
}
