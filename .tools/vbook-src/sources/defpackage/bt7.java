package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class bt7 {
    public final ArrayList a;
    public int b;
    public boolean c;
    public uf4 d;
    private volatile /* synthetic */ Object interceptors$delegate;

    public bt7(uf4... uf4VarArr) {
        kc5.c();
        this.a = gc1.a0(Arrays.copyOf(uf4VarArr, uf4VarArr.length));
        this.interceptors$delegate = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, java.lang.Object r14, defpackage.kt1 r15) {
        /*
            r12 = this;
            jx1 r0 = r15.getContext()
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            if (r1 != 0) goto L94
            int r1 = r12.b
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L1b
            lc3 r1 = defpackage.lc3.a
            r12.interceptors$delegate = r1
            r12.c = r3
            r12.d = r4
            goto L94
        L1b:
            java.util.ArrayList r5 = r12.a
            if (r1 != r2) goto L4f
            int r1 = defpackage.gc1.S(r5)
            if (r1 < 0) goto L4f
            r6 = r3
        L26:
            java.lang.Object r7 = r5.get(r6)
            boolean r8 = r7 instanceof defpackage.es7
            if (r8 == 0) goto L31
            es7 r7 = (defpackage.es7) r7
            goto L32
        L31:
            r7 = r4
        L32:
            if (r7 != 0) goto L35
            goto L4a
        L35:
            java.util.List r8 = r7.c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            java.util.List r1 = r7.c
            r7.d = r2
            r12.interceptors$delegate = r1
            r12.c = r3
            uf4 r1 = r7.a
            r12.d = r1
            goto L94
        L4a:
            if (r6 == r1) goto L4f
            int r6 = r6 + 1
            goto L26
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r6 = defpackage.gc1.S(r5)
            if (r6 < 0) goto L8e
            r7 = r3
        L5b:
            java.lang.Object r8 = r5.get(r7)
            boolean r9 = r8 instanceof defpackage.es7
            if (r9 == 0) goto L66
            es7 r8 = (defpackage.es7) r8
            goto L67
        L66:
            r8 = r4
        L67:
            if (r8 != 0) goto L6a
            goto L89
        L6a:
            java.util.List r8 = r8.c
            int r9 = r1.size()
            int r10 = r8.size()
            int r10 = r10 + r9
            r1.ensureCapacity(r10)
            int r9 = r8.size()
            r10 = r3
        L7d:
            if (r10 >= r9) goto L89
            java.lang.Object r11 = r8.get(r10)
            r1.add(r11)
            int r10 = r10 + 1
            goto L7d
        L89:
            if (r7 == r6) goto L8e
            int r7 = r7 + 1
            goto L5b
        L8e:
            r12.interceptors$delegate = r1
            r12.c = r3
            r12.d = r4
        L94:
            r12.c = r2
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            boolean r12 = r12.d()
            r13.getClass()
            r14.getClass()
            r0.getClass()
            boolean r2 = defpackage.dt7.a
            if (r2 != 0) goto Lb7
            if (r12 == 0) goto Lb1
            goto Lb7
        Lb1:
            n1a r12 = new n1a
            r12.<init>(r14, r13, r1)
            goto Lbc
        Lb7:
            ld2 r12 = new ld2
            r12.<init>(r13, r1, r14, r0)
        Lbc:
            java.lang.Object r12 = r12.a(r14, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt7.a(java.lang.Object, java.lang.Object, kt1):java.lang.Object");
    }

    public final es7 b(uf4 uf4Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == uf4Var) {
                es7 es7Var = new es7(uf4Var, gt7.a);
                arrayList.set(i, es7Var);
                return es7Var;
            }
            if (obj instanceof es7) {
                es7 es7Var2 = (es7) obj;
                if (es7Var2.a == uf4Var) {
                    return es7Var2;
                }
            }
        }
        return null;
    }

    public final int c(uf4 uf4Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == uf4Var || ((obj instanceof es7) && ((es7) obj).a == uf4Var)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(uf4 uf4Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == uf4Var) {
                return true;
            }
            if ((obj instanceof es7) && ((es7) obj).a == uf4Var) {
                return true;
            }
        }
        return false;
    }

    public final void f(uf4 uf4Var, uf4 uf4Var2) {
        qx1 qx1Var;
        uf4 uf4Var3;
        uf4Var.getClass();
        uf4Var2.getClass();
        if (e(uf4Var2)) {
            return;
        }
        int iC = c(uf4Var);
        if (iC == -1) {
            throw new v0("Phase " + uf4Var + " was not registered for this pipeline", 3);
        }
        int i = iC + 1;
        ArrayList arrayList = this.a;
        int iS = gc1.S(arrayList);
        if (i <= iS) {
            while (true) {
                Object obj = arrayList.get(i);
                es7 es7Var = obj instanceof es7 ? (es7) obj : null;
                if (es7Var != null && (qx1Var = es7Var.b) != null) {
                    et7 et7Var = qx1Var instanceof et7 ? (et7) qx1Var : null;
                    if (et7Var != null && (uf4Var3 = et7Var.a) != null && uf4Var3 == uf4Var) {
                        iC = i;
                    }
                    if (i == iS) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iC + 1, new es7(uf4Var2, new et7(uf4Var)));
    }

    public final void g(uf4 uf4Var, zb4 zb4Var) {
        uf4Var.getClass();
        es7 es7VarB = b(uf4Var);
        if (es7VarB == null) {
            throw new v0("Phase " + uf4Var + " was not registered for this pipeline", 3);
        }
        List list = (List) this.interceptors$delegate;
        if (!this.a.isEmpty() && list != null && !this.c && (!(list instanceof fi5) || (list instanceof hi5))) {
            if (lc5.Q(this.d, uf4Var)) {
                list.add(zb4Var);
            } else if (uf4Var == fc1.E0(this.a) || c(uf4Var) == gc1.S(this.a)) {
                es7 es7VarB2 = b(uf4Var);
                es7VarB2.getClass();
                if (es7VarB2.d) {
                    es7VarB2.c = fc1.b1(es7VarB2.c);
                    es7VarB2.d = false;
                }
                es7VarB2.c.add(zb4Var);
                list.add(zb4Var);
            }
            this.b++;
            return;
        }
        if (es7VarB.d) {
            es7VarB.c = fc1.b1(es7VarB.c);
            es7VarB.d = false;
        }
        es7VarB.c.add(zb4Var);
        this.b++;
        this.interceptors$delegate = null;
        this.c = false;
        this.d = null;
    }
}
