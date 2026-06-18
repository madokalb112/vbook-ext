package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r0a implements p0a {
    public static final ti2 d = new ti2(3);
    public final Object a = new Object();
    public volatile p0a b;
    public Object c;

    public r0a(p0a p0aVar) {
        p0aVar.getClass();
        this.b = p0aVar;
    }

    @Override // defpackage.p0a
    public final Object get() {
        p0a p0aVar = this.b;
        p0a p0aVar2 = d;
        if (p0aVar != p0aVar2) {
            synchronized (this.a) {
                try {
                    if (this.b != p0aVar2) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = p0aVar2;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        ti2 ti2VarK = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (ti2VarK == d) {
            ti2VarK = dx1.k(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return dx1.k(sb, ti2VarK, ")");
    }
}
