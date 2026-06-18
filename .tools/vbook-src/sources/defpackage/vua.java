package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vua extends CancellationException implements yv1 {
    public final transient yd5 a;

    public vua(String str, yd5 yd5Var) {
        super(str);
        this.a = yd5Var;
    }

    @Override // defpackage.yv1
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        vua vuaVar = new vua(message, this.a);
        vuaVar.initCause(this);
        return vuaVar;
    }
}
