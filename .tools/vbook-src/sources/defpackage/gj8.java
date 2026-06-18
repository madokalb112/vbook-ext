package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gj8 {
    public final hp5 a;
    public final vx1 b;
    public final a07 c;
    public final float d;
    public final o e;
    public final by8 f;
    public final nw8 g;
    public final zm5 h;
    public final yb4 i;
    public final t07 j;
    public final cn7 k;
    public final fo2 l;
    public final cn7 m;
    public final cn7 n;
    public final cn7 o;
    public final cn7 p;
    public long q;
    public final HashSet r;
    public final cn7 s;
    public final ym t;
    public final pp1 u;

    public gj8(hp5 hp5Var, vx1 vx1Var, a07 a07Var, float f, o oVar, by8 by8Var, nw8 nw8Var, zm5 zm5Var, yb4 yb4Var, int i) {
        nw8Var = (i & 64) != 0 ? nw8.a : nw8Var;
        yb4Var = (i & 512) != 0 ? v05.J : yb4Var;
        this.a = hp5Var;
        this.b = vx1Var;
        this.c = a07Var;
        this.d = f;
        this.e = oVar;
        this.f = by8Var;
        this.g = nw8Var;
        this.h = zm5Var;
        this.i = yb4Var;
        this.j = u07.a();
        this.k = dk9.x((Object) null);
        this.l = dk9.n(new zi8(this, 0));
        this.m = dk9.x(new eb7(0L));
        this.n = dk9.x(new ea5(0L));
        this.o = dk9.x((Object) null);
        this.p = dk9.x((Object) null);
        this.q = 0L;
        this.r = new HashSet();
        this.s = dk9.x((Object) null);
        this.t = new ym(new eb7(0L), ah1.y0, null, 12);
        this.u = dk9.C(new zi8(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d0, code lost:
    
        if (r12.getIndex() > r1.getIndex()) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e1, code lost:
    
        if (r12.getIndex() < r1.getIndex()) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e3, code lost:
    
        r0 = defpackage.ah1.J(r9.b, null, null, new defpackage.bj8(r9, r1, r12, r10, 0), 3);
        r15.q(null);
        r2.a = null;
        r2.b = null;
        r2.e = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0201, code lost:
    
        if (r0.join(r2) != r8) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0204, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        r15.q(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0208, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r1.getIndex() == r11.getIndex()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r1.getIndex() == r3.e()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r15.q(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.gj8 r19, defpackage.vx8 r20, defpackage.kt1 r21) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj8.a(gj8, vx8, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0191, code lost:
    
        if (defpackage.zib.o(1000, r1, r2) != r10) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003d, B:65:0x0194, B:22:0x0055, B:58:0x0125, B:60:0x012f, B:62:0x0175, B:61:0x016c, B:25:0x0066, B:54:0x00f3), top: B:74:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003d, B:65:0x0194, B:22:0x0055, B:58:0x0125, B:60:0x012f, B:62:0x0175, B:61:0x016c, B:25:0x0066, B:54:0x00f3), top: B:74:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [r07] */
    /* JADX WARN: Type inference failed for: r3v2, types: [r07] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.gj8 r16, defpackage.fp5 r17, defpackage.fp5 r18, defpackage.kt1 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj8.b(gj8, fp5, fp5, kt1):java.lang.Object");
    }

    public static fp5 c(gj8 gj8Var, kf8 kf8Var, List list, vx8 vx8Var, ej8 ej8Var, int i) {
        if ((i & 4) != 0) {
            vx8Var = vx8.b;
        }
        if ((i & 8) != 0) {
            ej8Var = td3.O;
        }
        gj8Var.getClass();
        cm cmVar = new cm(9, gj8Var, kf8Var, ej8Var);
        int iOrdinal = vx8Var.ordinal();
        Object obj = null;
        if (iOrdinal == 0) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object objPrevious = listIterator.previous();
                if (((Boolean) cmVar.invoke(objPrevious)).booleanValue()) {
                    obj = objPrevious;
                    break;
                }
            }
            return (fp5) obj;
        }
        if (iOrdinal != 1) {
            mn5.g();
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Boolean) cmVar.invoke(next)).booleanValue()) {
                obj = next;
                break;
            }
        }
        return (fp5) obj;
    }

    public final fp5 d() {
        Object value = this.k.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        ArrayList arrayListG = this.a.c().G();
        int size = arrayListG.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj2 = arrayListG.get(i);
            i++;
            if (lc5.Q(((fp5) obj2).getKey(), value)) {
                obj = obj2;
                break;
            }
        }
        return (fp5) obj;
    }

    public final long e() {
        long jB;
        fp5 fp5VarD = d();
        if (fp5VarD == null) {
            return 0L;
        }
        int index = fp5VarD.getIndex();
        cn7 cn7Var = this.o;
        Integer num = (Integer) cn7Var.getValue();
        cn7 cn7Var2 = this.p;
        if (num == null || index != num.intValue() || ((Integer) cn7Var.getValue()) == null) {
            cn7Var.setValue((Object) null);
            cn7Var2.setValue((Object) null);
            jB = fp5VarD.b();
        } else {
            ea5 ea5Var = (ea5) cn7Var2.getValue();
            jB = ea5Var != null ? ea5Var.a : fp5VarD.b();
        }
        long j = ((eb7) this.m.getValue()).a;
        long j2 = ((ea5) this.n.getValue()).a;
        long jH = h(eb7.g(qu1.j((int) (j2 >> 32), (int) (j2 & 4294967295L)), qu1.j((int) (jB >> 32), (int) (jB & 4294967295L))));
        i(jH);
        return eb7.h(j, jH);
    }

    public final lh7 f() {
        return this.a.c().r();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r9, long r10, defpackage.kt1 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.fj8
            if (r0 == 0) goto L13
            r0 = r12
            fj8 r0 = (defpackage.fj8) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            fj8 r0 = new fj8
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.e
            int r1 = r0.s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L31
            long r10 = r0.d
            fp5 r8 = r0.c
            java.lang.Object r9 = r0.b
            gj8 r0 = r0.a
            defpackage.e11.e0(r12)
            r1 = r8
            r8 = r0
            goto La4
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r2
        L37:
            defpackage.e11.e0(r12)
            hp5 r12 = r8.a
            gp5 r1 = r12.c()
            java.util.ArrayList r1 = r1.G()
            int r4 = r1.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5f
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            r7 = r6
            fp5 r7 = (defpackage.fp5) r7
            java.lang.Object r7 = r7.getKey()
            boolean r7 = defpackage.lc5.Q(r7, r9)
            if (r7 == 0) goto L49
            goto L60
        L5f:
            r6 = r2
        L60:
            r1 = r6
            fp5 r1 = (defpackage.fp5) r1
            if (r1 == 0) goto Lb9
            long r4 = r1.b()
            lh7 r6 = r8.f()
            r6.getClass()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L81
            if (r6 != r3) goto L7d
            r6 = 32
            long r4 = r4 >> r6
        L7b:
            int r4 = (int) r4
            goto L88
        L7d:
            defpackage.mn5.g()
            return r2
        L81:
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            goto L7b
        L88:
            if (r4 >= 0) goto La4
            float r4 = (float) r4
            r5 = 7
            r6 = 0
            kp9 r2 = defpackage.ah1.W(r6, r6, r5, r2)
            r0.a = r8
            r0.b = r9
            r0.c = r1
            r0.d = r10
            r0.s = r3
            java.lang.Object r12 = r12.b(r4, r2, r0)
            xx1 r0 = defpackage.xx1.a
            if (r12 != r0) goto La4
            return r0
        La4:
            cn7 r12 = r8.k
            r12.setValue(r9)
            long r0 = r1.b()
            cn7 r9 = r8.n
            ea5 r12 = new ea5
            r12.<init>(r0)
            r9.setValue(r12)
            r8.q = r10
        Lb9:
            heb r8 = defpackage.heb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj8.g(java.lang.Object, long, kt1):java.lang.Object");
    }

    public final long h(long j) {
        boolean zF = this.a.c().f();
        if (zF) {
            j = uj9.t(j, f());
        } else if (zF) {
            mn5.g();
            return 0L;
        }
        int iOrdinal = f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                mn5.g();
                return 0L;
            }
            int iOrdinal2 = this.h.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return uj9.t(j, lh7.b);
                }
                mn5.g();
                return 0L;
            }
        }
        return j;
    }

    public final long i(long j) {
        int iOrdinal = this.h.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return j;
        }
        mn5.g();
        return 0L;
    }
}
