package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class p6 implements ic4, Serializable {
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e = false;
    public final int f;
    public final int s;

    public p6(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.f = i;
        this.s = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return this.e == p6Var.e && this.f == p6Var.f && this.s == p6Var.s && lc5.Q(this.a, p6Var.a) && this.b.equals(p6Var.b) && this.c.equals(p6Var.c) && this.d.equals(p6Var.d);
    }

    @Override // defpackage.ic4
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((j39.a(j39.a((this.b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.s;
    }

    public final String toString() {
        ug8.a.getClass();
        return vg8.a(this);
    }
}
