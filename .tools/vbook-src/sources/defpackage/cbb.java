package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cbb implements sh5 {
    public final a91 a;
    public final String b;
    public final ti5 c;
    public volatile List d;

    public cbb(a91 a91Var) {
        this.a = a91Var;
        ex1.Z(xu5.b, new uk2(this, 18));
        this.b = "PluginConfigT";
        this.c = ti5.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cbb)) {
            return false;
        }
        cbb cbbVar = (cbb) obj;
        return lc5.Q(this.b, cbbVar.b) && this.a.equals(cbbVar.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    mn5.g();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(this.b);
        return sb.toString();
    }
}
