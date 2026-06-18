package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface k46 {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    void f(String str, Throwable th);

    void g(String str, Throwable th);

    String getName();

    void h(String str);

    void i(String str);

    void j(String str);

    default boolean k(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return e();
        }
        if (c == '\n') {
            return b();
        }
        if (c == 20) {
            return d();
        }
        if (c == 30) {
            return a();
        }
        if (c == '(') {
            return c();
        }
        mn5.i(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR", "] not recognized.", "Level [");
        return false;
    }
}
