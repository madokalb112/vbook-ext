package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ly5 extends l89 implements vb5 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public ly5(int i, long j, long j2, List list, List list2) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new xk9(lc1.i);
        }
        boolean z = obj instanceof xk9;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((lc1) list.get(i)).getClass();
                arrayList.add(new lc1(((xk9) obj).a));
            }
            obj = new ly5(this.g, this.e, this.f, arrayList, this.d);
        }
        if (!(obj instanceof ly5)) {
            return null;
        }
        ly5 ly5Var = (ly5) obj;
        ArrayList arrayListX = jf0.x(list, ly5Var.c, f);
        ArrayList arrayListY = jf0.y(this.d, ly5Var.d, f);
        long jZ = jf0.z(this.e, ly5Var.e, f);
        long jZ2 = jf0.z(this.f, ly5Var.f, f);
        if (f >= 0.5f) {
            this = ly5Var;
        }
        return new ly5(this.g, jZ, jZ2, arrayListX, arrayListY);
    }

    public final Shader c(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        return pu1.o(this.g, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly5)) {
            return false;
        }
        ly5 ly5Var = (ly5) obj;
        return lc5.Q(this.c, ly5Var.c) && lc5.Q(this.d, ly5Var.d) && eb7.c(this.e, ly5Var.e) && eb7.c(this.f, ly5Var.f) && this.g == ly5Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + xv5.b(xv5.b((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) eb7.j(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) eb7.j(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + str2 + "tileMode=" + ((Object) oh9.l(this.g)) + ')';
    }
}
