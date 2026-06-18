package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uza {
    public static final uza a;
    public static final uza b;
    public static final /* synthetic */ uza[] c;

    static {
        uza uzaVar = new uza("EXACT", 0);
        a = uzaVar;
        uza uzaVar2 = new uza("NEARER", 1);
        uza uzaVar3 = new uza("FARTHER", 2);
        b = uzaVar3;
        c = new uza[]{uzaVar, uzaVar2, uzaVar3};
    }

    public static uza valueOf(String str) {
        return (uza) Enum.valueOf(uza.class, str);
    }

    public static uza[] values() {
        return (uza[]) c.clone();
    }
}
