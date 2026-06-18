package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y48 {
    public final qz6 a;
    public final String b;

    public y48(qz6 qz6Var, String str) {
        str.getClass();
        this.a = qz6Var;
        this.b = str;
    }

    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        gp.j(ky0.s(this.b, " is not set", new StringBuilder("Field ")));
        return null;
    }

    public final Object b(Object obj, Object obj2) {
        qz6 qz6Var = this.a;
        Object obj3 = qz6Var.get(obj);
        if (obj3 == null) {
            qz6Var.l(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }

    public /* synthetic */ y48(qz6 qz6Var) {
        this(qz6Var, qz6Var.getName());
    }
}
