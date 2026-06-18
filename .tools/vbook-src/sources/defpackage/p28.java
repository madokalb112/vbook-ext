package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class p28 {
    public static final f86 a;

    static {
        f86 f86Var = new f86();
        f86Var.put(ug8.a(String.class), tv9.a);
        f86Var.put(ug8.a(Character.TYPE), d31.a);
        f86Var.put(ug8.a(char[].class), q21.c);
        f86Var.put(ug8.a(Double.TYPE), o03.a);
        f86Var.put(ug8.a(double[].class), c03.c);
        f86Var.put(ug8.a(Float.TYPE), g14.a);
        f86Var.put(ug8.a(float[].class), a14.c);
        f86Var.put(ug8.a(Long.TYPE), e66.a);
        f86Var.put(ug8.a(long[].class), p56.c);
        f86Var.put(ug8.a(mcb.class), qcb.a);
        f86Var.put(ug8.a(Integer.TYPE), la5.a);
        f86Var.put(ug8.a(int[].class), w95.c);
        f86Var.put(ug8.a(hcb.class), lcb.a);
        f86Var.put(ug8.a(Short.TYPE), vd9.a);
        f86Var.put(ug8.a(short[].class), ud9.c);
        f86Var.put(ug8.a(ucb.class), ycb.a);
        f86Var.put(ug8.a(Byte.TYPE), pu0.a);
        f86Var.put(ug8.a(byte[].class), ss0.c);
        f86Var.put(ug8.a(ccb.class), gcb.a);
        f86Var.put(ug8.a(Boolean.TYPE), mm0.a);
        f86Var.put(ug8.a(boolean[].class), jm0.c);
        f86Var.put(ug8.a(heb.class), ieb.b);
        f86Var.put(ug8.a(Void.class), w77.a);
        try {
            a91 a91VarA = ug8.a(k63.class);
            mc8 mc8Var = k63.b;
            f86Var.put(a91VarA, n63.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            f86Var.put(ug8.a(ncb.class), pcb.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            f86Var.put(ug8.a(icb.class), kcb.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            f86Var.put(ug8.a(vcb.class), xcb.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            f86Var.put(ug8.a(dcb.class), fcb.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            f86Var.put(ug8.a(vjb.class), xjb.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            a91 a91VarA2 = ug8.a(p95.class);
            p95 p95Var = p95.c;
            f86Var.put(a91VarA2, u95.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        a = f86Var.c();
    }

    public static final void a(String str) {
        for (oi5 oi5Var : (lz0) a.values()) {
            if (str.equals(oi5Var.e().a())) {
                StringBuilder sbM = dx1.m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM.append(ug8.a(oi5Var.getClass()).g());
                sbM.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                gp.l(cw9.t(sbM.toString()));
                return;
            }
        }
    }
}
