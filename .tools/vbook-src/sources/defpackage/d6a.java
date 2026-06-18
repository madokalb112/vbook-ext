package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d6a implements dp5, Serializable {
    public ib4 a;
    public volatile Object b;
    public final Object c;

    public d6a(ib4 ib4Var) {
        ib4Var.getClass();
        this.a = ib4Var;
        this.b = zk4.y;
        this.c = this;
    }

    @Override // defpackage.dp5
    public final boolean d() {
        return this.b != zk4.y;
    }

    @Override // defpackage.dp5
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        zk4 zk4Var = zk4.y;
        if (obj != zk4Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == zk4Var) {
                ib4 ib4Var = this.a;
                ib4Var.getClass();
                objInvoke = ib4Var.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
