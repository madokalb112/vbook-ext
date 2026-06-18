package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f4a {
    public static final xn7 b;
    public static final f4a c;
    public static final f4a d;
    public static final f4a e;
    public static final /* synthetic */ f4a[] f;
    public static final /* synthetic */ le3 s;
    public final int a;

    static {
        f4a f4aVar = new f4a("WebDav", 0, 0);
        c = f4aVar;
        f4a f4aVar2 = new f4a("GoogleDrive", 1, 1);
        d = f4aVar2;
        f4a f4aVar3 = new f4a("OneDrive", 2, 2);
        e = f4aVar3;
        f4a[] f4aVarArr = {f4aVar, f4aVar2, f4aVar3};
        f = f4aVarArr;
        s = new le3(f4aVarArr);
        b = new xn7(4);
    }

    public f4a(String str, int i, int i2) {
        this.a = i2;
    }

    public static f4a valueOf(String str) {
        return (f4a) Enum.valueOf(f4a.class, str);
    }

    public static f4a[] values() {
        return (f4a[]) f.clone();
    }
}
