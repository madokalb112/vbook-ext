package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class lh9 {
    public static final kh9 Companion = new kh9();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ lh9(int i, String str, String str2, boolean z) {
        if (1 != (i & 1)) {
            qu1.w0(i, 1, jh9.a.e());
            throw null;
        }
        this.a = str;
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
        if (!(obj instanceof lh9)) {
            return false;
        }
        lh9 lh9Var = (lh9) obj;
        return lc5.Q(this.a, lh9Var.a) && lc5.Q(this.b, lh9Var.b) && this.c == lh9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.q(")", j39.q("SkipWordRuleDto(word=", this.a, ", replace=", this.b, ", ignoreCase="), this.c);
    }

    public lh9(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
