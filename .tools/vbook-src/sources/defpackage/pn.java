package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pn implements m3b {
    public final p3b a;
    public f9 b;
    public final cn7 c = dk9.x(new na5(0));
    public final tz6 d;
    public k3b e;

    public pn(p3b p3bVar, f9 f9Var, zm5 zm5Var) {
        this.a = p3bVar;
        this.b = f9Var;
        long[] jArr = ju8.a;
        this.d = new tz6();
    }

    public static final long d(pn pnVar) {
        k3b k3bVar = pnVar.e;
        return k3bVar != null ? ((na5) k3bVar.getValue()).a : ((na5) pnVar.c.getValue()).a;
    }

    public final Object a() {
        return this.a.f().a();
    }

    public final Object c() {
        return this.a.f().c();
    }
}
