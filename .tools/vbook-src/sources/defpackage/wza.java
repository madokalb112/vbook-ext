package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wza {
    public static final wza a;
    public static final wza b;
    public static final wza c;
    public static final wza d;
    public static final wza e;
    public static final /* synthetic */ wza[] f;

    static {
        wza wzaVar = new wza("DARKER", 0);
        a = wzaVar;
        wza wzaVar2 = new wza("LIGHTER", 1);
        b = wzaVar2;
        wza wzaVar3 = new wza("RELATIVE_DARKER", 2);
        c = wzaVar3;
        wza wzaVar4 = new wza("RELATIVE_LIGHTER", 3);
        d = wzaVar4;
        wza wzaVar5 = new wza("NEARER", 4);
        e = wzaVar5;
        f = new wza[]{wzaVar, wzaVar2, wzaVar3, wzaVar4, wzaVar5, new wza("FARTHER", 5)};
    }

    public static wza valueOf(String str) {
        return (wza) Enum.valueOf(wza.class, str);
    }

    public static wza[] values() {
        return (wza[]) f.clone();
    }
}
