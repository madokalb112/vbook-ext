package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s95 implements t95 {
    public final int a;
    public final long b;

    public s95(int i, long j) {
        fx1.G(j >= 0);
        this.a = i;
        this.b = j;
    }

    public static s95 b(ms3 ms3Var, hn7 hn7Var) {
        ms3Var.w(hn7Var.a, 0, 8);
        hn7Var.M(0);
        int iM = hn7Var.m();
        return new s95(hn7Var.q(), iM, false);
    }

    public boolean a() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    @Override // defpackage.t95
    public p95 toInstant() {
        long j = p95.c.a;
        long j2 = this.b;
        if (j2 >= j && j2 <= p95.d.a) {
            return ny1.H(j2, this.a);
        }
        throw new d72("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }

    public /* synthetic */ s95(long j, int i, boolean z) {
        this.a = i;
        this.b = j;
    }

    public s95(long j, int i) {
        this.b = j;
        this.a = i;
    }
}
