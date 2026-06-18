package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wob implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ je4 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ a07 f;

    public wob(boolean z, je4 je4Var, a07 a07Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var2) {
        this.a = z;
        this.b = je4Var;
        this.c = a07Var;
        this.d = kb4Var;
        this.e = kb4Var2;
        this.f = a07Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        if (this.a) {
            Object objK = vv1.k(zx7Var, new vob(this.b, this.c, this.d, this.e, this.f, null), jt1Var);
            if (objK == xx1.a) {
                return objK;
            }
        }
        return heb.a;
    }
}
