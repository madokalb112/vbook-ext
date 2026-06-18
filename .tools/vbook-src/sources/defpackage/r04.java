package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r04 implements a39 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public r04(a39 a39Var, kb4 kb4Var) {
        this.a = 3;
        a39Var.getClass();
        this.b = a39Var;
        this.c = kb4Var;
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ux3(this);
            case 1:
                return new yd4(this);
            case 2:
                a39 a39Var = (a39) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = a39Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                ic1.m0((Comparator) this.c, arrayList);
                return arrayList.iterator();
            default:
                return new jh(this);
        }
    }

    public /* synthetic */ r04(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public r04(jc1 jc1Var, xl4 xl4Var) {
        this.a = 0;
        h39 h39Var = h39.a;
        this.b = jc1Var;
        this.c = xl4Var;
    }
}
