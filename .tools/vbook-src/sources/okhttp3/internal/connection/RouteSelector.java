package okhttp3.internal.connection;

import defpackage.lc3;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RouteSelector {
    public final Address a;
    public final RouteDatabase b;
    public final RealCall c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Selection {
        public final ArrayList a;
        public int b;

        public Selection(ArrayList arrayList) {
            this.a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, boolean z) {
        List listJ;
        routeDatabase.getClass();
        this.a = address;
        this.b = routeDatabase;
        this.c = realCall;
        this.d = z;
        lc3 lc3Var = lc3.a;
        this.e = lc3Var;
        this.g = lc3Var;
        this.h = new ArrayList();
        HttpUrl httpUrl = address.h;
        EventListener eventListener = realCall.e;
        eventListener.r(realCall, httpUrl);
        URI uriG = httpUrl.g();
        if (uriG.getHost() == null) {
            listJ = _UtilJvmKt.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> listSelect = address.g.select(uriG);
            listJ = (listSelect == null || listSelect.isEmpty()) ? _UtilJvmKt.j(new Proxy[]{Proxy.NO_PROXY}) : _UtilJvmKt.i(listSelect);
        }
        this.e = listJ;
        this.f = 0;
        eventListener.q(realCall, httpUrl, listJ);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
