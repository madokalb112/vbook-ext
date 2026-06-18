package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qd2 extends kc4 implements kb4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        cm3 cm3Var;
        Object value6;
        cm3 cm3Var2;
        Object value7;
        cm3 cm3Var3;
        Object value8;
        cm3 cm3Var4;
        Object value9;
        Object value10;
        int i = this.a;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return (pd2) ((y48) this.receiver).a(obj);
            case 1:
                String str = (String) obj;
                str.getClass();
                em3 em3Var = (em3) this.receiver;
                em3Var.getClass();
                fr9 fr9Var = em3Var.s;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, cm3.a((cm3) value, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, str, null, null, null, null, false, false, false, false, false, false, null, null, null, 1073676287)));
                }
                return hebVar;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                em3 em3Var2 = (em3) this.receiver;
                em3Var2.getClass();
                fr9 fr9Var2 = em3Var2.s;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, cm3.a((cm3) value2, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, false, false, str2, null, null, 939524095)));
                }
                return hebVar;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                em3 em3Var3 = (em3) this.receiver;
                em3Var3.getClass();
                fr9 fr9Var3 = em3Var3.s;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, cm3.a((cm3) value3, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, false, false, null, str3, null, 805306367)));
                }
                return hebVar;
            case 4:
                byte[] bArr = (byte[]) obj;
                fr9 fr9Var4 = ((em3) this.receiver).s;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, cm3.a((cm3) value4, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, false, false, null, null, bArr, 536870911)));
                }
                return hebVar;
            case 5:
                rl3 rl3Var = (rl3) obj;
                rl3Var.getClass();
                em3 em3Var4 = (em3) this.receiver;
                em3Var4.getClass();
                fr9 fr9Var5 = em3Var4.s;
                if (fr9Var5 != null) {
                    do {
                        value5 = fr9Var5.getValue();
                        cm3Var = (cm3) value5;
                    } while (!fr9Var5.j(value5, cm3.a(cm3Var, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, rl3Var, null, null, null, (cm3Var.e() && rw1.e0(rl3Var)) ? cm3Var.v : false, (cm3Var.e() && rw1.g0(rl3Var)) ? cm3Var.w : false, (cm3Var.e() && rw1.d0(rl3Var)) ? cm3Var.x : false, rw1.f0(rl3Var) ? cm3Var.y : true, false, false, null, null, null, 1042153471)));
                }
                return hebVar;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fr9 fr9Var6 = ((em3) this.receiver).s;
                if (fr9Var6 != null) {
                    do {
                        value6 = fr9Var6.getValue();
                        cm3Var2 = (cm3) value6;
                    } while (!fr9Var6.j(value6, cm3.a(cm3Var2, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, cm3Var2.b() ? zBooleanValue : false, false, false, false, false, false, null, null, null, 1071644671)));
                }
                return hebVar;
            case 7:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                fr9 fr9Var7 = ((em3) this.receiver).s;
                if (fr9Var7 != null) {
                    do {
                        value7 = fr9Var7.getValue();
                        cm3Var3 = (cm3) value7;
                    } while (!fr9Var7.j(value7, cm3.a(cm3Var3, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, cm3Var3.c() ? zBooleanValue2 : false, false, false, false, false, null, null, null, 1069547519)));
                }
                return hebVar;
            case 8:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                fr9 fr9Var8 = ((em3) this.receiver).s;
                if (fr9Var8 != null) {
                    do {
                        value8 = fr9Var8.getValue();
                        cm3Var4 = (cm3) value8;
                    } while (!fr9Var8.j(value8, cm3.a(cm3Var4, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, cm3Var4.d() ? zBooleanValue3 : false, false, false, false, null, null, null, 1065353215)));
                }
                return hebVar;
            case 9:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                fr9 fr9Var9 = ((em3) this.receiver).s;
                if (fr9Var9 != null) {
                    do {
                        value9 = fr9Var9.getValue();
                    } while (!fr9Var9.j(value9, cm3.a((cm3) value9, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, zBooleanValue4, false, false, null, null, null, 1056964607)));
                }
                return hebVar;
            case 10:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                fr9 fr9Var10 = ((em3) this.receiver).s;
                if (fr9Var10 != null) {
                    do {
                        value10 = fr9Var10.getValue();
                    } while (!fr9Var10.j(value10, cm3.a((cm3) value10, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, zBooleanValue5, false, null, null, null, 1040187391)));
                }
                return hebVar;
            case 11:
                String str4 = (String) obj;
                str4.getClass();
                yn3 yn3Var = (yn3) this.receiver;
                yn3Var.getClass();
                za1 za1VarA = vtb.a(yn3Var);
                aj2 aj2Var = rw2.a;
                yn3Var.g(za1VarA, nh2.c, new et1(yn3Var, str4, jt1Var, 24));
                return hebVar;
            case 12:
                int iIntValue = ((Number) obj).intValue();
                yn3 yn3Var2 = (yn3) this.receiver;
                yn3Var2.getClass();
                yn3Var2.j("thread_num", String.valueOf(iIntValue));
                return hebVar;
            case 13:
                int iIntValue2 = ((Number) obj).intValue();
                yn3 yn3Var3 = (yn3) this.receiver;
                yn3Var3.getClass();
                yn3Var3.j("delay", String.valueOf(iIntValue2));
                return hebVar;
            case 14:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                yn3 yn3Var4 = (yn3) this.receiver;
                yn3Var4.getClass();
                yn3Var4.j("ignore", String.valueOf(zBooleanValue6));
                return hebVar;
            case 15:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                cm4 cm4Var = (cm4) this.receiver;
                cm4Var.getClass();
                za1 za1VarA2 = vtb.a(cm4Var);
                aj2 aj2Var2 = rw2.a;
                cm4Var.g(za1VarA2, nh2.c, new bm4(cm4Var, zBooleanValue7, jt1Var, i4));
                return hebVar;
            case 16:
                ((Set) obj).getClass();
                bd5 bd5Var = (bd5) this.receiver;
                ReentrantLock reentrantLock = bd5Var.d;
                reentrantLock.lock();
                try {
                    List listZ0 = fc1.Z0(bd5Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = listZ0.iterator();
                    if (!it.hasNext()) {
                        return hebVar;
                    }
                    ((za7) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 17:
                ((ee5) this.receiver).r((Throwable) obj);
                return hebVar;
            case 18:
                String str5 = (String) obj;
                str5.getClass();
                hm5 hm5Var = (hm5) this.receiver;
                hm5Var.getClass();
                za1 za1VarA3 = vtb.a(hm5Var);
                aj2 aj2Var3 = rw2.a;
                hm5Var.g(za1VarA3, nh2.c, new mt4((qtb) hm5Var, str5, jt1Var, i2));
                return hebVar;
            case 19:
                return i57.b((i57) this.receiver, (jt1) obj);
            case 20:
                bw4 bw4Var = (bw4) obj;
                zb7 zb7Var = ((dc7) this.receiver).e;
                zb7Var.getClass();
                OkHttpClient.Builder builderB = ((OkHttpClient) dc7.v.getValue()).b();
                builderB.a = new Dispatcher();
                zb7Var.a.invoke(builderB);
                if (bw4Var != null) {
                    Long l = bw4Var.b;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        k46 k46Var = dw4.a;
                        if (jLongValue == Long.MAX_VALUE) {
                            jLongValue = 0;
                        }
                        timeUnit.getClass();
                        builderB.w = _UtilJvmKt.b(jLongValue);
                    }
                    Long l2 = bw4Var.c;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        k46 k46Var2 = dw4.a;
                        long j = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                        timeUnit.getClass();
                        builderB.x = _UtilJvmKt.b(j);
                        builderB.y = _UtilJvmKt.b(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L);
                    }
                }
                return new OkHttpClient(builderB);
            case 21:
                return ((y48) this.receiver).a.get(obj);
            case 22:
                return Boolean.valueOf(((g08) this.receiver).test(obj));
            case 23:
                ((n7b) this.receiver).getClass();
                return Boolean.TRUE;
            case 24:
                int iIntValue3 = ((Number) obj).intValue();
                u98 u98Var = (u98) this.receiver;
                u98Var.getClass();
                za1 za1VarA4 = vtb.a(u98Var);
                aj2 aj2Var4 = rw2.a;
                u98Var.g(za1VarA4, nh2.c, new q98(u98Var, iIntValue3, jt1Var, 2));
                return hebVar;
            case 25:
                int iIntValue4 = ((Number) obj).intValue();
                u98 u98Var2 = (u98) this.receiver;
                u98Var2.getClass();
                za1 za1VarA5 = vtb.a(u98Var2);
                aj2 aj2Var5 = rw2.a;
                u98Var2.g(za1VarA5, nh2.c, new q98(u98Var2, iIntValue4, jt1Var, 3));
                return hebVar;
            case 26:
                int iIntValue5 = ((Number) obj).intValue();
                u98 u98Var3 = (u98) this.receiver;
                u98Var3.getClass();
                za1 za1VarA6 = vtb.a(u98Var3);
                aj2 aj2Var6 = rw2.a;
                u98Var3.g(za1VarA6, nh2.c, new q98(u98Var3, iIntValue5, jt1Var, i2));
                return hebVar;
            case 27:
                int iIntValue6 = ((Number) obj).intValue();
                u98 u98Var4 = (u98) this.receiver;
                u98Var4.getClass();
                za1 za1VarA7 = vtb.a(u98Var4);
                aj2 aj2Var7 = rw2.a;
                u98Var4.g(za1VarA7, nh2.c, new q98(u98Var4, iIntValue6, jt1Var, i3));
                return hebVar;
            case 28:
                int iIntValue7 = ((Number) obj).intValue();
                u98 u98Var5 = (u98) this.receiver;
                u98Var5.getClass();
                za1 za1VarA8 = vtb.a(u98Var5);
                aj2 aj2Var8 = rw2.a;
                u98Var5.g(za1VarA8, nh2.c, new q98(u98Var5, iIntValue7, jt1Var, i4));
                return hebVar;
            default:
                int iIntValue8 = ((Number) obj).intValue();
                u98 u98Var6 = (u98) this.receiver;
                u98Var6.getClass();
                za1 za1VarA9 = vtb.a(u98Var6);
                aj2 aj2Var9 = rw2.a;
                u98Var6.g(za1VarA9, nh2.c, new q98(u98Var6, iIntValue8, jt1Var, 5));
                return hebVar;
        }
    }
}
