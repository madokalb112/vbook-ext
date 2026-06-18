package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class t96 {
    public static final rj1 i;
    public static final rj1 m;
    public static final uh t;
    public static final uh u;
    public static final Object v;
    public static final String[] w;
    public static final String[] x;
    public static final String[] y;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final double[][] d = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] e = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final rj1 f = new rj1(new k7(21), false, 1682128026);
    public static final rj1 g = new rj1(new k7(22), false, 1599628075);
    public static final rj1 h = new rj1(new uj1(29), false, 1673418665);
    public static final rj1 j = new rj1(new ck1(26), false, -711113688);
    public static final rj1 k = new rj1(new ck1(27), false, -193871445);
    public static final rj1 l = new rj1(new jk1(5), false, -1515151547);
    public static final rj1 n = new rj1(new lk1(10), false, 1272717951);
    public static final rj1 o = new rj1(new lk1(11), false, 1461791208);
    public static final rj1 p = new rj1(new nk1(14), false, -767427801);
    public static final gv q = new gv(2);
    public static final q45 r = new q45(false);
    public static final uh s = new uh(1000);

    static {
        int i2 = 9;
        i = new rj1(new vj1(i2), false, -146633272);
        m = new rj1(new lk1(i2), false, 265761641);
        new uh(1007);
        t = new uh(1008);
        u = new uh(1002);
        v = new Object();
        w = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        x = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        y = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    public static int A(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static long B(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    vp1.l(i7);
                    if2.c();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return vp1.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long C(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int iMin = Math.min(i2, 262142);
        int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    vp1.l(i7);
                    if2.c();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return vp1.a(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final Intent D(t4 t4Var, o5b o5bVar, int i2, kb4 kb4Var) {
        int i3 = o5bVar.b;
        if (t4Var instanceof rq9) {
            rq9 rq9Var = (rq9) t4Var;
            Intent intentF = F(rq9Var, o5bVar, (py6) kb4Var.invoke(rq9Var.a));
            if (intentF.getData() == null) {
                intentF.setData(gjb.a0(o5bVar, i2, 5, ""));
            }
            return intentF;
        }
        if (t4Var instanceof mq8) {
            int i4 = ActionCallbackBroadcastReceiver.a;
            mq8 mq8Var = (mq8) t4Var;
            return gjb.T(m79.z(o5bVar.a, mq8Var.a, i3, (py6) kb4Var.invoke(mq8Var.b)), o5bVar, i2);
        }
        if (!(t4Var instanceof tl5)) {
            mn5.n(t4Var, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = o5bVar.n;
        if (componentName != null) {
            return gjb.T(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i3), o5bVar, i2);
        }
        gp.l("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    public static final PendingIntent E(t4 t4Var, o5b o5bVar, int i2, kb4 kb4Var) {
        int i3 = o5bVar.b;
        Context context = o5bVar.a;
        if (t4Var instanceof rq9) {
            rq9 rq9Var = (rq9) t4Var;
            Intent intentF = F(rq9Var, o5bVar, (py6) kb4Var.invoke(rq9Var.a));
            if (intentF.getData() == null) {
                intentF.setData(gjb.a0(o5bVar, i2, 5, ""));
            }
            return PendingIntent.getActivity(context, 0, intentF, 201326592, null);
        }
        if (t4Var instanceof mq8) {
            int i4 = ActionCallbackBroadcastReceiver.a;
            mq8 mq8Var = (mq8) t4Var;
            Intent intentZ = m79.z(context, mq8Var.a, i3, (py6) kb4Var.invoke(mq8Var.b));
            intentZ.setData(gjb.a0(o5bVar, i2, 5, ""));
            return PendingIntent.getBroadcast(context, 0, intentZ, 201326592);
        }
        if (!(t4Var instanceof tl5)) {
            mn5.n(t4Var, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = o5bVar.n;
        if (componentName == null) {
            gp.l("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i3);
        intentPutExtra.setData(gjb.a0(o5bVar, i2, 5, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent F(rq9 rq9Var, o5b o5bVar, py6 py6Var) {
        if (!(rq9Var instanceof rq9)) {
            mn5.n(rq9Var, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = new Intent(o5bVar.a, (Class<?>) vc8.class);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(py6Var.a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            y4 y4Var = (y4) entry.getKey();
            arrayList.add(new xl7(y4Var.a, entry.getValue()));
        }
        xl7[] xl7VarArr = (xl7[]) arrayList.toArray(new xl7[0]);
        intent.putExtras(jv3.u((xl7[]) Arrays.copyOf(xl7VarArr, xl7VarArr.length)));
        return intent;
    }

    public static int G(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return de1.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float H(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r71 I(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, qn7 {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.I(java.lang.String):r71");
    }

    public static hh8 J(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        v45 v45VarI = a55.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (hn9.s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strO = hn9.o(xmlPullParser, strConcat3);
                String strO2 = hn9.o(xmlPullParser, strConcat4);
                String strO3 = hn9.o(xmlPullParser, strConcat5);
                String strO4 = hn9.o(xmlPullParser, strConcat6);
                if (strO == null || strO2 == null) {
                    return hh8.e;
                }
                v45VarI.b(new nv6(strO3 != null ? Long.parseLong(strO3) : 0L, strO4 != null ? Long.parseLong(strO4) : 0L, strO));
            }
        } while (!hn9.r(xmlPullParser, strConcat2));
        return v45VarI.g();
    }

    public static Task K(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        d02 d02Var = new d02(0, taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        gv gvVar = q;
        task.continueWithTask(gvVar, d02Var);
        task2.continueWithTask(gvVar, d02Var);
        return taskCompletionSource.getTask();
    }

    public static int L(double d2) {
        if (Double.isNaN(d2)) {
            gp.l("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int M(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        gp.l("Cannot round NaN value.");
        return 0;
    }

    public static long N(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        gp.l("Cannot round NaN value.");
        return 0L;
    }

    public static final ou6 O(ou6 ou6Var, boolean z, yy6 yy6Var, n65 n65Var, boolean z2, uo8 uo8Var, ib4 ib4Var) {
        i09 i09VarE;
        if (n65Var != null) {
            i09VarE = new i09(z, yy6Var, n65Var, false, z2, uo8Var, ib4Var);
        } else if (n65Var == null) {
            i09VarE = new i09(z, yy6Var, (n65) null, false, z2, uo8Var, ib4Var);
        } else {
            lu6 lu6Var = lu6.a;
            i09VarE = yy6Var != null ? k65.a(lu6Var, yy6Var, n65Var).e(new i09(z, yy6Var, (n65) null, false, z2, uo8Var, ib4Var)) : s32.X(lu6Var, new k09(n65Var, z, z2, uo8Var, ib4Var));
        }
        return ou6Var.e(i09VarE);
    }

    public static ou6 P(ou6 ou6Var, boolean z, uo8 uo8Var, ib4 ib4Var) {
        return ou6Var.e(new i09(z, (yy6) null, (n65) null, true, true, uo8Var, ib4Var));
    }

    public static final ou6 Q(dd4 dd4Var, ou6 ou6Var) {
        ur9 ur9Var = s96.a;
        return gjb.m0(fe.L(w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f, 16.0f);
    }

    public static final void R(a91 a91Var, String str) {
        String string;
        a91Var.getClass();
        String str2 = "in the polymorphic scope of '" + a91Var.g() + '\'';
        if (str == null) {
            string = j39.i('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbQ = j39.q("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            j39.y(sbQ, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbQ.append(a91Var.g());
            sbQ.append("' has to be sealed and '@Serializable'.");
            string = sbQ.toString();
        }
        throw new u39(string);
    }

    public static final void a(p3b p3bVar, ou6 ou6Var, kb4 kb4Var, f9 f9Var, kb4 kb4Var2, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var3;
        dd4 dd4Var2;
        yf1 yf1Var;
        pn pnVar;
        hk9 hk9Var;
        pn pnVar2;
        l3b l3bVarX;
        boolean z;
        kb4 kb4Var4 = kb4Var;
        yf1 yf1Var2 = p3bVar.a;
        dd4Var.h0(511725103);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(p3bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(f9Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 16384 : 8192;
        }
        rj1 rj1Var2 = rj1Var;
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(rj1Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new pn(p3bVar, f9Var, zm5Var);
                dd4Var.p0(objQ);
            }
            pn pnVar3 = (pn) objQ;
            boolean z3 = i4 == 4;
            Object objQ2 = dd4Var.Q();
            Object obj2 = objQ2;
            if (z3 || objQ2 == obj) {
                Object[] objArr = {yf1Var2.t()};
                hk9 hk9Var2 = new hk9();
                hk9Var2.addAll(fw.O0(objArr));
                dd4Var.p0(hk9Var2);
                obj2 = hk9Var2;
            }
            hk9 hk9Var3 = (hk9) obj2;
            boolean z4 = i4 == 4;
            Object objQ3 = dd4Var.Q();
            if (z4 || objQ3 == obj) {
                long[] jArr = ju8.a;
                objQ3 = new tz6();
                dd4Var.p0(objQ3);
            }
            tz6 tz6Var = (tz6) objQ3;
            cn7 cn7Var = p3bVar.d;
            if (!hk9Var3.contains(yf1Var2.t())) {
                hk9Var3.clear();
                hk9Var3.add(yf1Var2.t());
            }
            if (lc5.Q(yf1Var2.t(), cn7Var.getValue())) {
                if (hk9Var3.size() != 1 || !lc5.Q(hk9Var3.get(0), yf1Var2.t())) {
                    hk9Var3.clear();
                    hk9Var3.add(yf1Var2.t());
                }
                if (tz6Var.e != 1 || tz6Var.c(yf1Var2.t())) {
                    tz6Var.a();
                }
                pnVar3.b = f9Var;
            }
            if (lc5.Q(yf1Var2.t(), cn7Var.getValue()) || hk9Var3.contains(cn7Var.getValue())) {
                yf1Var = yf1Var2;
            } else {
                ListIterator listIterator = hk9Var3.listIterator();
                int i5 = 0;
                while (true) {
                    em4 em4Var = (em4) listIterator;
                    yf1Var = yf1Var2;
                    if (!em4Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else {
                        if (lc5.Q(kb4Var2.invoke(em4Var.next()), kb4Var2.invoke(cn7Var.getValue()))) {
                            break;
                        }
                        i5++;
                        yf1Var2 = yf1Var;
                    }
                }
                if (i5 == -1) {
                    hk9Var3.add(cn7Var.getValue());
                } else {
                    hk9Var3.set(i5, cn7Var.getValue());
                }
            }
            if (tz6Var.c(cn7Var.getValue()) && tz6Var.c(yf1Var.t())) {
                dd4Var.f0(1968995539);
                dd4Var.q(false);
                kb4Var3 = kb4Var4;
                pnVar = pnVar3;
            } else {
                dd4Var.f0(1966410449);
                tz6Var.a();
                int size = hk9Var3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj3 = hk9Var3.get(i6);
                    pn pnVar4 = pnVar3;
                    tz6Var.n(obj3, jf0.G(-23915175, new en(p3bVar, obj3, kb4Var4, pnVar4, hk9Var3, rj1Var2), dd4Var));
                    pnVar3 = pnVar4;
                    i6++;
                    kb4Var4 = kb4Var4;
                    rj1Var2 = rj1Var;
                }
                kb4Var3 = kb4Var4;
                pnVar = pnVar3;
                dd4Var.q(false);
            }
            boolean zF = dd4Var.f(p3bVar.f()) | dd4Var.f(pnVar);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = (vr1) kb4Var3.invoke(pnVar);
                dd4Var.p0(objQ4);
            }
            vr1 vr1Var = (vr1) objQ4;
            p3b p3bVar2 = pnVar.a;
            boolean zF2 = dd4Var.f(pnVar);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ5);
            }
            a07 a07Var = (a07) objQ5;
            a07 a07VarA = dk9.A(vr1Var.d, dd4Var);
            if (lc5.Q(p3bVar2.a.t(), p3bVar2.d.getValue())) {
                a07Var.setValue(Boolean.FALSE);
            } else if (a07VarA.getValue() != null) {
                a07Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            ou6 ou6VarX = lu6.a;
            if (zBooleanValue) {
                dd4Var.f0(1353077497);
                pn pnVar5 = pnVar;
                hk9Var = hk9Var3;
                dd4Var2 = dd4Var;
                pnVar2 = pnVar5;
                l3bVarX = p7c.X(pnVar5.a, ah1.A0, null, dd4Var2, 0, 2);
                boolean zF3 = dd4Var2.f(l3bVarX);
                Object objQ6 = dd4Var2.Q();
                if (zF3 || objQ6 == obj) {
                    ch9 ch9Var = (ch9) a07VarA.getValue();
                    if (ch9Var == null || ch9Var.a) {
                        ou6VarX = x(ou6VarX);
                    }
                    dd4Var2.p0(ou6VarX);
                    objQ6 = ou6VarX;
                }
                ou6VarX = (ou6) objQ6;
                dd4Var2.q(false);
            } else {
                hk9Var = hk9Var3;
                dd4Var2 = dd4Var;
                pnVar2 = pnVar;
                dd4Var2.f0(1353343539);
                dd4Var2.q(false);
                l3bVarX = null;
                pnVar2.e = null;
            }
            ou6 ou6VarE = ou6Var.e(ou6VarX.e(new kn(l3bVarX, a07VarA, pnVar2)));
            Object objQ7 = dd4Var2.Q();
            if (objQ7 == obj) {
                objQ7 = new hn(pnVar2);
                dd4Var2.p0(objQ7);
            }
            hn hnVar = (hn) objQ7;
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, hnVar);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.l(dd4Var2, Integer.valueOf(iHashCode), ll1.g);
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            dd4Var2.f0(-860173498);
            int size2 = hk9Var.size();
            int i7 = 0;
            while (i7 < size2) {
                hk9 hk9Var4 = hk9Var;
                Object obj4 = hk9Var4.get(i7);
                dd4Var2.c0(-2026002954, kb4Var2.invoke(obj4));
                yb4 yb4Var = (yb4) tz6Var.g(obj4);
                if (yb4Var == null) {
                    dd4Var2.f0(1618454323);
                    z = false;
                } else {
                    z = false;
                    dd4Var2.f0(-2026001778);
                    yb4Var.invoke(dd4Var2, 0);
                }
                dd4Var2.q(z);
                dd4Var2.q(z);
                i7++;
                hk9Var = hk9Var4;
            }
            dd4Var2.q(false);
            dd4Var2.q(true);
        } else {
            kb4Var3 = kb4Var4;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fn(p3bVar, ou6Var, kb4Var3, f9Var, kb4Var2, rj1Var, i2);
        }
    }

    public static final void b(Boolean bool, ou6 ou6Var, kb4 kb4Var, f9 f9Var, String str, kb4 kb4Var2, rj1 rj1Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        ou6 ou6Var2;
        f9 f9Var2;
        String str2;
        kb4 kb4Var3;
        dd4Var.h0(1501828832);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? dd4Var.f(bool) : dd4Var.h(bool) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        int i6 = i4 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i6 = i4 | 27648;
        } else if ((i2 & 24576) == 0) {
            i6 |= dd4Var.f(str) ? 16384 : 8192;
        }
        int i8 = i6 | 196608;
        if ((1572864 & i2) == 0) {
            i8 |= dd4Var.h(rj1Var) ? 1048576 : 524288;
        }
        if (dd4Var.V(i8 & 1, (599187 & i8) != 599186)) {
            if (i5 != 0) {
                ou6Var = lu6.a;
            }
            ou6 ou6Var3 = ou6Var;
            f9 f9Var3 = bv4.b;
            String str3 = i7 != 0 ? "AnimatedContent" : str;
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = kd.A;
                dd4Var.p0(objQ);
            }
            kb4 kb4Var4 = (kb4) objQ;
            p3b p3bVarH0 = p7c.h0(bool, str3, dd4Var, (i8 & 14) | ((i8 >> 9) & Token.ASSIGN_MOD), 0);
            int i9 = i8 & 8176;
            int i10 = i8 >> 3;
            a(p3bVarH0, ou6Var3, kb4Var, f9Var3, kb4Var4, rj1Var, dd4Var, (i10 & 458752) | i9 | (57344 & i10));
            str2 = str3;
            ou6Var2 = ou6Var3;
            kb4Var3 = kb4Var4;
            f9Var2 = f9Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            f9Var2 = f9Var;
            str2 = str;
            kb4Var3 = kb4Var2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bn(bool, ou6Var2, kb4Var, f9Var2, str2, kb4Var3, rj1Var, i2, i3);
        }
    }

    public static final void c(final boolean z, final boolean z2, final float f2, final ou6 ou6Var, final kb4 kb4Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, dd4 dd4Var, final int i2) {
        dd4Var.h0(-1012829846);
        int i3 = i2 | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.c(f2) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var2) ? 1048576 : 524288) | (dd4Var.h(ib4Var3) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            int i4 = 3;
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new e4(i4);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new e4(i4);
                dd4Var.p0(objQ2);
            }
            kf0.d(z, ou6Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-1392577646, new j50(z2, ib4Var2, ib4Var, f2, ib4Var3, kb4Var), dd4Var), dd4Var, (i3 & 14) | 200064 | ((i3 >> 6) & Token.ASSIGN_MOD), 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, f2, ou6Var, kb4Var, ib4Var, ib4Var2, ib4Var3, i2) { // from class: k50
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ ou6 d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ ib4 f;
                public final /* synthetic */ ib4 s;
                public final /* synthetic */ ib4 t;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(1);
                    t96.c(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final BlurMaskFilter d(float f2) {
        return new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL);
    }

    public static kl9 e(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        wq0 wq0Var = new wq0();
        wq0Var.b0(length, bArr);
        return new kl9(wq0Var);
    }

    public static final void f(mf4 mf4Var, int i2, int i3, rj1 rj1Var, dd4 dd4Var, int i4, int i5) {
        int i6;
        int i7;
        dd4Var.h0(-1883910253);
        int i8 = (dd4Var.f(mf4Var) ? 4 : 2) | i4 | (dd4Var.d(i2) ? 32 : 16);
        int i9 = i5 & 4;
        if (i9 != 0) {
            i6 = i8 | 384;
        } else {
            i6 = i8 | (dd4Var.d(i3) ? 256 : Token.CASE);
        }
        if ((i6 & 1171) == 1170 && dd4Var.F()) {
            dd4Var.Y();
            i7 = i3;
        } else {
            int i10 = i9 != 0 ? 0 : i3;
            ee1 ee1Var = ee1.a;
            dd4Var.g0(578571862);
            dd4Var.g0(-548224868);
            if (!(dd4Var.a instanceof su)) {
                fe.Y();
                throw null;
            }
            dd4Var.d0();
            if (dd4Var.S) {
                dd4Var.k(ee1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jm.A, dd4Var, mf4Var);
            un9.s(jm.B, dd4Var, new c9(i10));
            un9.s(jm.C, dd4Var, new d9(i2));
            rj1Var.c(je1.a, dd4Var, 54);
            dd4Var.q(true);
            dd4Var.q(false);
            dd4Var.q(false);
            i7 = i10;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fe1(mf4Var, i2, i7, rj1Var, i4, i5, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    public static final void g(String str, String str2, fv3 fv3Var, boolean z, boolean z2, t13 t13Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        ib4 ib4Var3;
        fu6 fu6Var;
        zn7 zn7VarB;
        jv jvVar;
        vw3 vw3Var;
        g5 g5Var;
        boolean z3;
        lu6 lu6Var;
        zn0 zn0Var;
        jv jvVar2;
        boolean z4;
        Object obj;
        boolean z5;
        Object pm8Var;
        Object tw3Var;
        Throwable th;
        Long lValueOf;
        long jLongValue;
        boolean z6;
        int i3;
        long j2;
        long jC;
        boolean z7;
        long j3;
        long jC2;
        ?? r13;
        boolean z8;
        Object obj2;
        boolean z9;
        long j4;
        long jC3;
        ib4 ib4Var4 = ib4Var2;
        dd4 dd4Var2 = dd4Var;
        fu6 fu6Var2 = vl1.a;
        vf0 vf0Var = bv4.z;
        jv jvVar3 = pv.c;
        dd4Var2.h0(1942326251);
        int i4 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.h(fv3Var) ? 256 : Token.CASE) | (dd4Var2.g(z) ? 2048 : 1024) | (dd4Var2.g(z2) ? 16384 : 8192) | (dd4Var2.d(t13Var.ordinal()) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.f(ou6Var) ? 1048576 : 524288) | (dd4Var2.h(ib4Var) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var4) ? 67108864 : 33554432);
        if (dd4Var2.V(i4 & 1, (i4 & 38347923) != 38347922)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var2 = lu6.a;
            bp5 bp5Var = new bp5(1.0f, true);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            zn0 zn0Var2 = zn0.a;
            int i5 = 12;
            if (t13Var == t13.b) {
                dd4Var2.f0(132359238);
                ou6 ou6VarF = tg9.f(lu6Var2, 1.0f);
                ie1 ie1VarA = ge1.a(jvVar3, vf0Var, dd4Var2, 0);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar, dd4Var2, ie1VarA);
                un9.s(jmVar2, dd4Var2, lr7VarL3);
                ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL03);
                int i6 = (i4 >> 3) & 14;
                c64 c64VarR0 = qu1.r0(str2, dd4Var2, i6);
                long jX = wn9.x(24);
                if (z) {
                    dd4Var2.f0(1177170519);
                    j4 = ((q96) dd4Var2.j(s96.a)).a.a;
                    z9 = false;
                } else {
                    z9 = false;
                    dd4Var2.f0(1177171769);
                    j4 = ((q96) dd4Var2.j(s96.a)).a.q;
                }
                dd4Var2.q(z9);
                nha.c(str, (ou6) null, j4, (g60) null, jX, (t74) null, (a84) null, c64VarR0, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, (i4 & 14) | 24576, 0, 261994);
                String strK = wn9.K((pv9) mu9.p0.getValue(), dd4Var2);
                c64 c64VarR02 = qu1.r0(str2, dd4Var2, i6);
                long jX2 = wn9.x(12);
                if (z) {
                    dd4Var2.f0(2132888134);
                    jC3 = lc1.c(0.5f, ((q96) dd4Var2.j(s96.a)).a.a);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(2133003237);
                    jC3 = lc1.c(0.5f, ((q96) dd4Var2.j(s96.a)).a.q);
                    dd4Var2.q(false);
                }
                nha.c(strK, (ou6) null, jC3, (g60) null, jX2, (t74) null, (a84) null, c64VarR02, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 24576, 0, 261994);
                z7 = true;
                dd4Var2.q(true);
                dd4Var2.q(false);
                dd4Var2 = dd4Var2;
                lu6Var = lu6Var2;
                zn0Var = zn0Var2;
                fu6Var = fu6Var2;
                i3 = 2;
                r13 = 0;
            } else {
                dd4Var2.f0(133422042);
                int i7 = i4 & Token.ASSIGN_MOD;
                boolean z10 = i7 == 32;
                Object objQ = dd4Var2.Q();
                fu6Var = fu6Var2;
                Object obj3 = objQ;
                if (z10 || objQ == fu6Var) {
                    String strP = wm9.p();
                    dd4Var2.p0(strP);
                    obj3 = strP;
                }
                String str3 = (String) obj3;
                boolean z11 = i7 == 32;
                Object objQ2 = dd4Var2.Q();
                Object obj4 = objQ2;
                if (z11 || objQ2 == fu6Var) {
                    sw3 sw3Var = new sw3(str2, str2, str3);
                    dd4Var2.p0(sw3Var);
                    obj4 = sw3Var;
                }
                sw3 sw3Var2 = (sw3) obj4;
                boolean z12 = i7 == 32;
                Object objQ3 = dd4Var2.Q();
                if (z12 || objQ3 == fu6Var) {
                    fv3Var.getClass();
                    sw3Var2.getClass();
                    String str4 = sw3Var2.a;
                    if (iw9.K(str4, "http://", false) || iw9.K(str4, "https://", false)) {
                        zn7VarB = null;
                    } else {
                        String str5 = zn7.b;
                        zn7VarB = xn7.b(str4, false);
                    }
                    int i8 = 5;
                    if (zn7VarB != null) {
                        oh5 oh5Var = gx3.a;
                        if (oh5Var.e0(zn7VarB)) {
                            try {
                                ow3 ow3VarP0 = oh5Var.p0(zn7VarB);
                                mx3 mx3VarE = fv3.e(sw3Var2.a);
                                Long l2 = ow3VarP0.d;
                                if (l2 != null) {
                                    jLongValue = l2.longValue();
                                    jvVar = jvVar3;
                                } else {
                                    j85 j85VarK0 = tu1.k0(zn7VarB.toFile());
                                    xq0 xq0Var = new xq0();
                                    try {
                                        xq0Var.K0(j85VarK0);
                                        jvVar = jvVar3;
                                        try {
                                            lValueOf = Long.valueOf(xq0Var.e0(xq0Var.b).length);
                                            try {
                                                j85VarK0.close();
                                                xq0Var.p();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Throwable th4 = th;
                                            try {
                                                try {
                                                    j85VarK0.close();
                                                    xq0Var.p();
                                                } catch (Throwable th5) {
                                                    i12.r(th4, th5);
                                                }
                                                th = th4;
                                                lValueOf = null;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                pm8Var = new pm8(th);
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        jvVar = jvVar3;
                                    }
                                    if (th != null) {
                                        throw th;
                                    }
                                    jLongValue = lValueOf.longValue();
                                }
                                pm8Var = new vw3(zn7VarB, jLongValue, mx3VarE, mx3VarE != null ? mx3VarE.a : null);
                            } catch (Throwable th8) {
                                th = th8;
                                jvVar = jvVar3;
                            }
                            Throwable thA = qm8.a(pm8Var);
                            if (thA != null) {
                                pm8Var = new tw3(thA);
                            }
                            tw3Var = (ww3) pm8Var;
                        } else {
                            tw3Var = new tw3(new IllegalStateException("Local file not found: " + zn7VarB));
                            jvVar = jvVar3;
                        }
                        objQ3 = new pp1(tw3Var, i8);
                    } else {
                        jvVar = jvVar3;
                        String str6 = sw3Var2.b;
                        synchronized (fv3Var.f) {
                            vw3Var = (vw3) fv3Var.e.c(str6);
                        }
                        if (vw3Var != null) {
                            objQ3 = new pp1(vw3Var, i8);
                        } else {
                            ea9 ea9VarA = fa9.a(0, 6, null);
                            rg8 rg8Var = new rg8();
                            synchronized (fv3Var.f) {
                                try {
                                    g5 g5Var2 = (g5) fv3Var.c.get(str6);
                                    if (g5Var2 == null) {
                                        g5 g5Var3 = new g5();
                                        fv3Var.c.put(str6, g5Var3);
                                        g5Var = g5Var3;
                                        z3 = true;
                                    } else {
                                        g5Var = g5Var2;
                                        z3 = false;
                                    }
                                    rg8Var.a = g5Var;
                                    g5Var.a.put(sw3Var2.c, ea9VarA);
                                    fv3Var.d.put(sw3Var2.c, str6);
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            }
                            if (!z3 || (obj = rg8Var.a) == null) {
                                lu6Var = lu6Var2;
                                zn0Var = zn0Var2;
                                jvVar2 = jvVar;
                                z4 = false;
                            } else {
                                lu6Var = lu6Var2;
                                zn0Var = zn0Var2;
                                jvVar2 = jvVar;
                                z4 = false;
                                ah1.J(fv3Var.g, null, null, new vg(fv3Var, str6, sw3Var2, rg8Var, null, 13), 3);
                            }
                            objQ3 = ea9VarA;
                            z5 = z4;
                            dd4Var2.p0(objQ3);
                            z6 = z5;
                        }
                    }
                    lu6Var = lu6Var2;
                    zn0Var = zn0Var2;
                    jvVar2 = jvVar;
                    z5 = false;
                    dd4Var2.p0(objQ3);
                    z6 = z5;
                } else {
                    jvVar2 = jvVar3;
                    lu6Var = lu6Var2;
                    zn0Var = zn0Var2;
                    z6 = false;
                }
                a07 a07VarZ = bx1.z((b24) objQ3, uw3.a, dd4Var2);
                ww3 ww3Var = (ww3) a07VarZ.getValue();
                if (ww3Var instanceof vw3) {
                    dd4Var2.f0(133736010);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    ie1 ie1VarA2 = ge1.a(jvVar2, vf0Var, dd4Var2, z6 ? 1 : 0);
                    int iHashCode4 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL4 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarF2);
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ie1VarA2);
                    un9.s(ll1.e, dd4Var2, lr7VarL4);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL04);
                    ww3 ww3Var2 = (ww3) a07VarZ.getValue();
                    ww3Var2.getClass();
                    c64 c64VarR03 = qu1.r0(((vw3) ww3Var2).a.a.s(), dd4Var2, z6 ? 1 : 0);
                    long jX3 = wn9.x(24);
                    if (z) {
                        dd4Var2.f0(-142127370);
                        j3 = ((q96) dd4Var2.j(s96.a)).a.a;
                    } else {
                        dd4Var2.f0(-142126120);
                        j3 = ((q96) dd4Var2.j(s96.a)).a.q;
                    }
                    dd4Var2.q(z6);
                    nha.c(str, (ou6) null, j3, (g60) null, jX3, (t74) null, (a84) null, c64VarR03, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, (i4 & 14) | 24576, 0, 261994);
                    dd4Var2 = dd4Var2;
                    String strK2 = wn9.K((pv9) mu9.p0.getValue(), dd4Var2);
                    ww3 ww3Var3 = (ww3) a07VarZ.getValue();
                    ww3Var3.getClass();
                    c64 c64VarR04 = qu1.r0(((vw3) ww3Var3).a.a.s(), dd4Var2, z6 ? 1 : 0);
                    long jX4 = wn9.x(12);
                    if (z) {
                        dd4Var2.f0(-110550985);
                        jC2 = lc1.c(0.5f, ((q96) dd4Var2.j(s96.a)).a.a);
                        dd4Var2.q(z6);
                    } else {
                        dd4Var2.f0(-110419514);
                        jC2 = lc1.c(0.5f, ((q96) dd4Var2.j(s96.a)).a.q);
                        dd4Var2.q(z6);
                    }
                    nha.c(strK2, (ou6) null, jC2, (g60) null, jX4, (t74) null, (a84) null, c64VarR04, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 24576, 0, 261994);
                    dd4Var2.q(true);
                    dd4Var2.q(z6);
                    i3 = 2;
                } else {
                    dd4Var2 = dd4Var2;
                    if (ww3Var instanceof uw3) {
                        dd4Var2.f0(134995974);
                        ie1 ie1VarA3 = ge1.a(jvVar2, vf0Var, dd4Var2, z6 ? 1 : 0);
                        int iHashCode5 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL5 = dd4Var2.l();
                        ou6 ou6VarL05 = s32.L0(dd4Var2, lu6Var);
                        um1 um1Var3 = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var3);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(ll1.f, dd4Var2, ie1VarA3);
                        un9.s(ll1.e, dd4Var2, lr7VarL5);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode5));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL05);
                        i3 = 2;
                        ah1.r(tg9.h(gjb.p0(tg9.f(lu6Var, 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), 24.0f), null, dd4Var2, 6, 2);
                        ah1.r(tg9.h(gjb.p0(xv5.h(lu6Var, 8.0f, dd4Var2, lu6Var, 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), 20.0f), null, dd4Var2, 6, 2);
                        dd4Var2.q(true);
                        dd4Var2.q(z6);
                    } else {
                        i3 = 2;
                        if (!(ww3Var instanceof tw3)) {
                            throw j39.e(-826969964, dd4Var2, z6);
                        }
                        dd4Var2.f0(135775500);
                        ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                        ie1 ie1VarA4 = ge1.a(jvVar2, vf0Var, dd4Var2, z6 ? 1 : 0);
                        int iHashCode6 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL6 = dd4Var2.l();
                        ou6 ou6VarL06 = s32.L0(dd4Var2, ou6VarF3);
                        um1 um1Var4 = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var4);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(ll1.f, dd4Var2, ie1VarA4);
                        un9.s(ll1.e, dd4Var2, lr7VarL6);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode6));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL06);
                        long jX5 = wn9.x(24);
                        if (z) {
                            dd4Var2.f0(615765262);
                            j2 = ((q96) dd4Var2.j(s96.a)).a.a;
                        } else {
                            dd4Var2.f0(615766512);
                            j2 = ((q96) dd4Var2.j(s96.a)).a.q;
                        }
                        dd4Var2.q(z6);
                        nha.c(str, (ou6) null, j2, (g60) null, jX5, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, (i4 & 14) | 24576, 0, 262122);
                        String strK3 = wn9.K((pv9) mu9.p0.getValue(), dd4Var2);
                        long jX6 = wn9.x(14);
                        if (z) {
                            dd4Var2.f0(1909172031);
                            jC = lc1.c(0.5f, ((q96) dd4Var2.j(s96.a)).a.a);
                            dd4Var2.q(z6);
                        } else {
                            dd4Var2.f0(1909303502);
                            jC = lc1.c(0.5f, ((q96) dd4Var2.j(s96.a)).a.q);
                            dd4Var2.q(z6);
                        }
                        nha.c(strK3, (ou6) null, jC, (g60) null, jX6, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 24576, 0, 262122);
                        z7 = true;
                        dd4Var2.q(true);
                        dd4Var2.q(z6);
                        dd4Var2.q(z6);
                        r13 = z6;
                    }
                }
                z7 = true;
                dd4Var2.q(z6);
                r13 = z6;
            }
            ky0.A(dd4Var2, z7, lu6Var, 12.0f, dd4Var2);
            if (z) {
                dd4Var2.f0(790840304);
                mx4.a(i25.c((m53) a53.v.getValue(), dd4Var2, r13), (String) null, tg9.n(lu6Var, 24.0f), ((q96) dd4Var2.j(s96.a)).a.a, dd4Var2, 432, 0);
                dd4Var2.q((boolean) r13);
            } else {
                dd4Var2.f0(791076059);
                dd4Var2.q((boolean) r13);
            }
            if (z2) {
                ib4Var3 = ib4Var;
                ib4Var4 = ib4Var2;
                z8 = true;
                dd4Var2.f0(792789243);
                dd4Var2.q((boolean) r13);
            } else {
                dd4Var2.f0(791159387);
                ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
                ur9 ur9Var = s96.a;
                ou6 ou6VarL = fe.L(w(ou6VarN, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 3.0f), jf0.G);
                int i9 = ((i4 & 29360128) == 8388608 ? 1 : r13) | ((i4 & 458752) == 131072 ? 1 : r13) | ((i4 & 234881024) == 67108864 ? 1 : r13);
                Object objQ4 = dd4Var2.Q();
                if (i9 != 0 || objQ4 == fu6Var) {
                    ib4Var3 = ib4Var;
                    ib4Var4 = ib4Var2;
                    ma0 ma0Var = new ma0(i5, t13Var, ib4Var3, ib4Var4);
                    dd4Var2.p0(ma0Var);
                    obj2 = ma0Var;
                } else {
                    ib4Var3 = ib4Var;
                    ib4Var4 = ib4Var2;
                    obj2 = objQ4;
                }
                ou6 ou6VarJ = fw.J(null, (ib4) obj2, ou6VarL, r13, 15);
                xf0 xf0Var = bv4.f;
                ha6 ha6VarD2 = pn0.d(xf0Var, (boolean) r13);
                int iHashCode7 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL7 = dd4Var2.l();
                ou6 ou6VarL07 = s32.L0(dd4Var2, ou6VarJ);
                um1 um1Var5 = ll1.b;
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var5);
                } else {
                    dd4Var2.s0();
                }
                un9.s(ll1.f, dd4Var2, ha6VarD2);
                un9.s(ll1.e, dd4Var2, lr7VarL7);
                un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode7));
                un9.r(dd4Var2, ll1.h);
                un9.s(ll1.d, dd4Var2, ou6VarL07);
                int iOrdinal = t13Var.ordinal();
                if (iOrdinal == 0) {
                    dd4Var2.f0(2130755142);
                    mx4.a(i25.c((m53) a53.L.getValue(), dd4Var2, r13), (String) null, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.a, dd4Var2, 48, 4);
                    dd4Var2.q((boolean) r13);
                } else if (iOrdinal == 1) {
                    dd4Var2.f0(2131088330);
                    mx4.a(i25.c((m53) a53.H.getValue(), dd4Var2, r13), (String) null, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.w, dd4Var2, 48, 4);
                    dd4Var2.q((boolean) r13);
                } else {
                    if (iOrdinal != i3) {
                        throw j39.e(-762551870, dd4Var2, r13);
                    }
                    dd4Var2.f0(2131419162);
                    l16.a(2.0f, 48, 0, ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, tg9.n(zn0Var.a(lu6Var, xf0Var), 20.0f));
                    dd4Var2.q((boolean) r13);
                }
                z8 = true;
                dd4Var2.q(true);
                dd4Var2.q((boolean) r13);
            }
            dd4Var2.q(z8);
        } else {
            ib4Var3 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new j41(str, str2, fv3Var, z, z2, t13Var, ou6Var, ib4Var3, ib4Var4, i2);
        }
    }

    public static final void h(String str, List list, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var4;
        kb4 kb4Var5;
        list.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        dd4Var.h0(1081774570);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            kb4Var4 = kb4Var;
            i3 |= dd4Var.h(kb4Var4) ? 16384 : 8192;
        } else {
            kb4Var4 = kb4Var;
        }
        if ((196608 & i2) == 0) {
            kb4Var5 = kb4Var2;
            i3 |= dd4Var.h(kb4Var5) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var5 = kb4Var2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (599187 & i4) != 599186)) {
            ev8 ev8VarA = ek5.a(dd4Var);
            boolean zF = dd4Var.f((Object) null) | dd4Var.f(ev8VarA);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                objQ = ev8VarA.d(ug8.a(fv3.class), null);
                dd4Var.p0(objQ);
            }
            fv3 fv3Var = (fv3) objQ;
            szb szbVarW = yib.w(pj7Var, gjb.q(16.0f, 0.0f, 16.0f, 0.0f, 10));
            szb szbVarW2 = yib.w(pj7Var, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | dd4Var.h(fv3Var) | ((i4 & 14) == 4) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((3670016 & i4) == 1048576);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == fu6Var) {
                pm0 pm0Var = new pm0(list, fv3Var, str, kb4Var4, kb4Var5, kb4Var3, 7);
                dd4Var.p0(pm0Var);
                objQ2 = pm0Var;
            }
            gx1.h(ou6Var, null, szbVarW, mvVar, null, null, false, szbVarW2, 0L, 0L, 0.0f, (kb4) objQ2, dd4Var, ((i4 >> 9) & 14) | 24576, 0, 3818);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(str, list, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, i2, 1);
        }
    }

    public static final void i(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(-766922622);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            r64 r64Var = (r64) ((qtb) qx1.N(ug8.a(r64.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(r64Var.d, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            ms7 ms7Var = new ms7(gc1.Z("otf", "ttf"));
            boolean zF = dd4Var.f(r64Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new n64(r64Var, i4);
                dd4Var.p0(objQ);
            }
            aw3 aw3VarA0 = e11.a0(ms7Var, (kb4) objQ, dd4Var, 8);
            pp1 pp1Var = r64Var.e;
            boolean zF2 = dd4Var.f(m8Var);
            Object objQ2 = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF2 || objQ2 == obj) {
                objQ2 = new xa(m8Var, jt1Var, 15);
                dd4Var.p0(objQ2);
            }
            wx1.e(pp1Var, null, (zb4) objQ2, dd4Var, 0);
            gx1.p(wn9.K((pv9) ru9.E.getValue(), dd4Var), tg9.c, false, jf0.G(1546778246, new q41(t27Var, 28), dd4Var), null, jf0.G(-1210523912, new ak0(24, r64Var, aw3VarA0, a07VarB), dd4Var), dd4Var, 199728, 20);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 29, t27Var);
        }
    }

    public static final void j(String str, List list, List list2, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, dd4 dd4Var, int i2) {
        dd4Var.h0(-2023620535);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | (dd4Var.h(list2) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var3) ? 1048576 : 524288) | (dd4Var.h(kb4Var5) ? 67108864 : 33554432);
        if (dd4Var.V(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean zH = ((i3 & 14) == 4) | dd4Var.h(list) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | dd4Var.h(list2) | ((3670016 & i3) == 1048576) | ((i3 & 234881024) == 67108864);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                j71 j71Var = new j71(str, list, list2, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, 3);
                dd4Var.p0(j71Var);
                objQ = j71Var;
            }
            rw1.j(ou6Var, null, null, false, null, null, null, false, null, (kb4) objQ, dd4Var, 6, 510);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l85(str, list, list2, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(pj7 r30, defpackage.gm5 r31, ou6 r32, defpackage.kb4 r33, dd4 r34, int r35) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.k(pj7, gm5, ou6, kb4, dd4, int):void");
    }

    public static final void l(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(278819647);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            hm5 hm5Var = (hm5) ((qtb) qx1.N(ug8.a(hm5.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) iu9.g0.getValue(), dd4Var), null, false, jf0.G(2106212027, new n74(t27Var, 7), dd4Var), null, jf0.G(567159049, new qs1(3, hm5Var, bx1.B(hm5Var.d, dd4Var)), dd4Var), dd4Var2, 199680, 22);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 6, t27Var);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b1 A[PHI: r4
  0x03b1: PHI (r4v46 boolean) = 
  (r4v35 boolean)
  (r4v36 boolean)
  (r4v37 boolean)
  (r4v38 boolean)
  (r4v39 boolean)
  (r4v40 boolean)
  (r4v41 boolean)
  (r4v42 boolean)
  (r4v47 boolean)
 binds: [B:110:0x03af, B:106:0x038e, B:102:0x036d, B:98:0x034c, B:94:0x032d, B:90:0x030e, B:86:0x02ef, B:82:0x02d0, B:75:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e A[PHI: r12
  0x022e: PHI (r12v15 ??) = (r12v3 ??), (r12v4 ??), (r12v5 ??), (r12v6 ??), (r12v7 ??), (r12v8 ??), (r12v9 ??), (r12v10 ??), (r12v16 ??) binds: [B:70:0x022c, B:66:0x020e, B:62:0x01f0, B:58:0x01d2, B:54:0x01b2, B:50:0x0192, B:46:0x0172, B:42:0x0152, B:36:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.js1 r32, ou6 r33, defpackage.ib4 r34, dd4 r35, int r36) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.m(js1, ou6, ib4, dd4, int):void");
    }

    public static final void n(boolean z, final t27 t27Var, String str, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var4;
        kb4 kb4Var5;
        final kb4 kb4Var6;
        String str2;
        br9 br9Var;
        final br9 br9Var2;
        t27Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        dd4Var.h0(316394022);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            kb4Var4 = kb4Var2;
            i4 |= dd4Var.h(kb4Var4) ? 16384 : 8192;
        } else {
            kb4Var4 = kb4Var2;
        }
        if ((i2 & 196608) == 0) {
            kb4Var5 = kb4Var3;
            i4 |= dd4Var.h(kb4Var5) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var5 = kb4Var3;
        }
        final int i5 = 0;
        if (dd4Var.V(i4 & 1, (74899 & i4) != 74898)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ);
            }
            br9 br9Var3 = (a07) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.x("");
                dd4Var.p0(objQ2);
            }
            br9 br9Var4 = (a07) objQ2;
            if (xzb.a(dd4Var)) {
                dd4Var.f0(-1758223998);
                Object objQ3 = dd4Var.Q();
                if (objQ3 == obj) {
                    objQ3 = new rl0(br9Var4, br9Var3, 17);
                    dd4Var.p0(objQ3);
                }
                int i6 = i4 >> 3;
                br9Var = br9Var4;
                br9Var2 = br9Var3;
                q(z, kb4Var, kb4Var4, kb4Var5, (kb4) objQ3, dd4Var, (i4 & 14) | 196608 | (i6 & Token.ASSIGN_MOD) | (i6 & 896) | (i6 & 7168) | (i6 & 57344));
                dd4Var.q(false);
                kb4Var6 = kb4Var;
            } else {
                br9Var = br9Var4;
                br9Var2 = br9Var3;
                dd4Var.f0(-1757874845);
                Object objQ4 = dd4Var.Q();
                if (objQ4 == obj) {
                    objQ4 = new rl0(br9Var, br9Var2, 18);
                    dd4Var.p0(objQ4);
                }
                int i7 = i4 >> 3;
                p(z, kb4Var, kb4Var2, kb4Var3, (kb4) objQ4, dd4Var, (i4 & 14) | 196608 | (i7 & Token.ASSIGN_MOD) | (i7 & 896) | (i7 & 7168) | (i7 & 57344));
                kb4Var6 = kb4Var;
                dd4Var.q(false);
            }
            boolean zBooleanValue = ((Boolean) br9Var2.getValue()).booleanValue();
            String str3 = (String) br9Var.getValue();
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = new cl6(br9Var2, 1);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var7 = (kb4) objQ5;
            int i8 = i4 & 7168;
            boolean z2 = i8 == 2048;
            int i9 = i4 & Token.ASSIGN_MOD;
            boolean z3 = z2 | (i9 == 32);
            Object objQ6 = dd4Var.Q();
            if (z3 || objQ6 == obj) {
                objQ6 = new mt(24, kb4Var6, t27Var, br9Var2);
                dd4Var.p0(objQ6);
            }
            yb4 yb4Var = (yb4) objQ6;
            boolean z4 = (i8 == 2048) | (i9 == 32);
            Object objQ7 = dd4Var.Q();
            if (z4 || objQ7 == obj) {
                objQ7 = new kb4() { // from class: el6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i10 = i5;
                        heb hebVar = heb.a;
                        a07 a07Var = br9Var2;
                        t27 t27Var2 = t27Var;
                        kb4 kb4Var8 = kb4Var6;
                        String str4 = (String) obj2;
                        switch (i10) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                a07Var.setValue(bool);
                                kb4Var8.invoke(bool);
                                qx1.I(t27Var2, str4);
                                break;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                a07Var.setValue(bool2);
                                kb4Var8.invoke(bool2);
                                y86.T(t27Var2, str4);
                                break;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                a07Var.setValue(bool3);
                                kb4Var8.invoke(bool3);
                                sw1.b0(t27Var2, str4);
                                break;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                a07Var.setValue(bool4);
                                kb4Var8.invoke(bool4);
                                qx1.H(t27Var2, str4);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var8 = (kb4) objQ7;
            boolean z5 = (i8 == 2048) | (i9 == 32);
            Object objQ8 = dd4Var.Q();
            if (z5 || objQ8 == obj) {
                final int i10 = 1;
                objQ8 = new kb4() { // from class: el6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i102 = i10;
                        heb hebVar = heb.a;
                        a07 a07Var = br9Var2;
                        t27 t27Var2 = t27Var;
                        kb4 kb4Var82 = kb4Var6;
                        String str4 = (String) obj2;
                        switch (i102) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                a07Var.setValue(bool);
                                kb4Var82.invoke(bool);
                                qx1.I(t27Var2, str4);
                                break;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                a07Var.setValue(bool2);
                                kb4Var82.invoke(bool2);
                                y86.T(t27Var2, str4);
                                break;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                a07Var.setValue(bool3);
                                kb4Var82.invoke(bool3);
                                sw1.b0(t27Var2, str4);
                                break;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                a07Var.setValue(bool4);
                                kb4Var82.invoke(bool4);
                                qx1.H(t27Var2, str4);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ8);
            }
            kb4 kb4Var9 = (kb4) objQ8;
            boolean z6 = (i8 == 2048) | (i9 == 32);
            Object objQ9 = dd4Var.Q();
            if (z6 || objQ9 == obj) {
                final int i11 = 2;
                objQ9 = new kb4() { // from class: el6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i102 = i11;
                        heb hebVar = heb.a;
                        a07 a07Var = br9Var2;
                        t27 t27Var2 = t27Var;
                        kb4 kb4Var82 = kb4Var6;
                        String str4 = (String) obj2;
                        switch (i102) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                a07Var.setValue(bool);
                                kb4Var82.invoke(bool);
                                qx1.I(t27Var2, str4);
                                break;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                a07Var.setValue(bool2);
                                kb4Var82.invoke(bool2);
                                y86.T(t27Var2, str4);
                                break;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                a07Var.setValue(bool3);
                                kb4Var82.invoke(bool3);
                                sw1.b0(t27Var2, str4);
                                break;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                a07Var.setValue(bool4);
                                kb4Var82.invoke(bool4);
                                qx1.H(t27Var2, str4);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ9);
            }
            kb4 kb4Var10 = (kb4) objQ9;
            boolean z7 = (i8 == 2048) | (i9 == 32);
            Object objQ10 = dd4Var.Q();
            if (z7 || objQ10 == obj) {
                final int i12 = 3;
                objQ10 = new kb4() { // from class: el6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i102 = i12;
                        heb hebVar = heb.a;
                        a07 a07Var = br9Var2;
                        t27 t27Var2 = t27Var;
                        kb4 kb4Var82 = kb4Var6;
                        String str4 = (String) obj2;
                        switch (i102) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                a07Var.setValue(bool);
                                kb4Var82.invoke(bool);
                                qx1.I(t27Var2, str4);
                                break;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                a07Var.setValue(bool2);
                                kb4Var82.invoke(bool2);
                                y86.T(t27Var2, str4);
                                break;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                a07Var.setValue(bool3);
                                kb4Var82.invoke(bool3);
                                sw1.b0(t27Var2, str4);
                                break;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                a07Var.setValue(bool4);
                                kb4Var82.invoke(bool4);
                                qx1.H(t27Var2, str4);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ10);
            }
            qu1.g(zBooleanValue, str3, kb4Var7, yb4Var, kb4Var8, kb4Var9, kb4Var10, (kb4) objQ10, dd4Var, 384);
            str2 = "";
        } else {
            kb4Var6 = kb4Var;
            dd4Var.Y();
            str2 = str;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k71(z, t27Var, str2, kb4Var6, kb4Var2, kb4Var3, i2, 5);
        }
    }

    public static final void o(a07 a07Var, boolean z) {
        a07Var.setValue(Boolean.valueOf(z));
    }

    public static final void p(boolean z, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var5;
        dd4Var.h0(722082155);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f("") ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            kb4Var5 = kb4Var2;
            i3 |= dd4Var.h(kb4Var5) ? 2048 : 1024;
        } else {
            kb4Var5 = kb4Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            a07 a07VarA = dk9.A(kb4Var3, dd4Var);
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                mo4 mo4Var = (mo4) ((qtb) qx1.N(ug8.a(mo4.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
                bx1.a(z, kb4Var, (be3) null, (cj3) null, bv4.d, lc1.c(0.3f, lc1.b), false, false, (ou6) null, jf0.G(20517837, new m85(mo4Var, kb4Var5, kb4Var4, a07VarA, kb4Var, bx1.B(mo4Var.f, dd4Var)), dd4Var), dd4Var, 805527552 | (i3 & 14) | ((i3 >> 3) & Token.ASSIGN_MOD), 460);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yk6(z, kb4Var, kb4Var2, kb4Var3, kb4Var4, i2, 1);
        }
    }

    public static final void q(boolean z, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-1610798409);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i3 & 1, (74883 & i3) != 74882)) {
            bx1.a(z, kb4Var, (be3) null, (cj3) null, (f9) null, 0L, false, false, (ou6) null, jf0.G(-1884455787, new hu2(kb4Var2, kb4Var4, dk9.A(kb4Var3, dd4Var), kb4Var), dd4Var), dd4Var, 805306368 | (i3 & 14) | ((i3 >> 3) & Token.ASSIGN_MOD), 508);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yk6(z, kb4Var, kb4Var2, kb4Var3, kb4Var4, i2, 0);
        }
    }

    public static final void r(z87 z87Var, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        kb4 kb4Var7 = kb4Var5;
        kb4 kb4Var8 = kb4Var6;
        dd4Var.h0(-1091159371);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(z87Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var7) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var8) ? 67108864 : 33554432;
        }
        if (dd4Var.V(i3 & 1, (38347923 & i3) != 38347922)) {
            ou6 ou6VarQ = kc5.Q(ou6Var, kc5.J(dd4Var), 14);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarQ);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            int i4 = i3;
            un9.a(dd4Var, tg9.h(gjb.k0(lu6Var, pj7Var), 12.0f));
            nha.c(wn9.K((pv9) mu9.q0.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW = w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarW);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ou6 ou6VarW2 = w(lu6Var, s00.p(dd4Var).a);
            long jG = dd1.g(s00.o(dd4Var), 1.0f);
            lp4 lp4Var = jf0.G;
            e11.x(null, wn9.K((pv9) ru9.U.getValue(), dd4Var), wn9.K((pv9) ru9.V.getValue(), dd4Var), gjb.l0(fe.L(ou6VarW2, jG, lp4Var), 16.0f), false, z87Var.a, kb4Var, dd4Var, (i4 << 9) & 3670016, 17);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            e11.x(null, wn9.K((pv9) ru9.X.getValue(), dd4Var), wn9.K((pv9) ru9.Y.getValue(), dd4Var), tw2.g(dd4Var, 1.0f, w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f), false, z87Var.b, kb4Var2, dd4Var, (i4 << 6) & 3670016, 17);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            e11.x(null, wn9.K((pv9) ru9.Z.getValue(), dd4Var), wn9.K((pv9) ru9.a0.getValue(), dd4Var), tw2.g(dd4Var, 1.0f, w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f), false, z87Var.c, kb4Var3, dd4Var, (i4 << 3) & 3670016, 17);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            nha.c(wn9.K((pv9) ru9.r0.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW3 = w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW3);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ou6 ou6VarF0 = h67.f0(tg9.f(lu6Var, 1.0f), null, 3);
            ie1 ie1VarA4 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarF0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA4);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL04);
            e11.x(null, wn9.K((pv9) ru9.b0.getValue(), dd4Var), wn9.K((pv9) ru9.c0.getValue(), dd4Var), tw2.g(dd4Var, 1.0f, w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f), false, z87Var.d, kb4Var4, dd4Var, i4 & 3670016, 17);
            kb4Var7 = kb4Var5;
            kb4Var8 = kb4Var6;
            kf0.e(z87Var.d, (ou6) null, (be3) null, (cj3) null, (String) null, jf0.G(-1391323738, new c41(28, z87Var, kb4Var7, kb4Var8), dd4Var), dd4Var, 1572870, 30);
            dd4Var2 = dd4Var;
            tw2.x(dd4Var2, true, true, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(z87Var, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var7, kb4Var8, i2, 8);
        }
    }

    public static final void s(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(-1048507522);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            x87 x87Var = (x87) ((qtb) qx1.N(ug8.a(x87.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.T.getValue(), dd4Var), tg9.c, false, jf0.G(-1707527174, new n74(t27Var, 19), dd4Var), null, jf0.G(817871048, new qs1(5, x87Var, bx1.B(x87Var.e, dd4Var)), dd4Var), dd4Var2, 199728, 20);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 18, t27Var);
        }
    }

    public static final void t(final i0a i0aVar, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1808479325);
        int i3 = i2 | (dd4Var2.f(i0aVar) ? 4 : 2) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var2) ? 2048 : 1024);
        final int i4 = 1;
        final int i5 = 0;
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            int i6 = i3 & 14;
            boolean z = ((i3 & 896) == 256) | (i6 == 4);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new ib4() { // from class: dl6
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i7 = i5;
                        heb hebVar = heb.a;
                        i0a i0aVar2 = i0aVar;
                        kb4 kb4Var3 = kb4Var;
                        switch (i7) {
                            case 0:
                                kb4Var3.invoke(i0aVar2.a);
                                break;
                            default:
                                kb4Var3.invoke(i0aVar2.a);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            boolean z2 = ((i3 & 7168) == 2048) | (i6 == 4);
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new ib4() { // from class: dl6
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i7 = i4;
                        heb hebVar = heb.a;
                        i0a i0aVar2 = i0aVar;
                        kb4 kb4Var3 = kb4Var2;
                        switch (i7) {
                            case 0:
                                kb4Var3.invoke(i0aVar2.a);
                                break;
                            default:
                                kb4Var3.invoke(i0aVar2.a);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarT = yn2.t(ou6Var, ib4Var, (ib4) objQ2, dd4Var2, 6);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarT);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarR = tg9.r(lu6Var, 30.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarE0 = sdc.e0(0.6666667f, w(ou6VarR, ((q96) dd4Var2.j(ur9Var)).c.a), false);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            String str = i0aVar.a;
            String str2 = i0aVar.b;
            w05.c(str, str2, i0aVar.c, i0aVar.d, ra1.d, tg9.c, dd4Var2, 221184);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            bp5 bp5Var = new bp5(1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            nha.c(str2, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 48, 24960, 109564);
            dd4Var2 = dd4Var;
            if (i0aVar.d.length() > 0) {
                dd4Var2.f0(-41447340);
                nha.c(i0aVar.d, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, ((q96) dd4Var2.j(ur9Var)).a.o), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 48, 24960, 109560);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-41042325);
                dd4Var2.q(false);
            }
            ky0.A(dd4Var2, true, lu6Var, 12.0f, dd4Var2);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(i0aVar, ou6Var, kb4Var, kb4Var2, i2, 26);
        }
    }

    public static final void u(final jka jkaVar, final kba kbaVar, final eda edaVar, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, dd4 dd4Var, int i2) {
        kbaVar.getClass();
        edaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        dd4Var.h0(-1004350049);
        int i3 = i2 | (dd4Var.f(kbaVar) ? 32 : 16) | (dd4Var.f(edaVar) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var3) ? 1048576 : 524288);
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            final boolean z = jkaVar.d() == t19.c;
            WeakHashMap weakHashMap = pzb.w;
            final nm nmVar = ju7.i(dd4Var).b;
            final zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
            sdc.e(ou6Var, null, jf0.G(1471367029, new zb4() { // from class: eka
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    final co0 co0Var = (co0) obj;
                    dd4 dd4Var2 = (dd4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    co0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                    }
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ur9 ur9Var = xm1.h;
                        final float fK0 = ((pn2) dd4Var2.j(ur9Var)).k0(20.0f);
                        float fK02 = ((pn2) dd4Var2.j(ur9Var)).k0(20.0f);
                        hyb hybVar = nmVar;
                        zm5 zm5Var2 = zm5Var;
                        final float fD = fK02 + hybVar.d(r6, zm5Var2);
                        final float fK03 = ((pn2) dd4Var2.j(ur9Var)).k0(20.0f) + hybVar.b(r6, zm5Var2);
                        final float fK04 = ((pn2) dd4Var2.j(ur9Var)).k0(20.0f) + hybVar.a(r6);
                        final float fK05 = ((pn2) dd4Var2.j(ur9Var)).k0(20.0f) + hybVar.c(r1);
                        be3 be3VarC = wd3.c((by3) null, 3);
                        long j2 = b3b.b;
                        be3 be3VarA = be3VarC.a(wd3.f((p9b) null, 0.9f, j2, 1));
                        cj3 cj3VarA = wd3.d((by3) null, 3).a(wd3.h(0.9f, j2, 1));
                        final jka jkaVar2 = jkaVar;
                        boolean zF = dd4Var2.f(jkaVar2) | dd4Var2.c(fD) | dd4Var2.c(fK03) | dd4Var2.c(fK0) | dd4Var2.c(fK04) | dd4Var2.c(fK05);
                        Object objQ = dd4Var2.Q();
                        if (zF || objQ == vl1.a) {
                            zb4 zb4Var = new zb4() { // from class: fka
                                @Override // defpackage.zb4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    ja6 ja6Var = (ja6) obj4;
                                    ca6 ca6Var = (ca6) obj5;
                                    final up1 up1Var = (up1) obj6;
                                    ja6Var.getClass();
                                    ca6Var.getClass();
                                    final jt7 jt7VarC = ca6Var.C(up1Var.a);
                                    int i4 = jt7VarC.a;
                                    int i5 = jt7VarC.b;
                                    final jka jkaVar3 = jkaVar2;
                                    final float f2 = fD;
                                    final float f3 = fK03;
                                    final float f4 = fK0;
                                    final float f5 = fK04;
                                    final float f6 = fK05;
                                    return ja6Var.R(i4, i5, mc3.a, new kb4() { // from class: hka
                                        @Override // defpackage.kb4
                                        public final Object invoke(Object obj7) {
                                            it7 it7Var = (it7) obj7;
                                            it7Var.getClass();
                                            jka jkaVar4 = jkaVar3;
                                            cn7 cn7Var = jkaVar4.d;
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (((eb7) cn7Var.getValue()).a >> 32));
                                            jt7 jt7Var = jt7VarC;
                                            long j3 = up1Var.a;
                                            float fP = wx1.P(fIntBitsToFloat - (jt7Var.a / 2.0f), f2, (up1.i(j3) - f3) - jt7Var.a);
                                            s09 s09Var = (s09) jkaVar4.e.getValue();
                                            s09 s09Var2 = s09.b;
                                            float f7 = f4;
                                            float f8 = f5;
                                            float f9 = f6;
                                            it7.l(it7Var, jt7Var, (((long) t96.M(fP)) << 32) | (((long) t96.M(s09Var == s09Var2 ? wx1.P(Float.intBitsToFloat((int) (((eb7) cn7Var.getValue()).a & 4294967295L)) + f7, f8, (up1.h(j3) - f9) - jt7Var.b) : wx1.P((Float.intBitsToFloat((int) (((eb7) cn7Var.getValue()).a & 4294967295L)) - jt7Var.b) - f7, f8, (up1.h(j3) - f9) - jt7Var.b))) & 4294967295L));
                                            return heb.a;
                                        }
                                    });
                                }
                            };
                            dd4Var2.p0(zb4Var);
                            objQ = zb4Var;
                        }
                        ou6 ou6VarZ = kl8.Z(lu6.a, (zb4) objQ);
                        final kba kbaVar2 = kbaVar;
                        final eda edaVar2 = edaVar;
                        final kb4 kb4Var4 = kb4Var3;
                        final kb4 kb4Var5 = kb4Var2;
                        final kb4 kb4Var6 = kb4Var;
                        kf0.d(z, ou6VarZ, be3VarA, cj3VarA, (String) null, jf0.G(1426098765, new zb4() { // from class: gka
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x01a7  */
                            /* JADX WARN: Removed duplicated region for block: B:32:0x01ab  */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x01be  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x02f2  */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x030b  */
                            /* JADX WARN: Removed duplicated region for block: B:74:0x036d  */
                            /* JADX WARN: Removed duplicated region for block: B:77:0x038c  */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x047c  */
                            /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r3v24 */
                            /* JADX WARN: Type inference failed for: r3v25, types: [int] */
                            /* JADX WARN: Type inference failed for: r3v48, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r3v49, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r3v58 */
                            /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r9v15 */
                            /* JADX WARN: Type inference failed for: r9v18 */
                            /* JADX WARN: Type inference failed for: r9v35 */
                            @Override // defpackage.zb4
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object c(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                                /*
                                    Method dump skipped, instruction units count: 1165
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.gka.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, dd4Var2), dd4Var2, 196608, 16);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 3078, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(jkaVar, kbaVar, edaVar, ou6Var, kb4Var, kb4Var2, kb4Var3, i2, 9);
        }
    }

    public static int v(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z = d5 > 0.008856451679035631d;
        double d6 = z ? d5 : d2 / 903.2962962962963d;
        if (!z) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = c;
        double d7 = d6 * ((double) fArr[0]);
        double d8 = d4 * ((double) fArr[1]);
        double d9 = d5 * ((double) fArr[2]);
        double[][] dArr = e;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((A(d10) & 255) << 16) | (-16777216) | ((A(d11) & 255) << 8) | (A((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static final ou6 w(ou6 ou6Var, t89 t89Var) {
        return kl8.X(ou6Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, t89Var, true, 518143);
    }

    public static final ou6 x(ou6 ou6Var) {
        return kl8.X(ou6Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 520191);
    }

    public static void y(long j2, hn7 hn7Var, e2b[] e2bVarArr) {
        int i2;
        while (true) {
            if (hn7Var.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (hn7Var.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iZ = hn7Var.z();
                i3 += iZ;
                if (iZ != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (hn7Var.a() == 0) {
                    i4 = -1;
                    break;
                }
                int iZ2 = hn7Var.z();
                i4 += iZ2;
                if (iZ2 != 255) {
                    break;
                }
            }
            int i5 = hn7Var.b + i4;
            if (i4 == -1 || i4 > hn7Var.a()) {
                fe.n0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = hn7Var.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iZ3 = hn7Var.z();
                int iG = hn7Var.G();
                int iM = iG == 49 ? hn7Var.m() : 0;
                int iZ4 = hn7Var.z();
                if (iG == 47) {
                    hn7Var.N(1);
                }
                boolean z = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    z(j2, hn7Var, e2bVarArr);
                }
            }
            hn7Var.M(i5);
        }
    }

    public static void z(long j2, hn7 hn7Var, e2b[] e2bVarArr) {
        int iZ = hn7Var.z();
        if ((iZ & 64) != 0) {
            hn7Var.N(1);
            int i2 = (iZ & 31) * 3;
            int i3 = hn7Var.b;
            for (e2b e2bVar : e2bVarArr) {
                hn7Var.M(i3);
                e2bVar.e(i2, hn7Var);
                fx1.R(j2 != -9223372036854775807L);
                e2bVar.a(j2, 1, i2, 0, (d2b) null);
            }
        }
    }
}
