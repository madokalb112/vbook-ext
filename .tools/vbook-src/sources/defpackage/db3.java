package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class db3 {
    public int a = 1;
    public final sg6 b;
    public sg6 c;
    public sg6 d;
    public int e;
    public int f;

    public db3(sg6 sg6Var) {
        this.b = sg6Var;
        this.c = sg6Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        pg6 pg6VarB = this.c.b.b();
        int iA = pg6VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) pg6VarB.d).get(iA + pg6VarB.a) == 0) || this.e == 65039;
    }
}
