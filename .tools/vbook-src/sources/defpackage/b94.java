package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b94 implements su3 {
    public static final List g = gc1.Z(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public static final List h = gc1.Z(2, 1, 0, 2, 1, 0, 2, 1, 0);
    public final r0 a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final int f;

    public b94() {
        List list = g;
        list.getClass();
        zd4 zd4Var = eua.d;
        zd4Var.getClass();
        this.a = zd4Var;
        this.b = 1;
        this.c = 9;
        this.d = list;
        this.e = 1;
        this.f = 9;
    }

    @Override // defpackage.su3
    public final s84 a() {
        return new qn1(new qd2(1, this.a.a(), y48.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 0), this.b, this.c, this.d);
    }

    @Override // defpackage.su3
    public final sn7 b() {
        r0 r0Var = this.a;
        return new sn7(gc1.Y(new ha7(gc1.Y(new a94(this.b, this.c, r0Var.a(), r0Var.c())))), lc3.a);
    }

    @Override // defpackage.su3
    public final r0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b94)) {
            return false;
        }
        b94 b94Var = (b94) obj;
        return this.e == b94Var.e && this.f == b94Var.f;
    }

    public final int hashCode() {
        return (this.e * 31) + this.f;
    }
}
