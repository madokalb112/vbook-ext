package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c07 implements oi5 {
    public final /* synthetic */ int a;
    public final oi5 b;
    public final m39 c;

    public c07(oi5 oi5Var, int i) {
        this.a = i;
        oi5Var.getClass();
        switch (i) {
            case 1:
                oi5 oi5VarSerializer = io9.Companion.serializer(oi5Var);
                this.b = oi5VarSerializer;
                this.c = oi5VarSerializer.e();
                break;
            default:
                this.b = oi5Var;
                gx1 gx1VarE = oi5Var.e().e();
                this.c = gx1VarE instanceof m28 ? fx1.m("kotlinx.coroutines.flow.MutableStateFlow", (m28) gx1VarE) : fx1.q("kotlinx.coroutines.flow.MutableStateFlow", oi5Var.e());
                break;
        }
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        int i = this.a;
        oi5 oi5Var = this.b;
        switch (i) {
            case 0:
                b07 b07Var = (b07) obj;
                b07Var.getClass();
                md2Var.W(oi5Var, ((fr9) b07Var).getValue());
                break;
            default:
                SparseArray sparseArray = (SparseArray) obj;
                sparseArray.getClass();
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
                }
                int size2 = sparseArray.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(sparseArray.valueAt(i3));
                }
                md2Var.W(oi5Var, new io9(arrayList, arrayList2));
                break;
        }
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        int i = this.a;
        oi5 oi5Var = this.b;
        switch (i) {
            case 0:
                return gr9.a(yd2Var.d(oi5Var));
            default:
                io9 io9Var = (io9) yd2Var.d(oi5Var);
                List list = io9Var.a;
                int size = list.size();
                List list2 = io9Var.b;
                if (size != list2.size()) {
                    gp.l("Failed requirement.");
                    return null;
                }
                SparseArray sparseArray = new SparseArray(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sparseArray.append(((Number) list.get(i2)).intValue(), list2.get(i2));
                }
                return sparseArray;
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        switch (this.a) {
        }
        return this.c;
    }
}
