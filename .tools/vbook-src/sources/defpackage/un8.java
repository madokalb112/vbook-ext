package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class un8 implements wn8 {
    public final String b;
    public final cn7 c;
    public final cn7 d;
    public final f48 e;

    public un8(long j, long j2, String str, String str2) {
        this.b = str;
        tpa[] tpaVarArr = spa.b;
        if ((j & 1095216660480L) == 0 && (1095216660480L & j2) == 0) {
            gp.l("At least one of the width or height should be specified");
            throw null;
        }
        if (spa.c(j) < 0.0f && spa.c(j2) < 0.0f) {
            gp.l("The width and height should be greater than or equal to 0");
            throw null;
        }
        if (Math.abs(spa.c(j)) > Float.MAX_VALUE && Math.abs(spa.c(j2)) > Float.MAX_VALUE) {
            gp.l("The width and height should be finite");
            throw null;
        }
        this.c = dk9.x(new spa(j));
        this.d = dk9.x(new spa(j2));
        this.e = new f48(13);
    }

    @Override // defpackage.wn8
    public final void a(zo zoVar, fo8 fo8Var) {
        jk9 jk9Var = fo8Var.d;
        if (!jk9Var.c.a.containsKey(g())) {
            String strG = g();
            float fC = spa.c(h());
            if (fC < 0.0f) {
                fC = 0.0f;
            }
            long jH = wn9.H(fC, 4294967296L);
            float fC2 = spa.c(f());
            jk9Var.put(strG, new v75(new mt7(jH, wn9.H(fC2 >= 0.0f ? fC2 : 0.0f, 4294967296L), 6), new rj1(new tn8(this, fo8Var), true, 907038366)));
        }
        fo8Var.e.add(g());
        zoVar.i("androidx.compose.foundation.text.inlineContent", g());
        zoVar.f("�");
        zoVar.g();
    }

    @Override // defpackage.wn8
    public final void b(r43 r43Var, qha qhaVar, long j, yn8 yn8Var, float f, float f2) {
        r43Var.getClass();
        yn8Var.getClass();
    }

    @Override // defpackage.wn8
    public final kb4 c() {
        return this.e;
    }

    @Override // defpackage.wn8
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un8)) {
            return false;
        }
        un8 un8Var = (un8) obj;
        return this.b.equals(un8Var.b) && spa.a(h(), un8Var.h()) && spa.a(f(), un8Var.f());
    }

    public final long f() {
        return ((spa) this.d.getValue()).a;
    }

    public final String g() {
        return ((Object) this.b) + "-" + spa.c(h()) + "-" + spa.c(f());
    }

    public final long h() {
        return ((spa) this.c.getValue()).a;
    }

    public final int hashCode() {
        return Long.hashCode(f()) + ((Long.hashCode(h()) + (this.b.hashCode() * 31)) * 31);
    }
}
