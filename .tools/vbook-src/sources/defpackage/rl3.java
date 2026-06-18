package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rl3 {
    public static final rl3 b;
    public static final /* synthetic */ rl3[] c;
    public static final /* synthetic */ le3 d;
    public final String a;

    static {
        rl3 rl3Var = new rl3("Epub", 0, "EPUB 2");
        b = rl3Var;
        rl3[] rl3VarArr = {rl3Var, new rl3("Epub3", 1, "EPUB 3"), new rl3("Cbz", 2, "CBZ"), new rl3("Txt", 3, "TXT"), new rl3("Html", 4, "HTML")};
        c = rl3VarArr;
        d = new le3(rl3VarArr);
    }

    public rl3(String str, int i, String str2) {
        this.a = str2;
    }

    public static rl3 valueOf(String str) {
        return (rl3) Enum.valueOf(rl3.class, str);
    }

    public static rl3[] values() {
        return (rl3[]) c.clone();
    }
}
