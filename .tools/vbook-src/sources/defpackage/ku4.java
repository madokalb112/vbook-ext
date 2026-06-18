package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ku4 {
    public static final Set a = fw.Q0(new Character[]{'/', '?', '#', '@'});

    static {
        List list = dy5.b;
        p7c.R(gc1.Z("HTTP/1.0", "HTTP/1.1"), new e4(16), new k7(4));
    }

    public static final void a(k21 k21Var, char c) {
        throw new r91("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) k21Var), 3);
    }

    public static final int b(k21 k21Var, xa8 xa8Var) {
        int i = xa8Var.c;
        for (int i2 = xa8Var.b; i2 < i; i2++) {
            char cCharAt = k21Var.charAt(i2);
            if (cCharAt == ':' && i2 != xa8Var.b) {
                xa8Var.b = i2 + 1;
                return i2;
            }
            if (lc5.V(cCharAt, 32) <= 0 || bw9.P("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                int i3 = xa8Var.b;
                if (cCharAt == ':') {
                    throw new r91("Empty header names are not allowed as per RFC7230.", 3);
                }
                if (i2 == i3) {
                    throw new r91("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", 3);
                }
                a(k21Var, cCharAt);
                throw null;
            }
        }
        throw new r91("No colon in HTTP header in " + k21Var.subSequence(xa8Var.b, xa8Var.c).toString() + " in builder: \n" + ((Object) k21Var), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        a(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002a, B:23:0x005f, B:25:0x006b, B:27:0x006f, B:31:0x007c, B:34:0x0088, B:37:0x0094, B:39:0x0099, B:55:0x00c1, B:19:0x0048, B:42:0x00a0, B:51:0x00b4, B:52:0x00b7, B:53:0x00b8, B:54:0x00bb, B:56:0x00cc, B:57:0x00d3, B:58:0x00d4, B:60:0x00dc), top: B:64:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002a, B:23:0x005f, B:25:0x006b, B:27:0x006f, B:31:0x007c, B:34:0x0088, B:37:0x0094, B:39:0x0099, B:55:0x00c1, B:19:0x0048, B:42:0x00a0, B:51:0x00b4, B:52:0x00b7, B:53:0x00b8, B:54:0x00bb, B:56:0x00cc, B:57:0x00d3, B:58:0x00d4, B:60:0x00dc), top: B:64:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:23:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.ut0 r12, defpackage.k21 r13, xa8 r14, defpackage.kt1 r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku4.c(ut0, k21, xa8, kt1):java.lang.Object");
    }

    public static final void d(i21 i21Var) {
        if (bw9.R(i21Var, ":")) {
            throw new r91("Host header with ':' should contains port: " + ((Object) i21Var), 3);
        }
        for (int i = 0; i < i21Var.length(); i++) {
            Character chValueOf = Character.valueOf(i21Var.charAt(i));
            Set set = a;
            if (set.contains(chValueOf)) {
                throw new r91("Host cannot contain any of the following symbols: " + set, 3);
            }
        }
    }
}
