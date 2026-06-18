package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yo {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ yo(int i, int i2, int i3, Object obj, String str) {
        this(i, (i3 & 8) != 0 ? "" : str, obj, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2);
    }

    public final ap a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            r75.c("Item.end should be set first");
        }
        return new ap(this.b, this.d, this.a, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo)) {
            return false;
        }
        yo yoVar = (yo) obj;
        return lc5.Q(this.a, yoVar.a) && this.b == yoVar.b && this.c == yoVar.c && lc5.Q(this.d, yoVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + tw2.d(this.c, tw2.d(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return xv5.s(sb, this.d, ')');
    }

    public yo(int i, String str, Object obj, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
