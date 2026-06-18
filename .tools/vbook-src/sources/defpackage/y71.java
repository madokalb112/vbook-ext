package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y71 {
    public final String a;
    public final String b;
    public final boolean c;

    public y71(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y71)) {
            return false;
        }
        y71 y71Var = (y71) obj;
        return lc5.Q(this.a, y71Var.a) && lc5.Q(this.b, y71Var.b) && this.c == y71Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return xv5.q(")", j39.q("ChooseItem(text=", this.a, ", subText=", this.b, ", isRequireNetwork="), this.c);
    }

    public /* synthetic */ y71(int i, String str, boolean z) {
        this(str, (String) null, (i & 4) != 0 ? false : z);
    }
}
