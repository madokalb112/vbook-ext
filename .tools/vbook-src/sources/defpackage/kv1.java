package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kv1 {
    public final sgb a;
    public final String b;

    public kv1(sgb sgbVar, String str) {
        str.getClass();
        this.a = sgbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        return this.a.equals(kv1Var.a) && lc5.Q(this.b, kv1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationMember(user=" + this.a + ", role=" + this.b + ")";
    }
}
