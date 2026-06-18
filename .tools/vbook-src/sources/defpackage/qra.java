package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class qra {
    public static final pra Companion = new pra();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ qra(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, ora.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qra)) {
            return false;
        }
        qra qraVar = (qra) obj;
        return lc5.Q(this.a, qraVar.a) && lc5.Q(this.b, qraVar.b) && lc5.Q(this.c, qraVar.c);
    }

    public final int hashCode() {
        int iA = j39.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("LegacyThemeColor(id=", this.a, ", color=", this.b, ", image="));
    }
}
