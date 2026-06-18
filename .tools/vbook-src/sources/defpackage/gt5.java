package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gt5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu5 b;

    public /* synthetic */ gt5(uu5 uu5Var, int i) {
        this.a = i;
        this.b = uu5Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object next;
        int i;
        int i2 = this.a;
        int i3 = 0;
        uu5 uu5Var = this.b;
        switch (i2) {
            case 0:
                qu5 qu5Var = (qu5) fc1.F0(uu5Var.g().m);
                return Boolean.valueOf(qu5Var == null || qu5Var.a >= uu5Var.g().l - 1);
            case 1:
                return Integer.valueOf(((zm7) uu5Var.c.d).h());
            case 2:
                Iterator it = uu5Var.g().m.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((qu5) next).a == ((zm7) uu5Var.c.d).h()) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (qu5) next;
            default:
                Iterator it2 = uu5Var.g().m.iterator();
                while (it2.hasNext() && (i = ((qu5) it2.next()).e) != -1 && i3 == i) {
                    i3++;
                }
                return Integer.valueOf(i3 >= 1 ? i3 : 1);
        }
    }
}
