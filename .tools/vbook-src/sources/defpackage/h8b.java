package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h8b {
    public final fr9 a = gr9.a(new e8b());
    public final fr9 b = gr9.a(new f8b());
    public final fr9 c = gr9.a(new g8b(0));

    public final void a(String str) {
        str.getClass();
        while (true) {
            fr9 fr9Var = this.a;
            Object value = fr9Var.getValue();
            String str2 = str;
            if (fr9Var.j(value, e8b.a((e8b) value, str2, 0, null, false, false, false, false, Token.ELSE))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void b(int i, String str) {
        str.getClass();
        while (true) {
            fr9 fr9Var = this.a;
            Object value = fr9Var.getValue();
            int i2 = i;
            String str2 = str;
            if (fr9Var.j(value, e8b.a((e8b) value, null, i2, str2, false, true, false, false, 9))) {
                return;
            }
            i = i2;
            str = str2;
        }
    }

    public final void c() {
        fr9 fr9Var;
        Object value;
        do {
            fr9Var = this.a;
            value = fr9Var.getValue();
        } while (!fr9Var.j(value, e8b.a((e8b) value, null, 0, null, false, false, false, true, 15)));
    }

    public final void d(boolean z, boolean z2) {
        while (true) {
            fr9 fr9Var = this.a;
            Object value = fr9Var.getValue();
            boolean z3 = z;
            boolean z4 = z2;
            if (fr9Var.j(value, e8b.a((e8b) value, null, 0, null, false, z3, z4, false, 15))) {
                return;
            }
            z = z3;
            z2 = z4;
        }
    }
}
