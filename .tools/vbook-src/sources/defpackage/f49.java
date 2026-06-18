package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f49 implements AutoCloseable {
    public final String a;
    public final m62 b;
    public final sv8 c;
    public final e21 d;
    public final t07 e;
    public wa2 f;
    public a82 s;
    public lm9 t;

    public f49(String str, m62 m62Var, sv8 sv8Var, e21 e21Var) {
        str.getClass();
        this.a = str;
        this.b = m62Var;
        this.c = sv8Var;
        this.d = e21Var;
        this.e = u07.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lrb N(String str) {
        we5 we5VarJ;
        ArrayList arrayList = new ArrayList();
        mf5 mf5VarC = ue5.d.c(str);
        if (mf5VarC instanceof we5) {
            Iterator it = ((Iterable) mf5VarC).iterator();
            while (it.hasNext()) {
                prb prbVarP = P((mf5) it.next());
                if (prbVarP != null) {
                    arrayList.add(prbVarP);
                }
            }
        } else {
            we5 we5VarJ2 = null;
            if (mf5VarC instanceof fg5) {
                fg5 fg5Var = (fg5) mf5VarC;
                mf5 mf5Var = (mf5) fg5Var.get("tracks");
                if (mf5Var == null || (we5VarJ = i12.J(mf5Var)) == null) {
                    mf5 mf5Var2 = (mf5) fg5Var.get("data");
                    if (mf5Var2 != null) {
                        we5VarJ2 = i12.J(mf5Var2);
                    }
                } else {
                    we5VarJ2 = we5VarJ;
                }
                if (we5VarJ2 != null) {
                    Iterator it2 = we5VarJ2.a.iterator();
                    while (it2.hasNext()) {
                        prb prbVarP2 = P((mf5) it2.next());
                        if (prbVarP2 != null) {
                            arrayList.add(prbVarP2);
                        }
                    }
                } else {
                    prb prbVarP3 = P(mf5VarC);
                    if (prbVarP3 != null) {
                        arrayList.add(prbVarP3);
                    }
                }
            } else {
                if (!(mf5VarC instanceof jg5)) {
                    mn5.g();
                    return null;
                }
                String strG = i12.G(mf5VarC);
                if (strG != null) {
                    String str2 = bw9.a0(strG) ? null : strG;
                    if (str2 != null) {
                        arrayList.add(new prb(str2));
                    }
                }
            }
        }
        return new lrb(arrayList);
    }

    public static prb P(mf5 mf5Var) {
        String strG;
        String strG2;
        fg5 fg5VarK = i12.K(mf5Var);
        if (fg5VarK != null) {
            mf5 mf5Var2 = (mf5) fg5VarK.get("data");
            if (mf5Var2 == null || (strG = i12.G(mf5Var2)) == null) {
                mf5 mf5Var3 = (mf5) fg5VarK.get("url");
                strG = mf5Var3 != null ? i12.G(mf5Var3) : null;
                if (strG == null) {
                    mf5 mf5Var4 = (mf5) fg5VarK.get("link");
                    strG = mf5Var4 != null ? i12.G(mf5Var4) : null;
                }
            }
            if (strG != null && !bw9.a0(strG)) {
                mf5 mf5Var5 = (mf5) fg5VarK.get("title");
                if (mf5Var5 == null || (strG2 = i12.G(mf5Var5)) == null) {
                    mf5 mf5Var6 = (mf5) fg5VarK.get("name");
                    strG2 = mf5Var6 != null ? i12.G(mf5Var6) : null;
                    if (strG2 == null) {
                        mf5 mf5Var7 = (mf5) fg5VarK.get("label");
                        String strG3 = mf5Var7 != null ? i12.G(mf5Var7) : null;
                        strG2 = strG3 == null ? "" : strG3;
                    }
                }
                return new prb(strG2, strG);
            }
        } else {
            jg5 jg5Var = mf5Var instanceof jg5 ? (jg5) mf5Var : null;
            String strG4 = jg5Var != null ? i12.G(jg5Var) : null;
            if (strG4 != null && !bw9.a0(strG4)) {
                return new prb(strG4);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(int r11, java.lang.String r12, boolean r13, defpackage.kt1 r14) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f49.A(int, java.lang.String, boolean, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1 == r7) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.lang.String r19, defpackage.kt1 r20) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f49.E(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.b49
            if (r0 == 0) goto L13
            r0 = r5
            b49 r0 = (defpackage.b49) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            b49 r0 = new b49
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            t07 r5 = r4.e
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            wa2 r5 = r4.q()     // Catch: java.lang.Throwable -> L53
            lm9 r1 = r4.t     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L55
            lm9 r1 = new lm9     // Catch: java.lang.Throwable -> L53
            sv8 r2 = r4.c     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L53
            r4.t = r1     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L59
        L55:
            r0.q(r3)
            return r1
        L59:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f49.p(kt1):java.lang.Object");
    }

    public final wa2 q() throws ap3 {
        if (this.f == null) {
            m62 m62Var = this.b;
            b92 b92Var = m62Var.b;
            String str = this.a;
            a82 a82Var = (a82) b92Var.T(str).d();
            this.s = a82Var;
            wa2 wa2VarA = oo3.a(m62Var, a82Var.j, a82Var.l);
            this.f = wa2VarA;
            String str2 = wa2VarA.a;
            a82 a82Var2 = this.s;
            if (a82Var2 == null) {
                lc5.i0("book");
                throw null;
            }
            if (!lc5.Q(str2, a82Var2.l)) {
                wa2 wa2Var = this.f;
                String str3 = wa2Var != null ? wa2Var.a : null;
                String str4 = wa2Var != null ? wa2Var.b : null;
                if (str4 == null) {
                    str4 = "";
                }
                b92Var.p0(str3, str4, str);
            }
        }
        wa2 wa2Var2 = this.f;
        if (wa2Var2 != null) {
            return wa2Var2;
        }
        throw new ap3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r35, defpackage.kt1 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f49.w(boolean, kt1):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
