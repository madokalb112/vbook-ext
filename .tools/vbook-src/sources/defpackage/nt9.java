package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nt9 extends s32 implements if5 {
    public final ue5 T;
    public final g3c U;
    public final l1 V;
    public final q32 W;
    public int X;
    public cb3 Y;
    public final cf5 Z;
    public final of5 a0;

    public nt9(ue5 ue5Var, g3c g3cVar, l1 l1Var, m39 m39Var, cb3 cb3Var) {
        ue5Var.getClass();
        m39Var.getClass();
        this.T = ue5Var;
        this.U = g3cVar;
        this.V = l1Var;
        this.W = ue5Var.b;
        this.X = -1;
        this.Y = cb3Var;
        cf5 cf5Var = ue5Var.a;
        this.Z = cf5Var;
        this.a0 = cf5Var.e ? null : new of5(m39Var);
    }

    @Override // defpackage.s32, defpackage.yd2
    public final byte A() {
        l1 l1Var = this.V;
        long jK = l1Var.k();
        byte b = (byte) jK;
        if (jK == b) {
            return b;
        }
        l1.s(l1Var, "Failed to parse byte for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final short B() {
        l1 l1Var = this.V;
        long jK = l1Var.k();
        short s = (short) jK;
        if (jK == s) {
            return s;
        }
        l1.s(l1Var, "Failed to parse short for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final float C() {
        l1 l1Var = this.V;
        String strN = l1Var.n();
        try {
            float f = Float.parseFloat(strN);
            if (this.T.a.i || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            l1.s(l1Var, ny1.R(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            l1.s(l1Var, j39.i('\'', "Failed to parse type 'float' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.s32, defpackage.yd2
    public final double E() {
        l1 l1Var = this.V;
        String strN = l1Var.n();
        try {
            double d = Double.parseDouble(strN);
            if (this.T.a.i || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            l1.s(l1Var, ny1.R(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            l1.s(l1Var, j39.i('\'', "Failed to parse type 'double' for input '", strN), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.s32, defpackage.yd2
    public final boolean b() {
        boolean z;
        boolean z2;
        l1 l1Var = this.V;
        int iA = l1Var.A();
        if (iA == l1Var.u().length()) {
            l1.s(l1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (l1Var.u().charAt(iA) == '\"') {
            iA++;
            z = true;
        } else {
            z = false;
        }
        int iZ = l1Var.z(iA);
        if (iZ >= l1Var.u().length() || iZ == -1) {
            l1.s(l1Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iZ + 1;
        int iCharAt = l1Var.u().charAt(iZ) | ' ';
        if (iCharAt == 102) {
            l1Var.f(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                l1.s(l1Var, "Expected valid boolean literal prefix, but had '" + l1Var.n() + '\'', 0, null, 6);
                throw null;
            }
            l1Var.f(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (l1Var.b == l1Var.u().length()) {
            l1.s(l1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (l1Var.u().charAt(l1Var.b) == '\"') {
            l1Var.b++;
            return z2;
        }
        l1.s(l1Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final char c() {
        l1 l1Var = this.V;
        String strN = l1Var.n();
        if (strN.length() == 1) {
            return strN.charAt(0);
        }
        l1.s(l1Var, j39.i('\'', "Expected single char, but got '", strN), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    @Override // defpackage.yd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.oi5 r11) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt9.d(oi5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x012e, code lost:
    
        if (r7 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0130, code lost:
    
        r0 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0134, code lost:
    
        if (r8 >= 64) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0136, code lost:
    
        r0.a |= 1 << r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013d, code lost:
    
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0140, code lost:
    
        r1 = (r8 >>> 6) - 1;
        r0 = (long[]) r0.d;
        r0[r1] = r0[r1] | (1 << (r8 & 63));
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.am1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.m39 r23) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt9.f(m39):int");
    }

    @Override // defpackage.if5
    public final mf5 i() {
        return new tg5(this.T.a, this.V).b();
    }

    @Override // defpackage.s32, defpackage.yd2
    public final int l() {
        l1 l1Var = this.V;
        long jK = l1Var.k();
        int i = (int) jK;
        if (jK == i) {
            return i;
        }
        l1.s(l1Var, "Failed to parse int for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.s32, defpackage.am1
    public final void n(m39 m39Var) {
        m39Var.getClass();
        int iF = m39Var.f();
        ue5 ue5Var = this.T;
        if (iF == 0 && bg5.c(ue5Var, m39Var)) {
            while (f(m39Var) != -1) {
            }
        }
        l1 l1Var = this.V;
        if (l1Var.C() && !ue5Var.a.k) {
            ny1.O(l1Var, "");
            throw null;
        }
        l1Var.j(this.U.b);
        fv4 fv4Var = (fv4) l1Var.e;
        int i = fv4Var.b;
        int[] iArr = (int[]) fv4Var.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            fv4Var.b = i - 1;
        }
        int i2 = fv4Var.b;
        if (i2 != -1) {
            fv4Var.b = i2 - 1;
        }
    }

    @Override // defpackage.am1
    public final q32 o() {
        return this.W;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final yd2 p(m39 m39Var) {
        m39Var.getClass();
        return pt9.a(m39Var) ? new jf5(this.V, this.T) : this;
    }

    @Override // defpackage.s32, defpackage.am1
    public final Object q(m39 m39Var, int i, oi5 oi5Var, Object obj) {
        fv4 fv4Var = (fv4) this.V.e;
        m39Var.getClass();
        oi5Var.getClass();
        boolean z = this.U == g3c.e && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) fv4Var.e;
            int i2 = fv4Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) fv4Var.d)[i2] = lr3.t;
            }
        }
        Object objD = d(oi5Var);
        if (z) {
            int[] iArr2 = (int[]) fv4Var.e;
            int i3 = fv4Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                fv4Var.b = i4;
                if (i4 == ((Object[]) fv4Var.d).length) {
                    fv4Var.e();
                }
            }
            Object[] objArr = (Object[]) fv4Var.d;
            int i5 = fv4Var.b;
            objArr[i5] = ((cf5) fv4Var.c).m ? objD : g83.s;
            ((int[]) fv4Var.e)[i5] = -2;
        }
        return objD;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final String s() {
        boolean z = this.Z.c;
        l1 l1Var = this.V;
        return z ? l1Var.o() : l1Var.l();
    }

    @Override // defpackage.s32, defpackage.yd2
    public final am1 t(m39 m39Var) {
        m39Var.getClass();
        ue5 ue5Var = this.T;
        g3c g3cVarS = wm9.s(ue5Var, m39Var);
        l1 l1Var = this.V;
        fv4 fv4Var = (fv4) l1Var.e;
        fv4Var.getClass();
        int i = fv4Var.b + 1;
        fv4Var.b = i;
        if (i == ((Object[]) fv4Var.d).length) {
            fv4Var.e();
        }
        ((Object[]) fv4Var.d)[i] = m39Var;
        l1Var.j(g3cVarS.a);
        if (l1Var.x() != 4) {
            int iOrdinal = g3cVarS.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new nt9(this.T, g3cVarS, l1Var, m39Var, this.Y) : (this.U == g3cVarS && ue5Var.a.e) ? this : new nt9(this.T, g3cVarS, l1Var, m39Var, this.Y);
        }
        l1.s(l1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.s32, defpackage.yd2
    public final int u(m39 m39Var) {
        m39Var.getClass();
        return bg5.b(m39Var, this.T, s(), " at path ".concat(((fv4) this.V.e).b()));
    }

    @Override // defpackage.s32, defpackage.yd2
    public final long v() {
        return this.V.k();
    }

    @Override // defpackage.s32, defpackage.yd2
    public final boolean w() {
        of5 of5Var = this.a0;
        return ((of5Var != null ? of5Var.b : false) || this.V.D(true)) ? false : true;
    }

    @Override // defpackage.if5
    public final ue5 y() {
        return this.T;
    }
}
