package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ev8 {
    public final pa8 a;
    public final String b;
    public final boolean c;
    public final dbb d;
    public final nc1 e;
    public final ArrayList f;
    public volatile ThreadLocal g;

    public ev8(pa8 pa8Var, String str, dbb dbbVar, nc1 nc1Var, int i) {
        boolean z = (i & 4) == 0;
        dbbVar = (i & 8) != 0 ? null : dbbVar;
        pa8Var.getClass();
        this.a = pa8Var;
        this.b = str;
        this.c = z;
        this.d = dbbVar;
        this.e = nc1Var;
        this.f = new ArrayList();
        new LinkedHashSet();
    }

    public final void a(vv vvVar) {
        if (!vvVar.isEmpty()) {
            vvVar.removeFirst();
        }
        if (vvVar.isEmpty()) {
            b().remove();
        }
    }

    public final ThreadLocal b() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.g;
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (this) {
            threadLocal = this.g;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                this.g = threadLocal;
            }
        }
        return threadLocal;
    }

    public final vv c(rm7 rm7Var) {
        rm7Var.getClass();
        vv vvVar = (vv) b().get();
        if (vvVar == null) {
            vvVar = new vv();
            b().set(vvVar);
        }
        vvVar.addFirst(rm7Var);
        return vvVar;
    }

    public final Object d(a91 a91Var, rm7 rm7Var) {
        zk4 zk4Var = (zk4) this.e.b;
        zk4Var.getClass();
        if (yv5.e.compareTo(yv5.a) > 0) {
            return f(a91Var, rm7Var);
        }
        rh5.a(a91Var);
        zk4Var.getClass();
        long jA = xu6.a();
        Object objF = f(a91Var, rm7Var);
        long jA2 = jua.a(jA);
        rh5.a(a91Var);
        mc8 mc8Var = k63.b;
        k63.i(jA2, o63.MICROSECONDS);
        zk4Var.getClass();
        return objF;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a A[PHI: r1
  0x017a: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v22 java.lang.Object), (r1v27 java.lang.Object) binds: [B:9:0x0027, B:21:0x004e, B:82:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.s16 r12) throws e20 {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev8.e(s16):java.lang.Object");
    }

    public final Object f(a91 a91Var, rm7 rm7Var) {
        nc1 nc1Var = this.e;
        s16 s16Var = new s16((zk4) nc1Var.b, this, a91Var, rm7Var);
        zk4 zk4Var = (zk4) nc1Var.b;
        if (rm7Var == null) {
            return e(s16Var);
        }
        zk4Var.getClass();
        yv5 yv5Var = yv5.e;
        yv5 yv5Var2 = yv5.a;
        if (yv5Var.compareTo(yv5Var2) <= 0) {
            rm7Var.toString();
        }
        vv vvVarC = c(rm7Var);
        try {
            return e(s16Var);
        } finally {
            zk4Var.getClass();
            yv5Var.compareTo(yv5Var2);
            a(vvVarC);
        }
    }

    public final String toString() {
        return ky0.s(this.b, "']", new StringBuilder("['"));
    }
}
