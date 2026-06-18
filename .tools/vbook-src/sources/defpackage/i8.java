package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i8 extends sdc {
    @Override // defpackage.sdc
    public final void g0(ue1 ue1Var, Set set) {
        synchronized (ue1Var) {
            try {
                if (ue1Var.a == null) {
                    ue1Var.a = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sdc
    public final int h0(ue1 ue1Var) {
        int i;
        synchronized (ue1Var) {
            i = ue1Var.b - 1;
            ue1Var.b = i;
        }
        return i;
    }
}
