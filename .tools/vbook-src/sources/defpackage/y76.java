package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y76 extends q5 {
    public final r5 a;

    public y76(r5 r5Var, a07 a07Var) {
        this.a = r5Var;
    }

    @Override // defpackage.q5
    public final void a(Object obj) {
        w5 w5Var = this.a.a;
        if (w5Var != null) {
            w5Var.a(obj);
        } else {
            gp.j("Launcher has not been initialized");
        }
    }

    @Override // defpackage.q5
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
