package defpackage;

import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vo0 implements kb4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ vo0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((cy0) this.b).cancel();
                break;
            case 1:
                ((RealCall) this.b).d();
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cy7 cy7Var = (cy7) this.b;
                if (cy7Var != null) {
                    cy7Var.c = zBooleanValue;
                }
                break;
            case 3:
                KeyEvent keyEvent = ((cj5) obj).a;
                o19 o19Var = (o19) this.b;
                if (lj5.a.r(keyEvent) == bj5.COPY) {
                    o19Var.b();
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 4:
                float[] fArr = ((u96) obj).a;
                ym5 ym5Var = (ym5) this.b;
                if (ym5Var.l()) {
                    e11.K(ym5Var).o(ym5Var, fArr);
                }
                break;
            case 5:
                ((ax2) this.b).a();
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((ae5) this.b).s(new CancellationException(th.getMessage()));
                }
                break;
        }
        return hebVar;
    }
}
