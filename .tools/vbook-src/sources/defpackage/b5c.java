package defpackage;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b5c extends gx3 {
    public static final zn7 f;
    public final zn7 c;
    public final gx3 d;
    public final LinkedHashMap e;

    static {
        String str = zn7.b;
        f = xn7.b("/", false);
    }

    public b5c(zn7 zn7Var, gx3 gx3Var, LinkedHashMap linkedHashMap) {
        gx3Var.getClass();
        this.c = zn7Var;
        this.d = gx3Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.gx3
    public final zg5 A0(zn7 zn7Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.gx3
    public final zg5 F0(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.gx3
    public final void N(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gx3
    public final ag9 O0(zn7 zn7Var, boolean z) throws IOException {
        zn7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gx3
    public final void R(zn7 zn7Var, boolean z) throws IOException {
        zn7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gx3
    public final il9 T0(zn7 zn7Var) throws Throwable {
        Throwable th;
        ie8 ie8Var;
        zn7Var.getClass();
        zn7 zn7Var2 = f;
        zn7Var2.getClass();
        r4c r4cVar = (r4c) this.e.get(e.b(zn7Var2, zn7Var, true));
        if (r4cVar == null) {
            if2.f(zn7Var, "no such file: ");
            return null;
        }
        long j = r4cVar.f;
        zg5 zg5VarA0 = this.d.A0(this.c);
        try {
            ie8Var = new ie8(zg5VarA0.q(r4cVar.h));
            try {
                zg5VarA0.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (zg5VarA0 != null) {
                try {
                    zg5VarA0.close();
                } catch (Throwable th4) {
                    i12.r(th3, th4);
                }
            }
            th = th3;
            ie8Var = null;
        }
        if (th != null) {
            throw th;
        }
        ie8Var.getClass();
        un9.q(ie8Var, null);
        if (r4cVar.g == 0) {
            return new xz3(ie8Var, j, true);
        }
        return new xz3(new g75(new ie8(new xz3(ie8Var, r4cVar.e, true)), new Inflater(true)), j, false);
    }

    public final List U0(zn7 zn7Var, boolean z) {
        zn7 zn7Var2 = f;
        zn7Var2.getClass();
        zn7Var.getClass();
        r4c r4cVar = (r4c) this.e.get(e.b(zn7Var2, zn7Var, true));
        if (r4cVar != null) {
            return fc1.Z0(r4cVar.q);
        }
        if (!z) {
            return null;
        }
        so9.m(zn7Var, "not a directory: ");
        return null;
    }

    @Override // defpackage.gx3
    public final List g0(zn7 zn7Var) {
        zn7Var.getClass();
        List listU0 = U0(zn7Var, true);
        listU0.getClass();
        return listU0;
    }

    @Override // defpackage.gx3
    public final List j0(zn7 zn7Var) {
        zn7Var.getClass();
        return U0(zn7Var, false);
    }

    @Override // defpackage.gx3
    public final ag9 p(zn7 zn7Var) throws IOException {
        zn7Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gx3
    public final void q(zn7 zn7Var, zn7 zn7Var2) throws IOException {
        zn7Var.getClass();
        zn7Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    @Override // defpackage.gx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ow3 x0(defpackage.zn7 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5c.x0(zn7):ow3");
    }
}
