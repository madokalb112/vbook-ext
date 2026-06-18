package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class bg5 {
    public static final bv4 a = new bv4(22);

    public static final int a(m39 m39Var, ue5 ue5Var, String str) {
        m39Var.getClass();
        ue5Var.getClass();
        str.getClass();
        d(ue5Var, m39Var);
        int iD = m39Var.d(str);
        if (iD != -3 || !ue5Var.a.j) {
            return iD;
        }
        uf4 uf4Var = ue5Var.c;
        al3 al3Var = new al3(21, m39Var, ue5Var);
        uf4Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) uf4Var.b;
        Map map = (Map) concurrentHashMap.get(m39Var);
        bv4 bv4Var = a;
        Object obj = map != null ? map.get(bv4Var) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = al3Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(m39Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(m39Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(bv4Var, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(m39 m39Var, ue5 ue5Var, String str, String str2) {
        m39Var.getClass();
        ue5Var.getClass();
        str.getClass();
        int iA = a(m39Var, ue5Var, str);
        if (iA != -3) {
            return iA;
        }
        throw new u39(m39Var.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(ue5 ue5Var, m39 m39Var) {
        m39Var.getClass();
        ue5Var.getClass();
        if (ue5Var.a.b) {
            return true;
        }
        List annotations = m39Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof tf5) {
                return true;
            }
        }
        return false;
    }

    public static final void d(ue5 ue5Var, m39 m39Var) {
        m39Var.getClass();
        ue5Var.getClass();
        lc5.Q(m39Var.e(), qw9.c);
    }
}
