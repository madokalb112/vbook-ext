package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x14 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ x14(a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((cj5) obj).a;
                keyEvent.getClass();
                if (vw1.E(keyEvent) == 2 && aj5.a(cx1.e(keyEvent.getKeyCode()), aj5.w)) {
                    if (((Boolean) a07Var2.getValue()).booleanValue()) {
                        ((ib4) a07Var.getValue()).invoke();
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                a07Var2.setValue(wj8Var);
                a07Var.setValue(Boolean.TRUE);
                return heb.a;
        }
    }
}
