package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ot0 {
    public final ut0 a;
    public final zu0 b;
    public final bv0 c;
    public final long d;
    public final jl9 e;
    public final int[] f;
    public final wq0 g;
    public long h;
    public int i;

    public ot0(ut0 ut0Var, zu0 zu0Var, bv0 bv0Var, long j) {
        ut0Var.getClass();
        zu0Var.getClass();
        bv0Var.getClass();
        this.a = ut0Var;
        this.b = zu0Var;
        this.c = bv0Var;
        this.d = j;
        byte[] bArr = zu0Var.a;
        if (bArr.length <= 0) {
            gp.l("Empty match string not permitted for scanning");
            throw null;
        }
        this.e = ut0Var.h();
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            while (i > 0 && zu0Var.a(i2) != zu0Var.a(i)) {
                i = iArr[i - 1];
            }
            if (zu0Var.a(i2) == zu0Var.a(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        this.f = iArr;
        this.g = new wq0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r13 == r7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:19:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kt1 r13) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.lt0
            if (r0 == 0) goto L13
            r0 = r13
            lt0 r0 = (defpackage.lt0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lt0 r0 = new lt0
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            heb r2 = defpackage.heb.a
            r3 = 3
            r4 = 2
            r5 = 1
            jl9 r6 = r12.e
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L31
            defpackage.e11.e0(r13)
            return r2
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            r12 = 0
            return r12
        L38:
            defpackage.e11.e0(r13)
            goto L52
        L3c:
            defpackage.e11.e0(r13)
        L3f:
            boolean r13 = r6.k()
            if (r13 == 0) goto L5a
            r0.c = r5
            tt0 r13 = defpackage.ut0.a
            ut0 r13 = r12.a
            java.lang.Object r13 = r13.e(r5, r0)
            if (r13 != r7) goto L52
            goto Lae
        L52:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Laf
        L5a:
            zu0 r13 = r12.b
            r1 = 0
            byte r13 = r13.a(r1)
            r8 = 0
            r1 = 6
            long r8 = defpackage.qn9.k(r6, r13, r8, r1)
            r10 = -1
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            bv0 r1 = r12.c
            if (r13 != 0) goto L91
            r6.getClass()
            r13 = r6
            wq0 r13 = (defpackage.wq0) r13
            long r8 = r13.c
            r12.b(r8)
            long r8 = r12.h
            bg9 r10 = r1.f()
            long r10 = r13.R(r10)
            long r10 = r10 + r8
            r12.h = r10
            r0.c = r4
            java.lang.Object r13 = defpackage.sdc.j0(r1, r0)
            if (r13 != r7) goto L3f
            goto Lae
        L91:
            r12.b(r8)
            long r4 = r12.h
            bg9 r13 = r1.f()
            r13.getClass()
            wq0 r13 = (defpackage.wq0) r13
            long r8 = r6.K(r13, r8)
            long r8 = r8 + r4
            r12.h = r8
            r0.c = r3
            java.lang.Object r12 = defpackage.sdc.j0(r1, r0)
            if (r12 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot0.a(kt1):java.lang.Object");
    }

    public final void b(long j) throws IOException {
        long j2 = this.h + j;
        long j3 = this.d;
        if (j2 <= j3) {
            return;
        }
        StringBuilder sbO = j39.o(j3, "Limit of ", " bytes exceeded while searching for \"");
        zu0 zu0Var = this.b;
        zu0Var.getClass();
        sbO.append(iw9.H(iw9.z(zu0Var.a), false, "\n", "\\n"));
        sbO.append('\"');
        throw new IOException(sbO.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r14 == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r14 != r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003f -> B:27:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:22:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot0.c(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r1.c(r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (r11 != r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[PHI: r10
  0x00c5: PHI (r10v2 boolean) = (r10v3 boolean), (r10v6 boolean) binds: [B:27:0x006f, B:22:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d8 -> B:43:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r10, defpackage.kt1 r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot0.d(boolean, kt1):java.lang.Object");
    }
}
