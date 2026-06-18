package okhttp3.internal.http;

import defpackage.ifc;
import defpackage.j31;
import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    public final RealCall a;
    public final ArrayList b;
    public final int c;
    public final Exchange d;
    public final Request e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        request.getClass();
        this.a = realCall;
        this.b = arrayList;
        this.c = i;
        this.d = exchange;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static RealInterceptorChain a(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            exchange = realInterceptorChain.d;
        }
        Exchange exchange2 = exchange;
        if ((i2 & 4) != 0) {
            request = realInterceptorChain.e;
        }
        Request request2 = request;
        int i4 = realInterceptorChain.f;
        int i5 = realInterceptorChain.g;
        int i6 = realInterceptorChain.h;
        request2.getClass();
        return new RealInterceptorChain(realInterceptorChain.a, realInterceptorChain.b, i3, exchange2, request2, i4, i5, i6);
    }

    public final Response b(Request request) {
        request.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            gp.j("Check failed.");
            return null;
        }
        this.i++;
        Exchange exchange = this.d;
        if (exchange != null) {
            if (!exchange.c.b().c(request.a)) {
                j31.f(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                j31.f(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        RealInterceptorChain realInterceptorChainA = a(this, i2, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseA = interceptor.a(realInterceptorChainA);
        if (responseA == null) {
            ifc.e(interceptor, " returned null", "interceptor ");
            return null;
        }
        if (exchange == null || i2 >= arrayList.size() || realInterceptorChainA.i == 1) {
            return responseA;
        }
        j31.f(interceptor, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
