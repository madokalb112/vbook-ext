package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v66 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p83 b;

    public /* synthetic */ v66(p83 p83Var, int i) {
        this.a = i;
        this.b = p83Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        p83 p83Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                j39.v(str, str2, str3);
                p83Var.b(str, str2, str3);
                break;
            case 1:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    nha.c(wn9.K(((Boolean) p83Var.e.getValue()).booleanValue() ? (pv9) vt9.f.getValue() : (pv9) zt9.C0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262142);
                }
                break;
            default:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                j39.v(str4, str5, str6);
                p83Var.b(str4, str5, str6);
                break;
        }
        return hebVar;
    }
}
