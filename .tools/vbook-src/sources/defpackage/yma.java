package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yma implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yma(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                zlb zlbVar = new zlb();
                ym7 ym7Var = (ym7) obj2;
                Object objH = m33.h(zx7Var, new nx9(zlbVar, 8), new wp0(zlbVar, (joa) obj3, ym7Var, (ym7) obj, 16), new o39(ym7Var, 23), new b18(14, zlbVar, ym7Var), jt1Var);
                return objH == xx1Var ? objH : hebVar;
            case 1:
                if (((jka) obj3).d() != t19.a) {
                    return hebVar;
                }
                sw8 sw8Var = (sw8) obj;
                Object objA0 = wx1.a0(new u9a(zx7Var, (kf8) obj2, new iy1(sw8Var, 3), new iy1(sw8Var, 4), new ql7(sw8Var, 2), null, 2), jt1Var);
                if (objA0 != xx1Var) {
                    objA0 = hebVar;
                }
                return objA0 == xx1Var ? objA0 : hebVar;
            default:
                Object objA02 = wx1.a0(new no0(zx7Var, (n7c) obj3, (a07) obj2, (a07) obj, null, 5), jt1Var);
                if (objA02 != xx1Var) {
                    objA02 = hebVar;
                }
                return objA02 == xx1Var ? objA02 : hebVar;
        }
    }
}
