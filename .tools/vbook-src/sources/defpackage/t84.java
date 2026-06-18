package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class t84 extends gx3 {
    public final gx3 c;

    public t84(gx3 gx3Var) {
        gx3Var.getClass();
        this.c = gx3Var;
    }

    @Override // defpackage.gx3
    public final zg5 A0(zn7 zn7Var) {
        return this.c.A0(zn7Var);
    }

    @Override // defpackage.gx3
    public final zg5 F0(zn7 zn7Var) {
        zn7Var.getClass();
        return this.c.F0(zn7Var);
    }

    @Override // defpackage.gx3
    public final void N(zn7 zn7Var) {
        zn7Var.getClass();
        this.c.N(zn7Var);
    }

    @Override // defpackage.gx3
    public final void R(zn7 zn7Var, boolean z) {
        zn7Var.getClass();
        this.c.R(zn7Var, z);
    }

    @Override // defpackage.gx3
    public final il9 T0(zn7 zn7Var) {
        zn7Var.getClass();
        return this.c.T0(zn7Var);
    }

    @Override // defpackage.gx3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.gx3
    public final List g0(zn7 zn7Var) {
        zn7Var.getClass();
        List<zn7> listG0 = this.c.g0(zn7Var);
        ArrayList arrayList = new ArrayList();
        for (zn7 zn7Var2 : listG0) {
            zn7Var2.getClass();
            arrayList.add(zn7Var2);
        }
        ic1.l0(arrayList);
        return arrayList;
    }

    @Override // defpackage.gx3
    public final List j0(zn7 zn7Var) {
        zn7Var.getClass();
        List<zn7> listJ0 = this.c.j0(zn7Var);
        if (listJ0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (zn7 zn7Var2 : listJ0) {
            zn7Var2.getClass();
            arrayList.add(zn7Var2);
        }
        ic1.l0(arrayList);
        return arrayList;
    }

    @Override // defpackage.gx3
    public final ag9 p(zn7 zn7Var) {
        zn7Var.getClass();
        return this.c.p(zn7Var);
    }

    @Override // defpackage.gx3
    public final void q(zn7 zn7Var, zn7 zn7Var2) {
        zn7Var.getClass();
        zn7Var2.getClass();
        this.c.q(zn7Var, zn7Var2);
    }

    public final String toString() {
        return ug8.a(getClass()).g() + '(' + this.c + ')';
    }

    @Override // defpackage.gx3
    public final ow3 x0(zn7 zn7Var) {
        zn7Var.getClass();
        ow3 ow3VarX0 = this.c.x0(zn7Var);
        if (ow3VarX0 == null) {
            return null;
        }
        zn7 zn7Var2 = ow3VarX0.c;
        if (zn7Var2 == null) {
            return ow3VarX0;
        }
        boolean z = ow3VarX0.a;
        boolean z2 = ow3VarX0.b;
        Long l = ow3VarX0.d;
        Long l2 = ow3VarX0.e;
        Long l3 = ow3VarX0.f;
        Long l4 = ow3VarX0.g;
        Map map = ow3VarX0.h;
        map.getClass();
        return new ow3(z, z2, zn7Var2, l, l2, l3, l4, map);
    }
}
