package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yxb {
    public static final vs7 a;
    public static final /* synthetic */ yxb[] b;
    public static final /* synthetic */ le3 c;

    static {
        yxb[] yxbVarArr = {new yxb("MONDAY", 0), new yxb("TUESDAY", 1), new yxb("WEDNESDAY", 2), new yxb("THURSDAY", 3), new yxb("FRIDAY", 4), new yxb("SATURDAY", 5), new yxb("SUNDAY", 6)};
        b = yxbVarArr;
        c = new le3(yxbVarArr);
        a = new vs7(7);
    }

    public static yxb valueOf(String str) {
        return (yxb) Enum.valueOf(yxb.class, str);
    }

    public static yxb[] values() {
        return (yxb[]) b.clone();
    }
}
