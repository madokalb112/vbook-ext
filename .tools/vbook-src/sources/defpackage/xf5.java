package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class xf5 {
    public static final uf5 a = e11.f(new fz4(18));

    public static final we5 a(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(gc1.M(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return new we5(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lc3] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public static final mf5 b(Object obj) {
        if (obj == null) {
            return cg5.INSTANCE;
        }
        if (obj instanceof Map) {
            return c((Map) obj);
        }
        if (obj instanceof Collection) {
            return a((Collection) obj);
        }
        if (obj instanceof byte[]) {
            return a(fw.J0((byte[]) obj));
        }
        boolean z = obj instanceof char[];
        ?? Y = lc3.a;
        int i = 0;
        if (z) {
            char[] cArr = (char[]) obj;
            int length = cArr.length;
            if (length != 0) {
                if (length != 1) {
                    Y = new ArrayList(cArr.length);
                    int length2 = cArr.length;
                    while (i < length2) {
                        Y.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    Y = gc1.Y(Character.valueOf(cArr[0]));
                }
            }
            return a(Y);
        }
        if (obj instanceof short[]) {
            return a(fw.P0((short[]) obj));
        }
        if (obj instanceof int[]) {
            return a(fw.M0((int[]) obj));
        }
        if (obj instanceof long[]) {
            return a(fw.N0((long[]) obj));
        }
        if (obj instanceof float[]) {
            return a(fw.L0((float[]) obj));
        }
        if (obj instanceof double[]) {
            return a(fw.K0((double[]) obj));
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length3 = zArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    Y = new ArrayList(zArr.length);
                    int length4 = zArr.length;
                    while (i < length4) {
                        Y.add(Boolean.valueOf(zArr[i]));
                        i++;
                    }
                } else {
                    Y = gc1.Y(Boolean.valueOf(zArr[0]));
                }
            }
            return a(Y);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            int length5 = objArr.length;
            while (i < length5) {
                arrayList.add(b(objArr[i]));
                i++;
            }
            return new we5(arrayList);
        }
        if (obj instanceof Boolean) {
            m75 m75Var = nf5.a;
            return new yf5((Boolean) obj, false);
        }
        if (obj instanceof Number) {
            m75 m75Var2 = nf5.a;
            return new yf5((Number) obj, false);
        }
        if (obj instanceof String) {
            return nf5.a((String) obj);
        }
        if (obj instanceof Enum) {
            return nf5.a(((Enum) obj).toString());
        }
        if (obj instanceof mf5) {
            return (mf5) obj;
        }
        gp.j(ky0.p(obj, "Can't serialize unknown type: "));
        return null;
    }

    public static final fg5 c(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            key.getClass();
            linkedHashMap.put(key, b(value));
        }
        return new fg5(linkedHashMap);
    }
}
