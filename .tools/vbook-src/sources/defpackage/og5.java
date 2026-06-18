package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class og5 extends m1 {
    public final fg5 f;
    public final m39 g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og5(ue5 ue5Var, fg5 fg5Var, String str, m39 m39Var) {
        super(ue5Var, str);
        ue5Var.getClass();
        this.f = fg5Var;
        this.g = m39Var;
    }

    @Override // defpackage.m1
    public mf5 F(String str) {
        str.getClass();
        return (mf5) y86.G(str, T());
    }

    @Override // defpackage.m1
    public String R(m39 m39Var, int i) {
        m39Var.getClass();
        ue5 ue5Var = this.c;
        bg5.d(ue5Var, m39Var);
        String strG = m39Var.g(i);
        if (this.e.j && !T().a.keySet().contains(strG)) {
            uf4 uf4Var = ue5Var.c;
            al3 al3Var = new al3(21, m39Var, ue5Var);
            uf4Var.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) uf4Var.b;
            Map map = (Map) concurrentHashMap.get(m39Var);
            Object obj = null;
            bv4 bv4Var = bg5.a;
            Object objInvoke = map != null ? map.get(bv4Var) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = al3Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(m39Var);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(m39Var, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(bv4Var, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator it = T().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strG;
    }

    @Override // defpackage.m1
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public fg5 T() {
        return this.f;
    }

    public final boolean Z(m39 m39Var, int i) {
        boolean z = (this.c.a.e || m39Var.j(i) || !m39Var.i(i).c()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // defpackage.am1
    public int f(m39 m39Var) {
        m39Var.getClass();
        while (this.h < m39Var.f()) {
            int i = this.h;
            this.h = i + 1;
            String strS = S(m39Var, i);
            int i2 = this.h - 1;
            this.i = false;
            if (T().containsKey(strS) || Z(m39Var, i2)) {
                if (this.e.g) {
                    boolean zJ = m39Var.j(i2);
                    m39 m39VarI = m39Var.i(i2);
                    if (!zJ || m39VarI.c() || !(((mf5) T().get(strS)) instanceof cg5)) {
                        if (lc5.Q(m39VarI.e(), s39.c) && (!m39VarI.c() || !(((mf5) T().get(strS)) instanceof cg5))) {
                            mf5 mf5Var = (mf5) T().get(strS);
                            String strA = null;
                            jg5 jg5Var = mf5Var instanceof jg5 ? (jg5) mf5Var : null;
                            if (jg5Var != null) {
                                m75 m75Var = nf5.a;
                                if (!(jg5Var instanceof cg5)) {
                                    strA = jg5Var.a();
                                }
                            }
                            if (strA != null) {
                                ue5 ue5Var = this.c;
                                int iA = bg5.a(m39VarI, ue5Var, strA);
                                boolean z = !ue5Var.a.e && m39VarI.c();
                                if (iA != -3 || ((!zJ && !z) || Z(m39Var, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.m1, defpackage.am1
    public void n(m39 m39Var) {
        Set setX;
        m39Var.getClass();
        ue5 ue5Var = this.c;
        if (bg5.c(ue5Var, m39Var) || (m39Var.e() instanceof gy7)) {
            return;
        }
        bg5.d(ue5Var, m39Var);
        if (this.e.j) {
            Set setS = kc5.s(m39Var);
            uf4 uf4Var = ue5Var.c;
            uf4Var.getClass();
            Map map = (Map) ((ConcurrentHashMap) uf4Var.b).get(m39Var);
            Object obj = map != null ? map.get(bg5.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = sc3.a;
            }
            setX = e11.X(setS, setKeySet);
        } else {
            setX = kc5.s(m39Var);
        }
        for (String str : T().a.keySet()) {
            if (!setX.contains(str) && !lc5.Q(str, this.d)) {
                throw new kf5(ny1.E(j39.i('\'', "Encountered an unknown key '", str), V(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", ue5Var.a.m ? ny1.Q(T().toString(), -1).toString() : null, -1));
            }
        }
    }

    @Override // defpackage.m1, defpackage.yd2
    public final am1 t(m39 m39Var) {
        m39Var.getClass();
        m39 m39Var2 = this.g;
        if (m39Var != m39Var2) {
            return super.t(m39Var);
        }
        mf5 mf5VarG = G();
        String strA = m39Var2.a();
        boolean z = mf5VarG instanceof fg5;
        ue5 ue5Var = this.c;
        if (z) {
            return new og5(ue5Var, (fg5) mf5VarG, this.d, m39Var2);
        }
        throw new kf5(ny1.E("Expected " + ug8.a(fg5.class).g() + ", but had " + ug8.a(mf5VarG.getClass()).g() + " as the serialized body of " + strA, V(), null, ue5Var.a.m ? ny1.Q(mf5VarG.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.m1, defpackage.yd2
    public final boolean w() {
        return !this.i && super.w();
    }

    public /* synthetic */ og5(ue5 ue5Var, fg5 fg5Var, String str, int i) {
        this(ue5Var, fg5Var, (i & 4) != 0 ? null : str, (m39) null);
    }
}
