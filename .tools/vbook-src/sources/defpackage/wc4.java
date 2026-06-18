package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class wc4 implements Comparable<wc4> {
    public static final vc4 Companion = new vc4();
    public static final dp5[] v;
    public final int a;
    public final int b;
    public final int c;
    public final yxb d;
    public final int e;
    public final int f;
    public final zu6 s;
    public final int t;
    public final long u;

    static {
        tl3 tl3Var = new tl3(22);
        xu5 xu5Var = xu5.b;
        v = new dp5[]{null, null, null, ex1.Z(xu5Var, tl3Var), null, null, ex1.Z(xu5Var, new tl3(23)), null, null};
        t62.a(0L);
    }

    public /* synthetic */ wc4(int i, int i2, int i3, int i4, yxb yxbVar, int i5, int i6, zu6 zu6Var, int i7, long j) {
        if (511 != (i & 511)) {
            qu1.w0(i, 511, uc4.a.e());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = yxbVar;
        this.e = i5;
        this.f = i6;
        this.s = zu6Var;
        this.t = i7;
        this.u = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(wc4 wc4Var) {
        wc4 wc4Var2 = wc4Var;
        wc4Var2.getClass();
        return lc5.W(this.u, wc4Var2.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc4)) {
            return false;
        }
        wc4 wc4Var = (wc4) obj;
        return this.a == wc4Var.a && this.b == wc4Var.b && this.c == wc4Var.c && this.d == wc4Var.d && this.e == wc4Var.e && this.f == wc4Var.f && this.s == wc4Var.s && this.t == wc4Var.t && this.u == wc4Var.u;
    }

    public final int hashCode() {
        return Long.hashCode(this.u) + tw2.d(this.t, (this.s.hashCode() + tw2.d(this.f, tw2.d(this.e, (this.d.hashCode() + tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.a);
        sb.append(", minutes=");
        sb.append(this.b);
        sb.append(", hours=");
        sb.append(this.c);
        sb.append(", dayOfWeek=");
        sb.append(this.d);
        sb.append(", dayOfMonth=");
        sb.append(this.e);
        sb.append(", dayOfYear=");
        sb.append(this.f);
        sb.append(", month=");
        sb.append(this.s);
        sb.append(", year=");
        sb.append(this.t);
        sb.append(", timestamp=");
        return dx1.j(sb, this.u, ')');
    }

    public wc4(int i, int i2, int i3, yxb yxbVar, int i4, int i5, zu6 zu6Var, int i6, long j) {
        yxbVar.getClass();
        zu6Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = yxbVar;
        this.e = i4;
        this.f = i5;
        this.s = zu6Var;
        this.t = i6;
        this.u = j;
    }
}
