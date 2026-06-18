package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u9 implements k77 {
    public final hn1 a;
    public final ArrayList b;

    public u9(hn1 hn1Var, ArrayList arrayList) {
        this.a = hn1Var;
        this.b = arrayList;
    }

    @Override // defpackage.r84
    public final s84 a() {
        return this.a.a();
    }

    @Override // defpackage.r84
    public final sn7 b() {
        zy5 zy5VarN = gc1.N();
        zy5VarN.add(this.a.b());
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zy5VarN.add(((r84) obj).b());
        }
        return new sn7(lc3.a, gc1.J(zy5VarN));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return this.a.equals(u9Var.a) && this.b.equals(u9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
