package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ym {
    public final s9b a;
    public final Object b;
    public final qo c;
    public final cn7 d;
    public final cn7 e;
    public Float f;
    public Float g;
    public final q07 h;
    public final kp9 i;
    public final vo j;
    public final vo k;
    public vo l;
    public vo m;

    public ym(Object obj, s9b s9bVar, Object obj2) {
        this.a = s9bVar;
        this.b = obj2;
        qo qoVar = new qo(s9bVar, obj, null, 60);
        this.c = qoVar;
        this.d = dk9.x(Boolean.FALSE);
        this.e = dk9.x(obj);
        this.h = new q07();
        this.i = new kp9(obj2, 3);
        vo voVar = qoVar.c;
        boolean z = voVar instanceof ro;
        ro roVar = z ? lc5.e : voVar instanceof so ? lc5.f : voVar instanceof to ? lc5.g : lc5.h;
        this.j = roVar;
        ro roVar2 = z ? lc5.a : voVar instanceof so ? lc5.b : voVar instanceof to ? lc5.c : lc5.d;
        this.k = roVar2;
        this.l = roVar;
        this.m = roVar2;
    }

    public static final void a(ym ymVar) {
        qo qoVar = ymVar.c;
        qoVar.c.d();
        qoVar.d = Long.MIN_VALUE;
        ymVar.d.setValue(Boolean.FALSE);
    }

    public static Object b(ym ymVar, Object obj, ko koVar, kb4 kb4Var, jt1 jt1Var, int i) {
        if ((i & 2) != 0) {
            koVar = ymVar.i;
        }
        ko koVar2 = koVar;
        Object objInvoke = ymVar.a.b.invoke(ymVar.c.c);
        if ((i & 8) != 0) {
            kb4Var = null;
        }
        kb4 kb4Var2 = kb4Var;
        Object objD = ymVar.d();
        s9b s9bVar = ymVar.a;
        return q07.a(ymVar.h, new vm(ymVar, objInvoke, new daa(koVar2, s9bVar, objD, obj, (vo) s9bVar.a.invoke(objInvoke)), ymVar.c.d, kb4Var2, (jt1) null), jt1Var);
    }

    public final Object c(Object obj) {
        if (!lc5.Q(this.l, this.j) || !lc5.Q(this.m, this.k)) {
            s9b s9bVar = this.a;
            vo voVar = (vo) s9bVar.a.invoke(obj);
            int iB = voVar.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (voVar.a(i) < this.l.a(i) || voVar.a(i) > this.m.a(i)) {
                    voVar.e(i, wx1.P(voVar.a(i), this.l.a(i), this.m.a(i)));
                    z = true;
                }
            }
            if (z) {
                return s9bVar.b.invoke(voVar);
            }
        }
        return obj;
    }

    public final Object d() {
        return this.c.b.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(jt1 jt1Var, Object obj) {
        Object objA = q07.a(this.h, new wm(this, obj, null, 0), jt1Var);
        return objA == xx1.a ? objA : heb.a;
    }

    public final Object g(kt1 kt1Var) {
        Object objA = q07.a(this.h, new xm(this, null, 0), kt1Var);
        return objA == xx1.a ? objA : heb.a;
    }

    public final void h(Float f, Float f2) {
        s9b s9bVar = this.a;
        vo voVar = (vo) s9bVar.a.invoke(f);
        if (voVar == null) {
            voVar = this.j;
        }
        vo voVar2 = (vo) s9bVar.a.invoke(f2);
        if (voVar2 == null) {
            voVar2 = this.k;
        }
        int iB = voVar.b();
        for (int i = 0; i < iB; i++) {
            if (voVar.a(i) > voVar2.a(i)) {
                f08.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + voVar + " is greater than upper bound " + voVar2 + " on index " + i);
            }
        }
        this.l = voVar;
        this.m = voVar2;
        this.g = f2;
        this.f = f;
        if (e()) {
            return;
        }
        Object objC = c(d());
        if (lc5.Q(objC, d())) {
            return;
        }
        this.c.b.setValue(objC);
    }

    public /* synthetic */ ym(Object obj, s9b s9bVar, Object obj2, int i) {
        this(obj, s9bVar, (i & 4) != 0 ? null : obj2);
    }
}
