package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cs3 implements dla {
    public final String a;
    public final m62 b;
    public final sv8 c;
    public final iw0 d;
    public List e;
    public List f;
    public int g;
    public int h;
    public final zb i;
    public bla j;
    public ArrayList k;
    public cla l;
    public final d6a m;
    public float n;
    public float o;
    public int p;
    public int q;
    public boolean r;
    public final se6 s;
    public int t;
    public boolean u;
    public final bbc v;
    public oq9 w;
    public String x;

    public cs3(String str, m62 m62Var, sv8 sv8Var) {
        str.getClass();
        this.a = str;
        this.b = m62Var;
        this.c = sv8Var;
        aj2 aj2Var = rw2.a;
        this.d = wx1.b(r76.a.f);
        this.h = -1;
        this.i = new zb();
        this.m = new d6a(new wr3(this, 0));
        this.n = 1.0f;
        this.o = 1.0f;
        mc8 mc8Var = k63.b;
        this.s = new se6(10);
        this.v = new bbc(this, 19);
        this.x = "";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object x(cs3 cs3Var, String str, hf1 hf1Var) {
        byte[] bArr;
        se6 se6Var = cs3Var.s;
        se6Var.getClass();
        Object obj = se6Var.a.get(str);
        Object obj2 = obj;
        if (obj == null) {
            xr3 xr3Var = new xr3();
            cs3Var.A(xr3Var, str);
            se6Var.a(str, xr3Var);
            obj2 = xr3Var;
        }
        xr3 xr3Var2 = (xr3) obj2;
        fr9 fr9Var = xr3Var2.a;
        if (xr3Var2.b && ((bArr = (byte[]) fr9Var.getValue()) == null || bArr.length == 0)) {
            cs3Var.A(xr3Var2, str);
        }
        return cx1.N(new u31(fr9Var, 2), hf1Var);
    }

    public static final void y(cs3 cs3Var) {
        if (cs3Var.k == null) {
            return;
        }
        if (cs3Var.p < r0.size() - 1) {
            cs3Var.p++;
            cs3Var.B();
        } else {
            bla blaVar = cs3Var.j;
            if (blaVar != null) {
                blaVar.a();
            }
        }
    }

    public final void A(xr3 xr3Var, String str) {
        aj2 aj2Var = rw2.a;
        ah1.J(this.d, nh2.c, null, new vg(xr3Var, this, str, (jt1) null, 12), 2);
    }

    public final void B() {
        oq9 oq9Var = this.w;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        aj2 aj2Var = rw2.a;
        this.w = ah1.J(this.d, nh2.c, null, new hf1(this, null), 2);
    }

    @Override // defpackage.dla
    public final heb a(wka wkaVar) {
        return heb.a;
    }

    @Override // defpackage.dla
    public final void b(int i) {
        this.h = i;
    }

    @Override // defpackage.dla
    public final Serializable c(jt1 jt1Var) {
        return z().c((kt1) jt1Var);
    }

    @Override // defpackage.dla
    public final void d(bla blaVar) {
        this.j = blaVar;
    }

    @Override // defpackage.dla
    public final void e(List list) {
        this.f = list;
    }

    @Override // defpackage.dla
    public final Object f(jt1 jt1Var) {
        if (this.k == null) {
            return Boolean.FALSE;
        }
        int i = this.p;
        if (i <= 0) {
            return Boolean.FALSE;
        }
        this.p = i - 1;
        B();
        return Boolean.TRUE;
    }

    @Override // defpackage.dla
    public final Object g(float f, kt1 kt1Var) {
        this.o = f;
        return heb.a;
    }

    @Override // defpackage.dla
    public final Serializable h(yka ykaVar, jt1 jt1Var) {
        return z().e(ykaVar.a, (kt1) jt1Var);
    }

    @Override // defpackage.dla
    public final Object i(float f, kt1 kt1Var) {
        this.n = f;
        return heb.a;
    }

    @Override // defpackage.dla
    public final void j(List list) {
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.dla
    public final Object k(kt1 kt1Var) {
        return z().b(kt1Var);
    }

    @Override // defpackage.dla
    public final Boolean l(l8b l8bVar) {
        return Boolean.valueOf(this.i.a());
    }

    @Override // defpackage.dla
    public final Object m(jt1 jt1Var) {
        return lc3.a;
    }

    @Override // defpackage.dla
    public final void n(int i) {
        this.g = i;
    }

    @Override // defpackage.dla
    public final Object o(jt1 jt1Var) {
        if (this.k == null) {
            return Boolean.FALSE;
        }
        if (this.p > r2.size() - 1) {
            return Boolean.FALSE;
        }
        this.p++;
        B();
        return Boolean.TRUE;
    }

    @Override // defpackage.dla
    public final Object p(float f, c9b c9bVar) {
        ArrayList arrayList = this.k;
        heb hebVar = heb.a;
        if (arrayList != null) {
            this.p = (int) (f * arrayList.size());
            B();
        }
        return hebVar;
    }

    @Override // defpackage.dla
    public final Object q(yka ykaVar, kt1 kt1Var) {
        return heb.a;
    }

    @Override // defpackage.dla
    public final heb r(a9b a9bVar) {
        boolean z = this.u;
        heb hebVar = heb.a;
        if (z) {
            B();
            return hebVar;
        }
        this.i.d();
        return hebVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.bs3
            if (r0 == 0) goto L13
            r0 = r6
            bs3 r0 = (defpackage.bs3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bs3 r0 = new bs3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.e11.e0(r6)
            goto L3d
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            r0.c = r4
            zb r6 = r5.i
            r6.e()
            xx1 r6 = defpackage.xx1.a
            if (r3 != r6) goto L3d
            return r6
        L3d:
            oq9 r5 = r5.w
            if (r5 == 0) goto L44
            r5.cancel(r2)
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs3.s(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r7, int r8, long r9, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs3.t(java.lang.String, int, long, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yr3
            if (r0 == 0) goto L13
            r0 = r6
            yr3 r0 = (defpackage.yr3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yr3 r0 = new yr3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 != r4) goto L28
            defpackage.e11.e0(r6)
            goto L3f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            r0.c = r4
            zb r6 = r5.i
            android.media.MediaPlayer r6 = r6.a
            r6.release()
            xx1 r6 = defpackage.xx1.a
            if (r3 != r6) goto L3f
            return r6
        L3f:
            qna r6 = r5.z()
            r6.getClass()
            oq9 r6 = r5.w
            if (r6 == 0) goto L4d
            r6.cancel(r2)
        L4d:
            iw0 r5 = r5.d
            defpackage.wx1.K(r5, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs3.u(kt1):java.lang.Object");
    }

    @Override // defpackage.dla
    public final Object v(cla claVar, kt1 kt1Var) {
        if (!lc5.Q(this.l, claVar)) {
            this.l = claVar;
            this.s.b();
        }
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r4 == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r4 == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.kt1 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.zr3
            if (r0 == 0) goto L13
            r0 = r10
            zr3 r0 = (defpackage.zr3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zr3 r0 = new zr3
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            heb r4 = defpackage.heb.a
            zb r5 = r9.i
            r6 = 0
            r7 = 1
            xx1 r8 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r7) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            defpackage.e11.e0(r10)
            goto L74
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r6
        L38:
            defpackage.e11.e0(r10)
            goto L68
        L3c:
            defpackage.e11.e0(r10)
            goto L50
        L40:
            defpackage.e11.e0(r10)
            r0.c = r7
            boolean r10 = r5.a()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            if (r10 != r8) goto L50
            goto L73
        L50:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6c
            r0.c = r3
            boolean r10 = r5.a()
            if (r10 == 0) goto L65
            android.media.MediaPlayer r10 = r5.a
            r10.pause()
        L65:
            if (r4 != r8) goto L68
            goto L73
        L68:
            r10 = 0
            r9.u = r10
            goto L7a
        L6c:
            r0.c = r2
            r5.e()
            if (r4 != r8) goto L74
        L73:
            return r8
        L74:
            r5.c = r6
            r5.b = r6
            r9.u = r7
        L7a:
            oq9 r9 = r9.w
            if (r9 == 0) goto L81
            r9.cancel(r6)
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs3.w(kt1):java.lang.Object");
    }

    public final qna z() {
        return (qna) this.m.getValue();
    }
}
