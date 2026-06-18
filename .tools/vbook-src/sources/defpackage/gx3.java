package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gx3 implements Closeable {
    public static final oh5 a;
    public static final zn7 b;

    static {
        oh5 oh5Var;
        try {
            Class.forName("java.nio.file.Files");
            oh5Var = new g67();
        } catch (ClassNotFoundException unused) {
            oh5Var = new oh5();
        }
        a = oh5Var;
        String str = zn7.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        b = xn7.b(property, false);
        ClassLoader classLoader = ll8.class.getClassLoader();
        classLoader.getClass();
        new ll8(classLoader);
    }

    public final void A(zn7 zn7Var) {
        zn7Var.getClass();
        vv vvVar = new vv();
        while (zn7Var != null && !e0(zn7Var)) {
            vvVar.addFirst(zn7Var);
            zn7Var = zn7Var.c();
        }
        Iterator it = vvVar.iterator();
        while (it.hasNext()) {
            N((zn7) it.next());
        }
    }

    public abstract zg5 A0(zn7 zn7Var);

    public final void E(zn7 zn7Var) {
        zn7Var.getClass();
        A(zn7Var);
    }

    public abstract zg5 F0(zn7 zn7Var);

    public final ag9 K0(zn7 zn7Var) {
        zn7Var.getClass();
        return O0(zn7Var, false);
    }

    public abstract void N(zn7 zn7Var);

    public abstract ag9 O0(zn7 zn7Var, boolean z);

    public final void P(zn7 zn7Var) {
        zn7Var.getClass();
        R(zn7Var, false);
    }

    public abstract void R(zn7 zn7Var, boolean z);

    public abstract il9 T0(zn7 zn7Var);

    public final void a0(zn7 zn7Var) {
        zn7Var.getClass();
        b39 b39VarY = ex1.Y(new d(this, zn7Var, null, 0));
        while (b39VarY.hasNext()) {
            R((zn7) b39VarY.next(), false);
        }
    }

    public final boolean e0(zn7 zn7Var) {
        zn7Var.getClass();
        return x0(zn7Var) != null;
    }

    public abstract List g0(zn7 zn7Var);

    public abstract List j0(zn7 zn7Var);

    public abstract ag9 p(zn7 zn7Var);

    public final ow3 p0(zn7 zn7Var) throws FileNotFoundException {
        zn7Var.getClass();
        ow3 ow3VarX0 = x0(zn7Var);
        if (ow3VarX0 != null) {
            return ow3VarX0;
        }
        if2.f(zn7Var, "no such file: ");
        return null;
    }

    public abstract void q(zn7 zn7Var, zn7 zn7Var2);

    public abstract ow3 x0(zn7 zn7Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
