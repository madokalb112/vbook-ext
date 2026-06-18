package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ra4 {
    public static final ra4 b;
    public static final ra4 c;
    public static final ra4 d;
    public static final ra4 e;
    public static final ra4 f;
    public static final /* synthetic */ ra4[] s;
    public static final /* synthetic */ le3 t;
    public final int a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object next;
        int i = 0;
        ra4 ra4Var = new ra4("TEXT", 0, 1);
        b = ra4Var;
        ra4 ra4Var2 = new ra4("BINARY", 1, 2);
        c = ra4Var2;
        ra4 ra4Var3 = new ra4("CLOSE", 2, 8);
        d = ra4Var3;
        ra4 ra4Var4 = new ra4("PING", 3, 9);
        e = ra4Var4;
        ra4 ra4Var5 = new ra4("PONG", 4, 10);
        f = ra4Var5;
        ra4[] ra4VarArr = {ra4Var, ra4Var2, ra4Var3, ra4Var4, ra4Var5};
        s = ra4VarArr;
        le3 le3Var = new le3(ra4VarArr);
        t = le3Var;
        n1 n1Var = new n1(le3Var, i);
        if (n1Var.hasNext()) {
            next = n1Var.next();
            if (n1Var.hasNext()) {
                int i2 = ((ra4) next).a;
                do {
                    Object next2 = n1Var.next();
                    int i3 = ((ra4) next2).a;
                    if (i2 < i3) {
                        next = next2;
                        i2 = i3;
                    }
                } while (n1Var.hasNext());
            }
        } else {
            next = null;
        }
        next.getClass();
        int i4 = ((ra4) next).a + 1;
        ra4[] ra4VarArr2 = new ra4[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            le3 le3Var2 = t;
            le3Var2.getClass();
            n1 n1Var2 = new n1(le3Var2, i);
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!n1Var2.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next3 = n1Var2.next();
                    if (((ra4) next3).a == i5) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next3;
                    }
                }
            }
            obj = null;
            ra4VarArr2[i5] = obj;
        }
    }

    public ra4(String str, int i, int i2) {
        this.a = i2;
    }

    public static ra4 valueOf(String str) {
        return (ra4) Enum.valueOf(ra4.class, str);
    }

    public static ra4[] values() {
        return (ra4[]) s.clone();
    }
}
