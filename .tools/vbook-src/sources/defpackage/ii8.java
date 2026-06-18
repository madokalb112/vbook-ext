package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ii8 implements i89 {
    public static final int g;
    public static final yg8 h;
    public final iua a;
    public final az3 b;
    public final qu c;
    public final ji8 d;
    public final g89 e;
    public final t07 f;

    static {
        mc8 mc8Var = k63.b;
        g = (int) k63.i(lx1.z0(24, o63.HOURS), o63.SECONDS);
        h = new yg8("com/google/firebase/sessions//");
    }

    public ii8(iua iuaVar, az3 az3Var, qu quVar, ji8 ji8Var, g89 g89Var) {
        iuaVar.getClass();
        az3Var.getClass();
        quVar.getClass();
        ji8Var.getClass();
        g89Var.getClass();
        this.a = iuaVar;
        this.b = az3Var;
        this.c = quVar;
        this.d = ji8Var;
        this.e = g89Var;
        this.f = u07.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(1:(5:13|61|14|57|58)(2:18|19))(5:20|63|21|45|(3:47|48|49)(4:50|(1:53)|(3:56|57|58)|55))|59|60)(1:25))(2:26|(3:31|(0)|55)(1:30))|64|34|(3:36|37|38)(3:41|(3:44|45|(0)(0))|55)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:45:0x00b1, B:47:0x00bb, B:50:0x00c4), top: B:63:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:21:0x004f, B:45:0x00b1, B:47:0x00bb, B:50:0x00c4), top: B:63:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.i89
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jt1 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii8.a(jt1):java.lang.Object");
    }

    @Override // defpackage.i89
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // defpackage.i89
    public final k63 c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        mc8 mc8Var = k63.b;
        return new k63(lx1.z0(num.intValue(), o63.SECONDS));
    }

    @Override // defpackage.i89
    public final Double d() {
        return this.e.a().b;
    }
}
