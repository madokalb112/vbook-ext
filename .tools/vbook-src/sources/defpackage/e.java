package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class e {
    public static final av0 a;
    public static final av0 b;
    public static final av0 c;
    public static final av0 d;
    public static final av0 e;

    static {
        av0 av0Var = av0.d;
        a = ra1.s("/");
        b = ra1.s("\\");
        c = ra1.s("/\\");
        d = ra1.s(".");
        e = ra1.s("..");
    }

    public static final int a(zn7 zn7Var) {
        av0 av0Var = zn7Var.a;
        if (av0Var.d() != 0) {
            if (av0Var.i(0) != 47) {
                if (av0Var.i(0) == 92) {
                    if (av0Var.d() > 2 && av0Var.i(1) == 92) {
                        av0 av0Var2 = b;
                        av0Var2.getClass();
                        int iF = av0Var.f(2, av0Var2.h());
                        return iF == -1 ? av0Var.d() : iF;
                    }
                } else if (av0Var.d() > 2 && av0Var.i(1) == 58 && av0Var.i(2) == 92) {
                    char cI = (char) av0Var.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final zn7 b(zn7 zn7Var, zn7 zn7Var2, boolean z) {
        zn7Var.getClass();
        zn7Var2.getClass();
        if (a(zn7Var2) != -1 || zn7Var2.g() != null) {
            return zn7Var2;
        }
        av0 av0VarC = c(zn7Var);
        if (av0VarC == null && (av0VarC = c(zn7Var2)) == null) {
            av0VarC = f(zn7.b);
        }
        xq0 xq0Var = new xq0();
        xq0Var.F0(zn7Var.a);
        if (xq0Var.b > 0) {
            xq0Var.F0(av0VarC);
        }
        xq0Var.F0(zn7Var2.a);
        return d(xq0Var, z);
    }

    public static final av0 c(zn7 zn7Var) {
        av0 av0Var = zn7Var.a;
        av0 av0Var2 = a;
        if (av0.g(av0Var, av0Var2) != -1) {
            return av0Var2;
        }
        av0 av0Var3 = zn7Var.a;
        av0 av0Var4 = b;
        if (av0.g(av0Var3, av0Var4) != -1) {
            return av0Var4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[EDGE_INSN: B:98:0x0110->B:81:0x0110 BREAK  A[LOOP:1: B:53:0x00ab->B:112:0x00ab], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zn7 d(defpackage.xq0 r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e.d(xq0, boolean):zn7");
    }

    public static final av0 e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        gp.l(dx1.f(b2, "not a directory separator: "));
        return null;
    }

    public static final av0 f(String str) {
        if (lc5.Q(str, "/")) {
            return a;
        }
        if (lc5.Q(str, "\\")) {
            return b;
        }
        gp.l(ky0.r("not a directory separator: ", str));
        return null;
    }
}
