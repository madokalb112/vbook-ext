package defpackage;

import android.net.NetworkRequest;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wfb implements vfb {
    public final am0 a;
    public final qt b;
    public final fr9 c;

    public wfb(am0 am0Var, qt qtVar) {
        this.a = am0Var;
        this.b = qtVar;
        this.c = am0Var.b;
    }

    public final heb a() throws Exception {
        int i;
        Object obj;
        long j;
        qt qtVar = this.b;
        boolean zBooleanValue = ((Boolean) qtVar.A.c(qt.T[25], qtVar)).booleanValue();
        heb hebVar = heb.a;
        if (zBooleanValue) {
            int iD = qtVar.d();
            mua.Companion.getClass();
            mua muaVarA = lua.a();
            ZoneId zoneId = muaVarA.a;
            p95 p95VarK = r95.a.k();
            w16 w16VarA = yib.F(p95VarK, muaVarA).a();
            List listZ = gc1.Z(6, 12, 18, 23);
            ArrayList arrayList = new ArrayList(gc1.M(listZ, 10));
            Iterator it = listZ.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Instant instant = new h26(w16VarA, new z26(((Number) it.next()).intValue(), 0, 0, 0)).a.atZone(zoneId).toInstant();
                instant.getClass();
                arrayList.add(e11.g0(instant));
            }
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                p95 p95Var = (p95) obj;
                p95Var.getClass();
                int iW = lc5.W(p95Var.a, p95VarK.a);
                if (iW == 0) {
                    iW = lc5.V(p95Var.b, p95VarK.b);
                }
                if (iW > 0) {
                    break;
                }
            }
            p95 p95VarG0 = (p95) obj;
            if (p95VarG0 == null) {
                p95 p95Var2 = (p95) fc1.x0(arrayList);
                s72.Companion.getClass();
                n72 n72Var = s72.a;
                p95Var2.getClass();
                n72Var.getClass();
                try {
                    try {
                        Instant instantOfEpochSecond = Instant.ofEpochSecond(p95Var2.a, p95Var2.b);
                        instantOfEpochSecond.getClass();
                        ZonedDateTime zonedDateTimeAtZone = instantOfEpochSecond.atZone(zoneId);
                        zonedDateTimeAtZone.getClass();
                        Instant instant2 = zonedDateTimeAtZone.plusDays(Math.multiplyExact(1L, n72Var.d)).toInstant();
                        instant2.getClass();
                        p95VarG0 = e11.g0(instant2);
                    } catch (DateTimeException e) {
                        throw new fi1(e);
                    }
                } catch (Exception e2) {
                    if (!(e2 instanceof DateTimeException) && !(e2 instanceof ArithmeticException)) {
                        throw e2;
                    }
                    throw new fi1("Instant " + p95Var2 + " cannot be represented as local date when adding 1 " + n72Var + " to it", e2);
                }
            }
            long jE = k63.e(p95VarG0.a(p95VarK));
            if (iD == 0) {
                j = 21600000;
            } else if (iD != 1) {
                j = 86400000;
                if (iD != 2) {
                    if (iD == 3) {
                        j = 129600000;
                    } else if (iD == 4) {
                        j = 604800000;
                    }
                }
            } else {
                j = 43200000;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeUnit.getClass();
            br7 br7Var = new br7(AndroidBookUpdateWorker.class);
            d2c d2cVar = (d2c) ((q) br7Var).b;
            d2cVar.getClass();
            String str = d2c.z;
            if (j < 900000) {
                cp4.k().p(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            long j2 = j >= 900000 ? j : 900000L;
            long j3 = j < 900000 ? 900000L : j;
            if (j2 < 900000) {
                cp4.k().p(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            d2cVar.h = j2 < 900000 ? 900000L : j2;
            if (j3 < 300000) {
                cp4.k().p(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
            }
            if (j3 > d2cVar.h) {
                cp4.k().p(str, "Flex duration greater than interval duration; Changed to " + j2);
            }
            d2cVar.i = wx1.R(j3, 300000L, d2cVar.h);
            br7 br7VarF = br7Var.f(jE, timeUnit);
            ((d2c) ((q) br7VarF).b).j = new tp1(new p57((NetworkRequest) null), w57.b, false, false, true, false, -1L, -1L, fc1.e1(new LinkedHashSet()));
            new g1c(r1c.b(this.a.a), "book_update_work", bj3.b, Collections.singletonList(br7VarF.a()), 0).a();
        }
        return hebVar;
    }
}
