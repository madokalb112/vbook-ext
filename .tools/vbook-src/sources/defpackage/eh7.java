package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eh7 implements s58 {
    public static final k27 c = new k27(18);
    public static final mj1 d = new mj1(5);
    public ll2 a;
    public volatile s58 b;

    public eh7(k27 k27Var, s58 s58Var) {
        this.a = k27Var;
        this.b = s58Var;
    }

    public final void a(ll2 ll2Var) {
        s58 s58Var;
        s58 s58Var2;
        s58 s58Var3 = this.b;
        mj1 mj1Var = d;
        if (s58Var3 != mj1Var) {
            ll2Var.e(s58Var3);
            return;
        }
        synchronized (this) {
            s58Var = this.b;
            if (s58Var != mj1Var) {
                s58Var2 = s58Var;
            } else {
                this.a = new gj1(7, this.a, ll2Var);
                s58Var2 = null;
            }
        }
        if (s58Var2 != null) {
            ll2Var.e(s58Var);
        }
    }

    @Override // defpackage.s58
    public final Object get() {
        return this.b.get();
    }
}
