package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class le4 implements PointerInputEventHandler {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rg8 b;
    public final /* synthetic */ y91 c;

    public le4(y91 y91Var, rg8 rg8Var) {
        this.c = y91Var;
        this.b = rg8Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                Object objA0 = wx1.a0(new vg(zx7Var, this.c, this.b, (jt1) null, 18), jt1Var);
                return objA0 == xx1Var ? objA0 : hebVar;
            default:
                Object objK = vv1.k(zx7Var, new d(this.b, this.c, null, 2), jt1Var);
                return objK == xx1Var ? objK : hebVar;
        }
    }

    public le4(rg8 rg8Var, y91 y91Var) {
        this.b = rg8Var;
        this.c = y91Var;
    }
}
