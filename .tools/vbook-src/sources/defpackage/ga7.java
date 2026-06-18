package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ga7 implements ib4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ga7(String str, ha7 ha7Var, int i, fa7 fa7Var) {
        this.c = str;
        this.d = ha7Var;
        this.b = i;
        this.e = fa7Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                StringBuilder sbM = dx1.m("Can not interpret the string '", (String) obj3, "' as ");
                sbM.append(((ea7) ((ha7) obj2).a.get(i2)).b);
                sbM.append(": ");
                sbM.append(((fa7) obj).h());
                return sbM.toString();
            default:
                ((a07) obj2).setValue(Boolean.FALSE);
                ((a07) obj).setValue(((String[]) obj3)[i2]);
                return heb.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ga7(String[] strArr, int i, a07 a07Var, a07 a07Var2) {
        this.c = strArr;
        this.b = i;
        this.d = a07Var;
        this.e = a07Var2;
    }
}
