package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class q1a implements PointerInputEventHandler, hc4 {
    public final /* synthetic */ yb4 a;

    public q1a(yb4 yb4Var) {
        this.a = yb4Var;
    }

    @Override // defpackage.hc4
    public final ub4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof hc4)) {
            return lc5.Q(a(), ((hc4) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(zx7 zx7Var, jt1 jt1Var) {
        return this.a.invoke(zx7Var, jt1Var);
    }
}
