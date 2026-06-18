package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rh1 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ uh1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ uh1 f;

    public rh1(uh1 uh1Var, int i) {
        this.e = i;
        this.f = uh1Var;
        this.d = uh1Var;
        this.a = uh1Var.e;
        this.b = uh1Var.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object th1Var;
        uh1 uh1Var = this.d;
        if (uh1Var.e != this.a) {
            gp.d();
            return null;
        }
        if (!hasNext()) {
            mn5.m();
            return null;
        }
        int i = this.b;
        this.c = i;
        int i2 = this.e;
        uh1 uh1Var2 = this.f;
        switch (i2) {
            case 0:
                th1Var = uh1Var2.j()[i];
                break;
            case 1:
                th1Var = new th1(uh1Var2, i);
                break;
            default:
                th1Var = uh1Var2.k()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= uh1Var.f) {
            i3 = -1;
        }
        this.b = i3;
        return th1Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        uh1 uh1Var = this.d;
        if (uh1Var.e != this.a) {
            gp.d();
            return;
        }
        fx1.Q("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        uh1Var.remove(uh1Var.j()[this.c]);
        this.b--;
        this.c = -1;
    }
}
