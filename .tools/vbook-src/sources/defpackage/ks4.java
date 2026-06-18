package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ks4 implements vx1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final j00 e;
    public final is4 a;
    public wu4 b;
    public gv4 c;
    private volatile /* synthetic */ int received;

    static {
        fbb fbbVarD;
        a91 a91VarA = ug8.a(Object.class);
        try {
            fbbVarD = ug8.d(Object.class);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        e = new j00("CustomResponse", new bbb(a91VarA, fbbVarD));
        d = AtomicIntegerFieldUpdater.newUpdater(ks4.class, "received");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ks4(is4 is4Var, fx3 fx3Var, iv4 iv4Var) {
        this(is4Var);
        is4Var.getClass();
        fx3Var.getClass();
        iv4Var.getClass();
        this.b = new hh2(this, fx3Var);
        this.c = new ih2(this, iv4Var);
        on1 attributes = getAttributes();
        attributes.getClass();
        j00 j00Var = e;
        j00Var.getClass();
        attributes.d().remove(j00Var);
        Object obj = iv4Var.e;
        if (obj instanceof ut0) {
            return;
        }
        getAttributes().f(j00Var, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r8 == r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bbb r7, defpackage.kt1 r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks4.a(bbb, kt1):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    public final wu4 c() {
        wu4 wu4Var = this.b;
        if (wu4Var != null) {
            return wu4Var;
        }
        lc5.i0("request");
        throw null;
    }

    public final gv4 d() {
        gv4 gv4Var = this.c;
        if (gv4Var != null) {
            return gv4Var;
        }
        lc5.i0("response");
        throw null;
    }

    public final on1 getAttributes() {
        return c().getAttributes();
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return d().q();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().e() + ']';
    }

    public ks4(is4 is4Var) {
        is4Var.getClass();
        this.a = is4Var;
        this.received = 0;
    }
}
