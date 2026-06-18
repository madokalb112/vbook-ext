package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sg6 {
    public final SparseArray a;
    public pbb b;

    public sg6(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(pbb pbbVar, int i, int i2) {
        int iA = pbbVar.a(i);
        SparseArray sparseArray = this.a;
        sg6 sg6Var = sparseArray == null ? null : (sg6) sparseArray.get(iA);
        if (sg6Var == null) {
            sg6Var = new sg6(1);
            sparseArray.put(pbbVar.a(i), sg6Var);
        }
        if (i2 > i) {
            sg6Var.a(pbbVar, i + 1, i2);
        } else {
            sg6Var.b = pbbVar;
        }
    }
}
