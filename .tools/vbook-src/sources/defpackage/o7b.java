package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o7b {
    public static final o7b a;
    public static final o7b b;
    public static final o7b c;
    public static final o7b d;
    public static final /* synthetic */ o7b[] e;

    static {
        o7b o7bVar = new o7b("SUCCESSFUL", 0);
        a = o7bVar;
        o7b o7bVar2 = new o7b("REREGISTER", 1);
        b = o7bVar2;
        o7b o7bVar3 = new o7b("CANCELLED", 2);
        c = o7bVar3;
        o7b o7bVar4 = new o7b("ALREADY_SELECTED", 3);
        d = o7bVar4;
        e = new o7b[]{o7bVar, o7bVar2, o7bVar3, o7bVar4};
    }

    public static o7b valueOf(String str) {
        return (o7b) Enum.valueOf(o7b.class, str);
    }

    public static o7b[] values() {
        return (o7b[]) e.clone();
    }
}
