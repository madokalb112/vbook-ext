package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z72 {
    public static final /* synthetic */ z72[] a;
    public static final /* synthetic */ le3 b;

    static {
        z72[] z72VarArr = {new z72("MONDAY", 0), new z72("TUESDAY", 1), new z72("WEDNESDAY", 2), new z72("THURSDAY", 3), new z72("FRIDAY", 4), new z72("SATURDAY", 5), new z72("SUNDAY", 6)};
        a = z72VarArr;
        b = new le3(z72VarArr);
    }

    public static z72 valueOf(String str) {
        return (z72) Enum.valueOf(z72.class, str);
    }

    public static z72[] values() {
        return (z72[]) a.clone();
    }
}
