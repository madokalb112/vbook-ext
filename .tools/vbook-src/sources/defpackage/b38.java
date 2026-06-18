package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class b38 {
    public static final a38 Companion = new a38();
    public final int a;
    public final String b;

    public /* synthetic */ b38(int i, int i2, String str) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, z28.a.e());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b38)) {
            return false;
        }
        b38 b38Var = (b38) obj;
        return this.a == b38Var.a && lc5.Q(this.b, b38Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return xv5.s(sb, this.b, ')');
    }

    public b38(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
