package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rj1 implements yb4, zb4, ac4, bc4, cc4, dc4, ec4, fc4, jb4, lb4, nb4, ob4, pb4, qb4, rb4, sb4, tb4, vb4, wb4 {
    public final int a;
    public final boolean b;
    public Object c;
    public ye8 d;
    public ArrayList e;

    public rj1(Object obj, boolean z, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final Object a(dd4 dd4Var, int i) {
        dd4Var.h0(this.a);
        m(dd4Var);
        int iQ = i | (dd4Var.f(this) ? jf0.q(2, 0) : jf0.q(1, 0));
        Object obj = this.c;
        obj.getClass();
        fw.F(2, obj);
        Object objInvoke = ((yb4) obj).invoke(dd4Var, Integer.valueOf(iQ));
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qj1(2, this, rj1.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object b(Object obj, dd4 dd4Var, int i) {
        dd4Var.h0(this.a);
        m(dd4Var);
        int iQ = dd4Var.f(this) ? jf0.q(2, 1) : jf0.q(1, 1);
        Object obj2 = this.c;
        obj2.getClass();
        fw.F(3, obj2);
        Object objC = ((zb4) obj2).c(obj, dd4Var, Integer.valueOf(iQ | i));
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6((Object) this, false, obj, i, 3);
        }
        return objC;
    }

    @Override // defpackage.zb4
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3) {
        return b(obj, (dd4) obj2, ((Number) obj3).intValue());
    }

    public final Object d(Object obj, Object obj2, dd4 dd4Var, int i) {
        dd4Var.h0(this.a);
        m(dd4Var);
        int iQ = dd4Var.f(this) ? jf0.q(2, 2) : jf0.q(1, 2);
        Object obj3 = this.c;
        obj3.getClass();
        fw.F(4, obj3);
        Object objG = ((ac4) obj3).g(obj, obj2, dd4Var, Integer.valueOf(iQ | i));
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(this, obj, obj2, i);
        }
        return objG;
    }

    public final Object f(Object obj, Object obj2, Object obj3, dd4 dd4Var, int i) {
        dd4Var.h0(this.a);
        m(dd4Var);
        int iQ = dd4Var.f(this) ? jf0.q(2, 3) : jf0.q(1, 3);
        Object obj4 = this.c;
        obj4.getClass();
        fw.F(5, obj4);
        Object objK = ((bc4) obj4).k(obj, obj2, obj3, dd4Var, Integer.valueOf(iQ | i));
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(this, obj, obj2, obj3, i, 1);
        }
        return objK;
    }

    @Override // defpackage.ac4
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (dd4) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.cc4
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return i(obj, obj2, obj3, obj4, (dd4) obj5, ((Number) obj6).intValue());
    }

    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, dd4 dd4Var, int i) {
        dd4Var.h0(this.a);
        m(dd4Var);
        int iQ = dd4Var.f(this) ? jf0.q(2, 4) : jf0.q(1, 4);
        Object obj5 = this.c;
        obj5.getClass();
        fw.F(6, obj5);
        Object objH = ((cc4) obj5).h(obj, obj2, obj3, obj4, dd4Var, Integer.valueOf(i | iQ));
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(this, obj, obj2, obj3, obj4, i, 1);
        }
        return objH;
    }

    @Override // defpackage.yb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((dd4) obj, ((Number) obj2).intValue());
    }

    @Override // defpackage.ec4
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Number number) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, (dd4) obj7, number.intValue());
    }

    @Override // defpackage.bc4
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (dd4) obj4, ((Number) obj5).intValue());
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, dd4 dd4Var, int i) {
        dd4Var.h0(this.a);
        m(dd4Var);
        int iQ = dd4Var.f(this) ? jf0.q(2, 6) : jf0.q(1, 6);
        Object obj7 = this.c;
        obj7.getClass();
        fw.F(8, obj7);
        Object objJ = ((ec4) obj7).j(obj, obj2, obj3, obj4, obj5, obj6, dd4Var, Integer.valueOf(i | iQ));
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(this, obj, obj2, obj3, obj4, obj5, obj6, i, 0);
        }
        return objJ;
    }

    public final void m(dd4 dd4Var) {
        ye8 ye8VarB;
        if (!this.b || (ye8VarB = dd4Var.B()) == null) {
            return;
        }
        ye8VarB.b |= 1;
        ye8 ye8Var = this.d;
        if (ye8Var == null || !ye8Var.a() || ye8Var == ye8VarB || lc5.Q(ye8Var.c, ye8VarB.c)) {
            this.d = ye8VarB;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(ye8VarB);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ye8 ye8Var2 = (ye8) arrayList.get(i);
            if (ye8Var2 == null || !ye8Var2.a() || ye8Var2 == ye8VarB || lc5.Q(ye8Var2.c, ye8VarB.c)) {
                arrayList.set(i, ye8VarB);
                return;
            }
        }
        arrayList.add(ye8VarB);
    }

    public final void n(ub4 ub4Var) {
        if (lc5.Q(this.c, ub4Var)) {
            return;
        }
        boolean z = this.c == null;
        this.c = ub4Var;
        if (z || !this.b) {
            return;
        }
        ye8 ye8Var = this.d;
        if (ye8Var != null) {
            ze8 ze8Var = ye8Var.a;
            if (ze8Var != null) {
                ze8Var.e(ye8Var, (Object) null);
            }
            this.d = null;
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ye8 ye8Var2 = (ye8) arrayList.get(i);
                ze8 ze8Var2 = ye8Var2.a;
                if (ze8Var2 != null) {
                    ze8Var2.e(ye8Var2, (Object) null);
                }
            }
            arrayList.clear();
        }
    }
}
