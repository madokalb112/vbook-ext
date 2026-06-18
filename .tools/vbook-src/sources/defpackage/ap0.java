package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ap0 implements vv8 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public long c;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (defpackage.heb.a == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vv8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xo0
            if (r0 == 0) goto L13
            r0 = r6
            xo0 r0 = (defpackage.xo0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xo0 r0 = new xo0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            int r5 = r0.b
            java.util.Iterator r2 = r0.a
            defpackage.e11.e0(r6)
            goto L5f
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L35:
            defpackage.e11.e0(r6)
            goto L43
        L39:
            defpackage.e11.e0(r6)
            r0.e = r4
            heb r6 = defpackage.heb.a
            if (r6 != r1) goto L43
            goto L77
        L43:
            java.lang.Object r6 = r5.a
            monitor-enter(r6)
            java.util.LinkedHashMap r2 = r5.b     // Catch: java.lang.Throwable -> L7b
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L7b
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L7b
            java.util.List r2 = defpackage.fc1.Z0(r2)     // Catch: java.lang.Throwable -> L7b
            java.util.LinkedHashMap r5 = r5.b     // Catch: java.lang.Throwable -> L7b
            r5.clear()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r6)
            java.util.Iterator r5 = r2.iterator()
            r6 = 0
            r2 = r5
            r5 = r6
        L5f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r2.next()
            yk4 r6 = (defpackage.yk4) r6
            r0.a = r2
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L5f
        L77:
            return r1
        L78:
            heb r5 = defpackage.heb.a
            return r5
        L7b:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap0.a(kt1):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
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
    @Override // defpackage.vv8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, java.lang.Object[] r10, defpackage.jt1 r11) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap0.b(java.lang.String, java.lang.Object[], jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object[] r11, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.yo0
            if (r0 == 0) goto L13
            r0 = r12
            yo0 r0 = (defpackage.yo0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            yo0 r0 = new yo0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            o63 r2 = defpackage.o63.MILLISECONDS
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 != r4) goto L2e
            defpackage.e11.e0(r12)
            return r12
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r6
        L34:
            long r10 = r0.b
            yk4 r1 = r0.a
            defpackage.e11.e0(r12)
            goto L83
        L3c:
            defpackage.e11.e0(r12)
            java.lang.Object r12 = defpackage.fw.p0(r3, r11)
            yk4 r1 = r10.e(r12)
            if (r1 != 0) goto L4a
            goto L56
        L4a:
            r10 = r11[r5]
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L53
            java.lang.String r10 = (java.lang.String) r10
            goto L54
        L53:
            r10 = r6
        L54:
            if (r10 != 0) goto L59
        L56:
            java.lang.String r10 = ""
            return r10
        L59:
            java.lang.Object r11 = defpackage.fw.p0(r4, r11)
            boolean r12 = r11 instanceof java.lang.Double
            if (r12 == 0) goto L64
            java.lang.Double r11 = (java.lang.Double) r11
            goto L65
        L64:
            r11 = r6
        L65:
            if (r11 == 0) goto L6d
            double r11 = r11.doubleValue()
            long r11 = (long) r11
            goto L6f
        L6d:
            r11 = 0
        L6f:
            mc8 r8 = defpackage.k63.b
            long r8 = defpackage.lx1.A0(r11, r2)
            r0.a = r1
            r0.b = r11
            r0.e = r5
            java.lang.Object r10 = r1.f(r8, r0, r10)
            if (r10 != r7) goto L82
            goto L95
        L82:
            r10 = r11
        L83:
            mc8 r12 = defpackage.k63.b
            long r2 = defpackage.lx1.z0(r3, r2)
            r0.a = r6
            r0.b = r10
            r0.e = r4
            java.lang.Object r10 = r1.e(r2, r0)
            if (r10 != r7) goto L96
        L95:
            return r7
        L96:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap0.c(java.lang.Object[], kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Object[] r7, defpackage.kt1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zo0
            if (r0 == 0) goto L13
            r0 = r8
            zo0 r0 = (defpackage.zo0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zo0 r0 = new zo0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L29
            defpackage.e11.e0(r8)
            goto L4e
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r5
        L2f:
            defpackage.e11.e0(r8)
            java.lang.Object r7 = defpackage.fw.p0(r3, r7)
            yk4 r6 = r6.e(r7)
            if (r6 != 0) goto L3f
            java.lang.String r6 = "[]"
            return r6
        L3f:
            r0.c = r4
            java.lang.Object r7 = r6.h
            monitor-enter(r7)
            java.util.ArrayList r6 = r6.c     // Catch: java.lang.Throwable -> L86
            java.util.List r8 = defpackage.fc1.Z0(r6)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r7)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            uf5 r6 = defpackage.xf5.a     // Catch: java.lang.Exception -> L5f
            r6.getClass()     // Catch: java.lang.Exception -> L5f
            wv r7 = new wv     // Catch: java.lang.Exception -> L5f
            tv9 r0 = defpackage.tv9.a     // Catch: java.lang.Exception -> L5f
            r7.<init>(r0, r3)     // Catch: java.lang.Exception -> L5f
            java.lang.String r5 = r6.b(r7, r8)     // Catch: java.lang.Exception -> L5f
            goto L81
        L5f:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L68
            java.lang.String r6 = ""
        L68:
            java.lang.String r7 = "Log"
            boolean r8 = defpackage.pu.a()
            if (r8 == 0) goto L81
            e46 r8 = e46.b
            k89 r0 = k89.c
            bh5 r1 = r8.a
            k89 r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L81
            r8.a(r0, r7, r6, r5)
        L81:
            if (r5 != 0) goto L85
            java.lang.String r5 = "[]"
        L85:
            return r5
        L86:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap0.d(java.lang.Object[], kt1):java.lang.Object");
    }

    public final yk4 e(Object obj) {
        yk4 yk4Var;
        if (obj instanceof yk4) {
            return (yk4) obj;
        }
        synchronized (this.a) {
            try {
                yk4Var = (yk4) this.b.get(obj != null ? obj.toString() : null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return yk4Var;
    }
}
