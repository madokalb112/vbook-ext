package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class w3a {
    public static final v3a Companion = new v3a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ w3a(String str, String str2, String str3, String str4, int i) {
        if (15 != (i & 15)) {
            qu1.w0(i, 15, u3a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3a)) {
            return false;
        }
        w3a w3aVar = (w3a) obj;
        return lc5.Q(this.a, w3aVar.a) && lc5.Q(this.b, w3aVar.b) && lc5.Q(this.c, w3aVar.c) && lc5.Q(this.d, w3aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return tw2.s(j39.q("SyncExtensionLocalStorage(id=", this.a, ", extensionId=", this.b, ", key="), this.c, ", content=", this.d, ")");
    }

    public w3a(String str, String str2, String str3, String str4) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
