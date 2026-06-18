package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ho0 {
    public final g07 a;

    public ho0(int i) {
        switch (i) {
            case 1:
                this.a = new g07(new gr5[16]);
                break;
            default:
                this.a = new g07(new dr1[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        g07 g07Var = this.a;
        int i = g07Var.c;
        zx0[] zx0VarArr = new zx0[i];
        for (int i2 = 0; i2 < i; i2++) {
            zx0VarArr[i2] = ((dr1) g07Var.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            zx0VarArr[i3].a(cancellationException);
        }
        if (g07Var.c == 0) {
            return;
        }
        t75.c("uncancelled requests present");
    }

    public void b() {
        g07 g07Var = this.a;
        ha5 ha5VarS0 = wx1.s0(0, g07Var.c);
        int i = ha5VarS0.a;
        int i2 = ha5VarS0.b;
        if (i <= i2) {
            while (true) {
                ((dr1) g07Var.a[i]).b.resumeWith(heb.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        g07Var.g();
    }
}
