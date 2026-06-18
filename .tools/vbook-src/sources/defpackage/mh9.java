package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mh9 extends zy {
    public final zy a;
    public final long b;
    public final long c;
    public final long d;

    public mh9(zy zyVar, long j, long j2) {
        zyVar.getClass();
        this.a = zyVar;
        this.b = j;
        this.c = j2;
        this.d = j2 - j;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        return heb.a;
    }

    @Override // defpackage.zy, defpackage.fx
    public final Object e(kt1 kt1Var) {
        return new Long(this.d);
    }

    @Override // defpackage.zy
    public final Object i(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        xl7 xl7VarK = k(i2, j);
        return this.a.i(((Number) xl7VarK.a).longValue(), bArr, i, ((Number) xl7VarK.b).intValue(), jt1Var);
    }

    @Override // defpackage.zy
    public final Object j(long j, byte[] bArr, int i, int i2, jt1 jt1Var) {
        xl7 xl7VarK = k(i2, j);
        Object objJ = this.a.j(((Number) xl7VarK.a).longValue(), bArr, i, ((Number) xl7VarK.b).intValue(), jt1Var);
        return objJ == xx1.a ? objJ : heb.a;
    }

    public final xl7 k(int i, long j) {
        if (j < 0) {
            gp.l("Invalid position");
            return null;
        }
        long j2 = this.b;
        long jR = wx1.R(j2 + j, j2, this.c);
        return new xl7(Long.valueOf(jR), Integer.valueOf((int) (wx1.R(jR + ((long) i), this.b, this.c) - jR)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliceAsyncStreamBase(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        return dx1.j(sb, this.c, ')');
    }
}
