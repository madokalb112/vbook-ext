package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s51 implements PointerInputEventHandler {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public s51(vx1 vx1Var, a07 a07Var, yy6 yy6Var, a07 a07Var2) {
        this.c = vx1Var;
        this.b = a07Var;
        this.d = yy6Var;
        this.e = a07Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                Object objE = aaa.e(zx7Var, (tob) null, (ke4) null, (gi9) null, new um(this.b, (bp) obj3, (ib4) obj2, (ib4) obj, 4), jt1Var, 7);
                return objE == xx1Var ? objE : hebVar;
            default:
                bga bgaVar = new bga((vx1) obj3, this.b, (yy6) obj2, null);
                qda qdaVar = new qda((a07) obj, 4);
                b43 b43Var = aaa.a;
                Object objA0 = wx1.a0(new u9a(zx7Var, bgaVar, qdaVar, new a28(zx7Var), (jt1) null, 0), jt1Var);
                if (objA0 != xx1Var) {
                    objA0 = hebVar;
                }
                return objA0 == xx1Var ? objA0 : hebVar;
        }
    }

    public s51(a07 a07Var, bp bpVar, ib4 ib4Var, ib4 ib4Var2) {
        this.b = a07Var;
        this.c = bpVar;
        this.d = ib4Var;
        this.e = ib4Var2;
    }
}
