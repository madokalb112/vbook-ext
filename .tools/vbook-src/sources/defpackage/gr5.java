package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gr5 {
    public final int a;
    public final int b;

    public gr5(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            t75.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        t75.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5)) {
            return false;
        }
        gr5 gr5Var = (gr5) obj;
        return this.a == gr5Var.a && this.b == gr5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return tw2.p(sb, this.b, ')');
    }
}
