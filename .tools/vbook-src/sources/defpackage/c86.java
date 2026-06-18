package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c86 extends e86 implements Iterator, fi5 {
    public final /* synthetic */ int e;

    public c86(f86 f86Var, int i) {
        this.e = i;
        f86Var.getClass();
        this.d = f86Var;
        this.b = -1;
        this.c = f86Var.t;
        d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                c();
                int i = this.a;
                f86 f86Var = (f86) this.d;
                if (i >= f86Var.f) {
                    mn5.m();
                } else {
                    this.a = i + 1;
                    this.b = i;
                    d86 d86Var = new d86(f86Var, i);
                    d();
                }
                break;
            case 1:
                c();
                int i2 = this.a;
                f86 f86Var2 = (f86) this.d;
                if (i2 >= f86Var2.f) {
                    mn5.m();
                } else {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = f86Var2.a[i2];
                    d();
                }
                break;
            default:
                c();
                int i3 = this.a;
                f86 f86Var3 = (f86) this.d;
                if (i3 >= f86Var3.f) {
                    mn5.m();
                } else {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object[] objArr = f86Var3.b;
                    objArr.getClass();
                    Object obj2 = objArr[this.b];
                    d();
                }
                break;
        }
        return null;
    }
}
