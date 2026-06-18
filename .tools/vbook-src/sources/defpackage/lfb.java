package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class lfb implements su3 {
    public final jfb a;
    public final int b;
    public final Integer c;
    public final int d;

    public lfb(jfb jfbVar, int i, Integer num) {
        jfbVar.getClass();
        this.a = jfbVar;
        this.b = i;
        this.c = num;
        int i2 = jfbVar.e;
        this.d = i2;
        if (i < 0) {
            gp.k(xv5.k(i, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i2 < i) {
            gp.f(i2, "The maximum number of digits (", ") is less than the minimum number of digits (", i);
            throw null;
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.su3
    public final s84 a() {
        y48 y48Var = this.a.a;
        in1 in1Var = new in1();
        int i = this.b;
        if (i < 0) {
            gp.k(xv5.k(i, "The minimum number of digits (", ") is negative"));
            return null;
        }
        if (i <= 9) {
            return this.c != null ? new in1() : in1Var;
        }
        gp.k(xv5.k(i, "The minimum number of digits (", ") exceeds the length of an Int"));
        return null;
    }

    @Override // defpackage.su3
    public final sn7 b() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.d);
        jfb jfbVar = this.a;
        return vw1.V(numValueOf, numValueOf2, this.c, jfbVar.a, jfbVar.b, false);
    }

    @Override // defpackage.su3
    public final /* bridge */ /* synthetic */ r0 c() {
        return this.a;
    }
}
