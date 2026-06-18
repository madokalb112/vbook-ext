package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class br5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq5 b;

    public /* synthetic */ br5(wq5 wq5Var, int i) {
        this.a = i;
        this.b = wq5Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        Object next;
        int i;
        int i2 = this.a;
        z = true;
        boolean z = true;
        wq5 wq5Var = this.b;
        switch (i2) {
            case 0:
                return Integer.valueOf(wq5Var.h());
            case 1:
                wq5Var.j().getClass();
                return Boolean.FALSE;
            case 2:
                Iterator it = wq5Var.j().m.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((kq5) next).a == wq5Var.h()) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (kq5) next;
            case 3:
                Iterator it2 = wq5Var.j().m.iterator();
                while (it2.hasNext() && (i = ((kq5) it2.next()).w) != -1 && i == i) {
                    i++;
                }
                return Integer.valueOf(i >= 1 ? i : 1);
            case 4:
                kq5 kq5Var = (kq5) fc1.F0(wq5Var.j().m);
                if (kq5Var != null && kq5Var.a < wq5Var.j().p - 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                kq5 kq5Var2 = (kq5) fc1.z0(wq5Var.j().m);
                return Integer.valueOf(kq5Var2 != null ? kq5Var2.a : 0);
            default:
                kq5 kq5Var3 = (kq5) fc1.F0(wq5Var.j().m);
                return Integer.valueOf(kq5Var3 != null ? kq5Var3.a : -1);
        }
    }
}
