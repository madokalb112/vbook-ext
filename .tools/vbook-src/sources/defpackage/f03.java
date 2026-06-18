package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f03 implements q58 {
    public static final Object c = new Object();
    public volatile ht3 a;
    public volatile Object b;

    public static q58 a(ht3 ht3Var) {
        if (ht3Var instanceof f03) {
            return ht3Var;
        }
        f03 f03Var = new f03();
        f03Var.b = c;
        f03Var.a = ht3Var;
        return f03Var;
    }

    @Override // defpackage.r58
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
