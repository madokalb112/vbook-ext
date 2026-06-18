package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class l6b {
    public static final k6b Companion = new k6b();
    public final String a;
    public final boolean b;

    public /* synthetic */ l6b(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, j6b.a.e());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6b)) {
            return false;
        }
        l6b l6bVar = (l6b) obj;
        return lc5.Q(this.a, l6bVar.a) && this.b == l6bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrashWordDto(word=" + this.a + ", regex=" + this.b + ")";
    }

    public l6b(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
