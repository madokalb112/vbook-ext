package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract /* synthetic */ class xv5 {
    public static void A(lu6 lu6Var, float f, dd4 dd4Var, boolean z) {
        un9.a(dd4Var, tg9.h(lu6Var, f));
        dd4Var.q(z);
    }

    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int b(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int c(uka ukaVar, int i, int i2) {
        return (ukaVar.hashCode() + i) * i2;
    }

    public static long d(int i, int i2, String str) {
        return zk9.h(i2, str.length() + i);
    }

    public static rg2 e(xu4 xu4Var, gu4 gu4Var, xu4 xu4Var2, is4 is4Var) {
        xu4Var.d(gu4Var);
        return new rg2(xu4Var2, is4Var);
    }

    public static ou6 f(float f, ou6 ou6Var, boolean z) {
        return ou6Var.e(new bp5(f, z));
    }

    public static ou6 g(dd4 dd4Var, boolean z, boolean z2, lu6 lu6Var, float f) {
        dd4Var.q(z);
        dd4Var.q(z2);
        return tg9.h(lu6Var, f);
    }

    public static ou6 h(lu6 lu6Var, float f, dd4 dd4Var, lu6 lu6Var2, float f2) {
        un9.a(dd4Var, tg9.h(lu6Var, f));
        return tg9.f(lu6Var2, f2);
    }

    public static Integer i(int i, Integer num) {
        return Integer.valueOf(num.intValue() / i);
    }

    public static String j(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(long j, String str) {
        return str + j;
    }

    public static String m(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String n(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder t(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void w(int i, yb4 yb4Var, dd4 dd4Var, boolean z, boolean z2) {
        yb4Var.invoke(dd4Var, Integer.valueOf(i));
        dd4Var.q(z);
        dd4Var.q(z2);
    }

    public static void x(long j, String str, StringBuilder sb) {
        sb.append((Object) lc1.j(j));
        sb.append(str);
    }

    public static void y(dd4 dd4Var, int i, lu6 lu6Var, float f, dd4 dd4Var2) {
        dd4Var.f0(i);
        un9.a(dd4Var2, tg9.r(lu6Var, f));
    }

    public static void z(dd4 dd4Var, boolean z, lu6 lu6Var, float f, dd4 dd4Var2) {
        dd4Var.q(z);
        un9.a(dd4Var2, tg9.h(lu6Var, f));
    }
}
