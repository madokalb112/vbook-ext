package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z33 extends nu6 implements in5 {
    public ob A;
    public yb4 B;
    public lh7 C;
    public boolean D;

    public final void X0() {
        this.D = false;
    }

    public final ia6 d(ja6 ja6Var, ca6 ca6Var, long j) {
        ca6Var.getClass();
        jt7 jt7VarC = ca6Var.C(j);
        if (!ja6Var.i0() || !this.D) {
            xl7 xl7Var = (xl7) this.B.invoke(new na5((((long) jt7VarC.b) & 4294967295L) | (((long) jt7VarC.a) << 32)), new up1(j));
            ob obVar = this.A;
            h86 h86Var = (h86) xl7Var.a;
            Object obj = xl7Var.b;
            obVar.getClass();
            cn7 cn7Var = obVar.l;
            h86Var.getClass();
            if (!lc5.Q(obVar.d(), h86Var)) {
                obVar.m.setValue(h86Var);
                t07 t07Var = obVar.e.b;
                boolean zF = t07Var.f();
                if (zF) {
                    try {
                        jb jbVar = obVar.n;
                        float fD = obVar.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            ob obVar2 = jbVar.a;
                            obVar2.j.i(fD);
                            obVar2.k.i(0.0f);
                            cn7Var.setValue((Object) null);
                        }
                        obVar.g(obj);
                        t07Var.q(null);
                    } catch (Throwable th) {
                        t07Var.q(null);
                        throw th;
                    }
                }
                if (!zF) {
                    cn7Var.setValue(obj);
                }
            }
        }
        this.D = ja6Var.i0() || this.D;
        return ja6Var.R(jt7VarC.a, jt7VarC.b, mc3.a, new v6(28, ja6Var, this, jt7VarC));
    }
}
