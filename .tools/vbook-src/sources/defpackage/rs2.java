package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rs2 {
    public final x78 a;
    public final m62 b;
    public final t07 c = u07.a();
    public final d6a d = new d6a(new bs2(0));
    public ld4 e;

    public rs2(x78 x78Var, m62 m62Var) {
        this.a = x78Var;
        this.b = m62Var;
    }

    public static final t6b a(rs2 rs2Var, List list) {
        t6b t6bVar = new t6b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dc2 dc2Var = (dc2) it.next();
            if (dc2Var.f == 1) {
                t6bVar.a(dc2Var.c, dc2Var.d);
            }
        }
        return t6bVar;
    }

    public static zn7 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return zn7.f(qu1.d0(gx3.a), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n78 e(String str, Map map) throws Throwable {
        List listR0 = fc1.R0(new k54(21), map.entrySet());
        int size = map.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Map.Entry) listR0.get(i)).getKey();
        }
        int size2 = map.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((Map.Entry) listR0.get(i2)).getValue();
        }
        oh5 oh5Var = gx3.a;
        zn7 zn7VarF = zn7.f(qu1.d0(oh5Var), "dictionary");
        oh5Var.N(zn7VarF);
        zn7 zn7VarF2 = zn7.f(zn7VarF, str);
        oh5Var.R(zn7VarF2, false);
        he8 he8Var = new he8(oh5Var.O0(zn7VarF2, false));
        try {
            he8Var.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                if (i3 != 0) {
                    he8Var.d0("\n");
                }
                he8Var.d0(strArr2[i3]);
            }
            for (int i4 = 0; i4 < size; i4++) {
                he8Var.d0("\n");
                he8Var.d0(strArr[i4]);
            }
            try {
                he8Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                he8Var.close();
            } catch (Throwable th3) {
                i12.r(th, th3);
            }
        }
        if (th == null) {
            return new n78("dictionary/".concat(str), listR0.size());
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n78 f(String str, Map map) throws Throwable {
        List listR0 = fc1.R0(new k54(22), map.entrySet());
        int size = map.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((Map.Entry) listR0.get(i)).getKey();
        }
        int size2 = map.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((Map.Entry) listR0.get(i2)).getValue();
        }
        b03 b03Var = new b03(strArr);
        b03Var.a();
        oh5 oh5Var = gx3.a;
        zn7 zn7VarF = zn7.f(qu1.d0(oh5Var), "dictionary");
        oh5Var.N(zn7VarF);
        zn7 zn7VarF2 = zn7.f(zn7VarF, str);
        oh5Var.R(zn7VarF2, false);
        he8 he8Var = new he8(oh5Var.O0(zn7VarF2, false));
        try {
            int[] iArr = b03Var.c;
            he8Var.writeInt(iArr.length);
            for (int i3 : iArr) {
                he8Var.writeInt(i3);
            }
            int[] iArr2 = b03Var.b;
            he8Var.writeInt(iArr2.length);
            for (int i4 : iArr2) {
                he8Var.writeInt(i4);
            }
            he8Var.writeInt(size2);
            for (int i5 = 0; i5 < size2; i5++) {
                if (i5 != 0) {
                    he8Var.d0("\n");
                }
                he8Var.d0(strArr2[i5]);
            }
            for (int i6 = 0; i6 < size; i6++) {
                if (i6 != 0) {
                    he8Var.d0("\n");
                }
                he8Var.d0(strArr[i6]);
            }
            try {
                he8Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                he8Var.close();
            } catch (Throwable th3) {
                i12.r(th, th3);
            }
        }
        if (th == null) {
            return new n78("dictionary/".concat(str), listR0.size());
        }
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static Object j(zn7 zn7Var) {
        ?? r1;
        if (zn7Var == null || !gx3.a.e0(zn7Var)) {
            return mc3.a;
        }
        ie8 ie8Var = new ie8(tu1.k0(zn7Var.toFile()));
        LinkedHashMap th = null;
        try {
            int i = ie8Var.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                String strP = ie8Var.P();
                strP.getClass();
                arrayList.add(strP);
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                String strP2 = ie8Var.P();
                strP2.getClass();
                arrayList2.add(strP2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                linkedHashMap.put(arrayList2.get(i4), arrayList.get(i4));
            }
            try {
                ie8Var.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r1 = th;
            th = linkedHashMap;
        } catch (Throwable th3) {
            try {
                ie8Var.close();
                r1 = th3;
            } catch (Throwable th4) {
                i12.r(th3, th4);
                r1 = th3;
            }
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }

    public static t6b k(List list) {
        t6b t6bVar = new t6b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dc2 dc2Var = (dc2) it.next();
            if (dc2Var.f == 0) {
                t6bVar.a(dc2Var.c, dc2Var.d);
            }
        }
        return t6bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static e03 l(zn7 zn7Var) {
        ?? r0;
        if (zn7Var == null || !gx3.a.e0(zn7Var)) {
            return new e03(new d03(new int[0], new int[0], 0), new String[0]);
        }
        ie8 ie8Var = new ie8(tu1.k0(zn7Var.toFile()));
        e03 th = null;
        try {
            int i = ie8Var.readInt();
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                iArr[i2] = ie8Var.readInt();
            }
            int i3 = ie8Var.readInt();
            int[] iArr2 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr2[i4] = ie8Var.readInt();
            }
            int i5 = ie8Var.readInt();
            String[] strArr = new String[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                strArr[i6] = null;
            }
            for (int i7 = 0; i7 < i5; i7++) {
                strArr[i7] = ie8Var.P();
            }
            e03 e03Var = new e03(new d03(iArr2, iArr, i5), strArr);
            try {
                ie8Var.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r0 = th;
            th = e03Var;
        } catch (Throwable th3) {
            try {
                ie8Var.close();
                r0 = th3;
            } catch (Throwable th4) {
                i12.r(th3, th4);
                r0 = th3;
            }
        }
        if (r0 == 0) {
            return th;
        }
        throw r0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(9:49|7|(1:9)|53|12|(1:14)|54|15|16)|(3:17|(3:19|(2:21|57)(2:22|56)|23)(1:55)|(1:43)(1:44))|24|(3:26|(2:28|59)(1:60)|29)|58|30|(2:32|33)|47|34|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m(defpackage.zn7 r8) {
        /*
            if (r8 == 0) goto L85
            oh5 r0 = defpackage.gx3.a
            boolean r0 = r0.e0(r8)
            if (r0 != 0) goto Lc
            goto L85
        Lc:
            java.io.File r8 = r8.toFile()
            j85 r8 = defpackage.tu1.k0(r8)
            ie8 r0 = new ie8
            r0.<init>(r8)
            r8 = 0
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = r2
        L20:
            if (r3 >= r1) goto L2a
            r0.readInt()     // Catch: java.lang.Throwable -> L28
            int r3 = r3 + 1
            goto L20
        L28:
            r1 = move-exception
            goto L79
        L2a:
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L28
            r3 = r2
        L2f:
            if (r3 >= r1) goto L37
            r0.readInt()     // Catch: java.lang.Throwable -> L28
            int r3 = r3 + 1
            goto L2f
        L37:
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L28
            r4 = r2
        L3e:
            java.lang.String r5 = ""
            if (r4 >= r1) goto L4f
            java.lang.String r6 = r0.P()     // Catch: java.lang.Throwable -> L28
            if (r6 != 0) goto L49
            goto L4a
        L49:
            r5 = r6
        L4a:
            r3[r4] = r5     // Catch: java.lang.Throwable -> L28
            int r4 = r4 + 1
            goto L3e
        L4f:
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L28
            r6 = r2
        L52:
            if (r6 >= r1) goto L60
            java.lang.String r7 = r0.P()     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L5b
            r7 = r5
        L5b:
            r4[r6] = r7     // Catch: java.lang.Throwable -> L28
            int r6 = r6 + 1
            goto L52
        L60:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L28
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L28
        L65:
            if (r2 >= r1) goto L71
            r6 = r4[r2]     // Catch: java.lang.Throwable -> L28
            r7 = r3[r2]     // Catch: java.lang.Throwable -> L28
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L28
            int r2 = r2 + 1
            goto L65
        L71:
            r0.close()     // Catch: java.lang.Throwable -> L75
            goto L76
        L75:
            r8 = move-exception
        L76:
            r1 = r8
            r8 = r5
            goto L81
        L79:
            r0.close()     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r0 = move-exception
            i12.r(r1, r0)
        L81:
            if (r1 != 0) goto L84
            return r8
        L84:
            throw r1
        L85:
            mc3 r8 = defpackage.mc3.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.m(zn7):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static Integer o(zn7 zn7Var) {
        ?? r1;
        gx3.a.getClass();
        ie8 ie8Var = new ie8(tu1.k0(zn7Var.toFile()));
        Integer th = null;
        try {
            Integer num = new Integer(ie8Var.readInt());
            try {
                ie8Var.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r1 = th;
            th = num;
        } catch (Throwable th3) {
            try {
                ie8Var.close();
                r1 = th3;
            } catch (Throwable th4) {
                i12.r(th3, th4);
                r1 = th3;
            }
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static Integer p(zn7 zn7Var) {
        ?? r1;
        gx3.a.getClass();
        ie8 ie8Var = new ie8(tu1.k0(zn7Var.toFile()));
        Integer th = null;
        try {
            int i = ie8Var.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                ie8Var.readInt();
            }
            int i3 = ie8Var.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                ie8Var.readInt();
            }
            Integer num = new Integer(ie8Var.readInt());
            try {
                ie8Var.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r1 = th;
            th = num;
        } catch (Throwable th3) {
            try {
                ie8Var.close();
                r1 = th3;
            } catch (Throwable th4) {
                i12.r(th3, th4);
                r1 = th3;
            }
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            m62 r0 = r9.b
            boolean r1 = r10 instanceof defpackage.cs2
            if (r1 == 0) goto L15
            r1 = r10
            cs2 r1 = (defpackage.cs2) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            cs2 r1 = new cs2
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.d
            int r2 = r1.f
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L35
            rs2 r0 = r1.b
            r07 r1 = r1.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L32
            goto L8a
        L32:
            r9 = move-exception
            goto L9b
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r6
        L3b:
            int r2 = r1.c
            r07 r8 = r1.a
            defpackage.e11.e0(r10)
            r10 = r8
            goto L57
        L44:
            defpackage.e11.e0(r10)
            t07 r10 = r9.c
            r1.a = r10
            r1.c = r4
            r1.f = r5
            java.lang.Object r2 = r10.p(r1)
            if (r2 != r7) goto L56
            goto L86
        L56:
            r2 = r4
        L57:
            ld4 r8 = r9.e     // Catch: java.lang.Throwable -> L99
            if (r8 == 0) goto L5f
            r10.q(r6)
            return r8
        L5f:
            b92 r8 = r0.F     // Catch: java.lang.Throwable -> L99
            h82 r5 = r8.a0(r5)     // Catch: java.lang.Throwable -> L99
            java.util.List r5 = r5.c()     // Catch: java.lang.Throwable -> L99
            b92 r0 = r0.F     // Catch: java.lang.Throwable -> L99
            h82 r0 = r0.a0(r4)     // Catch: java.lang.Throwable -> L99
            java.util.List r0 = r0.c()     // Catch: java.lang.Throwable -> L99
            r1.a = r10     // Catch: java.lang.Throwable -> L99
            r1.b = r9     // Catch: java.lang.Throwable -> L99
            r1.c = r2     // Catch: java.lang.Throwable -> L99
            r1.f = r3     // Catch: java.lang.Throwable -> L99
            hs2 r2 = new hs2     // Catch: java.lang.Throwable -> L99
            r2.<init>(r9, r5, r0, r6)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = defpackage.wx1.a0(r2, r1)     // Catch: java.lang.Throwable -> L99
            if (r0 != r7) goto L87
        L86:
            return r7
        L87:
            r1 = r10
            r10 = r0
            r0 = r9
        L8a:
            ld4 r10 = (defpackage.ld4) r10     // Catch: java.lang.Throwable -> L32
            r0.e = r10     // Catch: java.lang.Throwable -> L32
            ld4 r9 = r9.e     // Catch: java.lang.Throwable -> L32
            r9.getClass()     // Catch: java.lang.Throwable -> L32
            r1.q(r6)
            return r9
        L97:
            r1 = r10
            goto L9b
        L99:
            r9 = move-exception
            goto L97
        L9b:
            r1.q(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.c(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ds2
            if (r0 == 0) goto L13
            r0 = r9
            ds2 r0 = (defpackage.ds2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ds2 r0 = new ds2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            as2 r7 = r0.b
            defpackage.e11.e0(r9)
            goto L70
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r4
        L33:
            java.util.List r7 = r0.a
            defpackage.e11.e0(r9)
            goto L5f
        L39:
            defpackage.e11.e0(r9)
            m62 r7 = r7.b
            b92 r7 = r7.F
            m82 r9 = r7.W(r3, r8)
            java.util.List r9 = r9.c()
            r1 = 0
            m82 r7 = r7.W(r1, r8)
            java.util.List r7 = r7.c()
            r0.a = r9
            r0.e = r3
            t6b r7 = k(r7)
            if (r7 != r5) goto L5c
            goto L6e
        L5c:
            r6 = r9
            r9 = r7
            r7 = r6
        L5f:
            r8 = r9
            as2 r8 = (defpackage.as2) r8
            r0.a = r4
            r0.b = r8
            r0.e = r2
            t6b r9 = k(r7)
            if (r9 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r7 = r8
        L70:
            as2 r9 = (defpackage.as2) r9
            y28 r8 = new y28
            r8.<init>(r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.d(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(defpackage.zn7 r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.is2
            if (r0 == 0) goto L13
            r0 = r6
            is2 r0 = (defpackage.is2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            is2 r0 = new is2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.c
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.e11.e0(r4)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r4)
            r0.c = r1
            java.lang.Object r4 = j(r5)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            java.util.Map r4 = (java.util.Map) r4
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r6 = r4.size()
            int r6 = defpackage.y86.O(r6)
            r5.<init>(r6)
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L77
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            char r0 = r0.charAt(r1)
            java.lang.Character r1 = new java.lang.Character
            r1.<init>(r0)
            java.lang.Object r6 = r6.getValue()
            r5.put(r1, r6)
            goto L53
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.g(zn7, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.zn7 r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.js2
            if (r0 == 0) goto L13
            r0 = r6
            js2 r0 = (defpackage.js2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            js2 r0 = new js2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.c
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.e11.e0(r4)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r4)
            r0.c = r1
            java.lang.Object r4 = j(r5)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            java.util.Map r4 = (java.util.Map) r4
            f76 r5 = new f76
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.h(zn7, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x013a, code lost:
    
        if (r13 == r5) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v0, types: [bi5] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.bi5 r14, defpackage.kt1 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.i(bi5, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r13v0, types: [bi5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable n(defpackage.bi5 r13, defpackage.kt1 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.n(bi5, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ms2
            if (r0 == 0) goto L13
            r0 = r6
            ms2 r0 = (defpackage.ms2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ms2 r0 = new ms2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ld4 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            ld4 r6 = r5.e
            if (r6 == 0) goto L57
            x78 r1 = r5.a
            m78 r1 = r1.a()
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.a
        L3f:
            zn7 r1 = b(r2)
            r0.a = r6
            r0.d = r3
            java.lang.Object r5 = r5.h(r1, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            f76 r6 = (defpackage.f76) r6
            r5.i = r6
        L57:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.q(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ns2
            if (r0 == 0) goto L13
            r0 = r6
            ns2 r0 = (defpackage.ns2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ns2 r0 = new ns2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ld4 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            ld4 r6 = r5.e
            if (r6 == 0) goto L57
            x78 r5 = r5.a
            m78 r5 = r5.d()
            if (r5 == 0) goto L3f
            java.lang.String r2 = r5.a
        L3f:
            zn7 r5 = b(r2)
            r0.a = r6
            r0.d = r3
            e03 r5 = l(r5)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            as2 r6 = (defpackage.as2) r6
            r5.b = r6
        L57:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.r(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.os2
            if (r0 == 0) goto L13
            r0 = r6
            os2 r0 = (defpackage.os2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            os2 r0 = new os2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ld4 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            ld4 r6 = r5.e
            if (r6 == 0) goto L57
            x78 r1 = r5.a
            m78 r1 = r1.g()
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.a
        L3f:
            zn7 r1 = b(r2)
            r0.a = r6
            r0.d = r3
            java.io.Serializable r5 = r5.g(r1, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            java.util.Map r6 = (java.util.Map) r6
            r5.d = r6
        L57:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.s(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ps2
            if (r0 == 0) goto L13
            r0 = r6
            ps2 r0 = (defpackage.ps2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ps2 r0 = new ps2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ld4 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            ld4 r6 = r5.e
            if (r6 == 0) goto L57
            x78 r5 = r5.a
            m78 r5 = r5.h()
            if (r5 == 0) goto L3f
            java.lang.String r2 = r5.a
        L3f:
            zn7 r5 = b(r2)
            r0.a = r6
            r0.d = r3
            e03 r5 = l(r5)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            as2 r6 = (defpackage.as2) r6
            r5.c = r6
        L57:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.t(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.qs2
            if (r0 == 0) goto L13
            r0 = r6
            qs2 r0 = (defpackage.qs2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qs2 r0 = new qs2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ld4 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L53
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            ld4 r6 = r5.e
            if (r6 == 0) goto L57
            x78 r5 = r5.a
            m78 r5 = r5.j()
            if (r5 == 0) goto L3f
            java.lang.String r2 = r5.a
        L3f:
            zn7 r5 = b(r2)
            r0.a = r6
            r0.d = r3
            e03 r5 = l(r5)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r4
        L53:
            as2 r6 = (defpackage.as2) r6
            r5.a = r6
        L57:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.u(kt1):java.lang.Object");
    }
}
