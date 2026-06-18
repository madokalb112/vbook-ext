package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hc7 extends WebSocketListener implements dl2 {
    public final WebSocket.Factory a;
    public final jx1 b;
    public final bi1 c;
    public final bi1 d;
    public final ir0 e;
    public final ir0 f;
    public final bi1 s;
    public final oq9 t;

    public hc7(OkHttpClient okHttpClient, OkHttpClient okHttpClient2, Request request, jx1 jx1Var, yvb yvbVar) {
        okHttpClient.getClass();
        okHttpClient2.getClass();
        request.getClass();
        jx1Var.getClass();
        yvbVar.getClass();
        this.a = okHttpClient2;
        this.b = jx1Var;
        this.c = p7c.d();
        this.d = p7c.d();
        j11 j11Var = yvbVar.a;
        j11Var.getClass();
        if (j11Var.a != Integer.MAX_VALUE) {
            gp.l("OkHttp does not support SUSPEND overflow strategy for incoming channel");
            throw null;
        }
        g11 g11Var = h11.i;
        this.e = hn9.n(g11Var, yvbVar.a);
        this.f = hn9.n(g11Var, yvbVar.b);
        this.s = p7c.d();
        this.t = ah1.J(this, null, null, new gc7(this, request, null), 3);
    }

    @Override // defpackage.cwb
    public final h11 A() {
        return this.e;
    }

    @Override // defpackage.cwb
    public final void F0(long j) {
        throw new r91(9, "Max frame size switch is not supported in OkHttp engine.", null);
    }

    @Override // defpackage.cwb
    public final Object N(dwb dwbVar) {
        return heb.a;
    }

    @Override // defpackage.cwb
    public final long O0() {
        return Long.MAX_VALUE;
    }

    @Override // okhttp3.WebSocketListener
    public final void a(RealWebSocket realWebSocket, int i, String str) {
        Object objValueOf;
        realWebSocket.getClass();
        str.getClass();
        short s = (short) i;
        this.s.Q(new va1(s, str));
        this.e.h(null);
        StringBuilder sb = new StringBuilder("WebSocket session closed with code ");
        ua1.b.getClass();
        ua1 ua1Var = (ua1) ua1.c.get(Short.valueOf(s));
        if (ua1Var == null || (objValueOf = ua1Var.toString()) == null) {
            objValueOf = Integer.valueOf(i);
        }
        CancellationException cancellationException = new CancellationException(xv5.r(sb, objValueOf, '.'));
        this.f.o(false, cancellationException);
        this.t.s(cancellationException);
    }

    @Override // okhttp3.WebSocketListener
    public final void b(RealWebSocket realWebSocket, int i, String str) {
        short s = (short) i;
        this.s.Q(new va1(s, str));
        this.f.k(new ja4(new va1(s, str)));
        this.e.h(null);
    }

    @Override // okhttp3.WebSocketListener
    public final void c(RealWebSocket realWebSocket, Exception exc, Response response) {
        realWebSocket.getClass();
        Integer numValueOf = response != null ? Integer.valueOf(response.d) : null;
        int i = yv4.u.a;
        ir0 ir0Var = this.f;
        ir0 ir0Var2 = this.e;
        bi1 bi1Var = this.d;
        if (numValueOf != null && numValueOf.intValue() == i) {
            bi1Var.Q(response);
            ir0Var2.h(null);
            ir0Var.h(null);
        } else {
            bi1Var.o0(exc);
            this.s.o0(exc);
            ir0Var2.o(false, exc);
            ir0Var.o(false, exc);
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void d(RealWebSocket realWebSocket, av0 av0Var) {
        av0Var.getClass();
        this.e.k(new ia4(ra4.c, av0Var.r()));
    }

    @Override // okhttp3.WebSocketListener
    public final void e(RealWebSocket realWebSocket, String str) {
        byte[] bytes = str.getBytes(q31.a);
        bytes.getClass();
        this.e.k(new ma4(ra4.b, bytes));
    }

    @Override // defpackage.cwb
    public final w29 e0() {
        return this.f;
    }

    @Override // okhttp3.WebSocketListener
    public final void f(WebSocket webSocket, Response response) {
        this.d.Q(response);
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.b;
    }

    @Override // defpackage.dl2
    public final void x0(List list) {
        if (list.isEmpty()) {
            return;
        }
        gp.l("Extensions are not supported.");
    }
}
