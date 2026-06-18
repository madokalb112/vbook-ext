package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tt {
    public final boolean a;
    public final String b;

    public tt(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public static tt a(tt ttVar, String str, int i) {
        boolean z = (i & 1) != 0 ? ttVar.a : false;
        if ((i & 2) != 0) {
            str = ttVar.b;
        }
        ttVar.getClass();
        return new tt(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        return this.a == ttVar.a && this.b.equals(ttVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AppState(isLoading=" + this.a + ", languageTag=" + this.b + ")";
    }
}
