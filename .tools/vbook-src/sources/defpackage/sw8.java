package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class sw8 {
    public final cn7 a;
    public vx1 b;
    public float c;
    public float d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public tc h;
    public tc i;
    public tc j;
    public final cn7 k;
    public final cn7 l;
    public dk7 m;
    public final float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public bi1 t;

    public sw8(st5 st5Var) {
        st5Var.getClass();
        this.a = dk9.x(st5Var);
        Float fValueOf = Float.valueOf(0.0f);
        this.e = dk9.x(fValueOf);
        this.f = dk9.x(fValueOf);
        this.g = dk9.x(new na5(0L));
        dk7 dk7Var = dk7.a;
        this.k = dk9.x(dk7Var);
        this.l = dk9.x((Object) null);
        this.m = dk7Var;
        this.n = 8.0f;
        this.o = -1.0f;
        this.p = -1.0f;
        this.q = -1;
        this.r = -1;
        this.s = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jt1 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.rw8
            if (r0 == 0) goto L13
            r0 = r8
            rw8 r0 = (defpackage.rw8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rw8 r0 = new rw8
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            cn7 r2 = r7.l
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.e11.e0(r8)
            goto L71
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r4
        L2e:
            defpackage.e11.e0(r8)
            bi1 r8 = defpackage.p7c.d()
            r7.t = r8
            r8 = 0
            r7.q = r8
            boolean r1 = r7.g()
            r5 = -1
            if (r1 == 0) goto L43
            r1 = r8
            goto L44
        L43:
            r1 = r5
        L44:
            r7.s = r1
            boolean r1 = r7.h()
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r8 = r5
        L4e:
            r7.r = r8
            qa1 r8 = defpackage.r95.a
            p95 r8 = r8.k()
            long r5 = r8.c()
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r2.setValue(r8)
            bi1 r8 = r7.t
            if (r8 == 0) goto L73
            r0.c = r3
            java.lang.Object r8 = r8.o(r0)
            xx1 r0 = defpackage.xx1.a
            if (r8 != r0) goto L71
            return r0
        L71:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L73:
            r2.setValue(r4)
            r7.t = r4
            heb r7 = defpackage.heb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.a(jt1):java.lang.Object");
    }

    public abstract void b(float f, float f2);

    public abstract void c();

    public final int d() {
        return i().h();
    }

    public final float e() {
        return ((Number) this.e.getValue()).floatValue();
    }

    public final dk7 f() {
        return (dk7) this.k.getValue();
    }

    public boolean g() {
        ot5 ot5Var = (ot5) fc1.F0(i().j().k);
        return ot5Var != null && ot5Var.a < i().j().n - 1;
    }

    public boolean h() {
        ot5 ot5Var = (ot5) fc1.z0(i().j().k);
        return ot5Var != null && ot5Var.a > 0;
    }

    public final st5 i() {
        return (st5) this.a.getValue();
    }

    public final long j() {
        return ((na5) this.g.getValue()).a;
    }

    public abstract boolean k();

    public abstract heb l(boolean z, eb7 eb7Var);

    public abstract heb m(boolean z, eb7 eb7Var);

    public final void n(float f) {
        this.e.setValue(Float.valueOf(f));
    }

    public final void o(float f) {
        this.f.setValue(Float.valueOf(f));
    }

    public abstract void p(float f, float f2);
}
