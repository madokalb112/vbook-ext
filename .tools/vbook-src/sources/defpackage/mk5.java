package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mk5 implements Comparable {
    public static final mk5 b = new mk5();
    public final int a = 131861;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mk5 mk5Var = (mk5) obj;
        mk5Var.getClass();
        return this.a - mk5Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mk5 mk5Var = obj instanceof mk5 ? (mk5) obj : null;
        return mk5Var != null && this.a == mk5Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.3.21";
    }
}
