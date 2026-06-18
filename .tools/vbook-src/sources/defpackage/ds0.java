package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ds0 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk9 b;

    public /* synthetic */ ds0(hk9 hk9Var, int i) {
        this.a = i;
        this.b = hk9Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        hk9 hk9Var = this.b;
        switch (i) {
            case 0:
                rp4 rp4Var = (sa5) obj;
                if (rp4Var instanceof qp4) {
                    hk9Var.add(rp4Var);
                } else if (rp4Var instanceof rp4) {
                    hk9Var.remove(rp4Var.a);
                } else if (rp4Var instanceof o44) {
                    hk9Var.add(rp4Var);
                } else if (rp4Var instanceof p44) {
                    hk9Var.remove(((p44) rp4Var).a);
                } else if (rp4Var instanceof c28) {
                    hk9Var.add(rp4Var);
                } else if (rp4Var instanceof d28) {
                    hk9Var.remove(((d28) rp4Var).a);
                } else if (rp4Var instanceof b28) {
                    hk9Var.remove(((b28) rp4Var).a);
                }
                break;
            default:
                w33 w33Var = (sa5) obj;
                if (w33Var instanceof c28) {
                    hk9Var.add(w33Var);
                } else if (w33Var instanceof d28) {
                    hk9Var.remove(((d28) w33Var).a);
                } else if (w33Var instanceof b28) {
                    hk9Var.remove(((b28) w33Var).a);
                } else if (w33Var instanceof v33) {
                    hk9Var.add(w33Var);
                } else if (w33Var instanceof w33) {
                    hk9Var.remove(w33Var.a);
                } else if (w33Var instanceof u33) {
                    hk9Var.remove(((u33) w33Var).a);
                }
                break;
        }
        return hebVar;
    }
}
