package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gu4 {
    public static final gu4 b;
    public static final gu4 c;
    public static final gu4 d;
    public static final gu4 e;
    public static final gu4 f;
    public static final gu4 g;
    public static final gu4 h;
    public static final gu4 i;
    public static final gu4 j;
    public static final List k;
    public final String a;

    static {
        gu4 gu4Var = new gu4("GET");
        b = gu4Var;
        gu4 gu4Var2 = new gu4("POST");
        c = gu4Var2;
        gu4 gu4Var3 = new gu4("PUT");
        d = gu4Var3;
        gu4 gu4Var4 = new gu4("PATCH");
        e = gu4Var4;
        gu4 gu4Var5 = new gu4("DELETE");
        f = gu4Var5;
        gu4 gu4Var6 = new gu4("HEAD");
        g = gu4Var6;
        gu4 gu4Var7 = new gu4("OPTIONS");
        h = gu4Var7;
        i = new gu4("TRACE");
        j = new gu4("QUERY");
        k = gc1.Z(gu4Var, gu4Var2, gu4Var3, gu4Var4, gu4Var5, gu4Var6, gu4Var7);
    }

    public gu4(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu4) && lc5.Q(this.a, ((gu4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
