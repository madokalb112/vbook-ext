package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ob {
    public final kb4 a;
    public final ib4 b;
    public final p9b c;
    public final kb4 d;
    public final sb5 e;
    public final nb f;
    public final cn7 g;
    public final fo2 h;
    public final fo2 i;
    public final ym7 j;
    public final ym7 k;
    public final cn7 l;
    public final cn7 m;
    public final jb n;

    public ob(kb4 kb4Var, ib4 ib4Var, p9b p9bVar, kb4 kb4Var2) {
        kb4Var2.getClass();
        this.a = kb4Var;
        this.b = ib4Var;
        this.c = p9bVar;
        this.d = kb4Var2;
        this.e = new sb5();
        this.f = new nb(this);
        this.g = dk9.x(lb9.a);
        this.h = dk9.n(new cb(this, 0));
        this.i = dk9.n(new cb(this, 1));
        this.j = new ym7(Float.NaN);
        dk9.o(new cb(this, 2), lr3.B);
        this.k = new ym7(0.0f);
        this.l = dk9.x((Object) null);
        this.m = dk9.x(new h86(mc3.a));
        this.n = new jb(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.j07 r9, defpackage.lb r10, defpackage.kt1 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.eb
            if (r0 == 0) goto L13
            r0 = r11
            eb r0 = (defpackage.eb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eb r0 = new eb
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            kb4 r2 = r8.d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            ym7 r6 = r8.j
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L2c
            goto L52
        L2c:
            r9 = move-exception
            goto L87
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r5
        L34:
            defpackage.e11.e0(r11)
            sb5 r11 = r8.e     // Catch: java.lang.Throwable -> L2c
            fb r1 = new fb     // Catch: java.lang.Throwable -> L2c
            r7 = 0
            r1.<init>(r8, r10, r5, r7)     // Catch: java.lang.Throwable -> L2c
            r0.c = r4     // Catch: java.lang.Throwable -> L2c
            r11.getClass()     // Catch: java.lang.Throwable -> L2c
            qt0 r10 = new qt0     // Catch: java.lang.Throwable -> L2c
            r10.<init>(r9, r11, r1, r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = defpackage.wx1.a0(r10, r0)     // Catch: java.lang.Throwable -> L2c
            xx1 r10 = defpackage.xx1.a
            if (r9 != r10) goto L52
            return r10
        L52:
            h86 r9 = r8.d()
            float r10 = r6.h()
            java.lang.Object r9 = r9.a(r10)
            if (r9 == 0) goto L84
            float r10 = r6.h()
            h86 r11 = r8.d()
            float r11 = r11.d(r9)
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L84
            java.lang.Object r10 = r2.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L84
            r8.g(r9)
        L84:
            heb r8 = defpackage.heb.a
            return r8
        L87:
            h86 r10 = r8.d()
            float r11 = r6.h()
            java.lang.Object r10 = r10.a(r11)
            if (r10 == 0) goto Lb9
            float r11 = r6.h()
            h86 r0 = r8.d()
            float r0 = r0.d(r10)
            float r11 = r11 - r0
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 > 0) goto Lb9
            java.lang.Object r11 = r2.invoke(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lb9
            r8.g(r10)
        Lb9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.a(j07, lb, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14, defpackage.j07 r15, defpackage.na r16, defpackage.kt1 r17) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob.b(java.lang.Object, j07, na, kt1):java.lang.Object");
    }

    public final Object c(float f, float f2, Object obj) {
        h86 h86VarD = d();
        float fD = h86VarD.d(obj);
        float fFloatValue = ((Number) this.b.invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            kb4 kb4Var = this.a;
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = h86VarD.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = h86VarD.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) kb4Var.invoke(Float.valueOf(Math.abs(h86VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = h86VarD.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = h86VarD.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) kb4Var.invoke(Float.valueOf(Math.abs(fD - h86VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final h86 d() {
        return (h86) this.m.getValue();
    }

    public final float e(float f) {
        Float fValueOf;
        ym7 ym7Var = this.j;
        float fH = (Float.isNaN(ym7Var.h()) ? 0.0f : ym7Var.h()) + f;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return wx1.P(fH, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        ym7 ym7Var = this.j;
        if (!Float.isNaN(ym7Var.h())) {
            return ym7Var.h();
        }
        gp.j("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }
}
