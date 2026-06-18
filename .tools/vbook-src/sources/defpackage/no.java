package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class no implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ no(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.d;
        Object obj2 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ym7 ym7Var = (ym7) obj2;
                ym7 ym7Var2 = (ym7) obj;
                if (!z) {
                    ym7Var.i(0.0f);
                    ym7Var2.i(0.0f);
                }
                return hebVar;
            case 1:
                ib4 ib4Var = (ib4) obj2;
                ib4 ib4Var2 = (ib4) obj;
                if (z) {
                    ib4Var.invoke();
                } else {
                    ib4Var2.invoke();
                }
                return hebVar;
            case 2:
                String str = ((oz0) obj2).a;
                a07 a07Var = (a07) obj;
                a07Var.setValue(z ? fc1.G0((List) a07Var.getValue(), str) : fc1.J0((List) a07Var.getValue(), str));
                return hebVar;
            case 3:
                ib4 ib4Var3 = (ib4) obj2;
                a07 a07Var2 = (a07) obj;
                if (z) {
                    a07Var2.setValue(Boolean.TRUE);
                } else {
                    ib4Var3.invoke();
                }
                return hebVar;
            default:
                return Boolean.valueOf(((Boolean) ((br9) obj2).getValue()).booleanValue() || ((Boolean) ((a07) obj).getValue()).booleanValue() || z);
        }
    }
}
