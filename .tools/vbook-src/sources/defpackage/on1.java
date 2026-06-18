package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class on1 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(j00 j00Var, ib4 ib4Var) {
        j00Var.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(j00Var);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = ib4Var.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(j00Var, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        objInvoke.getClass();
        return objInvoke;
    }

    public final boolean b(j00 j00Var) {
        j00Var.getClass();
        return d().containsKey(j00Var);
    }

    public final Object c(j00 j00Var) {
        j00Var.getClass();
        Object obj = d().get(j00Var);
        if (obj != null) {
            return obj;
        }
        w58.s(j00Var, "No instance for key ");
        return null;
    }

    public final Map d() {
        return this.a;
    }

    public final Object e(j00 j00Var) {
        j00Var.getClass();
        return d().get(j00Var);
    }

    public final void f(j00 j00Var, Object obj) {
        j00Var.getClass();
        obj.getClass();
        d().put(j00Var, obj);
    }
}
