package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k0c {
    public static final k0c a;
    public static final k0c b;
    public static final k0c c;
    public static final k0c d;
    public static final k0c e;
    public static final /* synthetic */ k0c[] f;

    static {
        k0c k0cVar = new k0c("Phones", 0);
        a = k0cVar;
        k0c k0cVar2 = new k0c("SmallTablets", 1);
        b = k0cVar2;
        k0c k0cVar3 = new k0c("BigTablets", 2);
        c = k0cVar3;
        k0c k0cVar4 = new k0c("DesktopOne", 3);
        d = k0cVar4;
        k0c k0cVar5 = new k0c("DesktopTwo", 4);
        e = k0cVar5;
        f = new k0c[]{k0cVar, k0cVar2, k0cVar3, k0cVar4, k0cVar5};
    }

    public static k0c valueOf(String str) {
        return (k0c) Enum.valueOf(k0c.class, str);
    }

    public static k0c[] values() {
        return (k0c[]) f.clone();
    }
}
