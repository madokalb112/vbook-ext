package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qg5 extends og5 {
    public final fg5 j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg5(ue5 ue5Var, fg5 fg5Var) {
        super(ue5Var, fg5Var, (String) null, 12);
        ue5Var.getClass();
        this.j = fg5Var;
        List listZ0 = fc1.Z0(fg5Var.a.keySet());
        this.k = listZ0;
        this.l = listZ0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.og5, defpackage.m1
    public final mf5 F(String str) {
        str.getClass();
        return this.m % 2 == 0 ? nf5.a(str) : (mf5) y86.G(str, this.j);
    }

    @Override // defpackage.og5, defpackage.m1
    public final String R(m39 m39Var, int i) {
        m39Var.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.og5, defpackage.m1
    public final mf5 T() {
        return this.j;
    }

    @Override // defpackage.og5
    /* JADX INFO: renamed from: Y */
    public final fg5 T() {
        return this.j;
    }

    @Override // defpackage.og5, defpackage.am1
    public final int f(m39 m39Var) {
        m39Var.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }

    @Override // defpackage.og5, defpackage.m1, defpackage.am1
    public final void n(m39 m39Var) {
        m39Var.getClass();
    }
}
