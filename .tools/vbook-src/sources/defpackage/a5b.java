package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a5b extends o1a implements ac4 {
    public /* synthetic */ String a;
    public /* synthetic */ Map b;
    public /* synthetic */ Map c;
    public final /* synthetic */ n5b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5b(n5b n5bVar, jt1 jt1Var) {
        super(4, jt1Var);
        this.d = n5bVar;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        a5b a5bVar = new a5b(this.d, (jt1) obj4);
        a5bVar.a = (String) obj;
        a5bVar.b = (Map) obj2;
        a5bVar.c = (Map) obj3;
        heb hebVar = heb.a;
        a5bVar.invokeSuspend(hebVar);
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        Object value2;
        String str2;
        Object value3;
        Object value4;
        String str3;
        Object value5;
        String str4;
        Object value6;
        n5b n5bVar = this.d;
        fr9 fr9Var = n5bVar.C;
        fr9 fr9Var2 = n5bVar.B;
        fr9 fr9Var3 = n5bVar.A;
        String str5 = this.a;
        Map map = this.b;
        Map map2 = this.c;
        e11.e0(obj);
        String str6 = (String) map.get("engine_id");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = (String) map2.get("engine_id");
        if (str7 == null) {
            str7 = "";
        }
        if (lc5.Q(str5, str6)) {
            if (fr9Var3 != null) {
                do {
                    value6 = fr9Var3.getValue();
                } while (!fr9Var3.j(value6, Boolean.valueOf(Boolean.parseBoolean((String) map.get("show_raw")))));
            }
            if (fr9Var2 != null) {
                do {
                    value5 = fr9Var2.getValue();
                    str4 = (String) map.get("from_language");
                    if (str4 == null) {
                        str4 = "";
                    }
                } while (!fr9Var2.j(value5, str4));
            }
            if (fr9Var != null) {
                do {
                    value4 = fr9Var.getValue();
                    str3 = (String) map.get("to_language");
                    if (str3 == null) {
                        str3 = "";
                    }
                } while (!fr9Var.j(value4, str3));
            }
        } else if (lc5.Q(str5, str7)) {
            if (fr9Var3 != null) {
                do {
                    value3 = fr9Var3.getValue();
                } while (!fr9Var3.j(value3, Boolean.valueOf(Boolean.parseBoolean((String) map2.get("show_raw")))));
            }
            if (fr9Var2 != null) {
                do {
                    value2 = fr9Var2.getValue();
                    str2 = (String) map2.get("from_language");
                    if (str2 == null) {
                        str2 = "";
                    }
                } while (!fr9Var2.j(value2, str2));
            }
            if (fr9Var != null) {
                do {
                    value = fr9Var.getValue();
                    str = (String) map2.get("to_language");
                    if (str == null) {
                        str = "";
                    }
                } while (!fr9Var.j(value, str));
            }
        }
        return heb.a;
    }
}
