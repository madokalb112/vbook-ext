package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x50 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ z50 b;

    public /* synthetic */ x50(z50 z50Var, int i) {
        this.a = i;
        this.b = z50Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zx7 zx7Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        final z50 z50Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                Object objI = m33.i(zx7Var, new kb4() { // from class: v50
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        heb hebVar2 = heb.a;
                        z50 z50Var2 = z50Var;
                        switch (i3) {
                            case 0:
                                z50Var2.a();
                                break;
                            default:
                                z50Var2.a();
                                break;
                        }
                        return hebVar2;
                    }
                }, new p50(z50Var, 3), new p50(z50Var, 4), new yb4() { // from class: w50
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj, Object obj2) {
                        int i3 = i2;
                        heb hebVar2 = heb.a;
                        z50 z50Var2 = z50Var;
                        ux7 ux7Var = (ux7) obj;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i3) {
                            case 0:
                                ux7Var.getClass();
                                ux7Var.a();
                                z50Var2.g(-fFloatValue);
                                break;
                            default:
                                ux7Var.getClass();
                                ux7Var.a();
                                z50Var2.g(-fFloatValue);
                                break;
                        }
                        return hebVar2;
                    }
                }, jt1Var);
                return objI == xx1Var ? objI : hebVar;
            default:
                final int i3 = 1;
                Object objI2 = m33.i(zx7Var, new kb4() { // from class: v50
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj) {
                        int i32 = i3;
                        heb hebVar2 = heb.a;
                        z50 z50Var2 = z50Var;
                        switch (i32) {
                            case 0:
                                z50Var2.a();
                                break;
                            default:
                                z50Var2.a();
                                break;
                        }
                        return hebVar2;
                    }
                }, new p50(z50Var, 5), new p50(z50Var, 6), new yb4() { // from class: w50
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj, Object obj2) {
                        int i32 = i3;
                        heb hebVar2 = heb.a;
                        z50 z50Var2 = z50Var;
                        ux7 ux7Var = (ux7) obj;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i32) {
                            case 0:
                                ux7Var.getClass();
                                ux7Var.a();
                                z50Var2.g(-fFloatValue);
                                break;
                            default:
                                ux7Var.getClass();
                                ux7Var.a();
                                z50Var2.g(-fFloatValue);
                                break;
                        }
                        return hebVar2;
                    }
                }, jt1Var);
                return objI2 == xx1Var ? objI2 : hebVar;
        }
    }
}
