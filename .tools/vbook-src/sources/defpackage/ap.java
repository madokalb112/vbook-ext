package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ap {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ap(int i, String str, Object obj, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        r75.a("Reversed range is not supported");
    }

    public static ap a(ap apVar, xo xoVar, int i, int i2) {
        Object obj = xoVar;
        if ((i2 & 1) != 0) {
            obj = apVar.a;
        }
        int i3 = apVar.b;
        if ((i2 & 4) != 0) {
            i = apVar.c;
        }
        String str = apVar.d;
        apVar.getClass();
        return new ap(i3, str, obj, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return lc5.Q(this.a, apVar.a) && this.b == apVar.b && this.c == apVar.c && lc5.Q(this.d, apVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + tw2.d(this.c, tw2.d(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return xv5.s(sb, this.d, ')');
    }

    public ap(Object obj, int i, int i2) {
        this(i, "", obj, i2);
    }
}
