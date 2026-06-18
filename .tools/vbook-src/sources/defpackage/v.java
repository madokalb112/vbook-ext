package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 6;
        int i3 = 4;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        heb hebVar = heb.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((yy6) obj3).c((b28) obj2);
                return hebVar;
            case 1:
                ((pn2) obj).getClass();
                return new ea5(((long) t96.M(((Number) wx1.S(Float.valueOf(((pb) obj3).d()), (bb1) obj2)).floatValue())) << 32);
            case 2:
                bb bbVar = (bb) obj3;
                kb kbVar = (kb) obj2;
                long jI = eb7.i(bbVar.A1() ? -1.0f : 1.0f, ((t23) obj).a);
                kb.b(kbVar, bbVar.V.c(Float.intBitsToFloat((int) (bbVar.W == lh7.a ? jI & 4294967295L : jI >> 32))));
                return hebVar;
            case 3:
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)) * ((Number) ((z50) obj3).g.getValue()).floatValue();
                tc tcVar = ((sw8) obj2).h;
                if (tcVar != null) {
                    tcVar.a(r43Var.p0().x());
                }
                r43.J(r43Var, lc1.i, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r43Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, (jw9) null, 48);
                y91 y91VarP0 = r43Var.p0();
                long jG = y91VarP0.G();
                y91VarP0.x().i();
                try {
                    lp8.E((lp8) y91VarP0.b, 0.0f, fIntBitsToFloat, 1);
                    float fK0 = r43Var.k0(y50.b);
                    r43.G0(r43Var, js8.x(y50.a, fK0, 8), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r43Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fK0)) & 4294967295L), 0.0f, (s43) null, (qc1) null, 0, Token.FUNCTION);
                    return hebVar;
                } finally {
                    j39.s(y91VarP0, jG);
                }
            case 4:
                Float f = (Float) obj;
                ((z50) obj3).i(f.floatValue());
                ((kb4) obj2).invoke(f);
                return hebVar;
            case 5:
                Float f2 = (Float) obj;
                ((z50) obj3).i(f2.floatValue());
                ((kb4) obj2).invoke(f2);
                return hebVar;
            case 6:
                ia0 ia0Var = (ia0) obj3;
                ja0 ja0Var = (ja0) obj2;
                psa psaVar = ia0Var.A;
                if (psaVar != null) {
                    psaVar.b();
                }
                ia0Var.A = null;
                bi1 bi1Var = ja0Var.c;
                if (bi1Var != null) {
                    bi1Var.Q(hebVar);
                }
                ja0Var.c = null;
                return hebVar;
            case 7:
                eb0 eb0Var = (eb0) obj3;
                uk1 uk1Var = (uk1) obj2;
                s16 s16Var = eb0Var.a;
                if (s16Var != null) {
                    s16.k(s16Var, uk1Var.b);
                } else {
                    te7 te7Var = eb0Var.b;
                    if (te7Var == null) {
                        gp.j("Unreachable");
                        return null;
                    }
                    db0 db0Var = uk1Var.a;
                    db0Var.getClass();
                    oe7 oe7Var = new oe7(db0Var, new pe7(db0Var, (mx5) null));
                    db0Var.a.add(oe7Var);
                    s16.k(te7Var.b().c, oe7Var);
                }
                return new kb0(1, eb0Var, uk1Var);
            case 8:
                jt7 jt7Var = (jt7) obj3;
                jt7 jt7Var2 = (jt7) obj2;
                it7 it7Var = (it7) obj;
                i = jt7Var.a <= it7Var.w0(jf0.g) ? 0 : 1;
                float f3 = i != 0 ? 12.0f : 6.0f;
                float f4 = i != 0 ? 14.0f : 6.0f;
                it7.n(it7Var, jt7Var2, 0, 0);
                it7.n(it7Var, jt7Var, Math.min(jt7Var2.a - it7Var.w0(f3), ((int) it7Var.c(yb0.e, Float.POSITIVE_INFINITY)) - jt7Var.a), Math.max(it7Var.w0(f4) + (-jt7Var.b), (int) it7Var.c(yb0.d, Float.NEGATIVE_INFINITY)));
                return hebVar;
            case 9:
                kb4 kb4Var = (kb4) obj2;
                wga wgaVar = (wga) obj;
                if (!lc5.Q((wga) obj3, wgaVar)) {
                    kb4Var.invoke(wgaVar);
                }
                return hebVar;
            case 10:
                String str = (String) obj;
                str.getClass();
                ((a07) obj2).setValue(Boolean.FALSE);
                ((rk0) obj3).k(str);
                return hebVar;
            case 11:
                sq0 sq0Var = (sq0) obj2;
                un5 un5Var = (un5) obj;
                un5Var.a();
                r43.q(un5Var, (hh) obj3, sq0Var, 0.0f, (s43) null, (qc1) null, 0, 60);
                return hebVar;
            case 12:
                un5 un5Var2 = (un5) obj;
                un5Var2.a();
                r43.q(un5Var2, ((xh7) obj3).b, (sq0) obj2, 0.0f, (s43) null, (qc1) null, 0, 60);
                return hebVar;
            case 13:
                ((ho0) obj3).a.j((dr1) obj2);
                return hebVar;
            case 14:
                xu4 xu4Var = (xu4) obj;
                xu4Var.getClass();
                rcb rcbVar = xu4Var.a;
                tcb tcbVar = tcb.d;
                rcbVar.getClass();
                tcbVar.getClass();
                rcbVar.d = tcbVar;
                rcbVar.e(rcbVar.c);
                scb.b(rcbVar, (String) obj3);
                ((nx9) obj2).invoke(xu4Var);
                return hebVar;
            case 15:
                xu4 xu4Var2 = (xu4) obj;
                xu4Var2.getClass();
                xu4Var2.d((gu4) obj3);
                j00 j00Var = yu4.a;
                rcb rcbVar2 = xu4Var2.a;
                rcbVar2.getClass();
                tcb tcbVar2 = tcb.c;
                rcbVar2.d = gl9.e("ws");
                ((v) obj2).invoke(xu4Var2);
                return hebVar;
            case 16:
                bv0 bv0Var = (bv0) obj3;
                jt0 jt0Var = (jt0) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    md2.x(bv0Var, th);
                    jt0Var.a(th);
                }
                return hebVar;
            case 17:
                jt0 jt0Var2 = (jt0) obj3;
                jt0 jt0Var3 = (jt0) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    jt0Var2.a(th2);
                    jt0Var3.a(th2);
                }
                return hebVar;
            case 18:
                t61 t61Var = (t61) obj3;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                List list = t61Var.y;
                at5Var.c0(list.size(), new f7(i2, new vi0(29), list), new g7(9, list), new rj1(new ik0(list, (Object) t61Var, (kb4) obj2, i), true, 802480018));
                if (t61Var.w) {
                    at5.b0(at5Var, (String) null, kc5.c, 3);
                }
                return hebVar;
            case 19:
                ng8 ng8Var = (ng8) obj2;
                boolean z = ng8Var.a || ((ge4) obj).E((p65) obj3);
                ng8Var.a = z;
                return Boolean.valueOf(!z);
            case 20:
                ng8 ng8Var2 = (ng8) obj2;
                boolean z2 = ng8Var2.a || ((ge4) obj).d0((ux7) obj3);
                ng8Var2.a = z2;
                return Boolean.valueOf(!z2);
            case 21:
                tf1 tf1Var = (tf1) obj3;
                ((u2b) obj).getClass();
                m62 m62Var = tf1Var.b;
                b92 b92Var = m62Var.C;
                String str2 = tf1Var.a;
                b92Var.R(str2);
                for (Object obj4 : (List) obj2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    b92 b92Var2 = m62Var.C;
                    String strG = dx1.g(i7, str2, "_");
                    String str3 = tf1Var.a;
                    String str4 = ((cn9) obj4).a;
                    qa1 qa1Var = r95.a;
                    b92Var2.l0(new xb2(strG, str3, i7, str4, qa1Var.k().c(), qa1Var.k().c()));
                    i7 = i8;
                }
                return hebVar;
            case 22:
                tf1 tf1Var2 = (tf1) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((u2b) obj).getClass();
                m62 m62Var2 = tf1Var2.b;
                m62Var2.f.O(tf1Var2.a);
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj5 = arrayList.get(i6);
                    i6++;
                    m62Var2.f.h0((v92) obj5);
                }
                return hebVar;
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                fk4 fk4Var = (fk4) obj;
                fk4Var.getClass();
                ((gv4) obj3).a().d(new ah(fk4Var, i3));
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i5 < size2) {
                    Object obj6 = arrayList2.get(i5);
                    i5++;
                    if (!arrayList2.contains((String) obj6)) {
                        arrayList3.add(obj6);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    fk4Var.h("Content-Encoding", fc1.D0(arrayList3, ",", null, null, null, 62));
                }
                return hebVar;
            case 24:
                pw0 pw0Var = (pw0) obj;
                pw0Var.getClass();
                return pw0Var.a(new we(((e12) ((a07) obj3).getValue()).a(rw1.w(0L, pw0Var.a.f())), pw0Var.b() * 2.0f, (br9) obj2, 1));
            case 25:
                qv5 qv5Var = (qv5) obj3;
                sq0 sq0Var2 = (sq0) obj2;
                un5 un5Var3 = (un5) obj;
                un5Var3.a();
                if (((Boolean) qv5Var.s.getValue()).booleanValue() || ((Boolean) qv5Var.t.getValue()).booleanValue()) {
                    r43.G0(un5Var3, sq0Var2, 0L, 0L, 0.0f, (s43) null, (qc1) null, 0, Token.ELSE);
                }
                return hebVar;
            case 26:
                a82 a82Var = (a82) obj3;
                b92 b92Var3 = (b92) obj2;
                rj rjVar = (rj) obj;
                rjVar.getClass();
                rjVar.g(0, a82Var.a);
                ((bv4) b92Var3.c).getClass();
                wfc wfcVar = wfc.t;
                rjVar.g(1, (String) wfcVar.n(a82Var.b));
                ((bv4) b92Var3.c).getClass();
                rjVar.g(2, (String) wfcVar.n(a82Var.c));
                rjVar.g(3, a82Var.d);
                rjVar.j(4, Long.valueOf(a82Var.e));
                rjVar.j(5, Long.valueOf(a82Var.f));
                List list2 = a82Var.g;
                list2.getClass();
                uf5 uf5Var = xf5.a;
                uf5Var.getClass();
                rjVar.g(6, uf5Var.b(new wv(tv9.a, 0), list2));
                rjVar.g(7, a82Var.h);
                rjVar.g(8, a82Var.i);
                rjVar.g(9, a82Var.j);
                rjVar.g(10, a82Var.k);
                rjVar.g(11, a82Var.l);
                rjVar.j(12, Long.valueOf(a82Var.m));
                rjVar.j(13, Long.valueOf(a82Var.n));
                rjVar.g(14, (String) wfcVar.n(a82Var.o));
                rjVar.l(15, Boolean.valueOf(a82Var.p));
                rjVar.g(16, a82Var.q);
                rjVar.g(17, a82Var.r);
                rjVar.j(18, Long.valueOf(a82Var.s));
                rjVar.k(19, Double.valueOf(a82Var.t));
                rjVar.j(20, Long.valueOf(a82Var.u));
                rjVar.j(21, Long.valueOf(a82Var.v));
                rjVar.j(22, Long.valueOf(a82Var.w));
                rjVar.l(23, Boolean.valueOf(a82Var.x));
                rjVar.l(24, Boolean.valueOf(a82Var.y));
                rjVar.l(25, Boolean.valueOf(a82Var.z));
                rjVar.l(26, Boolean.valueOf(a82Var.A));
                rjVar.j(27, Long.valueOf(a82Var.B));
                rjVar.g(28, (String) wfcVar.n(a82Var.C));
                rjVar.g(29, (String) wfcVar.n(a82Var.D));
                rjVar.j(30, Long.valueOf(a82Var.E));
                rjVar.j(31, Long.valueOf(a82Var.F));
                rjVar.j(32, Long.valueOf(a82Var.G));
                rjVar.j(33, Long.valueOf(a82Var.H));
                rjVar.j(34, Long.valueOf(a82Var.I));
                return hebVar;
            case 27:
                b92 b92Var4 = (b92) obj2;
                rj rjVar2 = (rj) obj;
                rjVar2.getClass();
                Iterator it = ((List) ((g82) obj3).c).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    ((bv4) b92Var4.c).getClass();
                    rjVar2.j(i4, Long.valueOf(iIntValue));
                    i4++;
                }
                return hebVar;
            case 28:
                rj rjVar3 = (rj) obj;
                rjVar3.getClass();
                ((bv4) ((b92) obj3).c).getClass();
                rjVar3.j(0, Long.valueOf(((h82) obj2).c));
                return hebVar;
            default:
                b92 b92Var5 = (b92) obj3;
                rj rjVar4 = (rj) obj;
                rjVar4.getClass();
                ((bv4) b92Var5.c).getClass();
                rjVar4.j(0, Long.valueOf(r15.c));
                Iterator it2 = ((List) ((m82) obj2).d).iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    ((bv4) b92Var5.c).getClass();
                    rjVar4.j(i, Long.valueOf(iIntValue2));
                    i++;
                }
                return hebVar;
        }
    }
}
