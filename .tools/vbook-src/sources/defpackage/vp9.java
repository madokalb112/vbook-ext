package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vp9 {
    public static final vp9 e;
    public static final /* synthetic */ vp9[] f;
    public final by3 a;
    public final by3 b;
    public final by3 c;
    public final by3 d;

    static {
        kp9 kp9VarW = ah1.W(0.5f, 200.0f, 4, null);
        kp9 kp9VarW2 = ah1.W(0.5f, 200.0f, 4, null);
        kf8 kf8Var = wub.a;
        vp9 vp9Var = new vp9("Bounce", 0, kp9VarW, kp9VarW2, new kp9(0.5f, 200.0f, new ea5(4294967297L)), new kp9(0.5f, 200.0f, new ea5(4294967297L)));
        e = vp9Var;
        a22 a22Var = b83.a;
        f = new vp9[]{vp9Var, new vp9("Slide", 1, new p9b(100, 0, a22Var), new p9b(100, 0, a22Var), new p9b(100, 0, a22Var), new p9b(100, 0, a22Var))};
    }

    public vp9(String str, int i, by3 by3Var, by3 by3Var2, by3 by3Var3, by3 by3Var4) {
        this.a = by3Var;
        this.b = by3Var2;
        this.c = by3Var3;
        this.d = by3Var4;
    }

    public static vp9 valueOf(String str) {
        return (vp9) Enum.valueOf(vp9.class, str);
    }

    public static vp9[] values() {
        return (vp9[]) f.clone();
    }
}
