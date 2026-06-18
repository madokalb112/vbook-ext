package defpackage;

import j$.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wib implements oi5 {
    public static final wib a = new wib();
    public static final o28 b = fx1.m("kotlinx.datetime.UtcOffset", m28.k);

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        oib oibVar = (oib) obj;
        oibVar.getClass();
        md2Var.Y(oibVar.toString());
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        nib nibVar = oib.Companion;
        String strS = yd2Var.s();
        d6a d6aVar = rib.a;
        qib qibVar = (qib) d6aVar.getValue();
        nibVar.getClass();
        strS.getClass();
        qibVar.getClass();
        if (qibVar == ((qib) d6aVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) tib.a.getValue();
            dateTimeFormatter.getClass();
            return tib.a(strS, dateTimeFormatter);
        }
        if (qibVar == ((qib) rib.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) tib.b.getValue();
            dateTimeFormatter2.getClass();
            return tib.a(strS, dateTimeFormatter2);
        }
        if (qibVar != ((qib) rib.c.getValue())) {
            return (oib) qibVar.c(strS);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) tib.c.getValue();
        dateTimeFormatter3.getClass();
        return tib.a(strS, dateTimeFormatter3);
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return b;
    }
}
