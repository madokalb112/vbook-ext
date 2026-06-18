package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zn7 implements Comparable {
    public static final String b;
    public final av0 a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public zn7(av0 av0Var) {
        av0Var.getClass();
        this.a = av0Var;
    }

    public static zn7 f(zn7 zn7Var, String str) {
        zn7Var.getClass();
        str.getClass();
        xq0 xq0Var = new xq0();
        xq0Var.X0(str);
        return e.b(zn7Var, e.d(xq0Var, false), false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = e.a(this);
        av0 av0Var = this.a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < av0Var.d() && av0Var.i(iA) == 92) {
            iA++;
        }
        int iD = av0Var.d();
        int i = iA;
        while (iA < iD) {
            if (av0Var.i(iA) == 47 || av0Var.i(iA) == 92) {
                arrayList.add(av0Var.o(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < av0Var.d()) {
            arrayList.add(av0Var.o(i, av0Var.d()));
        }
        return arrayList;
    }

    public final String b() {
        av0 av0Var = e.a;
        av0 av0VarP = this.a;
        int iK = av0.k(av0VarP, av0Var);
        if (iK == -1) {
            iK = av0.k(av0VarP, e.b);
        }
        if (iK != -1) {
            av0VarP = av0.p(av0VarP, iK + 1, 0, 2);
        } else if (g() != null && av0VarP.d() == 2) {
            av0VarP = av0.d;
        }
        return av0VarP.s();
    }

    public final zn7 c() {
        av0 av0Var = e.d;
        av0 av0Var2 = this.a;
        if (lc5.Q(av0Var2, av0Var)) {
            return null;
        }
        av0 av0Var3 = e.a;
        if (lc5.Q(av0Var2, av0Var3)) {
            return null;
        }
        av0 av0Var4 = e.b;
        if (lc5.Q(av0Var2, av0Var4)) {
            return null;
        }
        av0 av0Var5 = e.e;
        av0Var2.getClass();
        av0Var5.getClass();
        int iD = av0Var2.d();
        byte[] bArr = av0Var5.a;
        if (av0Var2.l(iD - bArr.length, av0Var5, bArr.length) && (av0Var2.d() == 2 || av0Var2.l(av0Var2.d() - 3, av0Var3, 1) || av0Var2.l(av0Var2.d() - 3, av0Var4, 1))) {
            return null;
        }
        int iK = av0.k(av0Var2, av0Var3);
        if (iK == -1) {
            iK = av0.k(av0Var2, av0Var4);
        }
        if (iK == 2 && g() != null) {
            if (av0Var2.d() == 3) {
                return null;
            }
            return new zn7(av0.p(av0Var2, 0, 3, 1));
        }
        if (iK == 1) {
            av0Var4.getClass();
            if (av0Var2.l(0, av0Var4, av0Var4.d())) {
                return null;
            }
        }
        if (iK != -1 || g() == null) {
            return iK == -1 ? new zn7(av0Var) : iK == 0 ? new zn7(av0.p(av0Var2, 0, 1, 1)) : new zn7(av0.p(av0Var2, 0, iK, 1));
        }
        if (av0Var2.d() == 2) {
            return null;
        }
        return new zn7(av0.p(av0Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zn7 zn7Var = (zn7) obj;
        zn7Var.getClass();
        return this.a.compareTo(zn7Var.a);
    }

    public final zn7 d(zn7 zn7Var) {
        zn7Var.getClass();
        av0 av0Var = zn7Var.a;
        int iA = e.a(this);
        av0 av0Var2 = this.a;
        zn7 zn7Var2 = iA == -1 ? null : new zn7(av0Var2.o(0, iA));
        int iA2 = e.a(zn7Var);
        if (!lc5.Q(zn7Var2, iA2 == -1 ? null : new zn7(av0Var.o(0, iA2)))) {
            k27.j("Paths of different roots cannot be relative to each other: ", this, " and ", zn7Var);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = zn7Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && lc5.Q(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && av0Var2.d() == av0Var.d()) {
            return xn7.b(".", false);
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(e.e) != -1) {
            k27.j("Impossible relative path to resolve: ", this, " and ", zn7Var);
            return null;
        }
        if (lc5.Q(av0Var, e.d)) {
            return this;
        }
        xq0 xq0Var = new xq0();
        av0 av0VarC = e.c(zn7Var);
        if (av0VarC == null && (av0VarC = e.c(this)) == null) {
            av0VarC = e.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            xq0Var.F0(e.e);
            xq0Var.F0(av0VarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            xq0Var.F0((av0) arrayListA.get(i));
            xq0Var.F0(av0VarC);
            i++;
        }
        return e.d(xq0Var, false);
    }

    public final zn7 e(String str) {
        str.getClass();
        xq0 xq0Var = new xq0();
        xq0Var.X0(str);
        return e.b(this, e.d(xq0Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zn7) && lc5.Q(((zn7) obj).a, this.a);
    }

    public final Character g() {
        av0 av0Var = e.a;
        av0 av0Var2 = this.a;
        if (av0.g(av0Var2, av0Var) != -1 || av0Var2.d() < 2 || av0Var2.i(1) != 58) {
            return null;
        }
        char cI = (char) av0Var2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.s());
    }

    public final String toString() {
        return this.a.s();
    }
}
