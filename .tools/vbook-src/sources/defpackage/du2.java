package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class du2 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ du2(int i, int i2, kb4 kb4Var, List list) {
        this.a = i2;
        this.b = kb4Var;
        this.c = list;
        this.d = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        List list = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                kb4Var.invoke(list.get(i2));
                break;
            default:
                kb4Var.invoke(((xl7) list.get(i2)).a);
                break;
        }
        return hebVar;
    }
}
