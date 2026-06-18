package defpackage;

import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class m95 extends ny1 {
    public Object b;

    public final void s0(Object obj) {
        if (this.b == null) {
            this.b = obj;
            return;
        }
        Class<?> cls = getClass();
        Member memberT0 = t0();
        Object obj2 = this.b;
        StringBuilder sb = new StringBuilder("Instance already set for this resolver \"");
        sb.append(cls);
        sb.append("\" of \"");
        sb.append(memberT0);
        sb.append("(");
        k27.g(dx1.k(sb, obj2, ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver."));
    }

    public abstract Member t0();

    public abstract m95 u0(Object obj);
}
