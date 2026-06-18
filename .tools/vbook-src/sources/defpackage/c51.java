package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class c51 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ c51(kb4 kb4Var, String str, ib4 ib4Var, vx1 vx1Var, a07 a07Var, m8 m8Var) {
        this.a = 2;
        this.e = kb4Var;
        this.f = str;
        this.s = ib4Var;
        this.c = vx1Var;
        this.b = a07Var;
        this.d = m8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // defpackage.ib4
    public final Object invoke() throws Throwable {
        boolean z;
        boolean z2;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.s;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i2 = 1;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                mn8 mn8Var = (mn8) obj5;
                a07 a07Var = (a07) obj4;
                ((yb4) obj6).invoke(mn8Var.a.s(), (List) a07Var.getValue());
                mn8Var.a.q(new wga("", zk9.h(0, 0), 4));
                a07Var.setValue(lc3.a);
                Boolean bool = Boolean.FALSE;
                ((a07) obj3).setValue(bool);
                ((a07) obj2).setValue(bool);
                ((x31) obj).a();
                break;
            case 1:
                Boolean bool2 = (Boolean) ((a07) obj4).getValue();
                bool2.booleanValue();
                Boolean bool3 = (Boolean) ((a07) obj3).getValue();
                bool3.booleanValue();
                Boolean bool4 = (Boolean) ((a07) obj2).getValue();
                bool4.booleanValue();
                Boolean bool5 = (Boolean) ((a07) obj5).getValue();
                bool5.booleanValue();
                Boolean bool6 = (Boolean) ((a07) obj).getValue();
                bool6.booleanValue();
                ((bc4) obj6).k(bool2, bool3, bool4, bool5, bool6);
                break;
            case 2:
                kb4 kb4Var = (kb4) obj6;
                String str = (String) obj5;
                ib4 ib4Var = (ib4) obj;
                vx1 vx1Var = (vx1) obj3;
                m8 m8Var = (m8) obj2;
                if (!((iib) ((a07) obj4).getValue()).f) {
                    ah1.J(vx1Var, null, null, new dp6(m8Var, strA, 0), 3);
                } else {
                    kb4Var.invoke(str);
                    ib4Var.invoke();
                }
                break;
            case 3:
                ms8 ms8Var = (ms8) obj6;
                qt8 qt8Var = (qt8) obj5;
                rs8 rs8Var = (rs8) obj;
                String str2 = (String) obj4;
                Object[] objArr = (Object[]) obj2;
                if (ms8Var.b != rs8Var) {
                    ms8Var.b = rs8Var;
                    z = true;
                } else {
                    z = false;
                }
                if (lc5.Q(ms8Var.c, str2)) {
                    z2 = z;
                } else {
                    ms8Var.c = str2;
                    z2 = true;
                }
                ms8Var.a = qt8Var;
                ms8Var.d = obj3;
                ms8Var.e = objArr;
                be5 be5Var = ms8Var.f;
                if (be5Var != null && z2) {
                    be5Var.T();
                    ms8Var.f = null;
                    ms8Var.d();
                }
                break;
            case 4:
                b89 b89Var = (b89) obj6;
                vx1 vx1Var2 = (vx1) obj5;
                a07 a07Var2 = (a07) obj4;
                a07 a07Var3 = (a07) obj3;
                m8 m8Var2 = (m8) obj;
                lva lvaVar = (lva) obj2;
                qa1 qa1Var = r95.a;
                if (qa1Var.k().c() - ((Number) a07Var2.getValue()).longValue() < 1000) {
                    a07Var3.setValue(Integer.valueOf(((Number) a07Var3.getValue()).intValue() + 1));
                } else {
                    a07Var3.setValue(1);
                }
                int i3 = 7;
                if (((Number) a07Var3.getValue()).intValue() == 7) {
                    za1 za1VarA = vtb.a(b89Var);
                    aj2 aj2Var = rw2.a;
                    b89Var.g(za1VarA, nh2.c, new z79(b89Var, strA, 0));
                    ah1.J(vx1Var2, null, null, new dp6(m8Var2, strA, i2), 3);
                } else if (((Number) a07Var3.getValue()).intValue() > 2) {
                    ah1.J(vx1Var2, null, null, new lq8(lvaVar, a07Var3, (jt1) strA, i3), 3);
                }
                a07Var2.setValue(Long.valueOf(qa1Var.k().c()));
                break;
            case 5:
                int size = ((List) obj6).size();
                int i4 = ((pg8) obj5).a;
                int i5 = ((pg8) obj).a;
                int i6 = ((pg8) obj4).a;
                int i7 = ((pg8) obj3).a;
                ty9 ty9Var = ((ry9) obj2).B.e.o;
                strA = ty9Var != null ? ty9Var.a() : 0;
                StringBuilder sbT = xv5.t(size, i4, "SubsamplingState. drawTiles. tiles=", ", insideLoadCount=", ", outsideLoadCount=");
                ky0.u(i5, i6, ", realDrawCount=", ", backgroundCount=", sbT);
                sbT.append(i7);
                sbT.append(". '");
                sbT.append(strA);
                sbT.append("'");
                break;
            case 6:
                int size2 = ((List) obj6).size();
                int i8 = ((pg8) obj5).a;
                int i9 = ((pg8) obj).a;
                int i10 = ((pg8) obj4).a;
                int i11 = ((pg8) obj3).a;
                ty9 ty9Var2 = ((sy9) obj2).B.e.o;
                String strA = ty9Var2 != null ? ty9Var2.a() : null;
                StringBuilder sbT2 = xv5.t(size2, i8, "SubsamplingState. drawTiles. tiles=", ", insideLoadCount=", ", outsideLoadCount=");
                ky0.u(i9, i10, ", realDrawCount=", ", backgroundCount=", sbT2);
                sbT2.append(i11);
                sbT2.append(". '");
                sbT2.append(strA);
                sbT2.append("'");
                break;
            case 7:
                kb4 kb4Var2 = (kb4) obj6;
                kb4 kb4Var3 = (kb4) obj5;
                String string = bw9.B0((String) ((a07) obj4).getValue()).toString();
                String string2 = bw9.B0((String) ((a07) obj3).getValue()).toString();
                String str3 = (String) ((a07) obj2).getValue();
                String string3 = bw9.B0((String) ((a07) obj).getValue()).toString();
                if (bw9.a0(string3)) {
                    string3 = "/";
                }
                kb4Var2.invoke(new vvb(string, string2, str3, string3));
                kb4Var3.invoke(Boolean.FALSE);
                break;
            default:
                ((bc4) obj6).k((String) ((a07) obj4).getValue(), (String) ((a07) obj3).getValue(), (String) ((a07) obj2).getValue(), (bi5) ((a07) obj).getValue(), (List) obj5);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ c51(ub4 ub4Var, Object obj, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, int i) {
        this.a = i;
        this.e = ub4Var;
        this.f = obj;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
        this.s = a07Var4;
    }

    public /* synthetic */ c51(bc4 bc4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5) {
        this.a = 1;
        this.e = bc4Var;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
        this.f = a07Var4;
        this.s = a07Var5;
    }

    public /* synthetic */ c51(b89 b89Var, vx1 vx1Var, a07 a07Var, a07 a07Var2, m8 m8Var, lva lvaVar) {
        this.a = 4;
        this.e = b89Var;
        this.f = vx1Var;
        this.b = a07Var;
        this.c = a07Var2;
        this.s = m8Var;
        this.d = lvaVar;
    }

    public /* synthetic */ c51(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.s = obj3;
        this.b = obj4;
        this.c = obj5;
        this.d = obj6;
    }
}
