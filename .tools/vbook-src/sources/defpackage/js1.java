package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class js1 {
    public final String a;
    public final String b;
    public final ru c;
    public final boolean d;

    public js1(String str, String str2, ru ruVar, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ruVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof js1)) {
            return false;
        }
        js1 js1Var = (js1) obj;
        return lc5.Q(this.a, js1Var.a) && this.d == js1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ContextMenu(id=", this.a, ", label=", this.b, ", application=");
        sbQ.append(this.c);
        sbQ.append(", enabled=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ js1(String str, String str2, ru ruVar, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : ruVar, true);
    }
}
