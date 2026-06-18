package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class nm8 extends vc0 {
    public nm8(jt1 jt1Var) {
        super(jt1Var);
        if (jt1Var == null || jt1Var.getContext() == hc3.a) {
            return;
        }
        gp.l("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return hc3.a;
    }
}
