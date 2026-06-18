package okhttp3.internal.connection;

import defpackage.fc1;
import defpackage.gc1;
import defpackage.k27;
import defpackage.lc5;
import defpackage.mn5;
import defpackage.xv5;
import defpackage.yg8;
import defpackage.zy5;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealRoutePlanner implements RoutePlanner {
    public final TaskRunner a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Address i;
    public final RouteDatabase j;
    public final RealCall k;
    public final boolean l;
    public RouteSelector.Selection m;
    public RouteSelector n;
    public Route o;
    public final vv p;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, RealCall realCall, Request request) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        routeDatabase.getClass();
        this.a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = address;
        this.j = routeDatabase;
        this.k = realCall;
        this.l = !lc5.Q(request.b, "GET");
        this.p = new vv();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (this.p.isEmpty() && this.o == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    route = null;
                    if (realConnection.x == 0 && realConnection.v && _UtilJvmKt.a(realConnection.c.a.h, this.i.h)) {
                        route = realConnection.c;
                    }
                }
                if (route != null) {
                    this.o = route;
                    return true;
                }
            }
            RouteSelector.Selection selection = this.m;
            if ((selection == null || selection.b >= selection.a.size()) && (routeSelector = this.n) != null) {
                return routeSelector.a();
            }
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final Address b() {
        return this.i;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean c(HttpUrl httpUrl) {
        httpUrl.getClass();
        HttpUrl httpUrl2 = this.i.h;
        return httpUrl.e == httpUrl2.e && lc5.Q(httpUrl.d, httpUrl2.d);
    }

    public final RoutePlanner.Plan d() throws SocketException, UnknownServiceException, UnknownHostException {
        Socket socketJ;
        ReusePlan reusePlan;
        ConnectPlan connectPlanE;
        String hostAddress;
        int port;
        List listJ;
        boolean zContains;
        RealConnection realConnection = this.k.v;
        if (realConnection == null) {
            reusePlan = null;
        } else {
            boolean zG = realConnection.g(this.l);
            synchronized (realConnection) {
                boolean z = realConnection.v;
                try {
                    if (zG) {
                        socketJ = (z || !c(realConnection.c.a.h)) ? this.k.j() : null;
                    } else {
                        realConnection.v = true;
                        socketJ = this.k.j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.v == null) {
                if (socketJ != null) {
                    _UtilJvmKt.c(socketJ);
                }
                RealCall realCall = this.k;
                realCall.e.k(realCall, realConnection);
                reusePlan = null;
            } else {
                if (socketJ != null) {
                    gp.j("Check failed.");
                    return null;
                }
                reusePlan = new ReusePlan(realConnection);
            }
        }
        if (reusePlan != null) {
            return reusePlan;
        }
        ReusePlan reusePlanF = f(null, null);
        if (reusePlanF != null) {
            return reusePlanF;
        }
        if (!this.p.isEmpty()) {
            return (RoutePlanner.Plan) this.p.removeFirst();
        }
        Route route = this.o;
        if (route != null) {
            this.o = null;
            connectPlanE = e(route, null);
        } else {
            RouteSelector.Selection selection = this.m;
            if (selection == null || selection.b >= selection.a.size()) {
                RouteSelector routeSelector = this.n;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.i, this.j, this.k, this.h);
                    this.n = routeSelector;
                }
                if (!routeSelector.a()) {
                    sy3.m("exhausted all routes");
                    return null;
                }
                if (!routeSelector.a()) {
                    mn5.m();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (routeSelector.f < routeSelector.e.size()) {
                    Address address = routeSelector.a;
                    if (routeSelector.f >= routeSelector.e.size()) {
                        throw new SocketException("No route to " + address.h.d + "; exhausted proxy configurations: " + routeSelector.e);
                    }
                    List list = routeSelector.e;
                    int i = routeSelector.f;
                    routeSelector.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    RealCall realCall2 = routeSelector.c;
                    ArrayList arrayList2 = new ArrayList();
                    routeSelector.g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        HttpUrl httpUrl = address.h;
                        hostAddress = httpUrl.d;
                        port = httpUrl.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            k27.k(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        if (address2 == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address2.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        yg8 yg8Var = _HostnamesCommonKt.a;
                        hostAddress.getClass();
                        if (_HostnamesCommonKt.a.e(hostAddress)) {
                            listJ = gc1.Y(InetAddress.getByName(hostAddress));
                        } else {
                            realCall2.e.o(realCall2, hostAddress);
                            List listA = address.a.a(hostAddress);
                            if (listA.isEmpty()) {
                                throw new UnknownHostException(address.a + " returned no addresses for " + hostAddress);
                            }
                            realCall2.e.n(realCall2, hostAddress, listA);
                            listJ = listA;
                        }
                        if (routeSelector.d && listJ.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listJ) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                byte[] bArr = _UtilCommonKt.a;
                                Iterator it = arrayList3.iterator();
                                Iterator it2 = arrayList4.iterator();
                                zy5 zy5VarN = gc1.N();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        zy5VarN.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        zy5VarN.add(it2.next());
                                    }
                                }
                                listJ = gc1.J(zy5VarN);
                            }
                        }
                        Iterator it3 = listJ.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = routeSelector.g.iterator();
                    while (it4.hasNext()) {
                        Route route2 = new Route(routeSelector.a, proxy, (InetSocketAddress) it4.next());
                        RouteDatabase routeDatabase = routeSelector.b;
                        synchronized (routeDatabase) {
                            zContains = routeDatabase.a.contains(route2);
                        }
                        if (zContains) {
                            routeSelector.h.add(route2);
                        } else {
                            arrayList.add(route2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    fc1.p0(arrayList, routeSelector.h);
                    routeSelector.h.clear();
                }
                RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList);
                this.m = selection2;
                if (this.k.D) {
                    sy3.m("Canceled");
                    return null;
                }
                if (selection2.b >= arrayList.size()) {
                    mn5.m();
                    return null;
                }
                int i2 = selection2.b;
                selection2.b = i2 + 1;
                connectPlanE = e((Route) arrayList.get(i2), arrayList);
            } else {
                int i3 = selection.b;
                ArrayList arrayList5 = selection.a;
                if (i3 >= arrayList5.size()) {
                    mn5.m();
                    return null;
                }
                int i4 = selection.b;
                selection.b = i4 + 1;
                connectPlanE = e((Route) arrayList5.get(i4), null);
            }
        }
        ReusePlan reusePlanF2 = f(connectPlanE, connectPlanE.w);
        return reusePlanF2 != null ? reusePlanF2 : connectPlanE;
    }

    public final ConnectPlan e(Route route, ArrayList arrayList) throws UnknownServiceException {
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        route.getClass();
        Address address = route.a;
        if (address.c == null) {
            if (!address.j.contains(ConnectionSpec.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.a.h.d;
            Platform platform = Platform.a;
            if (!Platform.a.i(str)) {
                throw new UnknownServiceException(xv5.p("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (address.i.contains(protocol)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.b.type() == Proxy.Type.HTTP) {
            Address address2 = route.a;
            if (address2.c != null || address2.i.contains(protocol)) {
                Request.Builder builder = new Request.Builder();
                HttpUrl httpUrl = route.a.h;
                httpUrl.getClass();
                builder.a = httpUrl;
                builder.b("CONNECT", null);
                Address address3 = route.a;
                builder.a("Host", _UtilJvmKt.h(address3.h, true));
                builder.a("Proxy-Connection", "Keep-Alive");
                builder.a("User-Agent", "okhttp/5.3.2");
                Request request2 = new Request(builder);
                Response.Builder builder2 = new Response.Builder();
                builder2.a = request2;
                builder2.b = Protocol.HTTP_1_1;
                builder2.c = 407;
                builder2.d = "Preemptive Authenticate";
                builder2.l = -1L;
                builder2.m = -1L;
                Headers.Builder builder3 = builder2.f;
                builder3.getClass();
                _HeadersCommonKt.b("Proxy-Authenticate");
                _HeadersCommonKt.c("OkHttp-Preemptive", "Proxy-Authenticate");
                builder3.b("Proxy-Authenticate");
                _HeadersCommonKt.a(builder3, "Proxy-Authenticate", "OkHttp-Preemptive");
                Request requestA = address3.f.a(route, builder2.a());
                request = requestA == null ? request2 : requestA;
            }
        }
        return new ConnectPlan(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, route, arrayList, 0, request, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:14:0x0034, B:22:0x0041, B:25:0x0048), top: B:53:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.ReusePlan f(okhttp3.internal.connection.ConnectPlan r11, java.util.List r12) {
        /*
            r10 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r10.b
            boolean r1 = r10.l
            okhttp3.Address r2 = r10.i
            okhttp3.internal.connection.RealCall r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.a()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            okhttp3.internal.connection.RealConnection r7 = (okhttp3.internal.connection.RealConnection) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            okhttp3.internal.http2.Http2Connection r9 = r7.u     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r10 = move-exception
            goto L67
        L41:
            boolean r9 = r7.e(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.b(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.v = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.j()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            okhttp3.internal._UtilJvmKt.c(r8)
            goto L21
        L64:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L67:
            monitor-exit(r7)
            throw r10
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            okhttp3.Route r12 = r11.v
            r10.o = r12
            java.net.Socket r11 = r11.D
            if (r11 == 0) goto L7a
            okhttp3.internal._UtilJvmKt.c(r11)
        L7a:
            okhttp3.internal.connection.RealCall r10 = r10.k
            okhttp3.EventListener r11 = r10.e
            r11.j(r10, r7)
            okhttp3.internal.connection.ReusePlan r10 = new okhttp3.internal.connection.ReusePlan
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealRoutePlanner.f(okhttp3.internal.connection.ConnectPlan, java.util.List):okhttp3.internal.connection.ReusePlan");
    }
}
