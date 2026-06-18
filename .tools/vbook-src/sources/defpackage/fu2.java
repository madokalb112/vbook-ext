package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fu2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t27 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fu2(t27 t27Var, String str) {
        this.a = 3;
        this.c = str;
        this.b = t27Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.c;
        t27 t27Var = this.b;
        switch (i) {
            case 0:
                ce4 ce4Var = (ce4) obj;
                ce4Var.getClass();
                pu1.o0(t27Var, str, ce4Var.a, ce4Var.b);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                gx1.R(t27Var, str2, str);
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                gx1.R(t27Var, str3, str);
                break;
            case 3:
                wk3 wk3Var = (wk3) obj;
                wk3Var.getClass();
                String str4 = wk3Var.a;
                String str5 = wk3Var.d;
                String str6 = wk3Var.c;
                if (str4.equals("detail")) {
                    if (str6.length() != 0) {
                        str5 = str6;
                    }
                    if (str5.length() > 0) {
                        gx1.R(t27Var, str5, str);
                    }
                } else if (str4.equals("list")) {
                    te5 te5Var = ue5.d;
                    oi5 oi5VarSerializer = fg5.Companion.serializer();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    jg5 jg5VarA = nf5.a(wk3Var.b);
                    jg5VarA.getClass();
                    jg5 jg5VarA2 = nf5.a(str6);
                    jg5VarA2.getClass();
                    pu1.o0(t27Var, str, str5, te5Var.b(oi5VarSerializer, new fg5(linkedHashMap)));
                }
                break;
            default:
                String str7 = (String) obj;
                str7.getClass();
                gx1.R(t27Var, str7, str);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ fu2(t27 t27Var, String str, int i) {
        this.a = i;
        this.b = t27Var;
        this.c = str;
    }
}
