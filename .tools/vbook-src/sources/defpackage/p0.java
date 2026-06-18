package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface p0 extends c72 {
    nu b();

    default ax0 build() {
        ArrayList arrayList = b().a;
        arrayList.getClass();
        return new ax0(arrayList);
    }

    p0 h();
}
