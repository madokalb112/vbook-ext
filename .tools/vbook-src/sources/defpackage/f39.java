package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class f39 extends ex1 {
    public static a39 n0(Iterator it) {
        it.getClass();
        return new hp1(new mg5(it, 1));
    }

    public static Object o0(a39 a39Var) {
        Iterator it = a39Var.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String p0(a39 a39Var, String str) {
        a39Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : a39Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            xg9.d(sb, obj, (kb4) null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static a39 q0(a39 a39Var, int i) {
        if (i >= 0) {
            return i == 0 ? rc3.a : a39Var instanceof a63 ? ((a63) a39Var).a(i) : new x53(a39Var, i, 1);
        }
        gp.k(xv5.k(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List r0(a39 a39Var) {
        a39Var.getClass();
        Iterator it = a39Var.iterator();
        if (!it.hasNext()) {
            return lc3.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return gc1.Y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
