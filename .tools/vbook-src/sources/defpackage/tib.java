package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class tib {
    public static final d6a a = new d6a(new wab(15));
    public static final d6a b = new d6a(new wab(16));
    public static final d6a c = new d6a(new wab(17));

    public static final oib a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new oib((ZoneOffset) dateTimeFormatter.parse(str, new sib()));
        } catch (DateTimeException e) {
            throw new d72(e);
        }
    }
}
