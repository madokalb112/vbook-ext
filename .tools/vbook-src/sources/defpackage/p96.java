package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p96 implements t89 {
    public final hh a;
    public hh b;
    public long c;

    public p96(wp8 wp8Var) {
        hh hhVarA = mh.a();
        zy5 zy5Var = wp8Var.c;
        long j = wp8Var.b;
        lw1.N(hhVarA, zy5Var, y86.H(j), y86.I(j));
        this.a = hhVarA;
        this.c = 9205357640488583168L;
    }

    public final fx1 a(long j, zm5 zm5Var, pn2 pn2Var) {
        hh hhVar;
        if (!fg9.a(j, this.c) || (hhVar = this.b) == null) {
            this.c = j;
            this.b = mh.a();
        } else {
            hhVar.m();
        }
        hh hhVar2 = this.b;
        hhVar2.getClass();
        hh.b(hhVar2, this.a);
        float[] fArrA = u96.a();
        u96.h(fArrA, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        hhVar2.o(fArrA);
        hhVar2.p(eb7.g(sg9.j(j), hhVar2.g().d()));
        return new xh7(hhVar2);
    }
}
