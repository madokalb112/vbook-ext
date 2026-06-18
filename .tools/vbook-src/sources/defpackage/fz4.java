package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fz4 implements kb4 {
    public final /* synthetic */ int a;

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((oy4) obj).getClass();
                return hebVar;
            case 1:
                ((oy4) obj).getClass();
                return hebVar;
            case 2:
                return hebVar;
            case 3:
                ((kj1) obj).getClass();
                return hebVar;
            case 4:
                ((byte[]) obj).getClass();
                throw new IllegalStateException("Android platform doesn't support SVG format.");
            case 5:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 6:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 7:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 8:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 9:
                ((String) obj).getClass();
                return hebVar;
            case 10:
                ((String) obj).getClass();
                return hebVar;
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 12:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 13:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 15:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 16:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                b91 b91Var = (b91) obj;
                b91Var.getClass();
                b91Var.a("JsonPrimitive", new qf5(new ua5(5)));
                b91Var.a("JsonNull", new qf5(new ua5(6)));
                b91Var.a("JsonLiteral", new qf5(new ua5(7)));
                b91Var.a("JsonObject", new qf5(new ua5(8)));
                b91Var.a("JsonArray", new qf5(new ua5(9)));
                return hebVar;
            case 18:
                af5 af5Var = (af5) obj;
                af5Var.getClass();
                af5Var.a = true;
                af5Var.c = true;
                af5Var.e = true;
                af5Var.d = true;
                af5Var.b = false;
                af5Var.f = true;
                af5Var.g = true;
                return hebVar;
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                mf5 mf5Var = (mf5) entry.getValue();
                StringBuilder sb = new StringBuilder();
                nv9.a(str, sb);
                sb.append(':');
                sb.append(mf5Var);
                return sb.toString();
            case 20:
                af5 af5Var2 = (af5) obj;
                af5Var2.getClass();
                af5Var2.a = true;
                af5Var2.d = true;
                af5Var2.g = true;
                af5Var2.h = true;
                return hebVar;
            case 21:
                vl5 vl5Var = (vl5) obj;
                vl5Var.getClass();
                return vl5Var.b;
            case 22:
                List list = (List) obj;
                return new wq5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 23:
                ((Integer) obj).getClass();
                jq5 jq5Var = yq5.a;
                return lc3.a;
            case 24:
                ((Integer) obj).getClass();
                jq5 jq5Var2 = yq5.a;
                return -1;
            case 25:
                ((Integer) obj).getClass();
                return null;
            case 26:
                List list2 = (List) obj;
                return new st5(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 27:
                return hebVar;
            case 28:
                List list3 = (List) obj;
                return new uu5((int[]) list3.get(0), (int[]) list3.get(1));
            default:
                return hebVar;
        }
    }

    public /* synthetic */ fz4(int i) {
        this.a = i;
    }
}
