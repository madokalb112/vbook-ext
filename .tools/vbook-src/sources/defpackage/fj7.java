package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fj7 implements bi5 {
    public final /* synthetic */ int a;
    public final Object b;

    public fj7(wt7 wt7Var, int i) {
        this.a = i;
        wt7Var.getClass();
        switch (i) {
            case 1:
                this.b = wt7Var;
                break;
            default:
                this.b = wt7Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.bi5
    public final Object a(jt1 jt1Var) throws Throwable {
        int i = this.a;
        int i2 = 18;
        ?? r2 = 0;
        Throwable th = null;
        r2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                aj2 aj2Var = rw2.a;
                return ah1.b0(nh2.c, new ne0((wt7) obj, r2, i2), jt1Var);
            case 1:
                aj2 aj2Var2 = rw2.a;
                return ah1.b0(nh2.c, new ne0((wt7) obj, r2, i2), jt1Var);
            default:
                gx3.a.getClass();
                j85 j85VarK0 = tu1.k0(((zn7) obj).toFile());
                xq0 xq0Var = new xq0();
                try {
                    xq0Var.K0(j85VarK0);
                    byte[] bArrE0 = xq0Var.e0(xq0Var.b);
                    try {
                        j85VarK0.close();
                        xq0Var.p();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    Throwable th3 = th;
                    r2 = bArrE0;
                    th = th3;
                    break;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        j85VarK0.close();
                        xq0Var.p();
                    } catch (Throwable th5) {
                        i12.r(th, th5);
                    }
                    break;
                }
                if (th == null) {
                    return r2;
                }
                throw th;
        }
    }

    @Override // defpackage.bi5
    public final String b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return vo1.X((wt7) obj);
            case 1:
                return vo1.X((wt7) obj);
            default:
                return ((zn7) obj).a.s();
        }
    }

    @Override // defpackage.bi5
    public final String getName() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return vo1.W((wt7) obj);
            case 1:
                return vo1.W((wt7) obj);
            default:
                String strB = ((zn7) obj).b();
                int i2 = pgb.a;
                return pgb.a(strB);
        }
    }

    public fj7(zn7 zn7Var) {
        this.a = 2;
        this.b = zn7Var;
    }
}
