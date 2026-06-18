package defpackage;

import java.util.List;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a84 implements Comparable {
    public static final a84 b;
    public static final a84 c;
    public static final a84 d;
    public static final a84 e;
    public static final a84 f;
    public static final a84 s;
    public static final a84 t;
    public static final a84 u;
    public static final a84 v;
    public static final a84 w;
    public static final a84 x;
    public static final a84 y;
    public static final List z;
    public final int a;

    static {
        a84 a84Var = new a84(100);
        a84 a84Var2 = new a84(Context.VERSION_ES6);
        a84 a84Var3 = new a84(300);
        a84 a84Var4 = new a84(400);
        b = a84Var4;
        a84 a84Var5 = new a84(500);
        c = a84Var5;
        a84 a84Var6 = new a84(600);
        d = a84Var6;
        a84 a84Var7 = new a84(700);
        a84 a84Var8 = new a84(800);
        a84 a84Var9 = new a84(900);
        e = a84Var;
        f = a84Var2;
        s = a84Var3;
        t = a84Var4;
        u = a84Var5;
        v = a84Var6;
        w = a84Var7;
        x = a84Var8;
        y = a84Var9;
        z = gc1.Z(a84Var, a84Var2, a84Var3, a84Var4, a84Var5, a84Var6, a84Var7, a84Var8, a84Var9);
    }

    public a84(int i) {
        this.a = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        r75.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a84 a84Var) {
        return lc5.V(this.a, a84Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a84) {
            return this.a == ((a84) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return tw2.p(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}
