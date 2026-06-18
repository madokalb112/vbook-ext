package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q0a implements p0a, Serializable {
    public final transient Object a = new Object();
    public final p0a b;
    public volatile transient boolean c;
    public transient Object d;

    public q0a(p0a p0aVar) {
        p0aVar.getClass();
        this.b = p0aVar;
    }

    @Override // defpackage.p0a
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return dx1.k(new StringBuilder("Suppliers.memoize("), this.c ? dx1.k(new StringBuilder("<supplier that returned "), this.d, ">") : this.b, ")");
    }
}
