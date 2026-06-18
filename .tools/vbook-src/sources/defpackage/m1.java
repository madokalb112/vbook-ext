package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class m1 implements if5, yd2, am1 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final ue5 c;
    public final String d;
    public final cf5 e;

    public m1(ue5 ue5Var, String str) {
        this.c = ue5Var;
        this.d = str;
        this.e = ue5Var.a;
    }

    @Override // defpackage.yd2
    public final byte A() {
        return I(U());
    }

    @Override // defpackage.yd2
    public final short B() {
        return P(U());
    }

    @Override // defpackage.yd2
    public final float C() {
        return L(U());
    }

    @Override // defpackage.am1
    public final long D(m39 m39Var, int i) {
        m39Var.getClass();
        return O(S(m39Var, i));
    }

    @Override // defpackage.yd2
    public final double E() {
        return K(U());
    }

    public abstract mf5 F(String str);

    public final mf5 G() {
        mf5 mf5VarF;
        String str = (String) fc1.F0(this.a);
        return (str == null || (mf5VarF = F(str)) == null) ? T() : mf5VarF;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        if (!(mf5VarF instanceof jg5)) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of boolean", W(str), null, this.c.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            m75 m75Var = nf5.a;
            Boolean boolB = nv9.b(jg5Var.a());
            if (boolB != null) {
                return boolB.booleanValue();
            }
            X(jg5Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        if (!(mf5VarF instanceof jg5)) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of byte", W(str), null, this.c.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            long jH = nf5.h(jg5Var);
            Byte bValueOf = (-128 > jH || jH > 127) ? null : Byte.valueOf((byte) jH);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(jg5Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        if (!(mf5VarF instanceof jg5)) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of char", W(str), null, this.c.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            String strA = jg5Var.a();
            strA.getClass();
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        boolean z = mf5VarF instanceof jg5;
        ue5 ue5Var = this.c;
        if (!z) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of double", W(str), null, ue5Var.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            m75 m75Var = nf5.a;
            double d = Double.parseDouble(jg5Var.a());
            if (ue5Var.a.i || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new kf5(ny1.E(ny1.R(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", ue5Var.a.m ? ny1.Q(G().toString(), -1).toString() : null, -1));
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        boolean z = mf5VarF instanceof jg5;
        ue5 ue5Var = this.c;
        if (!z) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of float", W(str), null, ue5Var.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            m75 m75Var = nf5.a;
            float f = Float.parseFloat(jg5Var.a());
            if (ue5Var.a.i || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new kf5(ny1.E(ny1.R(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", ue5Var.a.m ? ny1.Q(G().toString(), -1).toString() : null, -1));
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "float", str);
            throw null;
        }
    }

    public final yd2 M(Object obj, m39 m39Var) {
        String str = (String) obj;
        str.getClass();
        m39Var.getClass();
        if (!pt9.a(m39Var)) {
            this.a.add(str);
            return this;
        }
        mf5 mf5VarF = F(str);
        String strA = m39Var.a();
        boolean z = mf5VarF instanceof jg5;
        ue5 ue5Var = this.c;
        if (z) {
            return new jf5(qn9.d(ue5Var, ((jg5) mf5VarF).a()), ue5Var);
        }
        throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of " + strA, W(str), null, ue5Var.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        if (!(mf5VarF instanceof jg5)) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of int", W(str), null, this.c.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            long jH = nf5.h(jg5Var);
            Integer numValueOf = (-2147483648L > jH || jH > 2147483647L) ? null : Integer.valueOf((int) jH);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(jg5Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        if (mf5VarF instanceof jg5) {
            jg5 jg5Var = (jg5) mf5VarF;
            try {
                return nf5.h(jg5Var);
            } catch (IllegalArgumentException unused) {
                this.X(jg5Var, "long", str);
                throw null;
            }
        }
        throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of long", W(str), null, this.c.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        if (!(mf5VarF instanceof jg5)) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of short", W(str), null, this.c.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        try {
            long jH = nf5.h(jg5Var);
            Short shValueOf = (-32768 > jH || jH > 32767) ? null : Short.valueOf((short) jH);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(jg5Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jg5Var, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        mf5 mf5VarF = F(str);
        boolean z = mf5VarF instanceof jg5;
        ue5 ue5Var = this.c;
        if (!z) {
            throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of string", W(str), null, ue5Var.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
        }
        jg5 jg5Var = (jg5) mf5VarF;
        if (!(jg5Var instanceof yf5)) {
            throw new kf5(ny1.E(xv5.p("Expected string value for a non-null key '", str, "', got null literal instead"), W(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", ue5Var.a.m ? ny1.Q(G().toString(), -1).toString() : null, -1));
        }
        yf5 yf5Var = (yf5) jg5Var;
        if (yf5Var.a || ue5Var.a.c) {
            return yf5Var.b;
        }
        throw new kf5(ny1.E(xv5.p("String literal for value of key '", str, "' should be quoted"), W(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", ue5Var.a.m ? ny1.Q(G().toString(), -1).toString() : null, -1));
    }

    public String R(m39 m39Var, int i) {
        m39Var.getClass();
        return m39Var.g(i);
    }

    public final String S(m39 m39Var, int i) {
        m39Var.getClass();
        String strR = R(m39Var, i);
        strR.getClass();
        return strR;
    }

    public abstract mf5 T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(gc1.S(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : fc1.D0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(jg5 jg5Var, String str, String str2) {
        throw new kf5(ny1.E("Failed to parse literal '" + jg5Var + "' as " + (iw9.K(str, "i", false) ? "an " : "a ").concat(str) + " value", W(str2), null, this.c.a.m ? ny1.Q(G().toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.am1
    public final yd2 a(k28 k28Var, int i) {
        k28Var.getClass();
        return M(S(k28Var, i), k28Var.i(i));
    }

    @Override // defpackage.yd2
    public final boolean b() {
        return H(U());
    }

    @Override // defpackage.yd2
    public final char c() {
        return J(U());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    @Override // defpackage.yd2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.oi5 r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1.d(oi5):java.lang.Object");
    }

    @Override // defpackage.am1
    public final float e(m39 m39Var, int i) {
        m39Var.getClass();
        return L(S(m39Var, i));
    }

    @Override // defpackage.am1
    public final double g(k28 k28Var, int i) {
        k28Var.getClass();
        return K(S(k28Var, i));
    }

    @Override // defpackage.am1
    public final char h(k28 k28Var, int i) {
        k28Var.getClass();
        return J(S(k28Var, i));
    }

    @Override // defpackage.if5
    public final mf5 i() {
        return G();
    }

    @Override // defpackage.am1
    public final byte j(k28 k28Var, int i) {
        k28Var.getClass();
        return I(S(k28Var, i));
    }

    @Override // defpackage.am1
    public final String k(m39 m39Var, int i) {
        m39Var.getClass();
        return Q(S(m39Var, i));
    }

    @Override // defpackage.yd2
    public final int l() {
        return N(U());
    }

    @Override // defpackage.am1
    public final short m(k28 k28Var, int i) {
        k28Var.getClass();
        return P(S(k28Var, i));
    }

    @Override // defpackage.am1
    public void n(m39 m39Var) {
        m39Var.getClass();
    }

    @Override // defpackage.am1
    public final q32 o() {
        return this.c.b;
    }

    @Override // defpackage.yd2
    public final yd2 p(m39 m39Var) {
        m39Var.getClass();
        if (fc1.F0(this.a) != null) {
            return M(U(), m39Var);
        }
        return new kg5(this.c, T(), this.d).p(m39Var);
    }

    @Override // defpackage.am1
    public final Object q(m39 m39Var, int i, oi5 oi5Var, Object obj) {
        m39Var.getClass();
        oi5Var.getClass();
        this.a.add(S(m39Var, i));
        oi5Var.getClass();
        Object objD = d(oi5Var);
        if (!this.b) {
            U();
        }
        this.b = false;
        return objD;
    }

    @Override // defpackage.am1
    public final int r(m39 m39Var, int i) {
        m39Var.getClass();
        return N(S(m39Var, i));
    }

    @Override // defpackage.yd2
    public final String s() {
        return Q(U());
    }

    @Override // defpackage.yd2
    public am1 t(m39 m39Var) {
        m39Var.getClass();
        mf5 mf5VarG = G();
        gx1 gx1VarE = m39Var.e();
        boolean zQ = lc5.Q(gx1VarE, qw9.d);
        ue5 ue5Var = this.c;
        if (zQ || (gx1VarE instanceof gy7)) {
            String strA = m39Var.a();
            if (mf5VarG instanceof we5) {
                return new pg5(ue5Var, (we5) mf5VarG);
            }
            throw new kf5(ny1.E("Expected " + ug8.a(we5.class).g() + ", but had " + ug8.a(mf5VarG.getClass()).g() + " as the serialized body of " + strA, V(), null, ue5Var.a.m ? ny1.Q(mf5VarG.toString(), -1).toString() : null, -1));
        }
        if (!lc5.Q(gx1VarE, qw9.e)) {
            String strA2 = m39Var.a();
            if (mf5VarG instanceof fg5) {
                return new og5(ue5Var, (fg5) mf5VarG, this.d, 8);
            }
            throw new kf5(ny1.E("Expected " + ug8.a(fg5.class).g() + ", but had " + ug8.a(mf5VarG.getClass()).g() + " as the serialized body of " + strA2, V(), null, ue5Var.a.m ? ny1.Q(mf5VarG.toString(), -1).toString() : null, -1));
        }
        m39 m39VarH = wm9.h(m39Var.i(0), ue5Var.b);
        gx1 gx1VarE2 = m39VarH.e();
        if ((gx1VarE2 instanceof m28) || lc5.Q(gx1VarE2, s39.c)) {
            String strA3 = m39Var.a();
            if (mf5VarG instanceof fg5) {
                return new qg5(ue5Var, (fg5) mf5VarG);
            }
            throw new kf5(ny1.E("Expected " + ug8.a(fg5.class).g() + ", but had " + ug8.a(mf5VarG.getClass()).g() + " as the serialized body of " + strA3, V(), null, ue5Var.a.m ? ny1.Q(mf5VarG.toString(), -1).toString() : null, -1));
        }
        if (!ue5Var.a.d) {
            throw ny1.c(m39VarH);
        }
        String strA4 = m39Var.a();
        if (mf5VarG instanceof we5) {
            return new pg5(ue5Var, (we5) mf5VarG);
        }
        throw new kf5(ny1.E("Expected " + ug8.a(we5.class).g() + ", but had " + ug8.a(mf5VarG.getClass()).g() + " as the serialized body of " + strA4, V(), null, ue5Var.a.m ? ny1.Q(mf5VarG.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.yd2
    public final int u(m39 m39Var) {
        m39Var.getClass();
        String str = (String) U();
        str.getClass();
        mf5 mf5VarF = F(str);
        String strA = m39Var.a();
        boolean z = mf5VarF instanceof jg5;
        ue5 ue5Var = this.c;
        if (z) {
            return bg5.b(m39Var, ue5Var, ((jg5) mf5VarF).a(), "");
        }
        throw new kf5(ny1.E("Expected " + ug8.a(jg5.class).g() + ", but had " + ug8.a(mf5VarF.getClass()).g() + " as the serialized body of " + strA, W(str), null, ue5Var.a.m ? ny1.Q(mf5VarF.toString(), -1).toString() : null, -1));
    }

    @Override // defpackage.yd2
    public final long v() {
        return O(U());
    }

    @Override // defpackage.yd2
    public boolean w() {
        return !(G() instanceof cg5);
    }

    @Override // defpackage.am1
    public final Object x(m39 m39Var, int i, oi5 oi5Var, Object obj) {
        m39Var.getClass();
        oi5Var.getClass();
        this.a.add(S(m39Var, i));
        Object objD = (oi5Var.e().c() || w()) ? d(oi5Var) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return objD;
    }

    @Override // defpackage.if5
    public final ue5 y() {
        return this.c;
    }

    @Override // defpackage.am1
    public final boolean z(m39 m39Var, int i) {
        m39Var.getClass();
        return H(S(m39Var, i));
    }
}
