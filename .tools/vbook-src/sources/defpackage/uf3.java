package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uf3 extends lx3 {
    public final kf3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf3(String str, m62 m62Var) {
        super(str, m62Var);
        str.getClass();
        this.d = new kf3(zn7.f(zn7.f(qu1.Z(gx3.a), str), "data").a.s());
    }

    @Override // defpackage.kka
    public final Object F(String str, nqa nqaVar) {
        return this.d.a(str, nqaVar);
    }

    @Override // defpackage.kka
    public final oka f() {
        return new oka("epub", "epub", mc3.a, false, false);
    }

    @Override // defpackage.lx3, defpackage.kka
    public final Object s(String str, Map map, kt1 kt1Var) {
        return this.d.j(str, kt1Var);
    }
}
