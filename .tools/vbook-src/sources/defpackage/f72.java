package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = i72.class)
public abstract class f72 {
    public static final e72 Companion = new e72();

    public abstract int a();

    public int b() {
        return (int) (g() / 3600000000000L);
    }

    public int c() {
        return (int) ((g() % 3600000000000L) / 60000000000L);
    }

    public int d() {
        return (int) (g() % 1000000000);
    }

    public int e() {
        return (int) ((g() % 60000000000L) / 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f72)) {
            return false;
        }
        f72 f72Var = (f72) obj;
        return f() == f72Var.f() && a() == f72Var.a() && g() == f72Var.g();
    }

    public abstract long f();

    public abstract long g();

    public final int hashCode() {
        return Long.hashCode(g()) + ((a() + (Long.hashCode(f()) * 31)) * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        if (f() > 0 || a() > 0 || g() > 0 || ((f() | g()) == 0 && a() == 0)) {
            i = 1;
        } else {
            sb.append('-');
            i = -1;
        }
        sb.append('P');
        if (((int) (f() / 12)) != 0) {
            sb.append(((int) (f() / 12)) * i);
            sb.append('Y');
        }
        if (((int) (f() % 12)) != 0) {
            sb.append(((int) (f() % 12)) * i);
            sb.append('M');
        }
        if (a() != 0) {
            sb.append(a() * i);
            sb.append('D');
        }
        String str = "";
        String str2 = "T";
        if (b() != 0) {
            sb.append("T");
            sb.append(b() * i);
            sb.append('H');
            str2 = "";
        }
        if (c() != 0) {
            sb.append(str2);
            sb.append(c() * i);
            sb.append('M');
        } else {
            str = str2;
        }
        if ((e() | d()) != 0) {
            sb.append(str);
            sb.append(e() != 0 ? Integer.valueOf(e() * i) : d() * i < 0 ? "-0" : "0");
            if (d() != 0) {
                sb.append('.');
                sb.append(bw9.i0(9, String.valueOf(Math.abs(d()))));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            sb.append("0D");
        }
        return sb.toString();
    }
}
