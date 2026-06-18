package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xr {
    public static final bv4 b;
    public static final xr c;
    public static final xr d;
    public static final /* synthetic */ xr[] e;
    public static final /* synthetic */ le3 f;
    public final String a;

    static {
        xr xrVar = new xr("None", 0, "none");
        c = xrVar;
        xr xrVar2 = new xr("Image", 1, "image");
        d = xrVar2;
        xr[] xrVarArr = {xrVar, xrVar2, new xr("Circles", 2, "circles"), new xr("Grid", 3, "grid"), new xr("Mesh", 4, "mesh"), new xr("Particles", 5, "particles"), new xr("Rings", 6, "rings"), new xr("Shapes", 7, "shapes"), new xr("Snow", 8, "snow"), new xr("Space", 9, "space")};
        e = xrVarArr;
        f = new le3(xrVarArr);
        b = new bv4(15);
    }

    public xr(String str, int i, String str2) {
        this.a = str2;
    }

    public static xr valueOf(String str) {
        return (xr) Enum.valueOf(xr.class, str);
    }

    public static xr[] values() {
        return (xr[]) e.clone();
    }
}
