package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e26 implements oi5 {
    public static final e26 a = new e26();
    public static final o28 b = fx1.m("kotlinx.datetime.LocalDate", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        w16 w16Var = (w16) obj;
        w16Var.getClass();
        md2Var.Y(w16Var.toString());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        u16 u16Var = w16.Companion;
        String strS = yd2Var.s();
        int i = v16.a;
        d6a d6aVar = a26.a;
        o0 o0Var = (o0) d6aVar.getValue();
        u16Var.getClass();
        strS.getClass();
        o0Var.getClass();
        if (o0Var != ((o0) d6aVar.getValue())) {
            return (w16) o0Var.c(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new w16(LocalDate.parse(dk9.B(6, string.toString())));
        } catch (DateTimeParseException e) {
            throw new d72(e);
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
