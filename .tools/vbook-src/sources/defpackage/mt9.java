package defpackage;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mt9 extends RequestBody {
    public final Long b;
    public final ib4 c;

    public mt9(jx1 jx1Var, Long l, ib4 ib4Var) {
        jx1Var.getClass();
        this.b = l;
        this.c = ib4Var;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        Long l = this.b;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // okhttp3.RequestBody
    public final void e(he8 he8Var) throws IOException {
        ?? r5;
        try {
            ut0 ut0Var = (ut0) this.c.invoke();
            ut0Var.getClass();
            j85 j85VarL0 = tu1.l0(new mh0(ut0Var, 0));
            Long th = null;
            try {
                Long lValueOf = Long.valueOf(he8Var.q(j85VarL0));
                try {
                    j85VarL0.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                Long l = th;
                th = lValueOf;
                r5 = l;
            } catch (Throwable th3) {
                try {
                    j85VarL0.close();
                    r5 = th3;
                } catch (Throwable th4) {
                    i12.r(th3, th4);
                    r5 = th3;
                }
            }
            if (r5 != 0) {
                throw r5;
            }
            th.getClass();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th5) {
            throw new us9(th5);
        }
    }
}
