package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class k31 {
    public static final zcb a;

    static {
        new ArrayList();
        new ReentrantLock();
        a = new zcb();
        int i = fx4.H;
        "UTF-16-".concat("LE");
        "UTF-16-".concat("BE");
    }

    public static byte[] a(String str, t1c t1cVar) {
        int length = str.length();
        str.getClass();
        t1cVar.getClass();
        b10 b10Var = new b10(t1cVar.X(length));
        t1cVar.V(b10Var, str, length);
        return b10Var.d();
    }

    public static String b(byte[] bArr, t1c t1cVar) {
        int length = bArr.length;
        bArr.getClass();
        t1cVar.getClass();
        StringBuilder sb = new StringBuilder(t1cVar.Y(length));
        t1cVar.S(sb, bArr, length);
        return sb.toString();
    }
}
