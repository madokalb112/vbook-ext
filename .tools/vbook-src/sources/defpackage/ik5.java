package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ik5 implements xtb {
    public final a91 a;
    public final ev8 b;
    public final ib4 c;

    public ik5(a91 a91Var, ev8 ev8Var, ib4 ib4Var) {
        this.a = a91Var;
        this.b = ev8Var;
        this.c = ib4Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    public final rtb c(a91 a91Var, ry6 ry6Var) throws e20 {
        gh ghVar = new gh(this.c, ry6Var);
        nc1 nc1Var = this.b.e;
        lp8 lp8Var = (lp8) nc1Var.f;
        lp8Var.getClass();
        Object obj = ((HashMap) lp8Var.b).get(hk5.a);
        if (obj == null) {
            obj = null;
        }
        if (!lc5.Q(obj, Boolean.TRUE)) {
            return (rtb) this.b.d(this.a, ghVar);
        }
        String str = a91Var.g() + '-' + tn9.n().toString();
        dbb dbbVar = new dbb(a91Var);
        dbb dbbVar2 = bub.a;
        s16 s16Var = (s16) nc1Var.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s16Var.d;
        ((zk4) ((nc1) s16Var.b).b).getClass();
        yv5 yv5Var = yv5.a;
        yv5 yv5Var2 = yv5.e;
        yv5Var2.compareTo(yv5Var);
        Set set = (Set) s16Var.c;
        if (!set.contains(dbbVar)) {
            yv5Var2.compareTo(yv5Var);
            set.add(dbbVar);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new e20(xv5.p("Scope with id '", str, "' is already created"));
        }
        ev8 ev8Var = new ev8(dbbVar, str, dbbVar2, (nc1) s16Var.b, 4);
        ev8[] ev8VarArr = {(ev8) s16Var.e};
        if (ev8Var.c) {
            gp.j("Can't add scope link to a root scope");
            return null;
        }
        ev8Var.f.addAll(0, fw.O0(ev8VarArr));
        concurrentHashMap.put(str, ev8Var);
        rtb rtbVar = (rtb) ev8Var.d(this.a, ghVar);
        te6 te6Var = new te6(str, nc1Var);
        stb stbVar = rtbVar.a;
        if (stbVar == null) {
            return rtbVar;
        }
        if (stbVar.d) {
            stb.a(te6Var);
            return rtbVar;
        }
        synchronized (stbVar.a) {
            stbVar.c.add(te6Var);
        }
        return rtbVar;
    }
}
