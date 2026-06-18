package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vg1 implements pg1 {
    public final qr a;

    public vg1(qr qrVar) {
        this.a = qrVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x021c, code lost:
    
        if (r0 == r10) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x015a -> B:31:0x0163). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r19, int r20, java.lang.String r21, java.lang.Long r22, java.util.List r23, defpackage.kt1 r24) throws e20 {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.a(int, int, java.lang.String, java.lang.Long, java.util.List, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(int r6, int r7, int r8, defpackage.kt1 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.rg1
            if (r0 == 0) goto L13
            r0 = r9
            rg1 r0 = (defpackage.rg1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rg1 r0 = new rg1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 10
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 != r4) goto L2a
            int r7 = r0.a
            defpackage.e11.e0(r9)
            goto L44
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L30:
            defpackage.e11.e0(r9)
            qr r5 = r5.a
            zq r5 = r5.d
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r5.t(r6, r8, r3, r0)
            xx1 r5 = defpackage.xx1.a
            if (r9 != r5) goto L44
            return r5
        L44:
            bm8 r9 = (defpackage.bm8) r9
            java.lang.Object r5 = r9.b
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L6d
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = defpackage.gc1.M(r5, r3)
            r2.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r5.next()
            pz7 r6 = (defpackage.pz7) r6
            bp2 r6 = defpackage.fw.I0(r6, r7)
            r2.add(r6)
            goto L59
        L6d:
            if (r2 != 0) goto L72
            lc3 r5 = defpackage.lc3.a
            return r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.b(int, int, int, kt1):java.io.Serializable");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final java.lang.Object c(int r36, defpackage.kt1 r37) {
        /*
            Method dump skipped, instruction units count: 1301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.c(int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r5, defpackage.kt1 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.tg1
            if (r0 == 0) goto L13
            r0 = r7
            tg1 r0 = (defpackage.tg1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tg1 r0 = new tg1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r7)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r7)
            qr r4 = r4.a
            zq r4 = r4.d
            r0.c = r2
            java.lang.Object r7 = r4.C(r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            bm8 r7 = (defpackage.bm8) r7
            java.lang.Object r4 = r7.b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L4b
            boolean r4 = r4.booleanValue()
            goto L4c
        L4b:
            r4 = 0
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.d(long, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ug1
            if (r0 == 0) goto L13
            r0 = r6
            ug1 r0 = (defpackage.ug1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ug1 r0 = new ug1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            qr r4 = r4.a
            zq r4 = r4.d
            r0.c = r2
            java.lang.Object r6 = r4.D(r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            bm8 r6 = (defpackage.bm8) r6
            java.lang.Object r4 = r6.b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L4b
            boolean r4 = r4.booleanValue()
            goto L4c
        L4b:
            r4 = 0
        L4c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg1.e(int, kt1):java.lang.Object");
    }
}
