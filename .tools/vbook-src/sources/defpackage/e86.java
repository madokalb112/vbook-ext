package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class e86 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public e86() {
        if (ix7.b == null) {
            ix7.b = new ix7(6);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void c() {
        if (((f86) this.d).t == this.c) {
            return;
        }
        gp.d();
    }

    public void d() {
        while (true) {
            int i = this.a;
            f86 f86Var = (f86) this.d;
            if (i >= f86Var.f || f86Var.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.a < ((f86) this.d).f;
    }

    public void remove() {
        f86 f86Var = (f86) this.d;
        c();
        if (this.b == -1) {
            gp.j("Call next() before removing element from the iterator.");
            return;
        }
        f86Var.d();
        f86Var.l(this.b);
        this.b = -1;
        this.c = f86Var.t;
    }
}
