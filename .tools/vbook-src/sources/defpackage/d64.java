package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d64 implements b64 {
    public final ig a;
    public final jg b;
    public final wo9 c;
    public final m64 d;
    public final uc6 e;
    public final rx2 f;

    public d64(ig igVar, jg jgVar) {
        wo9 wo9Var = e64.a;
        m64 m64Var = new m64(e64.b);
        uc6 uc6Var = new uc6(4);
        this.a = igVar;
        this.b = jgVar;
        this.c = wo9Var;
        this.d = m64Var;
        this.e = uc6Var;
        this.f = new rx2(this, 14);
    }

    public final vbb a(rbb rbbVar) {
        wo9 wo9Var = this.c;
        n82 n82Var = new n82(29, this, rbbVar);
        synchronized (((ju7) wo9Var.b)) {
            vbb vbbVar = (vbb) ((d76) wo9Var.c).get(rbbVar);
            if (vbbVar != null) {
                if (vbbVar.b()) {
                    return vbbVar;
                }
            }
            try {
                vbb vbbVar2 = (vbb) n82Var.invoke(new sbb(0, wo9Var, rbbVar));
                synchronized (((ju7) wo9Var.b)) {
                    if (((d76) wo9Var.c).get(rbbVar) == null && vbbVar2.b()) {
                        ((d76) wo9Var.c).put(rbbVar, vbbVar2);
                    }
                }
                return vbbVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final vbb b(c64 c64Var, a84 a84Var, int i, int i2) {
        jg jgVar = this.b;
        jgVar.getClass();
        int i3 = jgVar.a;
        a84 a84Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? a84Var : new a84(wx1.Q(a84Var.a + i3, 1, 1000));
        this.a.getClass();
        return a(new rbb(c64Var, a84Var2, i, i2, (Object) null));
    }
}
