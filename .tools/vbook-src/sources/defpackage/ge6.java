package defpackage;

import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ge6 {
    public static final List a;

    static {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(ok3.class);
        serviceLoaderLoad.getClass();
        a = fc1.Z0(serviceLoaderLoad);
    }
}
