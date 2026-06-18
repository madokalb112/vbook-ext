package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface xv9 {
    static {
        int i = wv9.a;
    }

    Set b();

    default String c(String str) {
        List listF = f(str);
        if (listF != null) {
            return (String) fc1.z0(listF);
        }
        return null;
    }

    default void d(yb4 yb4Var) {
        for (Map.Entry entry : b()) {
            yb4Var.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    boolean e();

    List f(String str);

    default boolean g() {
        return f("Content-Encoding") != null;
    }

    boolean isEmpty();

    Set names();
}
