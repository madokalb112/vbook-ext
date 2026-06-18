package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s50 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;

    public /* synthetic */ s50(int i, ib4 ib4Var) {
        this.a = i;
        this.b = ib4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        ib4 ib4Var = this.b;
        switch (i) {
            case 0:
                Object objE = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new zr(1, ib4Var), jt1Var, 7);
                return objE == xx1Var ? objE : hebVar;
            case 1:
                Object objE2 = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new zr(2, ib4Var), jt1Var, 7);
                return objE2 == xx1Var ? objE2 : hebVar;
            case 2:
                Object objE3 = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new zr(3, ib4Var), jt1Var, 7);
                return objE3 == xx1Var ? objE3 : hebVar;
            case 3:
                Object objE4 = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new zr(4, ib4Var), jt1Var, 7);
                return objE4 == xx1Var ? objE4 : hebVar;
            default:
                Object objE5 = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new zr(10, ib4Var), jt1Var, 7);
                return objE5 == xx1Var ? objE5 : hebVar;
        }
    }
}
