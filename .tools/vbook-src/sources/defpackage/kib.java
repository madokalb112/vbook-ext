package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kib implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mib b;

    public /* synthetic */ kib(mib mibVar, int i) {
        this.a = i;
        this.b = mibVar;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        iib iibVar;
        boolean z;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        Object value3;
        int i = this.a;
        heb hebVar = heb.a;
        mib mibVar = this.b;
        switch (i) {
            case 0:
                ihb ihbVar = (ihb) obj;
                fr9 fr9Var = mibVar.f;
                if (fr9Var != null) {
                    do {
                        value2 = fr9Var.getValue();
                        iibVar = (iib) value2;
                        z = ihbVar != null;
                        str = ihbVar != null ? ihbVar.a : null;
                        if (str == null) {
                            str = "";
                        }
                        str2 = ihbVar != null ? ihbVar.b : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        list = ihbVar != null ? ihbVar.h : null;
                        if (list == null) {
                            list = lc3.a;
                        }
                        str3 = ihbVar != null ? ihbVar.d : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str4 = ihbVar != null ? ihbVar.c : null;
                    } while (!fr9Var.j(value2, iib.a(iibVar, z, str, str2, str4 != null ? str4 : "", list, ihbVar != null ? ihbVar.f : false, ihbVar != null ? ihbVar.e : 0, str3, ihbVar != null ? ihbVar.g : false, 0, 0, 1536)));
                }
                if (ihbVar == null && fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, iib.a((iib) value, false, null, null, null, null, false, 0, null, false, 0, 0, 1535)));
                }
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                fr9 fr9Var2 = mibVar.f;
                if (fr9Var2 != null) {
                    do {
                        value3 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value3, iib.a((iib) value3, false, null, null, null, null, false, 0, null, false, 0, (int) jLongValue, 1023)));
                }
                break;
        }
        return hebVar;
    }
}
