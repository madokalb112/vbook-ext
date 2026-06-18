package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dh7 implements k77 {
    public final String a;
    public final hn1 b;
    public final ArrayList c;

    public dh7(String str, hn1 hn1Var) {
        this.a = str;
        this.b = hn1Var;
        zy5 zy5VarN = gc1.N();
        sw1.z(zy5VarN, hn1Var);
        zy5 zy5VarJ = gc1.J(zy5VarN);
        ArrayList arrayList = new ArrayList(gc1.M(zy5VarJ, 10));
        ListIterator listIterator = zy5VarJ.listIterator(0);
        while (true) {
            em4 em4Var = (em4) listIterator;
            if (!em4Var.hasNext()) {
                break;
            } else {
                arrayList.add(((su3) em4Var.next()).c());
            }
        }
        List<r0> listZ0 = fc1.Z0(fc1.d1(arrayList));
        ArrayList arrayList2 = new ArrayList(gc1.M(listZ0, 10));
        for (r0 r0Var : listZ0) {
            r0Var.getClass();
            Object objB = r0Var.b();
            if (objB == null) {
                so9.r(r0Var.c(), "' does not define a default value", "The field '");
                throw null;
            }
            arrayList2.add(new ch7(r0Var.a(), objB));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.r84
    public final s84 a() {
        Object wn1Var;
        s84 s84VarA = this.b.a();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(gc1.M(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ch7 ch7Var = (ch7) obj;
            arrayList2.add(new zh1(ch7Var.b, new qd2(1, ch7Var.a, y48.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 21)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        n7b n7bVar = n7b.a;
        if (zIsEmpty) {
            wn1Var = n7bVar;
        } else {
            wn1Var = arrayList2.size() == 1 ? (g08) fc1.O0(arrayList2) : new wn1(arrayList2);
        }
        return wn1Var instanceof n7b ? new in1() : new qn1(gc1.Z(new xl7(new qd2(1, wn1Var, g08.class, "test", "test(Ljava/lang/Object;)Z", 0, 22), new in1()), new xl7(new qd2(1, n7bVar, n7b.class, "test", "test(Ljava/lang/Object;)Z", 0, 23), s84VarA)));
    }

    @Override // defpackage.r84
    public final sn7 b() {
        sn7 sn7VarB = this.b.b();
        sn7 sn7VarB2 = new cp1(this.a).b();
        boolean zIsEmpty = this.c.isEmpty();
        lc3 lc3Var = lc3.a;
        return new sn7(lc3Var, gc1.Z(sn7VarB, tw1.E(gc1.Z(sn7VarB2, new sn7(zIsEmpty ? lc3Var : gc1.Y(new wdb(new zs5(this, 24))), lc3Var)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dh7)) {
            return false;
        }
        dh7 dh7Var = (dh7) obj;
        return this.a.equals(dh7Var.a) && this.b.equals(dh7Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
