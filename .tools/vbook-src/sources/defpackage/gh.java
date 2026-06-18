package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gh extends rm7 {
    public final ry6 c;

    public gh(ib4 ib4Var, ry6 ry6Var) {
        rm7 rm7Var;
        List list;
        super(2, (ib4Var == null || (rm7Var = (rm7) ib4Var.invoke()) == null || (list = rm7Var.a) == null) ? new ArrayList() : new ArrayList(list));
        this.c = ry6Var;
    }

    @Override // defpackage.rm7
    public final Object a(a91 a91Var) {
        a91Var.getClass();
        return a91Var.equals(ug8.a(dt8.class)) ? gt8.a(this.c) : super.a(a91Var);
    }
}
