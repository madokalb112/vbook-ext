package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uv2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f28 b;

    public /* synthetic */ uv2(f28 f28Var, int i) {
        this.a = 1;
        this.b = f28Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        f28 f28Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                f28Var.b(str, list);
                break;
            case 1:
                ((Integer) obj2).getClass();
                e11.q(f28Var, (dd4) obj, qu1.x0(1));
                break;
            default:
                String str2 = (String) obj;
                List list2 = (List) obj2;
                str2.getClass();
                list2.getClass();
                f28Var.b(str2, list2);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ uv2(f28 f28Var, int i, byte b) {
        this.a = i;
        this.b = f28Var;
    }
}
