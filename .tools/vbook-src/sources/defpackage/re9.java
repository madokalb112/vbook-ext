package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class re9 implements k77 {
    public final je0 a;
    public final Set b;

    public re9(je0 je0Var) {
        this.a = je0Var;
        zy5 zy5VarN = gc1.N();
        sw1.z(zy5VarN, je0Var);
        zy5 zy5VarJ = gc1.J(zy5VarN);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = zy5VarJ.listIterator(0);
        while (true) {
            em4 em4Var = (em4) listIterator;
            if (!em4Var.hasNext()) {
                break;
            }
            kb7 kb7VarD = ((su3) em4Var.next()).c().d();
            if (kb7VarD != null) {
                arrayList.add(kb7VarD);
            }
        }
        Set setE1 = fc1.e1(arrayList);
        this.b = setE1;
        if (setE1.isEmpty()) {
            gp.l("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // defpackage.r84
    public final s84 a() {
        this.a.a.a();
        return new in1();
    }

    @Override // defpackage.r84
    public final sn7 b() {
        return tw1.E(gc1.Z(new sn7(gc1.Y(new ie9(new w27(this, 9), "sign for " + this.b)), lc3.a), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof re9) {
            return this.a.equals(((re9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
