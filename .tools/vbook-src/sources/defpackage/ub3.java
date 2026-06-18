package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ub3 {
    public final boolean a;
    public final List b;
    public final List c;

    public ub3(boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub3)) {
            return false;
        }
        ub3 ub3Var = (ub3) obj;
        return this.a == ub3Var.a && lc5.Q(this.b, ub3Var.b) && lc5.Q(this.c, ub3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.d(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiState(isLoading=");
        sb.append(this.a);
        sb.append(", recentEmojis=");
        sb.append(this.b);
        sb.append(", emojiCategories=");
        return tw2.t(sb, this.c, ")");
    }
}
