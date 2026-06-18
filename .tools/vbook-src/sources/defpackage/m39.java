package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface m39 {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    gx1 e();

    int f();

    String g(int i);

    default List getAnnotations() {
        return lc3.a;
    }

    List h(int i);

    m39 i(int i);

    default boolean isInline() {
        return false;
    }

    boolean j(int i);
}
