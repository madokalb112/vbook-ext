package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eb0 {
    public final s16 a;
    public final te7 b;

    public eb0(s16 s16Var, te7 te7Var) {
        this.a = s16Var;
        this.b = te7Var;
        if ((s16Var == null ? te7Var : s16Var) != null) {
            return;
        }
        gp.l("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
