package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yu6 {
    public static final /* synthetic */ yu6[] a;
    public static final /* synthetic */ le3 b;

    static {
        yu6[] yu6VarArr = {new yu6("JANUARY", 0), new yu6("FEBRUARY", 1), new yu6("MARCH", 2), new yu6("APRIL", 3), new yu6("MAY", 4), new yu6("JUNE", 5), new yu6("JULY", 6), new yu6("AUGUST", 7), new yu6("SEPTEMBER", 8), new yu6("OCTOBER", 9), new yu6("NOVEMBER", 10), new yu6("DECEMBER", 11)};
        a = yu6VarArr;
        b = new le3(yu6VarArr);
    }

    public static yu6 valueOf(String str) {
        return (yu6) Enum.valueOf(yu6.class, str);
    }

    public static yu6[] values() {
        return (yu6[]) a.clone();
    }
}
