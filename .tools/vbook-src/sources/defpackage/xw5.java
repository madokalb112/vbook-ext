package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xw5 implements ww5 {
    public final qt a;
    public final d6a b = new d6a(new uk2(this, 22));

    public xw5(qt qtVar) {
        this.a = qtVar;
    }

    public final void a(int i) {
        this.a.N.e(qt.T[39], Integer.valueOf(i));
        b07 b07VarC = c();
        while (true) {
            fr9 fr9Var = (fr9) b07VarC;
            Object value = fr9Var.getValue();
            int i2 = i;
            if (fr9Var.j(value, ac9.a((ac9) value, 0, 0, 0, 0, i2, false, false, false, 239))) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final fe8 b() {
        return new fe8(c());
    }

    public final b07 c() {
        return (b07) this.b.getValue();
    }
}
