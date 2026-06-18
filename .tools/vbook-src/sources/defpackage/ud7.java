package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class ud7 {
    public static final td7 Companion = new td7();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ ud7(int i, String str, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud7)) {
            return false;
        }
        ud7 ud7Var = (ud7) obj;
        return lc5.Q(this.a, ud7Var.a) && lc5.Q(this.b, ud7Var.b) && this.c == ud7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.q(")", j39.q("OldSyncName(name=", this.a, ", replace=", this.b, ", ignoreCase="), this.c);
    }
}
