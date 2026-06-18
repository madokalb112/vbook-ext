package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oe4 implements jr9 {
    public final jjb a;
    public final TaskCompletionSource b;

    public oe4(jjb jjbVar, TaskCompletionSource taskCompletionSource) {
        this.a = jjbVar;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.jr9
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.jr9
    public final boolean b(r80 r80Var) {
        if (r80Var.b == 4 && !this.a.a(r80Var)) {
            String str = r80Var.c;
            if (str != null) {
                this.b.setResult(new i80(r80Var.e, r80Var.f, str));
                return true;
            }
            k27.n("Null token");
        }
        return false;
    }
}
