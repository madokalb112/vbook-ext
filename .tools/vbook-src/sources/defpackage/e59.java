package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class e59 {
    public static final d59 Companion = new d59();
    public static final oi5[] d = {null, null, new sj4(tv9.a, z28.a, 1)};
    public final i59 a;
    public final uta b;
    public final Map c;

    public /* synthetic */ e59(int i, i59 i59Var, uta utaVar, Map map) {
        if (1 != (i & 1)) {
            qu1.w0(i, 1, c59.a.e());
            throw null;
        }
        this.a = i59Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = utaVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static e59 a(e59 e59Var, i59 i59Var, uta utaVar, Map map, int i) {
        if ((i & 1) != 0) {
            i59Var = e59Var.a;
        }
        if ((i & 2) != 0) {
            utaVar = e59Var.b;
        }
        if ((i & 4) != 0) {
            map = e59Var.c;
        }
        e59Var.getClass();
        i59Var.getClass();
        return new e59(i59Var, utaVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e59)) {
            return false;
        }
        e59 e59Var = (e59) obj;
        return lc5.Q(this.a, e59Var.a) && lc5.Q(this.b, e59Var.b) && lc5.Q(this.c, e59Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uta utaVar = this.b;
        int iHashCode2 = (iHashCode + (utaVar == null ? 0 : Long.hashCode(utaVar.a))) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public e59(i59 i59Var, uta utaVar, Map map) {
        i59Var.getClass();
        this.a = i59Var;
        this.b = utaVar;
        this.c = map;
    }
}
