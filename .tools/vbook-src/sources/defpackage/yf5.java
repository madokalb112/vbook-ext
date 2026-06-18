package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yf5 extends jg5 {
    public final boolean a;
    public final String b;

    public yf5(Serializable serializable, boolean z) {
        serializable.getClass();
        this.a = z;
        this.b = serializable.toString();
    }

    @Override // defpackage.jg5
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jg5
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yf5.class != obj.getClass()) {
            return false;
        }
        yf5 yf5Var = (yf5) obj;
        return this.a == yf5Var.a && lc5.Q(this.b, yf5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.jg5
    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        nv9.a(str, sb);
        return sb.toString();
    }
}
