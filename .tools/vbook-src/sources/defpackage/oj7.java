package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oj7 extends nu6 implements in5 {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;

    public final ia6 d(ja6 ja6Var, ca6 ca6Var, long j) {
        int iW0 = ja6Var.w0(this.C) + ja6Var.w0(this.A);
        int iW02 = ja6Var.w0(this.D) + ja6Var.w0(this.B);
        jt7 jt7VarC = ca6Var.C(vp1.i(-iW0, -iW02, j));
        return ja6Var.R(vp1.g(jt7VarC.a + iW0, j), vp1.f(jt7VarC.b + iW02, j), mc3.a, new q57(6, this, jt7VarC));
    }
}
