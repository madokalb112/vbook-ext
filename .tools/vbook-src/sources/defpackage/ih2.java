package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ih2 extends gv4 {
    public final /* synthetic */ int a = 0;
    public final yv4 b;
    public final qu4 c;
    public final wc4 d;
    public final wc4 e;
    public final ek4 f;
    public final jx1 s;
    public final ks4 t;
    public final Object u;

    public ih2(ks4 ks4Var, iv4 iv4Var) {
        iv4Var.getClass();
        this.t = ks4Var;
        this.s = iv4Var.f;
        this.b = iv4Var.a;
        this.c = iv4Var.d;
        this.d = iv4Var.b;
        this.e = iv4Var.g;
        Object obj = iv4Var.e;
        ut0 ut0Var = obj instanceof ut0 ? (ut0) obj : null;
        if (ut0Var == null) {
            ut0.a.getClass();
            ut0Var = tt0.b;
        }
        this.u = ut0Var;
        this.f = iv4Var.c;
    }

    @Override // defpackage.fu4
    public final ek4 a() {
        switch (this.a) {
        }
        return this.f;
    }

    @Override // defpackage.gv4
    public final ut0 b() {
        int i = this.a;
        Object obj = this.u;
        switch (i) {
            case 0:
                return (ut0) obj;
            default:
                return t96.e((byte[]) obj);
        }
    }

    @Override // defpackage.gv4
    public final wc4 c() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // defpackage.gv4
    public final wc4 d() {
        switch (this.a) {
        }
        return this.e;
    }

    @Override // defpackage.gv4
    public final yv4 e() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.gv4
    public final qu4 f() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.gv4
    public final ks4 p0() {
        int i = this.a;
        ks4 ks4Var = this.t;
        switch (i) {
            case 0:
                return ks4Var;
            default:
                return (ws8) ks4Var;
        }
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        switch (this.a) {
        }
        return this.s;
    }

    public ih2(ws8 ws8Var, byte[] bArr, gv4 gv4Var) {
        this.t = ws8Var;
        this.u = bArr;
        this.b = gv4Var.e();
        this.c = gv4Var.f();
        this.d = gv4Var.c();
        this.e = gv4Var.d();
        this.f = gv4Var.a();
        this.s = gv4Var.q();
    }
}
