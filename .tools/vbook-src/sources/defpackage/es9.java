package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class es9 extends o1a implements bc4 {
    public /* synthetic */ List a;
    public /* synthetic */ List b;
    public /* synthetic */ tk0 c;
    public /* synthetic */ c4b d;
    public final /* synthetic */ long e;
    public final /* synthetic */ fs9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es9(long j, fs9 fs9Var, jt1 jt1Var) {
        super(5, jt1Var);
        this.e = j;
        this.f = fs9Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        List list2 = this.b;
        tk0 tk0Var = this.c;
        c4b c4bVar = this.d;
        e11.e0(obj);
        final int i = 2;
        final k49 k49Var = new k49(2, this.f, c4bVar);
        mua.Companion.getClass();
        mua muaVarA = lua.a();
        final w16 w16VarA = yib.F(r95.a.k(), muaVarA).a();
        List listR0 = fc1.R0(new cd9(5), list2);
        final int i2 = 0;
        ds9 ds9VarK = zk9.k(listR0, new kb4() { // from class: gs9
            @Override // defpackage.kb4
            public final Object invoke(Object obj2) {
                boolean zEquals;
                int i3 = i2;
                w16 w16Var = w16VarA;
                w16 w16Var2 = (w16) obj2;
                switch (i3) {
                    case 0:
                        w16Var2.getClass();
                        zEquals = w16Var2.equals(w16Var);
                        break;
                    case 1:
                        w16Var2.getClass();
                        w16 w16VarS = rw1.S(w16Var, new v62(w16Var.a().ordinal(), 3));
                        zEquals = new d26(w16VarS, b26.b(w16VarS, new v62(6, 3))).contains(w16Var2);
                        break;
                    default:
                        w16Var2.getClass();
                        return Boolean.valueOf(w16Var2.a.getYear() == w16Var.a.getYear() && w16Var2.b() == w16Var.b());
                }
                return Boolean.valueOf(zEquals);
            }
        }, muaVarA);
        final int i3 = 1;
        ds9 ds9VarK2 = zk9.k(listR0, new kb4() { // from class: gs9
            @Override // defpackage.kb4
            public final Object invoke(Object obj2) {
                boolean zEquals;
                int i32 = i3;
                w16 w16Var = w16VarA;
                w16 w16Var2 = (w16) obj2;
                switch (i32) {
                    case 0:
                        w16Var2.getClass();
                        zEquals = w16Var2.equals(w16Var);
                        break;
                    case 1:
                        w16Var2.getClass();
                        w16 w16VarS = rw1.S(w16Var, new v62(w16Var.a().ordinal(), 3));
                        zEquals = new d26(w16VarS, b26.b(w16VarS, new v62(6, 3))).contains(w16Var2);
                        break;
                    default:
                        w16Var2.getClass();
                        return Boolean.valueOf(w16Var2.a.getYear() == w16Var.a.getYear() && w16Var2.b() == w16Var.b());
                }
                return Boolean.valueOf(zEquals);
            }
        }, muaVarA);
        ds9 ds9VarK3 = zk9.k(listR0, new kb4() { // from class: gs9
            @Override // defpackage.kb4
            public final Object invoke(Object obj2) {
                boolean zEquals;
                int i32 = i;
                w16 w16Var = w16VarA;
                w16 w16Var2 = (w16) obj2;
                switch (i32) {
                    case 0:
                        w16Var2.getClass();
                        zEquals = w16Var2.equals(w16Var);
                        break;
                    case 1:
                        w16Var2.getClass();
                        w16 w16VarS = rw1.S(w16Var, new v62(w16Var.a().ordinal(), 3));
                        zEquals = new d26(w16VarS, b26.b(w16VarS, new v62(6, 3))).contains(w16Var2);
                        break;
                    default:
                        w16Var2.getClass();
                        return Boolean.valueOf(w16Var2.a.getYear() == w16Var.a.getYear() && w16Var2.b() == w16Var.b());
                }
                return Boolean.valueOf(zEquals);
            }
        }, muaVarA);
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((zv5) it.next()).v;
        }
        Iterator it2 = list.iterator();
        long j2 = 0;
        while (it2.hasNext()) {
            j2 += ((zv5) it2.next()).w;
        }
        ds9 ds9Var = new ds9(j, j2, 12);
        List listR02 = f39.r0(f39.q0(new r04(new r04(2, new vx3(new jc1(list, 0), true, new qc9(27)), new cw2(tk0Var, 7)), new kb4() { // from class: hs9
            @Override // defpackage.kb4
            public final Object invoke(Object obj2) {
                int i4 = i2;
                k49 k49Var2 = k49Var;
                switch (i4) {
                    case 0:
                        zv5 zv5Var = (zv5) obj2;
                        zv5Var.getClass();
                        Map mapSingletonMap = Collections.singletonMap("", k49Var2.invoke(zv5Var));
                        mapSingletonMap.getClass();
                        return zv5.a(zv5Var, mapSingletonMap, null, null, null, 0, null, null, 0, 0.0d, false, false, -3);
                    default:
                        zv5 zv5Var2 = (zv5) obj2;
                        zv5Var2.getClass();
                        Map mapSingletonMap2 = Collections.singletonMap("", k49Var2.invoke(zv5Var2));
                        mapSingletonMap2.getClass();
                        return zv5.a(zv5Var2, mapSingletonMap2, null, null, null, 0, null, null, 0, 0.0d, false, false, -3);
                }
            }
        }), 10));
        long size = list.size();
        Iterator it3 = list.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            i4 += ((zv5) it3.next()).u;
        }
        final int i5 = 1;
        return new cs9(ds9VarK, ds9VarK2, ds9VarK3, ds9Var, tk0Var, listR02, size, i4, this.e, f39.r0(new r04(f39.q0(new r04(2, new vx3(new jc1(list, 0), true, new qc9(28)), new cd9(6)), 20), new kb4() { // from class: hs9
            @Override // defpackage.kb4
            public final Object invoke(Object obj2) {
                int i42 = i5;
                k49 k49Var2 = k49Var;
                switch (i42) {
                    case 0:
                        zv5 zv5Var = (zv5) obj2;
                        zv5Var.getClass();
                        Map mapSingletonMap = Collections.singletonMap("", k49Var2.invoke(zv5Var));
                        mapSingletonMap.getClass();
                        return zv5.a(zv5Var, mapSingletonMap, null, null, null, 0, null, null, 0, 0.0d, false, false, -3);
                    default:
                        zv5 zv5Var2 = (zv5) obj2;
                        zv5Var2.getClass();
                        Map mapSingletonMap2 = Collections.singletonMap("", k49Var2.invoke(zv5Var2));
                        mapSingletonMap2.getClass();
                        return zv5.a(zv5Var2, mapSingletonMap2, null, null, null, 0, null, null, 0, 0.0d, false, false, -3);
                }
            }
        })));
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        es9 es9Var = new es9(this.e, this.f, (jt1) obj5);
        es9Var.a = (List) obj;
        es9Var.b = (List) obj2;
        es9Var.c = (tk0) obj3;
        es9Var.d = (c4b) obj4;
        return es9Var.invokeSuspend(heb.a);
    }
}
