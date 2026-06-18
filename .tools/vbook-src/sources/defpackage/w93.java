package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w93 {
    public final String a;
    public final String b;
    public final int c;
    public final List d;

    public w93(int i, String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w93)) {
            return false;
        }
        w93 w93Var = (w93) obj;
        return lc5.Q(this.a, w93Var.a) && lc5.Q(this.b, w93Var.b) && this.c == w93Var.c && lc5.Q(this.d, w93Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("EmojiCategory(id=", this.a, ", thumb=", this.b, ", count=");
        sbQ.append(this.c);
        sbQ.append(", emojiList=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
