package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n4c implements oi5 {
    public static final n4c a = new n4c();
    public static final o28 b = fx1.m("kotlinx.datetime.YearMonth", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        e4c e4cVar = (e4c) obj;
        e4cVar.getClass();
        md2Var.Y(e4cVar.toString());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        d4c d4cVar = e4c.Companion;
        String strS = yd2Var.s();
        d6a d6aVar = l4c.b;
        o0 o0Var = (o0) d6aVar.getValue();
        d4cVar.getClass();
        strS.getClass();
        o0Var.getClass();
        if (o0Var != ((o0) d6aVar.getValue())) {
            return (e4c) o0Var.c(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new e4c(YearMonth.parse(dk9.B(3, string.toString())));
        } catch (DateTimeParseException e) {
            throw new d72(e);
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
