package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c4c implements su3 {
    public final r0 a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final jj7 e;

    public c4c(jj7 jj7Var) {
        zd4 zd4Var = i4c.a;
        Integer numValueOf = Integer.valueOf(jj7Var != jj7.a ? 1 : 4);
        Integer num = jj7Var == jj7.b ? 4 : null;
        zd4Var.getClass();
        this.a = zd4Var;
        this.b = numValueOf;
        this.c = num;
        this.d = 4;
        this.e = jj7Var;
    }

    @Override // defpackage.su3
    public final s84 a() {
        this.a.a();
        Integer num = this.b;
        int iIntValue = num != null ? num.intValue() : 0;
        in1 in1Var = new in1();
        if (iIntValue < 0) {
            gp.k(xv5.k(iIntValue, "The minimum number of digits (", ") is negative"));
            return null;
        }
        if (iIntValue <= 9) {
            return this.c != null ? new in1() : in1Var;
        }
        gp.k(xv5.k(iIntValue, "The minimum number of digits (", ") exceeds the length of an Int"));
        return null;
    }

    @Override // defpackage.su3
    public final sn7 b() {
        r0 r0Var = this.a;
        y48 y48VarA = r0Var.a();
        String strC = r0Var.c();
        y48VarA.getClass();
        strC.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList arrayListA0 = gc1.a0(vw1.V(num, null, num2, y48VarA, strC, true));
        Integer num3 = this.d;
        lc3 lc3Var = lc3.a;
        if (num3 != null) {
            arrayListA0.add(vw1.V(num, num3, num2, y48VarA, strC, false));
            arrayListA0.add(new sn7(gc1.Z(new st7("+"), new ha7(gc1.Y(new kfb(Integer.valueOf(num3.intValue() + 1), null, y48VarA, strC, false)))), lc3Var));
        } else {
            arrayListA0.add(vw1.V(num, null, num2, y48VarA, strC, false));
        }
        return new sn7(lc3Var, arrayListA0);
    }

    @Override // defpackage.su3
    public final r0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c4c) {
            return this.e == ((c4c) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.e.hashCode() * 31);
    }
}
