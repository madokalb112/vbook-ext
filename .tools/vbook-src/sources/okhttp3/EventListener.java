package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class EventListener {
    public static final EventListener$Companion$NONE$1 a = new EventListener$Companion$NONE$1();

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class AggregateEventListener extends EventListener {
        @Override // okhttp3.EventListener
        public final void A(Call call, Response response) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void B(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void C(RealCall realCall, IOException iOException) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void D(Call call, Response response) {
            call.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void E(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void F(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void a(Call call, Response response) {
            call.getClass();
            response.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void b(Call call, Response response) {
            call.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void c(RealCall realCall) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void d(RealCall realCall, IOException iOException) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void e(RealCall realCall) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void f(RealCall realCall) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            inetSocketAddress.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
            inetSocketAddress.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            inetSocketAddress.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void j(Call call, Connection connection) {
            connection.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void k(Call call, Connection connection) {
            connection.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void l(RealCall realCall, Dispatcher dispatcher) {
            dispatcher.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void m(RealCall realCall, Dispatcher dispatcher) {
            dispatcher.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void n(RealCall realCall, String str, List list) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void o(RealCall realCall, String str) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void p(RealCall realCall, Response response) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void q(RealCall realCall, HttpUrl httpUrl, List list) {
            httpUrl.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void r(RealCall realCall, HttpUrl httpUrl) {
            httpUrl.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void s(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void t(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void u(Call call, IOException iOException) {
            iOException.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void v(Call call, Request request) {
            request.getClass();
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void w(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void x(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void y(Call call) {
            throw null;
        }

        @Override // okhttp3.EventListener
        public final void z(Call call, IOException iOException) {
            iOException.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Factory {
    }

    public void D(Call call, Response response) {
        call.getClass();
    }

    public void a(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    public void b(Call call, Response response) {
        call.getClass();
    }

    public void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        inetSocketAddress.getClass();
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        inetSocketAddress.getClass();
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        inetSocketAddress.getClass();
    }

    public void j(Call call, Connection connection) {
        connection.getClass();
    }

    public void k(Call call, Connection connection) {
        connection.getClass();
    }

    public void l(RealCall realCall, Dispatcher dispatcher) {
        dispatcher.getClass();
    }

    public void m(RealCall realCall, Dispatcher dispatcher) {
        dispatcher.getClass();
    }

    public void q(RealCall realCall, HttpUrl httpUrl, List list) {
        httpUrl.getClass();
    }

    public void r(RealCall realCall, HttpUrl httpUrl) {
        httpUrl.getClass();
    }

    public void u(Call call, IOException iOException) {
        iOException.getClass();
    }

    public void v(Call call, Request request) {
        request.getClass();
    }

    public void z(Call call, IOException iOException) {
        iOException.getClass();
    }

    public void B(Call call) {
    }

    public void E(Call call) {
    }

    public void F(Call call) {
    }

    public void c(RealCall realCall) {
    }

    public void e(RealCall realCall) {
    }

    public void f(RealCall realCall) {
    }

    public void s(Call call) {
    }

    public void t(Call call) {
    }

    public void w(Call call) {
    }

    public void x(Call call) {
    }

    public void y(Call call) {
    }

    public void A(Call call, Response response) {
    }

    public void C(RealCall realCall, IOException iOException) {
    }

    public void d(RealCall realCall, IOException iOException) {
    }

    public void o(RealCall realCall, String str) {
    }

    public void p(RealCall realCall, Response response) {
    }

    public void n(RealCall realCall, String str, List list) {
    }
}
