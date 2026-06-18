package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wma implements PointerInputEventHandler {
    public final /* synthetic */ zlb a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ vx1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;
    public final /* synthetic */ int s;
    public final /* synthetic */ a07 t;

    public wma(zlb zlbVar, a07 a07Var, vx1 vx1Var, int i, a07 a07Var2, a07 a07Var3, int i2, a07 a07Var4) {
        this.a = zlbVar;
        this.b = a07Var;
        this.c = vx1Var;
        this.d = i;
        this.e = a07Var2;
        this.f = a07Var3;
        this.s = i2;
        this.t = a07Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        zlb zlbVar = this.a;
        a07 a07Var = this.b;
        k49 k49Var = new k49(17, zlbVar, a07Var);
        vx1 vx1Var = this.c;
        int i = this.d;
        a07 a07Var2 = this.e;
        a07 a07Var3 = this.f;
        Object objH = m33.h(zx7Var, k49Var, new vma(a07Var, vx1Var, i, a07Var2, a07Var3), new vma(vx1Var, i, a07Var2, a07Var3, a07Var), new tv2(i, this.s, zlbVar, a07Var2, a07Var3, this.t), jt1Var);
        return objH == xx1.a ? objH : heb.a;
    }
}
