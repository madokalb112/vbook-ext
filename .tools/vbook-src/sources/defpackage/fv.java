package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fv {
    public static final fv a;
    public static final fv b;
    public static final fv c;
    public static final fv d;
    public static final fv e;
    public static final fv f;
    public static final /* synthetic */ fv[] s;

    static {
        fv fvVar = new fv("UNKNOWN", 0);
        a = fvVar;
        fv fvVar2 = new fv("X86", 1);
        b = fvVar2;
        fv fvVar3 = new fv("X64", 2);
        c = fvVar3;
        fv fvVar4 = new fv("ARM32", 3);
        d = fvVar4;
        fv fvVar5 = new fv("ARM64", 4);
        e = fvVar5;
        fv fvVar6 = new fv("MIPS32", 5);
        f = fvVar6;
        s = new fv[]{fvVar, fvVar2, fvVar3, fvVar4, fvVar5, fvVar6, new fv("MIPSEL32", 6), new fv("MIPS64", 7), new fv("MIPSEL64", 8), new fv("WASM32", 9), new fv("POWERPC64", 10)};
    }

    public static fv valueOf(String str) {
        return (fv) Enum.valueOf(fv.class, str);
    }

    public static fv[] values() {
        return (fv[]) s.clone();
    }
}
