package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class nv1 {
    public static final mv1 Companion = new mv1();
    public final hhb a;
    public final String b;

    public /* synthetic */ nv1(int i, hhb hhbVar, String str) {
        this.a = (i & 1) == 0 ? new hhb() : hhbVar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv1)) {
            return false;
        }
        nv1 nv1Var = (nv1) obj;
        return lc5.Q(this.a, nv1Var.a) && lc5.Q(this.b, nv1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationMemberDto(user=" + this.a + ", role=" + this.b + ")";
    }
}
