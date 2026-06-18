package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie2 implements xw2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ie2(ib4 ib4Var, a07 a07Var, a07 a07Var2, vx1 vx1Var) {
        this.c = ib4Var;
        this.b = a07Var;
        this.d = a07Var2;
        this.e = vx1Var;
    }

    @Override // defpackage.xw2
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                boolean zRemove = ((Set) obj).remove(obj2);
                if (!((Set) obj3).contains(obj2) && zRemove) {
                    List list = (List) a07Var.getValue();
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = fc1.N0(list).iterator();
                        while (it.hasNext()) {
                            ((d37) it.next()).a.invoke(obj2);
                        }
                    } else {
                        int size = list.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                ((d37) list.get(size)).a.invoke(obj2);
                                if (i2 >= 0) {
                                    size = i2;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (((Boolean) a07Var.getValue()).booleanValue()) {
                    v33 v33Var = (v33) ((a07) obj3).getValue();
                    if (v33Var != null) {
                        ah1.J((vx1) obj2, null, null, new c43(v33Var, null, 0), 3);
                    }
                    if (((Boolean) a07Var.getValue()).booleanValue()) {
                        ((ib4) obj).invoke();
                    }
                    a07Var.setValue(Boolean.FALSE);
                }
                break;
        }
    }

    public ie2(Set set, Object obj, Set set2, a07 a07Var) {
        this.c = set;
        this.e = obj;
        this.d = set2;
        this.b = a07Var;
    }
}
