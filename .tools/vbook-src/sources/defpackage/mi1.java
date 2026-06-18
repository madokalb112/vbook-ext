package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mi1 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public fj1 f;
    public final HashSet g;

    public mi1(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(oa8.a(cls));
        for (Class cls2 : clsArr) {
            gx1.y(cls2, "Null interface");
            this.b.add(oa8.a(cls2));
        }
    }

    public final void a(vn2 vn2Var) {
        if (this.b.contains(vn2Var.a)) {
            gp.l("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(vn2Var);
        }
    }

    public final ni1 b() {
        if (this.f != null) {
            return new ni1(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        gp.j("Missing required property: factory.");
        return null;
    }

    public final void c() {
        if (this.d == 0) {
            this.d = 2;
        } else {
            gp.j("Instantiation type has already been set.");
        }
    }

    public mi1(oa8 oa8Var, oa8[] oa8VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(oa8Var);
        for (oa8 oa8Var2 : oa8VarArr) {
            gx1.y(oa8Var2, "Null interface");
        }
        Collections.addAll(this.b, oa8VarArr);
    }
}
