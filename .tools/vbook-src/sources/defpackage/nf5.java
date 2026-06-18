package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class nf5 {
    public static final m75 a = lx1.e(tv9.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final jg5 a(String str) {
        return str == null ? cg5.INSTANCE : new yf5(str, true);
    }

    public static final void b(mf5 mf5Var, String str) {
        throw new IllegalArgumentException("Element " + ug8.a(mf5Var.getClass()) + " is not a " + str);
    }

    public static final int c(jg5 jg5Var) {
        try {
            long jH = h(jg5Var);
            if (-2147483648L <= jH && jH <= 2147483647L) {
                return (int) jH;
            }
            throw new NumberFormatException(jg5Var.a() + " is not an Int");
        } catch (kf5 e) {
            throw new NumberFormatException(e.a);
        }
    }

    public static final Integer d(jg5 jg5Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(h(jg5Var));
        } catch (kf5 unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final we5 e(mf5 mf5Var) {
        mf5Var.getClass();
        we5 we5Var = mf5Var instanceof we5 ? (we5) mf5Var : null;
        if (we5Var != null) {
            return we5Var;
        }
        b(mf5Var, "JsonArray");
        throw null;
    }

    public static final fg5 f(mf5 mf5Var) {
        mf5Var.getClass();
        fg5 fg5Var = mf5Var instanceof fg5 ? (fg5) mf5Var : null;
        if (fg5Var != null) {
            return fg5Var;
        }
        b(mf5Var, "JsonObject");
        throw null;
    }

    public static final jg5 g(mf5 mf5Var) {
        mf5Var.getClass();
        jg5 jg5Var = mf5Var instanceof jg5 ? (jg5) mf5Var : null;
        if (jg5Var != null) {
            return jg5Var;
        }
        b(mf5Var, "JsonPrimitive");
        throw null;
    }

    public static final long h(jg5 jg5Var) {
        mv9 mv9VarD = qn9.d(ue5.d, jg5Var.a());
        String str = mv9VarD.s;
        long jK = mv9VarD.k();
        if (mv9VarD.h() == 10) {
            return jK;
        }
        int i = mv9VarD.b;
        int i2 = i > 0 ? i - 1 : i;
        l1.s(mv9VarD, xv5.p("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
