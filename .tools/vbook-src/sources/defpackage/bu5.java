package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bu5 implements lr5 {
    public final uu5 a;

    public bu5(uu5 uu5Var) {
        this.a = uu5Var;
    }

    @Override // defpackage.lr5
    public final int a() {
        return this.a.g().l;
    }

    @Override // defpackage.lr5
    public final int b() {
        return ((qu5) fc1.E0(this.a.g().m)).a;
    }

    @Override // defpackage.lr5
    public final int c() {
        int i;
        uu5 uu5Var = this.a;
        int size = 0;
        if (uu5Var.g().m.isEmpty()) {
            return 0;
        }
        ou5 ou5VarG = uu5Var.g();
        ou5 ou5Var = pu5.a;
        lh7 lh7Var = ou5VarG.u;
        long j = ou5VarG.n;
        lh7 lh7Var2 = lh7.a;
        int i2 = (int) (lh7Var == lh7Var2 ? j & 4294967295L : j >> 32);
        ou5 ou5VarG2 = uu5Var.g();
        List list = ou5VarG2.m;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i3 = 0;
            while (size < size2) {
                qu5 qu5Var = (qu5) list.get(size);
                i3 += (int) (ou5VarG2.u == lh7Var2 ? qu5Var.s & 4294967295L : qu5Var.s >> 32);
                size++;
            }
            size = (i3 / list.size()) + ou5VarG2.s;
        }
        if (size != 0 && (i = i2 / size) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.lr5
    public final boolean d() {
        return !this.a.g().m.isEmpty();
    }

    @Override // defpackage.lr5
    public final int e() {
        return ((zm7) this.a.c.d).h();
    }
}
