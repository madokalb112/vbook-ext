package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g3c {
    public static final g3c c;
    public static final g3c d;
    public static final g3c e;
    public static final g3c f;
    public static final /* synthetic */ g3c[] s;
    public static final /* synthetic */ le3 t;
    public final char a;
    public final char b;

    static {
        g3c g3cVar = new g3c("OBJ", 0, '{', '}');
        c = g3cVar;
        g3c g3cVar2 = new g3c("LIST", 1, '[', ']');
        d = g3cVar2;
        g3c g3cVar3 = new g3c("MAP", 2, '{', '}');
        e = g3cVar3;
        g3c g3cVar4 = new g3c("POLY_OBJ", 3, '[', ']');
        f = g3cVar4;
        g3c[] g3cVarArr = {g3cVar, g3cVar2, g3cVar3, g3cVar4};
        s = g3cVarArr;
        t = new le3(g3cVarArr);
    }

    public g3c(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static g3c valueOf(String str) {
        return (g3c) Enum.valueOf(g3c.class, str);
    }

    public static g3c[] values() {
        return (g3c[]) s.clone();
    }
}
