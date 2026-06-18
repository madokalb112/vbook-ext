package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class p12 {
    public static final d6a a = new d6a(new dh1(12));
    public static final ur9 b = new ur9(new dh1(13));
    public static final List c;
    public static final List d;
    public static final ArrayList e;
    public static final List f;

    static {
        List listZ = gc1.Z(new eb7((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), new eb7((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), new eb7((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), new eb7((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)));
        c = listZ;
        List listZ2 = gc1.Z(new eb7((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), new eb7((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), new eb7((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), new eb7((((long) Float.floatToRawIntBits(0.5f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)));
        d = listZ2;
        e = fc1.I0(listZ, listZ2);
        f = gc1.Z(new hw(1, 1), new hw(16, 9), new hw(4, 3));
    }

    public static o12 a(int i, List list, List list2) {
        long j = lc1.b;
        long j2 = lc1.e;
        n12 n12Var = new n12();
        long jC = lc1.c(0.5f, j);
        if ((i & Token.CASE) != 0) {
            list = g12.c;
        }
        List list3 = list;
        if ((i & 256) != 0) {
            list2 = f;
        }
        List list4 = list2;
        list3.getClass();
        list4.getClass();
        return new o12(j, jC, list3, list4, n12Var, j2);
    }
}
