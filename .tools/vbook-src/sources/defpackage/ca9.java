package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ca9 implements ax2 {
    public final ea9 a;
    public final long b;
    public final Object c;
    public final ay0 d;

    public ca9(ea9 ea9Var, long j, Object obj, ay0 ay0Var) {
        this.a = ea9Var;
        this.b = j;
        this.c = obj;
        this.d = ay0Var;
    }

    @Override // defpackage.ax2
    public final void a() {
        ea9 ea9Var = this.a;
        synchronized (ea9Var) {
            if (this.b < ea9Var.p()) {
                return;
            }
            Object[] objArr = ea9Var.t;
            objArr.getClass();
            long j = this.b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            fa9.b(objArr, j, fa9.a);
            ea9Var.k();
        }
    }
}
