package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yk4 {
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final /* synthetic */ int o = 0;
    public owb a;
    public bi1 f;
    public jk4 g;
    public final t07 b = u07.a();
    public ArrayList c = new ArrayList();
    public List d = lc3.a;
    public final LinkedHashMap e = new LinkedHashMap();
    public final Object h = new Object();
    public final xk4 i = new xk4(this);

    static {
        mc8 mc8Var = k63.b;
        o63 o63Var = o63.SECONDS;
        j = lx1.z0(30, o63Var);
        k = lx1.z0(15, o63Var);
        l = lx1.z0(10, o63Var);
        m = lx1.z0(10, o63Var);
        n = lx1.z0(Context.VERSION_ES6, o63.MILLISECONDS);
    }

    public static Object k(long j2, long j3, kb4 kb4Var, kt1 kt1Var) {
        if (k63.c(j2, 0L) <= 0) {
            j2 = j3;
        }
        long jE = k63.e(j2);
        if (jE <= 0) {
            return kb4Var.invoke(kt1Var);
        }
        long jA0 = lx1.A0(jE, o63.MILLISECONDS);
        return zib.p(tw1.k0(jA0), new xw(3, null, kb4Var), kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, defpackage.kt1 r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.lk4
            if (r0 == 0) goto L14
            r0 = r11
            lk4 r0 = (defpackage.lk4) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            lk4 r0 = new lk4
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.c
            int r0 = r6.e
            r1 = 2
            r2 = 1
            r3 = 0
            xx1 r7 = defpackage.xx1.a
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            defpackage.e11.e0(r11)
            return r11
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r3
        L33:
            long r9 = r6.b
            java.lang.String r12 = r6.a
            defpackage.e11.e0(r11)
            goto L4b
        L3b:
            defpackage.e11.e0(r11)
            r6.a = r12
            r6.b = r9
            r6.e = r2
            java.lang.Object r11 = r8.c(r6)
            if (r11 != r7) goto L4b
            goto L63
        L4b:
            owb r11 = (defpackage.owb) r11
            fb r5 = new fb
            r8 = 8
            r5.<init>(r11, r12, r3, r8)
            r6.a = r3
            r6.b = r9
            r6.e = r1
            long r3 = defpackage.yk4.l
            r1 = r9
            java.lang.Object r8 = k(r1, r3, r5, r6)
            if (r8 != r7) goto L64
        L63:
            return r7
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.a(long, kt1, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mk4
            if (r0 == 0) goto L13
            r0 = r7
            mk4 r0 = (defpackage.mk4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mk4 r0 = new mk4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.e11.e0(r7)
            goto L74
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L2e:
            defpackage.e11.e0(r7)
            java.lang.Object r7 = r6.h
            monitor-enter(r7)
            bi1 r2 = r6.f     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            heb r5 = defpackage.heb.a     // Catch: java.lang.Throwable -> L3e
            r2.Q(r5)     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r6 = move-exception
            goto L79
        L40:
            jk4 r2 = r6.g     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L4b
            bi1 r2 = r2.b     // Catch: java.lang.Throwable -> L3e
            heb r5 = defpackage.heb.a     // Catch: java.lang.Throwable -> L3e
            r2.Q(r5)     // Catch: java.lang.Throwable -> L3e
        L4b:
            r6.f = r4     // Catch: java.lang.Throwable -> L3e
            r6.g = r4     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r2.<init>()     // Catch: java.lang.Throwable -> L3e
            r6.c = r2     // Catch: java.lang.Throwable -> L3e
            lc3 r2 = defpackage.lc3.a     // Catch: java.lang.Throwable -> L3e
            r6.d = r2     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r2 = r6.e     // Catch: java.lang.Throwable -> L3e
            r2.clear()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r7)
            aj2 r7 = defpackage.rw2.a
            fj4 r7 = defpackage.r76.a
            ne0 r2 = new ne0
            r5 = 12
            r2.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.ah1.b0(r7, r2, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            r6.a = r4
            heb r6 = defpackage.heb.a
            return r6
        L79:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.b(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.nk4
            if (r0 == 0) goto L13
            r0 = r9
            nk4 r0 = (defpackage.nk4) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            nk4 r0 = new nk4
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            yk4 r1 = r0.b
            r07 r0 = r0.a
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L76
        L2f:
            r8 = move-exception
            goto L88
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r4
        L37:
            int r1 = r0.c
            r07 r3 = r0.a
            defpackage.e11.e0(r9)
            r9 = r3
            goto L53
        L40:
            defpackage.e11.e0(r9)
            t07 r9 = r8.b
            r0.a = r9
            r1 = 0
            r0.c = r1
            r0.f = r3
            java.lang.Object r3 = r9.p(r0)
            if (r3 != r5) goto L53
            goto L71
        L53:
            owb r3 = r8.a     // Catch: java.lang.Throwable -> L7b
            if (r3 != 0) goto L7e
            aj2 r3 = defpackage.rw2.a     // Catch: java.lang.Throwable -> L7b
            fj4 r3 = defpackage.r76.a     // Catch: java.lang.Throwable -> L7b
            fj4 r3 = r3.f     // Catch: java.lang.Throwable -> L7b
            oc r6 = new oc     // Catch: java.lang.Throwable -> L7b
            r7 = 5
            r6.<init>(r8, r4, r7)     // Catch: java.lang.Throwable -> L7b
            r0.a = r9     // Catch: java.lang.Throwable -> L7b
            r0.b = r8     // Catch: java.lang.Throwable -> L7b
            r0.c = r1     // Catch: java.lang.Throwable -> L7b
            r0.f = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = defpackage.ah1.b0(r3, r6, r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 != r5) goto L72
        L71:
            return r5
        L72:
            r1 = r0
            r0 = r9
            r9 = r1
            r1 = r8
        L76:
            owb r9 = (defpackage.owb) r9     // Catch: java.lang.Throwable -> L2f
            r1.a = r9     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L7b:
            r8 = move-exception
            r0 = r9
            goto L88
        L7e:
            r0 = r9
        L7f:
            owb r8 = r8.a     // Catch: java.lang.Throwable -> L2f
            r8.getClass()     // Catch: java.lang.Throwable -> L2f
            r0.q(r4)
            return r8
        L88:
            r0.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.c(kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, ue5, uf5] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(defpackage.owb r6, defpackage.kt1 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qk4
            if (r0 == 0) goto L13
            r0 = r7
            qk4 r0 = (defpackage.qk4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qk4 r0 = new qk4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.e11.e0(r7)
            goto L45
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L2c:
            defpackage.e11.e0(r7)
            aj2 r7 = defpackage.rw2.a
            fj4 r7 = defpackage.r76.a
            yw3 r1 = new yw3
            r4 = 15
            r1.<init>(r5, r6, r3, r4)
            r0.c = r2
            java.lang.Object r7 = defpackage.ah1.b0(r7, r1, r0)
            xx1 r5 = defpackage.xx1.a
            if (r7 != r5) goto L45
            return r5
        L45:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L52
            java.lang.String r5 = "null"
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L52
            r3 = r7
        L52:
            if (r3 != 0) goto L56
            java.lang.String r3 = ""
        L56:
            uf5 r5 = defpackage.xf5.a     // Catch: java.lang.Throwable -> L64
            r5.getClass()     // Catch: java.lang.Throwable -> L64
            tv9 r6 = defpackage.tv9.a     // Catch: java.lang.Throwable -> L64
            java.lang.Object r5 = r5.a(r6, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L64
            goto L6b
        L64:
            r5 = move-exception
            pm8 r6 = new pm8
            r6.<init>(r5)
            r5 = r6
        L6b:
            boolean r6 = r5 instanceof defpackage.pm8
            if (r6 == 0) goto L71
            goto L72
        L71:
            r3 = r5
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.d(owb, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[PHI: r1 r10
  0x0068: PHI (r1v3 owb) = (r1v2 owb), (r1v2 owb), (r1v4 owb) binds: [B:23:0x0059, B:25:0x0065, B:17:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r10v2 long) = (r10v1 long), (r10v1 long), (r10v4 long) binds: [B:23:0x0059, B:25:0x0065, B:17:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r10, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.rk4
            if (r0 == 0) goto L13
            r0 = r12
            rk4 r0 = (defpackage.rk4) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            rk4 r0 = new rk4
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.e11.e0(r12)
            return r12
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r2
        L34:
            long r10 = r0.a
            owb r1 = r0.b
            defpackage.e11.e0(r12)
            goto L68
        L3c:
            long r10 = r0.a
            defpackage.e11.e0(r12)
            goto L50
        L42:
            defpackage.e11.e0(r12)
            r0.a = r10
            r0.e = r5
            java.lang.Object r12 = r9.c(r0)
            if (r12 != r6) goto L50
            goto L74
        L50:
            r1 = r12
            owb r1 = (defpackage.owb) r1
            r7 = 0
            int r12 = defpackage.k63.c(r10, r7)
            if (r12 <= 0) goto L68
            r0.b = r1
            r0.a = r10
            r0.e = r4
            java.lang.Object r12 = defpackage.tw1.I(r10, r0)
            if (r12 != r6) goto L68
            goto L74
        L68:
            r0.b = r2
            r0.a = r10
            r0.e = r3
            java.io.Serializable r9 = r9.d(r1, r0)
            if (r9 != r6) goto L75
        L74:
            return r6
        L75:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.e(long, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (defpackage.tw1.I(defpackage.yk4.n, r6) != r9) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r11, defpackage.kt1 r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.sk4
            if (r0 == 0) goto L14
            r0 = r13
            sk4 r0 = (defpackage.sk4) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            sk4 r0 = new sk4
            r0.<init>(r10, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.c
            int r0 = r6.e
            r7 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r8 = 0
            xx1 r9 = defpackage.xx1.a
            if (r0 == 0) goto L4e
            if (r0 == r3) goto L46
            if (r0 == r2) goto L40
            if (r0 == r1) goto L3a
            if (r0 != r7) goto L34
            defpackage.e11.e0(r13)
            goto L9f
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r8
        L3a:
            long r10 = r6.b
            defpackage.e11.e0(r13)
            goto L90
        L40:
            long r11 = r6.b
            defpackage.e11.e0(r13)
            goto L79
        L46:
            long r11 = r6.b
            java.lang.String r14 = r6.a
            defpackage.e11.e0(r13)
            goto L61
        L4e:
            defpackage.e11.e0(r13)
            r10.i()
            r6.a = r14
            r6.b = r11
            r6.e = r3
            java.lang.Object r13 = r10.c(r6)
            if (r13 != r9) goto L61
            goto L9e
        L61:
            owb r13 = (defpackage.owb) r13
            aj2 r0 = defpackage.rw2.a
            fj4 r0 = defpackage.r76.a
            d90 r3 = new d90
            r3.<init>(r13, r14, r8, r2)
            r6.a = r8
            r6.b = r11
            r6.e = r2
            java.lang.Object r13 = defpackage.ah1.b0(r0, r3, r6)
            if (r13 != r9) goto L79
            goto L9e
        L79:
            r6.a = r8
            r6.b = r11
            r6.e = r1
            kk4 r5 = new kk4
            r13 = 0
            r5.<init>(r10, r8, r13)
            long r3 = defpackage.yk4.j
            r1 = r11
            java.lang.Object r10 = k(r1, r3, r5, r6)
            if (r10 != r9) goto L8f
            goto L9e
        L8f:
            r10 = r1
        L90:
            r6.a = r8
            r6.b = r10
            r6.e = r7
            long r10 = defpackage.yk4.n
            java.lang.Object r10 = defpackage.tw1.I(r10, r6)
            if (r10 != r9) goto L9f
        L9e:
            return r9
        L9f:
            heb r10 = defpackage.heb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.f(long, kt1, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (defpackage.ah1.b0(r6, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tk4
            if (r0 == 0) goto L13
            r0 = r8
            tk4 r0 = (defpackage.tk4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tk4 r0 = new tk4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.e11.e0(r8)
            goto L5f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L48
        L37:
            defpackage.e11.e0(r8)
            r6.i()
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.c(r0)
            if (r8 != r5) goto L48
            goto L5e
        L48:
            owb r8 = (defpackage.owb) r8
            aj2 r6 = defpackage.rw2.a
            fj4 r6 = defpackage.r76.a
            d90 r1 = new d90
            r3 = 3
            r1.<init>(r8, r7, r4, r3)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = defpackage.ah1.b0(r6, r1, r0)
            if (r6 != r5) goto L5f
        L5e:
            return r5
        L5f:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.g(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (defpackage.ah1.b0(r1, r10, r8) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r17, java.lang.String r18, defpackage.kt1 r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof defpackage.uk4
            if (r2 == 0) goto L18
            r2 = r1
            uk4 r2 = (defpackage.uk4) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.e = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            uk4 r2 = new uk4
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.c
            int r2 = r8.e
            r9 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r14 = 0
            xx1 r6 = defpackage.xx1.a
            if (r2 == 0) goto L52
            if (r2 == r5) goto L48
            if (r2 == r4) goto L44
            if (r2 == r3) goto L3f
            if (r2 != r9) goto L38
            defpackage.e11.e0(r1)
            goto Lb1
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.e11.e0(r1)
            r0 = r6
            goto La2
        L44:
            defpackage.e11.e0(r1)
            goto L88
        L48:
            java.lang.String r2 = r8.b
            java.lang.String r5 = r8.a
            defpackage.e11.e0(r1)
            r12 = r5
        L50:
            r13 = r2
            goto L6d
        L52:
            defpackage.e11.e0(r1)
            r0.i()
            r1 = r17
            r8.a = r1
            r2 = r18
            r8.b = r2
            r8.e = r5
            java.lang.Object r5 = r0.c(r8)
            if (r5 != r6) goto L6a
        L68:
            r0 = r6
            goto Lb0
        L6a:
            r12 = r1
            r1 = r5
            goto L50
        L6d:
            r11 = r1
            owb r11 = (defpackage.owb) r11
            aj2 r1 = defpackage.rw2.a
            fj4 r1 = defpackage.r76.a
            hl2 r10 = new hl2
            r15 = 28
            r10.<init>(r11, r12, r13, r14, r15)
            r8.a = r14
            r8.b = r14
            r8.e = r4
            java.lang.Object r1 = defpackage.ah1.b0(r1, r10, r8)
            if (r1 != r6) goto L88
            goto L68
        L88:
            mc8 r1 = defpackage.k63.b
            r8.a = r14
            r8.b = r14
            r8.e = r3
            kk4 r7 = new kk4
            r1 = 0
            r7.<init>(r0, r14, r1)
            r3 = 0
            r0 = r6
            long r5 = defpackage.yk4.j
            java.lang.Object r1 = k(r3, r5, r7, r8)
            if (r1 != r0) goto La2
            goto Lb0
        La2:
            r8.a = r14
            r8.b = r14
            r8.e = r9
            long r1 = defpackage.yk4.n
            java.lang.Object r1 = defpackage.tw1.I(r1, r8)
            if (r1 != r0) goto Lb1
        Lb0:
            return r0
        Lb1:
            heb r0 = defpackage.heb.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.h(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final void i() {
        synchronized (this.h) {
            this.c = new ArrayList();
            this.e.clear();
            this.f = p7c.d();
            this.g = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (defpackage.ah1.b0(r6, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.vk4
            if (r0 == 0) goto L13
            r0 = r8
            vk4 r0 = (defpackage.vk4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vk4 r0 = new vk4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.e11.e0(r8)
            goto L5d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L45
        L37:
            defpackage.e11.e0(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.c(r0)
            if (r8 != r5) goto L45
            goto L5c
        L45:
            owb r8 = (defpackage.owb) r8
            aj2 r6 = defpackage.rw2.a
            fj4 r6 = defpackage.r76.a
            pg r1 = new pg
            r3 = 14
            r1.<init>(r8, r7, r4, r3)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = defpackage.ah1.b0(r6, r1, r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.j(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r15, defpackage.kt1 r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk4.l(long, kt1, java.util.List):java.lang.Object");
    }
}
