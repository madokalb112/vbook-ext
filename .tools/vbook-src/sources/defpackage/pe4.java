package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pe4 implements jr9 {
    public final TaskCompletionSource a;

    public pe4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.jr9
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.jr9
    public final boolean b(r80 r80Var) {
        int i = r80Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(r80Var.a);
        return true;
    }
}
