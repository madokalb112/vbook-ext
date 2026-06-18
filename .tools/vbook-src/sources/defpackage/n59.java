package defpackage;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n59 {
    public final iua a;
    public final wjb b;

    public n59(iua iuaVar, wjb wjbVar) {
        iuaVar.getClass();
        wjbVar.getClass();
        this.a = iuaVar;
        this.b = wjbVar;
    }

    public final i59 a(i59 i59Var) {
        String str;
        this.b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = iw9.H(string, false, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (i59Var == null || (str = i59Var.b) == null) ? lowerCase : str;
        int i = i59Var != null ? i59Var.c + 1 : 0;
        this.a.getClass();
        return new i59(i, iua.a().b, lowerCase, str2);
    }
}
