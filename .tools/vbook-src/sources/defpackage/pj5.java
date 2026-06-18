package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pj5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ ib4 c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ pj5(ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, int i) {
        this.a = i;
        this.b = ib4Var;
        this.c = ib4Var2;
        this.d = ib4Var3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        ib4 ib4Var = this.d;
        ib4 ib4Var2 = this.c;
        ib4 ib4Var3 = this.b;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((cj5) obj).a;
                keyEvent.getClass();
                if (vw1.E(keyEvent) == 2) {
                    long jE = cx1.e(keyEvent.getKeyCode());
                    if (aj5.a(jE, aj5.e) || aj5.a(jE, aj5.g)) {
                        ib4Var3.invoke();
                    } else if (aj5.a(jE, aj5.d) || aj5.a(jE, aj5.f)) {
                        ib4Var2.invoke();
                    } else if (aj5.a(jE, aj5.s) || aj5.a(jE, aj5.t) || aj5.a(jE, aj5.G) || aj5.a(jE, aj5.H)) {
                        ib4Var.invoke();
                    }
                    z = true;
                    break;
                }
                break;
            default:
                KeyEvent keyEvent2 = ((cj5) obj).a;
                keyEvent2.getClass();
                if (vw1.E(keyEvent2) == 2) {
                    long jE2 = cx1.e(keyEvent2.getKeyCode());
                    if (aj5.a(jE2, aj5.i)) {
                        ib4Var3.invoke();
                    } else if (aj5.a(jE2, aj5.H)) {
                        ib4Var2.invoke();
                    } else if (aj5.a(jE2, aj5.j)) {
                        ib4Var.invoke();
                    }
                    z = true;
                    break;
                }
                break;
        }
        return Boolean.FALSE;
    }
}
