package defpackage;

import io.ktor.client.engine.okhttp.OkHttpEngineContainer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zs4 {
    public static final yb7 a;

    static {
        try {
            Iterator it = Arrays.asList(new OkHttpEngineContainer()).iterator();
            it.getClass();
            if (((xs4) f39.o0(f39.n0(it))) != null) {
                a = yb7.a;
            } else {
                gp.j("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
