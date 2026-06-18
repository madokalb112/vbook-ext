package defpackage;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l26 implements oi5 {
    public static final l26 a = new l26();
    public static final o28 b = fx1.m("kotlinx.datetime.LocalDateTime", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        h26 h26Var = (h26) obj;
        h26Var.getClass();
        md2Var.Y(h26Var.toString());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        f26 f26Var = h26.Companion;
        String strS = yd2Var.s();
        j26 j26Var = g26.a;
        f26Var.getClass();
        strS.getClass();
        j26Var.getClass();
        try {
            String string = strS.toString();
            string.getClass();
            return new h26(LocalDateTime.parse(dk9.B(12, string.toString())));
        } catch (DateTimeParseException e) {
            throw new d72(e);
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
