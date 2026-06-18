package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fbb implements pi5 {
    public final sh5 a;
    public final List b;
    public final int c;

    public fbb(sh5 sh5Var, List list, int i) {
        sh5Var.getClass();
        list.getClass();
        this.a = sh5Var;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.pi5
    public final boolean a() {
        return (this.c & 1) != 0;
    }

    @Override // defpackage.pi5
    public final List b() {
        return this.b;
    }

    public final String c(boolean z) {
        sh5 sh5Var = this.a;
        a91 a91Var = sh5Var instanceof a91 ? (a91) sh5Var : null;
        Class clsM = a91Var != null ? tu1.M(a91Var) : null;
        return dx1.h(clsM == null ? sh5Var.toString() : (this.c & 4) != 0 ? "kotlin.Nothing" : clsM.isArray() ? clsM.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM.equals(char[].class) ? "kotlin.CharArray" : clsM.equals(byte[].class) ? "kotlin.ByteArray" : clsM.equals(short[].class) ? "kotlin.ShortArray" : clsM.equals(int[].class) ? "kotlin.IntArray" : clsM.equals(float[].class) ? "kotlin.FloatArray" : clsM.equals(long[].class) ? "kotlin.LongArray" : clsM.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsM.isPrimitive()) ? tu1.N((a91) sh5Var).getName() : clsM.getName(), this.b.isEmpty() ? "" : fc1.D0(this.b, ", ", "<", ">", new t3b(this), 24), a() ? "?" : "");
    }

    @Override // defpackage.pi5
    public final sh5 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbb)) {
            return false;
        }
        fbb fbbVar = (fbb) obj;
        return lc5.Q(this.a, fbbVar.a) && lc5.Q(this.b, fbbVar.b) && this.c == fbbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + j39.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return c(false).concat(" (Kotlin reflection is not available)");
    }
}
