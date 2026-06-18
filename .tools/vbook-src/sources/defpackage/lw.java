package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lw {
    public static final lw a;
    public static final /* synthetic */ lw[] b;

    static {
        lw lwVar = new lw("FIT", 0);
        a = lwVar;
        b = new lw[]{lwVar, new lw("STRETCH", 1), new lw("CROP", 2)};
    }

    public static lw valueOf(String str) {
        return (lw) Enum.valueOf(lw.class, str);
    }

    public static lw[] values() {
        return (lw[]) b.clone();
    }
}
