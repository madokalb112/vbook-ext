package defpackage;

import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d36 implements oi5 {
    public static final d36 a = new d36();
    public static final o28 b = fx1.m("kotlinx.datetime.LocalTime", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        z26 z26Var = (z26) obj;
        z26Var.getClass();
        md2Var.Y(z26Var.toString());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        y26 y26Var = z26.Companion;
        String strS = yd2Var.s();
        d6a d6aVar = c36.a;
        b36 b36Var = (b36) d6aVar.getValue();
        y26Var.getClass();
        strS.getClass();
        b36Var.getClass();
        if (b36Var != ((b36) d6aVar.getValue())) {
            return (z26) b36Var.c(strS);
        }
        try {
            return new z26(LocalTime.parse(strS));
        } catch (DateTimeParseException e) {
            throw new d72(e);
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
