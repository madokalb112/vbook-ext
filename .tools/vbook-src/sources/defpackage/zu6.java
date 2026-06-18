package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zu6 {
    public static final js8 a;
    public static final /* synthetic */ zu6[] b;
    public static final /* synthetic */ le3 c;

    static {
        zu6[] zu6VarArr = {new zu6("JANUARY", 0), new zu6("FEBRUARY", 1), new zu6("MARCH", 2), new zu6("APRIL", 3), new zu6("MAY", 4), new zu6("JUNE", 5), new zu6("JULY", 6), new zu6("AUGUST", 7), new zu6("SEPTEMBER", 8), new zu6("OCTOBER", 9), new zu6("NOVEMBER", 10), new zu6("DECEMBER", 11)};
        b = zu6VarArr;
        c = new le3(zu6VarArr);
        a = new js8(28);
    }

    public static zu6 valueOf(String str) {
        return (zu6) Enum.valueOf(zu6.class, str);
    }

    public static zu6[] values() {
        return (zu6[]) b.clone();
    }
}
