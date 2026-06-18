package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yeb implements dp5, Serializable {
    public ib4 a;
    public Object b;

    @Override // defpackage.dp5
    public final boolean d() {
        return this.b != zk4.y;
    }

    @Override // defpackage.dp5
    public final Object getValue() {
        if (this.b == zk4.y) {
            ib4 ib4Var = this.a;
            ib4Var.getClass();
            this.b = ib4Var.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
