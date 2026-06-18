package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mf9 implements mu8 {
    public final Object a;
    public final c37 b;
    public final List c;
    public final List d;
    public final rj1 e = new rj1(new w27(this, 10), true, -322904035);

    public mf9(Object obj, c37 c37Var, List list) {
        this.a = obj;
        this.b = c37Var;
        this.c = list;
        this.d = gc1.Y(c37Var);
    }

    @Override // defpackage.mu8
    public final List a() {
        return this.c;
    }

    @Override // defpackage.mu8
    public final List b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mf9.class != obj.getClass()) {
            return false;
        }
        mf9 mf9Var = (mf9) obj;
        return lc5.Q(this.a, mf9Var.a) && lc5.Q(this.b, mf9Var.b) && this.c.equals(mf9Var.c) && lc5.Q(this.d, mf9Var.d);
    }

    @Override // defpackage.mu8
    public final Object getKey() {
        return this.a;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.mu8
    public final rj1 p() {
        return this.e;
    }

    public final String toString() {
        return "SinglePaneScene(key=" + this.a + ", entry=" + this.b + ", previousEntries=" + this.c + ", entries=" + this.d + ')';
    }
}
