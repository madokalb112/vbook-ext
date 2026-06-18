package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tg5 {
    public int a;
    public final boolean b;
    public final boolean c;
    public final Object d;

    public tg5(cf5 cf5Var, l1 l1Var) {
        this.d = l1Var;
        this.b = cf5Var.c;
        this.c = cf5Var.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.tg5 r10, defpackage.je2 r11, defpackage.vc0 r12) {
        /*
            java.lang.Object r0 = r10.d
            l1 r0 = (defpackage.l1) r0
            boolean r1 = r12 instanceof defpackage.sg5
            if (r1 == 0) goto L17
            r1 = r12
            sg5 r1 = (defpackage.sg5) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.t = r2
            goto L1c
        L17:
            sg5 r1 = new sg5
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.f
            int r2 = r1.t
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 != r8) goto L56
            int r10 = r1.e
            java.lang.String r11 = r1.d
            java.util.LinkedHashMap r0 = r1.c
            tg5 r2 = r1.b
            je2 r9 = r1.a
            defpackage.e11.e0(r12)
            mf5 r12 = (defpackage.mf5) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.d
            l1 r11 = (defpackage.l1) r11
            byte r11 = r11.h()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto La0
        L49:
            java.lang.Object r10 = r2.d
            l1 r10 = (defpackage.l1) r10
            java.lang.String r11 = "Expected end of the object or comma"
            defpackage.l1.s(r10, r11, r5, r3, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L70
        L56:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r3
        L5c:
            defpackage.e11.e0(r12)
            byte r12 = r0.i(r4)
            byte r2 = r0.x()
            if (r2 == r7) goto Lc0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L70:
            java.lang.Object r12 = r10.d
            l1 r12 = (defpackage.l1) r12
            boolean r2 = r12.e()
            if (r2 == 0) goto L9f
            boolean r11 = r10.b
            if (r11 == 0) goto L83
            java.lang.String r11 = r12.n()
            goto L87
        L83:
            java.lang.String r11 = r12.l()
        L87:
            r2 = 5
            r12.i(r2)
            r1.a = r9
            r1.b = r10
            r1.c = r0
            r1.d = r11
            r1.e = r5
            r1.t = r8
            r9.getClass()
            r9.b = r1
            xx1 r10 = defpackage.xx1.a
            return r10
        L9f:
            r2 = r10
        La0:
            java.lang.Object r10 = r2.d
            l1 r10 = (defpackage.l1) r10
            if (r11 != r4) goto Laa
            r10.i(r6)
            goto Lba
        Laa:
            if (r11 != r7) goto Lba
            boolean r11 = r2.c
            if (r11 == 0) goto Lb4
            r10.i(r6)
            goto Lba
        Lb4:
            java.lang.String r11 = "object"
            defpackage.ny1.O(r10, r11)
            throw r3
        Lba:
            fg5 r10 = new fg5
            r10.<init>(r0)
            return r10
        Lc0:
            java.lang.String r10 = "Unexpected leading comma"
            defpackage.l1.s(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg5.a(tg5, je2, vc0):java.lang.Object");
    }

    public mf5 b() {
        mf5 fg5Var;
        Object obj;
        l1 l1Var = (l1) this.d;
        byte bX = l1Var.x();
        if (bX == 1) {
            return d(true);
        }
        if (bX == 0) {
            return d(false);
        }
        if (bX != 6) {
            if (bX == 8) {
                return c();
            }
            l1.s(l1Var, "Cannot read Json element because of unexpected ".concat(kc5.N(bX)), 0, null, 6);
            throw null;
        }
        int i = this.a + 1;
        this.a = i;
        if (i == 200) {
            rg5 rg5Var = new rg5(this, null);
            je2 je2Var = new je2();
            je2Var.a = rg5Var;
            je2Var.b = je2Var;
            xx1 xx1Var = vm7.s;
            je2Var.c = xx1Var;
            while (true) {
                obj = je2Var.c;
                jt1 jt1Var = je2Var.b;
                if (jt1Var == null) {
                    break;
                }
                if (lc5.Q(xx1Var, obj)) {
                    try {
                        rg5 rg5Var2 = je2Var.a;
                        fw.F(3, rg5Var2);
                        rg5 rg5Var3 = new rg5(rg5Var2.d, jt1Var);
                        rg5Var3.c = je2Var;
                        Object objInvokeSuspend = rg5Var3.invokeSuspend(heb.a);
                        if (objInvokeSuspend != xx1.a) {
                            jt1Var.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        jt1Var.resumeWith(new pm8(th));
                    }
                } else {
                    je2Var.c = xx1Var;
                    jt1Var.resumeWith(obj);
                }
            }
            e11.e0(obj);
            fg5Var = (mf5) obj;
        } else {
            byte bI = l1Var.i((byte) 6);
            if (l1Var.x() == 4) {
                l1.s(l1Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!l1Var.e()) {
                    break;
                }
                String strN = this.b ? l1Var.n() : l1Var.l();
                l1Var.i((byte) 5);
                linkedHashMap.put(strN, b());
                bI = l1Var.h();
                if (bI != 4) {
                    if (bI != 7) {
                        l1.s(l1Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bI == 6) {
                l1Var.i((byte) 7);
            } else if (bI == 4) {
                if (!this.c) {
                    ny1.O(l1Var, "object");
                    throw null;
                }
                l1Var.i((byte) 7);
            }
            fg5Var = new fg5(linkedHashMap);
        }
        this.a--;
        return fg5Var;
    }

    public we5 c() {
        l1 l1Var = (l1) this.d;
        byte bH = l1Var.h();
        if (l1Var.x() == 4) {
            l1.s(l1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (l1Var.e()) {
            arrayList.add(b());
            bH = l1Var.h();
            if (bH != 4) {
                boolean z = bH == 9;
                int i = l1Var.b;
                if (!z) {
                    l1.s(l1Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bH == 8) {
            l1Var.i((byte) 9);
        } else if (bH == 4) {
            if (!this.c) {
                ny1.O(l1Var, "array");
                throw null;
            }
            l1Var.i((byte) 9);
        }
        return new we5(arrayList);
    }

    public jg5 d(boolean z) {
        l1 l1Var = (l1) this.d;
        String strN = (this.b || !z) ? l1Var.n() : l1Var.l();
        return (z || !lc5.Q(strN, "null")) ? new yf5(strN, z) : cg5.INSTANCE;
    }

    public void e(String str) {
        ((jgc) this.d).Q(this.a, this.b, this.c, str, (Object) null, (Object) null, (Object) null);
    }

    public void f(Object obj, String str) {
        ((jgc) this.d).Q(this.a, this.b, this.c, str, obj, (Object) null, (Object) null);
    }

    public void g(Object obj, Object obj2, String str) {
        ((jgc) this.d).Q(this.a, this.b, this.c, str, obj, obj2, (Object) null);
    }

    public void h(String str, Object obj, Object obj2, Object obj3) {
        ((jgc) this.d).Q(this.a, this.b, this.c, str, obj, obj2, obj3);
    }

    public tg5(jgc jgcVar, int i, boolean z, boolean z2) {
        this.d = jgcVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }
}
