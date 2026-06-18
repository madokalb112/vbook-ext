package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m1c {
    public final u1c a;
    public final l38 b;
    public final g2c c;

    static {
        cp4.o("WMFgUpdater");
    }

    public m1c(WorkDatabase workDatabase, l38 l38Var, u1c u1cVar) {
        this.b = l38Var;
        this.a = u1cVar;
        this.c = workDatabase.w();
    }
}
