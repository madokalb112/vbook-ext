package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x25 implements w25 {
    public final m62 a;
    public final is4 b;
    public final e21 c;
    public final sv8 d;

    public x25(m62 m62Var, is4 is4Var, e21 e21Var, ym3 ym3Var, sv8 sv8Var) {
        this.a = m62Var;
        this.b = is4Var;
        this.c = e21Var;
        this.d = sv8Var;
    }

    public final t25 a(int i, String str) {
        str.getClass();
        m62 m62Var = this.a;
        if (i == 17) {
            return new m01(str, m62Var, 1);
        }
        switch (i) {
            case 20:
                return new tf1(str, m62Var, this.b, this.c, this.d);
            case 21:
                return new m01(str, m62Var, 0);
            case 22:
                return new dq7(str, m62Var);
            default:
                k27.i("not support");
                return null;
        }
    }
}
