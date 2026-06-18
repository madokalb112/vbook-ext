package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sub {
    public static final sub a;
    public static final /* synthetic */ sub[] b;

    static {
        sub subVar = new sub("Visible", 0);
        a = subVar;
        b = new sub[]{subVar, new sub("Invisible", 1), new sub("Gone", 2)};
    }

    public static sub valueOf(String str) {
        return (sub) Enum.valueOf(sub.class, str);
    }

    public static sub[] values() {
        return (sub[]) b.clone();
    }
}
