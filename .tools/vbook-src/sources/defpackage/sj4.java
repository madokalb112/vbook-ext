package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sj4 extends h0 {
    public final oi5 a;
    public final oi5 b;
    public final /* synthetic */ int c;
    public final rj4 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sj4(oi5 oi5Var, oi5 oi5Var2, int i) {
        this(oi5Var, oi5Var2, (byte) 0);
        this.c = i;
        oi5Var.getClass();
        oi5Var2.getClass();
        switch (i) {
            case 1:
                this(oi5Var, oi5Var2, (byte) 0);
                m39 m39VarE = oi5Var.e();
                m39 m39VarE2 = oi5Var2.e();
                m39VarE.getClass();
                m39VarE2.getClass();
                this.d = new rj4("kotlin.collections.LinkedHashMap", m39VarE, m39VarE2);
                break;
            default:
                m39 m39VarE3 = oi5Var.e();
                m39 m39VarE4 = oi5Var2.e();
                m39VarE3.getClass();
                m39VarE4.getClass();
                this.d = new rj4("kotlin.collections.HashMap", m39VarE3, m39VarE4);
                break;
        }
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        i(obj);
        m39 m39VarE = e();
        m39VarE.getClass();
        md2 md2VarV = md2Var.v(m39VarE);
        Iterator itH = h(obj);
        int i = 0;
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            md2VarV.V(e(), i, this.a, key);
            i += 2;
            md2VarV.V(e(), i2, this.b, value);
        }
        md2VarV.a0(m39VarE);
    }

    @Override // defpackage.oi5
    public final m39 e() {
        switch (this.c) {
        }
        return this.d;
    }

    @Override // defpackage.h0
    public final Object f() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.h0
    public final int g(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.h0
    public final Iterator h(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.h0
    public final int i(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objQ = am1Var.q(e(), i, this.a, null);
        int iF = am1Var.f(e());
        if (iF != i + 1) {
            gp.k(xv5.o("Value must follow key in a map, index for key: ", i, iF, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objQ);
        oi5 oi5Var = this.b;
        map.put(objQ, (!zContainsKey || (oi5Var.e().e() instanceof m28)) ? am1Var.q(e(), iF, oi5Var, null) : am1Var.q(e(), iF, oi5Var, y86.G(objQ, map)));
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.h0
    public final Object m(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public sj4(oi5 oi5Var, oi5 oi5Var2, byte b) {
        this.a = oi5Var;
        this.b = oi5Var2;
    }
}
