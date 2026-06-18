package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ni1 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final fj1 f;
    public final Set g;

    public ni1(String str, Set set, Set set2, int i, int i2, fj1 fj1Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = fj1Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static mi1 a(oa8 oa8Var) {
        return new mi1(oa8Var, new oa8[0]);
    }

    public static mi1 b(Class cls) {
        return new mi1(cls, new Class[0]);
    }

    public static ni1 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oa8.a(cls));
        for (Class cls2 : clsArr) {
            gx1.y(cls2, "Null interface");
            hashSet.add(oa8.a(cls2));
        }
        return new ni1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new li1(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
