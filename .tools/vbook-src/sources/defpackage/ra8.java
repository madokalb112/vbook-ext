package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ra8 {
    public final kb4 a;

    public ra8(kb4 kb4Var) {
        kb4Var.getClass();
        this.a = kb4Var;
    }

    public abstract void a(v34 v34Var);

    public abstract va8 b(kb4 kb4Var);

    public final List c() {
        return (List) b(new di3(this, 0)).b;
    }

    public final Object d() {
        Object objE = e();
        if (objE != null) {
            return objE;
        }
        throw new NullPointerException("ResultSet returned null for " + this);
    }

    public final Object e() {
        return b(new di3(this, 1)).b;
    }

    public abstract void f(v34 v34Var);
}
