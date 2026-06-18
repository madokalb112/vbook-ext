package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aj4 implements jz7 {
    public final f9 a;
    public final qb7 b;
    public long c = 0;

    public aj4(f9 f9Var, qb7 qb7Var) {
        this.a = f9Var;
        this.b = qb7Var;
    }

    public final long f(ia5 ia5Var, long j, zm5 zm5Var, long j2) {
        long jB = this.b.b();
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = this.c;
        }
        this.c = jB;
        return ea5.d(ea5.d(ia5Var.d(), y86.c0(jB)), this.a.a(j2, 0L, zm5Var));
    }
}
