package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class py1 {
    public final q32 a;
    public final y91 b;

    public py1(q32 q32Var, fx3 fx3Var) {
        this.a = q32Var;
        this.b = new y91(fx3Var);
    }

    public final void a(String str) {
        y91 y91Var = this.b;
        synchronized (y91Var) {
            if (!Objects.equals((String) y91Var.c, str)) {
                y91.S((fx3) y91Var.b, str, (String) y91Var.d);
                y91Var.c = str;
            }
        }
    }
}
