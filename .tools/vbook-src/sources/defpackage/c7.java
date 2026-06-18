package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c7 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(t27 t27Var, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.c = t27Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        int i2 = 3;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                c7 c7Var = new c7((t27) this.c, (jt1) obj3, 0);
                c7Var.b = (t6) obj2;
                c7Var.invokeSuspend(hebVar);
                return hebVar;
            case 1:
                c7 c7Var2 = new c7(i2, 1, (jt1) obj3);
                c7Var2.b = (xu4) obj;
                c7Var2.c = (wh7) obj2;
                return c7Var2.invokeSuspend(hebVar);
            case 2:
                c7 c7Var3 = new c7((t27) this.c, (jt1) obj3, 2);
                c7Var3.b = (ll0) obj2;
                c7Var3.invokeSuspend(hebVar);
                return hebVar;
            case 3:
                c7 c7Var4 = new c7((t27) this.c, (jt1) obj3, i2);
                c7Var4.b = (m02) obj2;
                c7Var4.invokeSuspend(hebVar);
                return hebVar;
            case 4:
                c7 c7Var5 = new c7(i2, 4, (jt1) obj3);
                c7Var5.b = (na9) obj;
                c7Var5.c = (pz6) obj2;
                return c7Var5.invokeSuspend(hebVar);
            case 5:
                c7 c7Var6 = new c7((t27) this.c, (jt1) obj3, 5);
                c7Var6.b = (ub9) obj2;
                c7Var6.invokeSuspend(hebVar);
                return hebVar;
            default:
                c7 c7Var7 = new c7(i2, 6, (jt1) obj3);
                c7Var7.b = (Map) obj;
                c7Var7.c = (Map) obj2;
                return c7Var7.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                t6 t6Var = (t6) this.b;
                e11.e0(obj);
                if (t6Var != null) {
                    ah1.M((t27) this.c, t6Var.a);
                    return hebVar;
                }
                mn5.g();
                return null;
            case 1:
                xu4 xu4Var = (xu4) this.b;
                wh7 wh7Var = (wh7) this.c;
                e11.e0(obj);
                h88 h88Var = (h88) xu4Var.f.e(fi0.a);
                if (h88Var == null) {
                    return null;
                }
                return new ta7(wh7Var, xu4Var.e, h88Var);
            case 2:
                ll0 ll0Var = (ll0) this.b;
                e11.e0(obj);
                if (ll0Var instanceof jl0) {
                    gx1.R((t27) this.c, ((jl0) ll0Var).a, null);
                    return hebVar;
                }
                if (lc5.Q(ll0Var, kl0.a)) {
                    return hebVar;
                }
                mn5.g();
                return null;
            case 3:
                m02 m02Var = (m02) this.b;
                e11.e0(obj);
                if (m02Var != null) {
                    ah1.M((t27) this.c, m02Var.a);
                    return hebVar;
                }
                mn5.g();
                return null;
            case 4:
                e11.e0(obj);
                na9 na9Var = (na9) this.b;
                pz6 pz6Var = (pz6) this.c;
                Set setKeySet = pz6Var.a().keySet();
                ArrayList arrayList = new ArrayList(gc1.M(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e18) it.next()).a);
                }
                Map<String, ?> all = na9Var.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Set set = na9Var.b;
                    if (set != null ? set.contains(key) : true) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(y86.O(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Set) {
                        value = fc1.e1((Iterable) value);
                    }
                    linkedHashMap2.put(key2, value);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!arrayList.contains((String) entry3.getKey())) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                pz6 pz6VarG = pz6Var.g();
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value2 = entry4.getValue();
                    if (value2 instanceof Boolean) {
                        pz6VarG.f(i12.t(str), value2);
                    } else if (value2 instanceof Float) {
                        pz6VarG.f(i12.C(str), value2);
                    } else if (value2 instanceof Integer) {
                        pz6VarG.f(i12.Q(str), value2);
                    } else if (value2 instanceof Long) {
                        pz6VarG.f(i12.U(str), value2);
                    } else if (value2 instanceof String) {
                        pz6VarG.f(i12.e0(str), value2);
                    } else if (value2 instanceof Set) {
                        pz6VarG.f(i12.f0(str), (Set) value2);
                    }
                }
                return pz6VarG.h();
            case 5:
                ub9 ub9Var = (ub9) this.b;
                e11.e0(obj);
                if (lc5.Q(ub9Var, ub9.a)) {
                    ((t27) this.c).b();
                    return hebVar;
                }
                mn5.g();
                return null;
            default:
                Map map = (Map) this.b;
                Map map2 = (Map) this.c;
                e11.e0(obj);
                return new c4b(true, map2, map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }
}
