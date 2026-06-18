package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xu4 {
    public final rcb a = new rcb();
    public gu4 b = gu4.b;
    public final fk4 c = new fk4(5);
    public Object d = gc3.a;
    public o0a e = zib.a();
    public final on1 f = new on1();

    public final fx3 a() {
        ngb ngbVarB = this.a.b();
        gu4 gu4Var = this.b;
        ik4 ik4VarI = this.c.I();
        Object obj = this.d;
        wh7 wh7Var = obj instanceof wh7 ? (wh7) obj : null;
        if (wh7Var != null) {
            return new fx3(ngbVarB, gu4Var, ik4VarI, wh7Var, this.e, this.f);
        }
        w58.t(this.d, "No request transformation found: ");
        return null;
    }

    public final void b(bbb bbbVar) {
        on1 on1Var = this.f;
        if (bbbVar != null) {
            on1Var.f(nk8.a, bbbVar);
            return;
        }
        j00 j00Var = nk8.a;
        on1Var.getClass();
        j00Var.getClass();
        on1Var.d().remove(j00Var);
    }

    public final void c(us4 us4Var, Object obj) {
        ((Map) this.f.a(vs4.a, new un4(11))).put(us4Var, obj);
    }

    public final void d(gu4 gu4Var) {
        gu4Var.getClass();
        this.b = gu4Var;
    }

    public final void e(xu4 xu4Var) {
        xu4Var.getClass();
        this.b = xu4Var.b;
        this.d = xu4Var.d;
        on1 on1Var = xu4Var.f;
        b((bbb) on1Var.e(nk8.a));
        rcb rcbVar = xu4Var.a;
        rcb rcbVar2 = this.a;
        ql9.E(rcbVar2, rcbVar);
        List list = rcbVar2.h;
        list.getClass();
        rcbVar2.h = list;
        yn9.f(this.c, xu4Var.c);
        on1 on1Var2 = this.f;
        on1Var2.getClass();
        on1Var.getClass();
        for (j00 j00Var : fc1.Z0(on1Var.d().keySet())) {
            j00Var.getClass();
            on1Var2.f(j00Var, on1Var.c(j00Var));
        }
    }
}
