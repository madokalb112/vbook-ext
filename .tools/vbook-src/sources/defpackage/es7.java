package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class es7 {
    public static final ArrayList e = new ArrayList();
    public final uf4 a;
    public final qx1 b;
    public List c;
    public boolean d;

    public es7(uf4 uf4Var, qx1 qx1Var) {
        uf4Var.getClass();
        ArrayList arrayList = e;
        arrayList.getClass();
        if ((arrayList instanceof fi5) && !(arrayList instanceof hi5)) {
            fw.G0(arrayList, "kotlin.collections.MutableList");
            throw null;
        }
        this.a = uf4Var;
        this.b = qx1Var;
        this.c = arrayList;
        this.d = true;
        if (arrayList.isEmpty()) {
            return;
        }
        gp.j("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + ((String) this.a.b) + "`, " + this.c.size() + " handlers";
    }
}
