package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class l50 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ l50(int i, kb4 kb4Var, a07 a07Var) {
        this.a = i;
        this.b = kb4Var;
        this.c = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                kb4Var.invoke(Float.valueOf(((Number) a07Var.getValue()).floatValue()));
                break;
            case 1:
                String str = (String) a07Var.getValue();
                if (str != null) {
                    kb4Var.invoke(str);
                }
                a07Var.setValue((Object) null);
                break;
            case 2:
                kb4Var.invoke((String) a07Var.getValue());
                a07Var.setValue("");
                break;
            case 3:
                kb4Var.invoke(Float.valueOf(((Number) a07Var.getValue()).floatValue()));
                break;
            case 4:
                kb4Var.invoke(Float.valueOf(((Number) a07Var.getValue()).floatValue()));
                break;
            case 5:
                kb4Var.invoke((String) a07Var.getValue());
                break;
            case 6:
                kb4Var.invoke((lm8) a07Var.getValue());
                break;
            case 7:
                kb4Var.invoke((lm8) a07Var.getValue());
                break;
            case 8:
                Boolean bool = (Boolean) a07Var.getValue();
                bool.booleanValue();
                kb4Var.invoke(bool);
                break;
            case 9:
                kb4Var.invoke((List) a07Var.getValue());
                break;
            case 10:
                kb4Var.invoke(Integer.valueOf((int) ((Number) a07Var.getValue()).floatValue()));
                break;
            case 11:
                kb4Var.invoke(Float.valueOf(((Number) a07Var.getValue()).floatValue()));
                break;
            case 12:
                kb4Var.invoke(((sla) a07Var.getValue()).c);
                break;
            case 13:
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(Boolean.TRUE);
                break;
            case 14:
                Boolean bool2 = Boolean.FALSE;
                a07Var.setValue(bool2);
                kb4Var.invoke(bool2);
                break;
            default:
                kb4Var.invoke(((wga) a07Var.getValue()).a.b);
                break;
        }
        return hebVar;
    }
}
