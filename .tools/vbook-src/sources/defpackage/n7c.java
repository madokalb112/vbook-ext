package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n7c {
    public final od2 a;
    public float b;
    public float c;
    public final cn7 d;
    public float e;
    public final fo2 f;
    public final zlb g;
    public final cn7 h;
    public final ym i;
    public final ym j;
    public final cn7 k;
    public final cn7 l;
    public final cn7 m;
    public final cn7 n;
    public final fo2 o;
    public yd5 p;
    public final cn7 q;

    public n7c(od2 od2Var, float f, float f2, float f3) {
        od2Var.getClass();
        this.a = od2Var;
        this.b = 1.0f;
        this.c = 4.0f;
        this.d = dk9.x((Object) null);
        this.e = 2.0f;
        this.f = dk9.n(new co6(this, 4));
        this.g = new zlb();
        this.h = dk9.x(Float.valueOf(f));
        this.i = lc5.a(f2, 0.5f);
        this.j = lc5.a(f3, 0.5f);
        this.k = dk9.x(new na5(0L));
        this.l = dk9.x(new fg9(0L));
        this.m = dk9.x(new ea5(0L));
        this.n = dk9.x(Float.valueOf(0.0f));
        this.o = dk9.n(new co6(this, 5));
        this.q = dk9.x(Boolean.FALSE);
    }

    public static Object a(n7c n7cVar, float f, long j, o1a o1aVar, int i) {
        if ((i & 2) != 0) {
            float fG = n7cVar.g();
            j = eb7.i(f, eb7.b(n7cVar.f(), (((long) Float.floatToRawIntBits(n7cVar.h())) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32)));
        }
        Object objA0 = wx1.a0(new i7c(n7cVar, f, ah1.W(0.0f, 0.0f, 7, null), j, null), o1aVar);
        return objA0 == xx1.a ? objA0 : heb.a;
    }

    public final long b(long j) {
        long j2 = sg9.j(sw1.l0(j()));
        float fG = g();
        return eb7.b(f(), eb7.g(eb7.h(j2, (((long) Float.floatToRawIntBits(h())) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32)), j));
    }

    public final Object c(o1a o1aVar) {
        Object objC = uj9.c(e(), e() < 0.0f ? -((int) (j() & 4294967295L)) : (int) (j() & 4294967295L), ah1.a0(500, 0, null, 6), new f7c(this, 0), o1aVar, 4);
        return objC == xx1.a ? objC : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r10, defpackage.kt1 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.j7c
            if (r0 == 0) goto L13
            r0 = r12
            j7c r0 = (defpackage.j7c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            j7c r0 = new j7c
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r6 = 0
            r8 = 1
            if (r1 == 0) goto L2e
            if (r1 != r8) goto L27
            defpackage.e11.e0(r12)
            r3 = r9
            goto L44
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.e11.e0(r12)
            f62 r2 = new f62
            r7 = 2
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r6, r7)
            r0.c = r8
            java.lang.Object r9 = defpackage.wx1.a0(r2, r0)
            xx1 r10 = defpackage.xx1.a
            if (r9 != r10) goto L44
            return r10
        L44:
            cn7 r9 = r3.q
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.setValue(r10)
            r3.p = r6
            heb r9 = defpackage.heb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7c.d(long, kt1):java.lang.Object");
    }

    public final float e() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final float f() {
        return ((Number) this.h.getValue()).floatValue();
    }

    public final float g() {
        return ((Number) this.i.d()).floatValue();
    }

    public final float h() {
        return ((Number) this.j.d()).floatValue();
    }

    public final long i() {
        return ((fg9) this.l.getValue()).a;
    }

    public final long j() {
        return ((na5) this.k.getValue()).a;
    }

    public final boolean k() {
        return f() > Math.max(this.b, ((ti7) this.d.getValue()) != null ? 1.0f : 0.0f) && f() <= this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r7.f(r0, r10) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r8, defpackage.kt1 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.l7c
            if (r0 == 0) goto L13
            r0 = r10
            l7c r0 = (defpackage.l7c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            l7c r0 = new l7c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.e11.e0(r10)
            goto L88
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L31:
            long r8 = r0.a
            defpackage.e11.e0(r10)
            goto L60
        L37:
            defpackage.e11.e0(r10)
            ym r10 = r7.i
            java.lang.Object r1 = r10.d()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r5 = 32
            long r5 = r8 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 + r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = r10.f(r0, r1)
            if (r10 != r4) goto L60
            goto L87
        L60:
            ym r7 = r7.j
            java.lang.Object r10 = r7.d()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r8
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r1)
            r0.a = r8
            r0.d = r2
            java.lang.Object r7 = r7.f(r0, r10)
            if (r7 != r4) goto L88
        L87:
            return r4
        L88:
            heb r7 = defpackage.heb.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7c.l(long, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        if (r18.j.f(r5, r6) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r19, long r21, float r23, defpackage.kt1 r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r23
            r4 = r24
            boolean r5 = r4 instanceof defpackage.m7c
            if (r5 == 0) goto L1b
            r5 = r4
            m7c r5 = (defpackage.m7c) r5
            int r6 = r5.s
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.s = r6
            goto L20
        L1b:
            m7c r5 = new m7c
            r5.<init>(r0, r4)
        L20:
            java.lang.Object r4 = r5.e
            int r6 = r5.s
            r7 = 2
            r8 = 1
            xx1 r9 = defpackage.xx1.a
            if (r6 == 0) goto L46
            if (r6 == r8) goto L3a
            if (r6 != r7) goto L33
            defpackage.e11.e0(r4)
            goto Lc1
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            r0 = 0
            return r0
        L3a:
            long r1 = r5.c
            float r3 = r5.d
            long r10 = r5.b
            long r12 = r5.a
            defpackage.e11.e0(r4)
            goto L9e
        L46:
            defpackage.e11.e0(r4)
            long r10 = eb7.g(r19, r21)
            long r10 = r0.b(r10)
            float r4 = r0.f()
            float r4 = r4 * r3
            r0.n(r4)
            float r4 = r0.f()
            long r10 = eb7.i(r4, r10)
            long r12 = r0.j()
            long r12 = sw1.l0(r12)
            long r12 = sg9.j(r12)
            long r10 = eb7.g(r10, r12)
            long r10 = eb7.h(r10, r1)
            r4 = 32
            long r12 = r10 >> r4
            int r4 = (int) r12
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
            r5.a = r1
            r12 = r21
            r5.b = r12
            r5.d = r3
            r5.c = r10
            r5.s = r8
            ym r4 = r0.i
            java.lang.Object r4 = r4.f(r5, r6)
            if (r4 != r9) goto L98
            goto Lc0
        L98:
            r16 = r12
            r12 = r1
            r1 = r10
            r10 = r16
        L9e:
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r1
            int r4 = (int) r14
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
            r5.a = r12
            r5.b = r10
            r5.d = r3
            r5.c = r1
            r5.s = r7
            ym r0 = r0.j
            java.lang.Object r0 = r0.f(r5, r6)
            if (r0 != r9) goto Lc1
        Lc0:
            return r9
        Lc1:
            heb r0 = defpackage.heb.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7c.m(long, long, float, kt1):java.lang.Object");
    }

    public final void n(float f) {
        this.h.setValue(Float.valueOf(wx1.P(f, this.b, this.c)));
        o();
    }

    public final void o() {
        if (fg9.a(i(), 0L)) {
            return;
        }
        float f = (f() * Float.intBitsToFloat((int) (i() >> 32))) - ((int) (j() >> 32));
        float f2 = (f() * Float.intBitsToFloat((int) (i() & 4294967295L))) - ((int) (j() & 4294967295L));
        this.m.setValue(new ea5((((long) t96.M(f2 / 2.0f)) & 4294967295L) | (((long) t96.M(f / 2.0f)) << 32)));
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f3 = f / 2.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f4 = f2 / 2.0f;
        this.i.h(Float.valueOf(-f3), Float.valueOf(f3));
        this.j.h(Float.valueOf(-f4), Float.valueOf(f4));
    }

    public final String toString() {
        return "ZoomableState(translateX=" + oh9.g(g()) + ", translateY=" + oh9.g(h()) + ", scale=" + oh9.g(f()) + ")";
    }
}
