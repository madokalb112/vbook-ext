package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w09 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ tda b;

    public /* synthetic */ w09(tda tdaVar, int i) {
        this.a = i;
        this.b = tdaVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        tda tdaVar = this.b;
        switch (i) {
            case 0:
                Object objX = yn2.x(zx7Var, tdaVar, jt1Var);
                return objX == xx1Var ? objX : hebVar;
            default:
                Object objX2 = yn2.x(zx7Var, tdaVar, jt1Var);
                return objX2 == xx1Var ? objX2 : hebVar;
        }
    }
}
