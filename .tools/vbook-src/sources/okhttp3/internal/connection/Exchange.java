package okhttp3.internal.connection;

import defpackage.ag9;
import defpackage.ie8;
import defpackage.il9;
import defpackage.j39;
import defpackage.pk9;
import defpackage.w84;
import defpackage.x84;
import defpackage.xq0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Exchange {
    public final RealCall a;
    public final EventListener b;
    public final ExchangeFinder c;
    public final ExchangeCodec d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class RequestBodySink extends w84 {
        public final long b;
        public final boolean c;
        public boolean d;
        public long e;
        public boolean f;
        public boolean s;
        public final /* synthetic */ Exchange t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, ag9 ag9Var, long j, boolean z) {
            super(ag9Var);
            ag9Var.getClass();
            this.t = exchange;
            this.b = j;
            this.c = z;
            this.f = z;
        }

        @Override // defpackage.w84, defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.s) {
                return;
            }
            this.s = true;
            long j = this.b;
            if (j != -1 && this.e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                p(null);
            } catch (IOException e) {
                IOException iOExceptionP = p(e);
                iOExceptionP.getClass();
                throw iOExceptionP;
            }
        }

        @Override // defpackage.w84, defpackage.ag9, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                IOException iOExceptionP = p(e);
                iOExceptionP.getClass();
                throw iOExceptionP;
            }
        }

        public final IOException p(IOException iOException) {
            if (this.d) {
                return iOException;
            }
            this.d = true;
            return Exchange.a(this.t, this.e, this.c, iOException, 4);
        }

        @Override // defpackage.w84, defpackage.ag9
        public final void y0(long j, xq0 xq0Var) throws IOException {
            if (this.s) {
                gp.j("closed");
                return;
            }
            long j2 = this.b;
            if (j2 != -1 && this.e + j > j2) {
                StringBuilder sbO = j39.o(j2, "expected ", " bytes but received ");
                sbO.append(this.e + j);
                throw new ProtocolException(sbO.toString());
            }
            try {
                if (this.f) {
                    this.f = false;
                    Exchange exchange = this.t;
                    exchange.b.t(exchange.a);
                }
                this.a.y0(j, xq0Var);
                this.e += j;
            } catch (IOException e) {
                IOException iOExceptionP = p(e);
                iOExceptionP.getClass();
                throw iOExceptionP;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class ResponseBodySource extends x84 {
        public final long b;
        public final boolean c;
        public long d;
        public boolean e;
        public boolean f;
        public boolean s;
        public final /* synthetic */ Exchange t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, il9 il9Var, long j, boolean z) {
            super(il9Var);
            il9Var.getClass();
            this.t = exchange;
            this.b = j;
            this.c = z;
            this.e = true;
            if (j == 0) {
                p(null);
            }
        }

        @Override // defpackage.x84, defpackage.il9
        public final long D0(long j, xq0 xq0Var) throws IOException {
            xq0Var.getClass();
            if (this.s) {
                gp.j("closed");
                return 0L;
            }
            try {
                long jD0 = this.a.D0(j, xq0Var);
                boolean z = this.e;
                Exchange exchange = this.t;
                if (z) {
                    this.e = false;
                    exchange.b.y(exchange.a);
                }
                if (jD0 == -1) {
                    p(null);
                    return -1L;
                }
                long j2 = this.d + jD0;
                long j3 = this.b;
                if (j3 == -1 || j2 <= j3) {
                    this.d = j2;
                    if (exchange.d.c()) {
                        p(null);
                    }
                    return jD0;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                IOException iOExceptionP = p(e);
                iOExceptionP.getClass();
                throw iOExceptionP;
            }
        }

        @Override // defpackage.x84, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.s) {
                return;
            }
            this.s = true;
            try {
                super.close();
                p(null);
            } catch (IOException e) {
                IOException iOExceptionP = p(e);
                iOExceptionP.getClass();
                throw iOExceptionP;
            }
        }

        public final IOException p(IOException iOException) {
            if (this.f) {
                return iOException;
            }
            this.f = true;
            Exchange exchange = this.t;
            if (iOException == null && this.e) {
                this.e = false;
                exchange.b.y(exchange.a);
            }
            return Exchange.a(exchange, this.d, this.c, iOException, 8);
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        eventListener.getClass();
        exchangeFinder.getClass();
        this.a = realCall;
        this.b = eventListener;
        this.c = exchangeFinder;
        this.d = exchangeCodec;
    }

    public static IOException a(Exchange exchange, long j, boolean z, IOException iOException, int i) {
        boolean z2;
        IOException iOException2;
        Exchange exchange2;
        RealCall realCall = exchange.a;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        EventListener eventListener = exchange.b;
        if (iOException != null) {
            exchange.f(iOException);
        }
        if (z4) {
            if (iOException != null) {
                eventListener.u(realCall, iOException);
            } else {
                eventListener.s(realCall);
            }
        }
        if (z3) {
            if (iOException != null) {
                eventListener.z(realCall, iOException);
            } else {
                eventListener.x(realCall);
            }
        }
        boolean z5 = z4 && !z;
        boolean z6 = z3 && !z;
        boolean z7 = z4 && z;
        if (z3 && z) {
            z2 = true;
            exchange2 = exchange;
            iOException2 = iOException;
        } else {
            z2 = false;
            iOException2 = iOException;
            exchange2 = exchange;
        }
        return realCall.h(exchange2, z5, z6, z2, z7, iOException2);
    }

    public final ag9 b(Request request, boolean z) {
        request.getClass();
        this.e = z;
        RequestBody requestBody = request.d;
        requestBody.getClass();
        long jA = requestBody.a();
        this.b.t(this.a);
        return new RequestBodySink(this, this.d.j(request, jA), jA, false);
    }

    public final RealConnection c() {
        ExchangeCodec.Carrier carrierI = this.d.i();
        RealConnection realConnection = carrierI instanceof RealConnection ? (RealConnection) carrierI : null;
        if (realConnection != null) {
            return realConnection;
        }
        gp.j("no connection for CONNECT tunnels");
        return null;
    }

    public final RealResponseBody d(Response response) throws IOException {
        Exchange exchange;
        String strA;
        long jH;
        ExchangeCodec exchangeCodec = this.d;
        try {
            strA = response.f.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            jH = exchangeCodec.h(response);
            exchange = this;
        } catch (IOException e) {
            e = e;
            exchange = this;
        }
        try {
            return new RealResponseBody(strA, jH, new ie8(new ResponseBodySource(exchange, exchangeCodec.d(response), jH, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            exchange.b.z(exchange.a, iOException);
            exchange.f(iOException);
            throw iOException;
        }
    }

    public final Response.Builder e(boolean z) throws IOException {
        try {
            Response.Builder builderE = this.d.e(z);
            if (builderE == null) {
                return builderE;
            }
            builderE.n = this;
            return builderE;
        } catch (IOException e) {
            this.b.z(this.a, e);
            f(e);
            throw e;
        }
    }

    public final void f(IOException iOException) {
        this.f = true;
        this.d.i().c(this.a, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.internal.connection.Exchange$upgradeToSocket$1] */
    public final Exchange$upgradeToSocket$1 g() throws SocketException {
        RealCall realCall = this.a;
        if (realCall.w) {
            gp.j("Check failed.");
            return null;
        }
        realCall.w = true;
        realCall.f.j();
        synchronized (realCall) {
            if (realCall.E == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.A || realCall.B) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.y) {
                throw new IllegalStateException("Check failed.");
            }
            if (!realCall.z) {
                throw new IllegalStateException("Check failed.");
            }
            realCall.z = false;
            realCall.A = true;
            realCall.B = true;
        }
        ExchangeCodec.Carrier carrierI = this.d.i();
        carrierI.getClass();
        RealConnection realConnection = (RealConnection) carrierI;
        realConnection.e.setSoTimeout(0);
        realConnection.f();
        return new pk9() { // from class: okhttp3.internal.connection.Exchange$upgradeToSocket$1
            public final Exchange.RequestBodySink a;
            public final Exchange.ResponseBodySource b;

            {
                ExchangeCodec exchangeCodec = this.c.d;
                this.a = new Exchange.RequestBodySink(this.c, exchangeCodec.g().b(), -1L, true);
                this.b = new Exchange.ResponseBodySource(this.c, exchangeCodec.g().c(), -1L, true);
            }

            @Override // defpackage.pk9
            public final ag9 b() {
                return this.a;
            }

            @Override // defpackage.pk9
            public final il9 c() {
                return this.b;
            }

            @Override // defpackage.pk9
            public final void cancel() {
                this.c.d.cancel();
            }
        };
    }
}
