package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class je7 {
    public static final ie7 Companion = new ie7();
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ je7(String str, int i, boolean z, boolean z2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je7)) {
            return false;
        }
        je7 je7Var = (je7) obj;
        return lc5.Q(this.a, je7Var.a) && this.b == je7Var.b && this.c == je7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncTrash(findWhat=");
        sb.append(this.a);
        sb.append(", regexp=");
        sb.append(this.b);
        sb.append(", enable=");
        return xv5.q(")", sb, this.c);
    }
}
