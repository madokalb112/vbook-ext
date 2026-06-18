package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jk4 {
    public final ArrayList a;
    public final bi1 b;

    public jk4(ArrayList arrayList, bi1 bi1Var) {
        this.a = arrayList;
        this.b = bi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jk4) {
            jk4 jk4Var = (jk4) obj;
            return this.a.equals(jk4Var.a) && this.b == jk4Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaitForUrlState(patterns=" + this.a + ", deferred=" + this.b + ")";
    }
}
