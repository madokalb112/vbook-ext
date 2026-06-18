package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jfb extends r0 {
    public final y48 a;
    public final String b;
    public final Integer c;
    public final kb7 d;
    public final int e;

    public jfb(y48 y48Var, int i, kb7 kb7Var, int i2) {
        int i3;
        String str = y48Var.b;
        Integer num = (i2 & 16) != 0 ? null : 0;
        kb7Var = (i2 & 32) != 0 ? null : kb7Var;
        str.getClass();
        this.a = y48Var;
        this.b = str;
        this.c = num;
        this.d = kb7Var;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else {
            if (i >= 1000) {
                gp.l(xv5.k(i, "Max value ", " is too large"));
                throw null;
            }
            i3 = 3;
        }
        this.e = i3;
    }

    @Override // defpackage.r0
    public final y48 a() {
        return this.a;
    }

    @Override // defpackage.r0
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.r0
    public final String c() {
        return this.b;
    }

    @Override // defpackage.r0
    public final kb7 d() {
        return this.d;
    }
}
