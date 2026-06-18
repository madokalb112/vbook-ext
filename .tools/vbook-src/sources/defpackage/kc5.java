package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kc5 {
    public static final rj1 c;
    public static final rj1 d;
    public static final rj1 i;
    public static final rj1 k;
    public static final rj1 l;
    public static final rj1 m;
    public static boolean s;
    public static long t;
    public static final double[][] a = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final rj1 b = new rj1(new k7(18), false, -2101498862);
    public static final rj1 e = new rj1(new uj1(6), false, -722042948);
    public static final rj1 f = new rj1(new uj1(26), false, 1891707195);
    public static final rj1 g = new rj1(new dk1(20), false, -1804273479);
    public static final rj1 h = new rj1(new dk1(21), false, 401501040);
    public static final rj1 j = new rj1(new hk1(28), false, -1450713961);
    public static final rj1 n = new rj1(new nk1(8), false, -71096267);
    public static final int[] o = {13, 15, 14};
    public static final m39[] p = new m39[0];
    public static final Object q = new Object();
    public static final Object r = new Object();
    public static final uh u = new uh(1022);

    static {
        int i2 = 4;
        c = new rj1(new uj1(i2), false, -2021062348);
        int i3 = 5;
        d = new rj1(new uj1(i3), false, -8238089);
        int i4 = 27;
        i = new rj1(new hk1(i4), false, 1195734394);
        k = new rj1(new jk1(i2), false, -994399853);
        l = new rj1(new kk1(i4), false, -1075803061);
        m = new rj1(new lk1(i3), false, 1749505095);
    }

    public static ou6 A(ou6 ou6Var, ww8 ww8Var, int i2) {
        return K(ou6Var, ww8Var, (i2 & 2) != 0, false);
    }

    public static final int B(int i2, int i3, int i4, int i5) {
        int i6 = (1 << i5) - 1;
        return (i2 & (~(i6 << i4))) | ((i3 & i6) << i4);
    }

    public static final a91 C(pi5 pi5Var) {
        pi5Var.getClass();
        sh5 sh5VarD = pi5Var.d();
        if (sh5VarD instanceof a91) {
            return (a91) sh5VarD;
        }
        if (!(sh5VarD instanceof cbb)) {
            w58.j(sh5VarD, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + sh5VarD + " from generic non-reified function. Such functionality cannot be supported because " + sh5VarD + " is erased, either specify serializer explicitly or make calling function inline with reified " + sh5VarD + '.');
    }

    public static final ou6 D() {
        return yi5.b;
    }

    public static int E(int i2) {
        return ((int) (((i2 & 255) * 0.5f) + 0.0f)) | (((int) (((i2 >>> 24) * 0.5f) + 127.5f)) << 24) | (((int) ((((i2 >> 16) & 255) * 0.5f) + 0.0f)) << 16) | (((int) ((((i2 >> 8) & 255) * 0.5f) + 0.0f)) << 8);
    }

    public static final ou6 F(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new cq1(kb4Var));
    }

    public static final Object G(lr7 lr7Var, n58 n58Var) {
        n58Var.getClass();
        Object objB = lr7Var.get(n58Var);
        if (objB == null) {
            objB = n58Var.b();
        }
        return ((wkb) objB).a(lr7Var);
    }

    public static long H(int i2, byte[] bArr) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & Token.CASE) == 128) {
            i3 = (i3 & Token.SWITCH) + Token.CASE;
        }
        if ((i4 & Token.CASE) == 128) {
            i4 = (i4 & Token.SWITCH) + Token.CASE;
        }
        if ((i5 & Token.CASE) == 128) {
            i5 = (i5 & Token.SWITCH) + Token.CASE;
        }
        if ((i6 & Token.CASE) == 128) {
            i6 = (i6 & Token.SWITCH) + Token.CASE;
        }
        return (((long) i3) << 24) + (((long) i4) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    public static long I(int i2, byte[] bArr) {
        long jH = H(i2, bArr);
        long jH2 = H(i2 + 4, bArr);
        if (jH == 0 && jH2 == 0) {
            return 0L;
        }
        return ((jH2 * 1000) / 4294967296L) + ((jH - 2208988800L) * 1000);
    }

    public static final ww8 J(dd4 dd4Var) {
        Object[] objArr = new Object[0];
        boolean zD = dd4Var.d(0);
        Object objQ = dd4Var.Q();
        if (zD || objQ == vl1.a) {
            objQ = new wo8(26);
            dd4Var.p0(objQ);
        }
        return (ww8) ww1.d0(objArr, ww8.j, (ib4) objQ, dd4Var, 0);
    }

    public static ou6 K(ou6 ou6Var, ww8 ww8Var, boolean z, boolean z2) {
        lh7 lh7Var = lh7.a;
        lh7 lh7Var2 = z2 ? lh7Var : lh7.b;
        yy6 yy6Var = ww8Var.d;
        lu6 lu6Var = lu6.a;
        return ou6Var.e(lh7Var2 == lh7Var ? t96.w(lu6Var, lp4.c) : t96.w(lu6Var, lp4.b)).e(new xw8((ag) null, (ro0) null, (s04) null, yy6Var, lh7Var2, ww8Var, z, false, true)).e(new cy8(ww8Var, z2));
    }

    public static final void L(a91 a91Var) {
        String strG = a91Var.g();
        if (strG == null) {
            strG = "<local class name not available>";
        }
        throw new u39(xv5.p("Serializer for class '", strG, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String M(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final String N(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }

    public static final lr7 O(p58[] p58VarArr, lr7 lr7Var, lr7 lr7Var2) {
        lr7 lr7Var3 = lr7.d;
        kr7 kr7Var = new kr7(lr7Var3);
        kr7Var.s = lr7Var3;
        for (p58 p58Var : p58VarArr) {
            n58 n58Var = p58Var.a;
            if (p58Var.f || !lr7Var.containsKey(n58Var)) {
                kr7Var.put(n58Var, n58Var.c(p58Var, (wkb) lr7Var2.get(n58Var)));
            }
        }
        return kr7Var.e();
    }

    public static final void P(dd4 dd4Var, ou6 ou6Var, int i2, pn2 pn2Var, mx5 mx5Var, mt8 mt8Var, zm5 zm5Var, lr7 lr7Var) {
        ml1.k.getClass();
        un9.s(ll1.e, dd4Var, lr7Var);
        un9.s(jm.s, dd4Var, ou6Var);
        un9.s(jm.t, dd4Var, pn2Var);
        un9.s(jm.u, dd4Var, mx5Var);
        un9.s(jm.v, dd4Var, mt8Var);
        un9.s(jm.w, dd4Var, zm5Var);
        un9.s(ll1.g, dd4Var, Integer.valueOf(i2));
    }

    public static ou6 Q(ou6 ou6Var, ww8 ww8Var, int i2) {
        return K(ou6Var, ww8Var, (i2 & 2) != 0, true);
    }

    public static final ou6 R(ou6 ou6Var, hyb hybVar) {
        return ou6Var.e(new x85(hybVar));
    }

    public static final void a(zd1 zd1Var, ou6 ou6Var, zb4 zb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-132464367);
        int i3 = i2 | (dd4Var2.f(zd1Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(zb4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            long jH = s00.o(dd4Var2).q;
            long jH2 = s00.o(dd4Var2).p;
            String str = zd1Var.c;
            String str2 = zd1Var.d;
            String str3 = zd1Var.b;
            boolean zF = dd4Var2.f(str);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                if (str.length() != 0) {
                    jH2 = kf0.H(str);
                }
                objQ = dk9.x(new lc1(jH2));
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            boolean zF2 = dd4Var2.f(str3);
            Object objQ2 = dd4Var2.Q();
            if (zF2 || objQ2 == obj) {
                if (str3.length() != 0) {
                    jH = kf0.H(str3);
                }
                objQ2 = dk9.x(new lc1(jH));
                dd4Var2.p0(objQ2);
            }
            a07 a07Var2 = (a07) objQ2;
            boolean zF3 = dd4Var2.f(str2);
            Object objQ3 = dd4Var2.Q();
            if (zF3 || objQ3 == obj) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                objQ3 = dk9.x(str2 != null ? new fj7(zn7.f(qu1.d0(gx3.a), str2)) : null);
                dd4Var2.p0(objQ3);
            }
            a07 a07Var3 = (a07) objQ3;
            Object objQ4 = dd4Var2.Q();
            if (objQ4 == obj) {
                objQ4 = lc5.Z(dd4Var2);
                dd4Var2.p0(objQ4);
            }
            vx1 vx1Var = (vx1) objQ4;
            String strK = wn9.K((pv9) vt9.K.getValue(), dd4Var2);
            boolean zE = dd4Var2.e(((lc1) a07Var.getValue()).a);
            Object objQ5 = dd4Var2.Q();
            if (zE || objQ5 == obj) {
                objQ5 = kf0.X(((lc1) a07Var.getValue()).a, true, false);
                dd4Var2.p0(objQ5);
            }
            String str4 = (String) objQ5;
            bi5 bi5Var = (bi5) a07Var3.getValue();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), s00.p(dd4Var2).b);
            long jG = dd1.g(s00.o(dd4Var2), 8.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL02 = gjb.l0(fe.L(ou6VarW, jG, lp4Var), 8.0f);
            boolean zH = dd4Var2.h(vx1Var) | dd4Var2.f(a07Var) | dd4Var2.f(a07Var3);
            Object objQ6 = dd4Var2.Q();
            if (zH || objQ6 == obj) {
                objQ6 = new gz4(vx1Var, a07Var, a07Var3);
                dd4Var2.p0(objQ6);
            }
            f(strK, str4, bi5Var, ou6VarL02, (kb4) objQ6, dd4Var, 0);
            String strK2 = wn9.K((pv9) vt9.J.getValue(), dd4Var);
            boolean zE2 = dd4Var.e(((lc1) a07Var.getValue()).a);
            Object objQ7 = dd4Var.Q();
            if (zE2 || objQ7 == obj) {
                objQ7 = kf0.X(((lc1) a07Var.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                objQ7.getClass();
                dd4Var.p0(objQ7);
            }
            String str5 = (String) objQ7;
            ou6 ou6VarG = tw2.g(dd4Var, 8.0f, t96.w(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), s00.p(dd4Var).b), lp4Var, 8.0f);
            boolean zF4 = dd4Var.f(a07Var);
            Object objQ8 = dd4Var.Q();
            if (zF4 || objQ8 == obj) {
                objQ8 = new ci6(a07Var, 6);
                dd4Var.p0(objQ8);
            }
            g(strK2, str5, ou6VarG, (kb4) objQ8, dd4Var, 0);
            String strK3 = wn9.K((pv9) zu9.H.getValue(), dd4Var);
            boolean zE3 = dd4Var.e(((lc1) a07Var2.getValue()).a);
            Object objQ9 = dd4Var.Q();
            if (zE3 || objQ9 == obj) {
                objQ9 = kf0.X(((lc1) a07Var2.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                objQ9.getClass();
                dd4Var.p0(objQ9);
            }
            String str6 = (String) objQ9;
            ou6 ou6VarG2 = tw2.g(dd4Var, 8.0f, t96.w(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), s00.p(dd4Var).b), lp4Var, 8.0f);
            boolean zF5 = dd4Var.f(a07Var2);
            Object objQ10 = dd4Var.Q();
            if (zF5 || objQ10 == obj) {
                objQ10 = new ci6(a07Var2, 7);
                dd4Var.p0(objQ10);
            }
            g(strK3, str6, ou6VarG2, (kb4) objQ10, dd4Var, 0);
            p35 p35VarC = i25.c((m53) a53.v.getValue(), dd4Var, 0);
            String strK4 = wn9.K((pv9) mu9.t.getValue(), dd4Var);
            ou6 ou6VarM0 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 12.0f);
            boolean zF6 = dd4Var.f(a07Var2) | ((i3 & 896) == 256) | dd4Var.f(a07Var) | dd4Var.f(a07Var3);
            Object objQ11 = dd4Var.Q();
            if (zF6 || objQ11 == obj) {
                ri6 ri6Var = new ri6(zb4Var, a07Var2, a07Var, a07Var3, 0);
                dd4Var.p0(ri6Var);
                objQ11 = ri6Var;
            }
            n(p35VarC, strK4, false, null, ou6VarM0, null, null, null, (ib4) objQ11, dd4Var, 24576, 236);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(zd1Var, ou6Var, zb4Var, i2, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.kb4 r18, ou6 r19, defpackage.kb4 r20, defpackage.kb4 r21, defpackage.kb4 r22, dd4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc5.b(kb4, ou6, kb4, kb4, kb4, dd4, int, int):void");
    }

    public static final on1 c() {
        return new on1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    public static final void d(String str, String str2, String str3, String str4, ou6 ou6Var, ac4 ac4Var, dd4 dd4Var, int i2) {
        kd kdVar;
        int i3;
        Object obj;
        br9 br9Var;
        ib4 ib4Var;
        int i4;
        char c2;
        boolean z;
        boolean z2;
        jm jmVar;
        a07 a07Var;
        char c3;
        yb4 yb4Var;
        yb4 yb4Var2;
        dd4 dd4Var2;
        ?? r1;
        String str5;
        Object pm8Var;
        f36 f36Var;
        Object sx2Var;
        int i5;
        br9 br9Var2;
        a07 a07Var2;
        dd4 dd4Var3 = dd4Var;
        qr1 qr1Var = ra1.d;
        dd4Var3.h0(376562847);
        int i6 = (dd4Var3.h(ac4Var) ? 131072 : Parser.ARGC_LIMIT) | i2 | (dd4Var3.f(str) ? 4 : 2) | (dd4Var3.f(str2) ? 32 : 16) | (dd4Var3.f(str3) ? 256 : Token.CASE) | (dd4Var3.f(str4) ? 2048 : 1024) | (dd4Var3.f(ou6Var) ? 16384 : 8192);
        if (dd4Var3.V(i6 & 1, (74899 & i6) != 74898)) {
            Object[] objArr = new Object[0];
            int i7 = i6 & Token.ASSIGN_MOD;
            boolean z3 = i7 == 32;
            Object objQ = dd4Var3.Q();
            Object obj2 = vl1.a;
            if (z3 || objQ == obj2) {
                objQ = new wj0(str2, 13);
                dd4Var3.p0(objQ);
            }
            br9 br9Var3 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var3, 0);
            Object[] objArr2 = new Object[0];
            boolean z4 = (i6 & 896) == 256;
            Object objQ2 = dd4Var3.Q();
            int i8 = 15;
            if (z4 || objQ2 == obj2) {
                objQ2 = new wj0(str3, i8);
                dd4Var3.p0(objQ2);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var3, 0);
            Object[] objArr3 = new Object[0];
            boolean z5 = (i6 & 7168) == 2048;
            Object objQ3 = dd4Var3.Q();
            if (z5 || objQ3 == obj2) {
                objQ3 = new wj0(str4, 16);
                dd4Var3.p0(objQ3);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var3, 0);
            Object objQ4 = dd4Var3.Q();
            if (objQ4 == obj2) {
                objQ4 = dk9.x((Object) null);
                dd4Var3.p0(objQ4);
            }
            a07 a07Var5 = (a07) objQ4;
            Object objQ5 = dd4Var3.Q();
            if (objQ5 == obj2) {
                objQ5 = new r02(a07Var5, 26);
                dd4Var3.p0(objQ5);
            }
            aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ5, dd4Var3, 48);
            Object[] objArr4 = new Object[0];
            Object objQ6 = dd4Var3.Q();
            if (objQ6 == obj2) {
                objQ6 = new g53(23);
                dd4Var3.p0(objQ6);
            }
            br9 br9Var4 = (a07) ww1.b0(objArr4, (ib4) objQ6, dd4Var3, 48);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL = dd4Var3.l();
            ou6 ou6VarL0 = s32.L0(dd4Var3, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var2);
            } else {
                dd4Var3.s0();
            }
            yb4 yb4Var3 = ll1.f;
            un9.s(yb4Var3, dd4Var3, ha6VarD);
            yb4 yb4Var4 = ll1.e;
            un9.s(yb4Var4, dd4Var3, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var3, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var3, kdVar2);
            jm jmVar3 = ll1.d;
            un9.s(jmVar3, dd4Var3, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarC = tg9.c(lu6Var, 1.0f);
            xf0 xf0Var2 = bv4.c;
            zn0 zn0Var = zn0.a;
            ou6 ou6VarQ = Q(yn2.E(zn0Var.a(ou6VarC, xf0Var2), dd4Var3, 0), J(dd4Var3), 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var3, 48);
            int iHashCode2 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL2 = dd4Var3.l();
            ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarQ);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var2);
            } else {
                dd4Var3.s0();
            }
            un9.s(yb4Var3, dd4Var3, ie1VarA);
            un9.s(yb4Var4, dd4Var3, lr7VarL2);
            ky0.v(iHashCode2, dd4Var3, jmVar2, dd4Var3, kdVar2);
            un9.s(jmVar3, dd4Var3, ou6VarL02);
            un9.a(dd4Var3, tg9.h(lu6Var, 44.0f));
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode3 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL3 = dd4Var3.l();
            ou6 ou6VarL03 = s32.L0(dd4Var3, lu6Var);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var2);
            } else {
                dd4Var3.s0();
            }
            un9.s(yb4Var3, dd4Var3, ha6VarD2);
            un9.s(yb4Var4, dd4Var3, lr7VarL3);
            ky0.v(iHashCode3, dd4Var3, jmVar2, dd4Var3, kdVar2);
            un9.s(jmVar3, dd4Var3, ou6VarL03);
            ou6 ou6VarW = t96.w(tg9.o(gjb.p0(lu6Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 120.0f, 180.0f), s00.p(dd4Var3).b);
            ha6 ha6VarD3 = pn0.d(xf0Var, false);
            int iHashCode4 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL4 = dd4Var3.l();
            ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarW);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var2);
            } else {
                dd4Var3.s0();
            }
            un9.s(yb4Var3, dd4Var3, ha6VarD3);
            un9.s(yb4Var4, dd4Var3, lr7VarL4);
            ky0.v(iHashCode4, dd4Var3, jmVar2, dd4Var3, kdVar2);
            un9.s(jmVar3, dd4Var3, ou6VarL04);
            if (((bi5) a07Var5.getValue()) == null) {
                dd4Var3.f0(-59390854);
                kdVar = kdVar2;
                i3 = i6;
                obj = obj2;
                w05.c(str, str2, "", "", qr1Var, tg9.c, dd4Var3, (i6 & 14) | 224640 | i7);
                dd4Var3.q(false);
                r1 = 0;
                yb4Var2 = yb4Var4;
                ib4Var = ib4Var2;
                jmVar = jmVar2;
                br9Var = br9Var3;
                a07Var = a07Var5;
                z = true;
                i4 = 2;
                c3 = '0';
                c2 = 0;
                yb4Var = yb4Var3;
                dd4Var2 = dd4Var3;
            } else {
                kdVar = kdVar2;
                i3 = i6;
                obj = obj2;
                dd4Var3.f0(-58969626);
                bi5 bi5Var = (bi5) a07Var5.getValue();
                if (bi5Var == null) {
                    dd4Var3.f0(-58969627);
                    dd4Var3.q(false);
                    z2 = false;
                    yb4Var2 = yb4Var4;
                    ib4Var = ib4Var2;
                    jmVar = jmVar2;
                    br9Var = br9Var3;
                    a07Var = a07Var5;
                    z = true;
                    i4 = 2;
                    c3 = '0';
                    c2 = 0;
                    yb4Var = yb4Var3;
                    dd4Var2 = dd4Var3;
                } else {
                    dd4Var3.f0(-58969626);
                    br9Var = br9Var3;
                    ib4Var = ib4Var2;
                    i4 = 2;
                    c2 = 0;
                    z = true;
                    z2 = false;
                    jmVar = jmVar2;
                    a07Var = a07Var5;
                    c3 = '0';
                    yb4Var = yb4Var3;
                    yb4Var2 = yb4Var4;
                    w05.a(bi5Var, qr1Var, false, null, null, tg9.c, null, dd4Var3, 1572912, 444);
                    dd4Var2 = dd4Var3;
                    dd4Var2.q(false);
                }
                dd4Var2.q(z2);
                r1 = z2;
            }
            dd4Var2.q(z);
            p35 p35VarC = i25.c((m53) a53.P.getValue(), dd4Var2, r1);
            long j2 = s00.o(dd4Var2).b;
            ou6 ou6VarN = tg9.n(zn0Var.a(lu6Var, bv4.u), 32.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarL = fe.L(gjb.l0(fe.L(t96.w(ou6VarN, rp8Var), s00.o(dd4Var2).n, rp8Var), 2.0f), s00.o(dd4Var2).a, rp8Var);
            boolean zF = dd4Var2.f(aw3VarC0);
            Object objQ7 = dd4Var2.Q();
            Object obj3 = obj;
            if (zF || objQ7 == obj3) {
                objQ7 = new k51(aw3VarC0, 3);
                dd4Var2.p0(objQ7);
            }
            yb4 yb4Var5 = yb4Var2;
            ib4 ib4Var3 = ib4Var;
            br9 br9Var5 = br9Var;
            dd4 dd4Var4 = dd4Var2;
            yb4 yb4Var6 = yb4Var;
            jm jmVar4 = jmVar;
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ7, ou6VarL, false, 15), 6.0f), j2, dd4Var4, 48, 0);
            xv5.z(dd4Var4, true, lu6Var, 12.0f, dd4Var4);
            String str6 = (String) br9Var5.getValue();
            uw1 uw1Var = s00.p(dd4Var4).b;
            ou6 ou6VarN0 = gjb.n0(tg9.f(tg9.t(lu6Var, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, i4);
            boolean zF2 = dd4Var4.f(br9Var5);
            Object objQ8 = dd4Var4.Q();
            if (zF2 || objQ8 == obj3) {
                objQ8 = new r02(br9Var5, 27);
                dd4Var4.p0(objQ8);
            }
            lx1.m(str6, (kb4) objQ8, ou6VarN0, false, false, null, vo1.c, null, null, null, false, null, null, null, false, 0, 0, uw1Var, null, dd4Var4, 1573248, 0, 6291384);
            String str7 = (String) tw2.l(lu6Var, 12.0f, dd4Var4, a07Var3);
            uw1 uw1Var2 = s00.p(dd4Var4).b;
            ou6 ou6VarN02 = gjb.n0(tg9.f(tg9.t(lu6Var, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF3 = dd4Var4.f(a07Var3);
            Object objQ9 = dd4Var4.Q();
            if (zF3 || objQ9 == obj3) {
                objQ9 = new r02(a07Var3, 24);
                dd4Var4.p0(objQ9);
            }
            lx1.m(str7, (kb4) objQ9, ou6VarN02, false, false, null, vo1.d, null, null, null, false, null, null, null, false, 0, 0, uw1Var2, null, dd4Var4, 1573248, 0, 6291384);
            un9.a(dd4Var4, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) iu9.g0.getValue(), dd4Var4), lu6Var, s00.o(dd4Var4).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var4).i, dd4Var4, 48, 0, 131064);
            un9.a(dd4Var4, tg9.h(lu6Var, 6.0f));
            ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(tg9.t(tg9.h(lu6Var, 56.0f), 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2), s00.p(dd4Var4).b);
            boolean zF4 = dd4Var4.f(br9Var4);
            Object objQ10 = dd4Var4.Q();
            if (zF4 || objQ10 == obj3) {
                objQ10 = new bv1(br9Var4, 22);
                dd4Var4.p0(objQ10);
            }
            ou6 ou6VarN03 = gjb.n0(fw.G(fw.J(null, (ib4) objQ10, ou6VarW2, false, 15), 1.5f, s00.o(dd4Var4).A, s00.p(dd4Var4).b), 12.0f, 0.0f, 2);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var4, 48);
            int iHashCode5 = Long.hashCode(dd4Var4.T);
            lr7 lr7VarL5 = dd4Var4.l();
            ou6 ou6VarL05 = s32.L0(dd4Var4, ou6VarN03);
            dd4Var4.j0();
            if (dd4Var4.S) {
                dd4Var4.k(ib4Var3);
            } else {
                dd4Var4.s0();
            }
            un9.s(yb4Var6, dd4Var4, eq8VarA);
            un9.s(yb4Var5, dd4Var4, lr7VarL5);
            ky0.v(iHashCode5, dd4Var4, jmVar4, dd4Var4, kdVar);
            un9.s(jmVar3, dd4Var4, ou6VarL05);
            boolean zF5 = dd4Var4.f((String) a07Var4.getValue());
            Object objQ11 = dd4Var4.Q();
            Object obj4 = objQ11;
            if (zF5 || objQ11 == obj3) {
                str5 = "";
                String strA = str5;
                if (((String) a07Var4.getValue()).length() != 0) {
                    String str8 = (String) a07Var4.getValue();
                    str8.getClass();
                    String strI = iw9.I(bw9.B0(str8).toString(), '_', '-');
                    if (strI.length() == 0 || strI.equalsIgnoreCase("und")) {
                        strI = null;
                    }
                    if (strI == null) {
                        f36Var = null;
                    } else {
                        try {
                            pm8Var = new f36(tw1.n(strI));
                        } catch (Throwable th) {
                            pm8Var = new pm8(th);
                        }
                        if (pm8Var instanceof pm8) {
                            pm8Var = null;
                        }
                        f36Var = (f36) pm8Var;
                    }
                    String strB = f36Var != null ? f36Var.b(f36Var) : null;
                    strA = j39.A(strB != null ? strB : "", " (", (String) a07Var4.getValue(), ")");
                }
                dd4Var4.p0(strA);
                obj4 = strA;
            }
            String strK = (String) obj4;
            dd4Var4.f0(-1121611561);
            if (strK.length() == 0) {
                strK = wn9.K((pv9) eu9.n.getValue(), dd4Var4);
            }
            dd4Var4.q(false);
            nha.c(strK, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var4, 0, 0, 262140);
            dd4Var3 = dd4Var4;
            mx4.a(i25.c((m53) f53.s.getValue(), dd4Var4, 0), (String) null, gjb.p0(lu6Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, dd4Var3, 432, 8);
            xv5.z(dd4Var3, true, lu6Var, 12.0f, dd4Var3);
            p35 p35VarC2 = i25.c((m53) f53.g0.getValue(), dd4Var3, 0);
            String strK2 = wn9.K((pv9) mu9.U.getValue(), dd4Var3);
            boolean z6 = ((String) br9Var5.getValue()).length() > 0 && ((String) a07Var4.getValue()).length() > 0;
            ou6 ou6VarN04 = gjb.n0(tg9.f(tg9.t(lu6Var, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF6 = dd4Var3.f(br9Var5) | ((i3 & 458752) == 131072) | dd4Var3.f(a07Var3) | dd4Var3.f(a07Var4);
            Object objQ12 = dd4Var3.Q();
            if (zF6 || objQ12 == obj3) {
                i5 = 0;
                br9Var2 = br9Var4;
                sx2Var = new sx2(ac4Var, br9Var5, a07Var3, a07Var4, a07Var, 1);
                a07Var2 = a07Var4;
                dd4Var3.p0(sx2Var);
            } else {
                sx2Var = objQ12;
                a07Var2 = a07Var4;
                i5 = 0;
                br9Var2 = br9Var4;
            }
            n(p35VarC2, strK2, z6, null, ou6VarN04, null, null, null, (ib4) sx2Var, dd4Var3, 24576, 232);
            un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
            dd4Var3.q(true);
            boolean zBooleanValue = ((Boolean) br9Var2.getValue()).booleanValue();
            boolean zF7 = dd4Var3.f(br9Var2);
            Object objQ13 = dd4Var3.Q();
            if (zF7 || objQ13 == obj3) {
                objQ13 = new r02(br9Var2, 25);
                dd4Var3.p0(objQ13);
            }
            kb4 kb4Var = (kb4) objQ13;
            boolean zF8 = dd4Var3.f(a07Var2) | dd4Var3.f(br9Var2);
            Object objQ14 = dd4Var3.Q();
            if (zF8 || objQ14 == obj3) {
                objQ14 = new rl0(a07Var2, br9Var2, 8);
                dd4Var3.p0(objQ14);
            }
            kl8.y(zBooleanValue, kb4Var, (kb4) objQ14, dd4Var3, i5);
            dd4Var3.q(true);
        } else {
            dd4Var3.Y();
        }
        ye8 ye8VarU = dd4Var3.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(str, str2, str3, str4, ou6Var, ac4Var, i2, 2);
        }
    }

    public static final void e(ou6 ou6Var, t89 t89Var, qy0 qy0Var, ry0 ry0Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        qy0 qy0Var2;
        int i3;
        qy0 qy0Var3;
        dd4Var.h0(1359693790);
        int i4 = 2;
        int i5 = i2 | (dd4Var.f(ou6Var) ? 4 : 2) | (dd4Var.f(t89Var) ? 32 : 16) | Token.CASE | (dd4Var.f(ry0Var) ? 2048 : 1024) | 24576;
        if (dd4Var.V(i5 & 1, (74899 & i5) != 74898)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
                qy0 qy0Var4 = ad1Var.Z;
                if (qy0Var4 == null) {
                    cd1 cd1Var = fz1.F;
                    qy0Var4 = new qy0(dd1.d(ad1Var, cd1Var), dd1.a(ad1Var, dd1.d(ad1Var, cd1Var)), ah1.B(lc1.c(fz1.H, dd1.d(ad1Var, fz1.G)), dd1.d(ad1Var, cd1Var)), lc1.c(0.38f, dd1.a(ad1Var, dd1.d(ad1Var, cd1Var))));
                    ad1Var.Z = qy0Var4;
                }
                i3 = i5 & (-897);
                qy0Var3 = qy0Var4;
            } else {
                dd4Var.Y();
                i3 = i5 & (-897);
                qy0Var3 = qy0Var;
            }
            dd4Var.r();
            long j2 = qy0Var3.a;
            long j3 = qy0Var3.b;
            float f2 = ry0Var.a;
            dd4Var.f0(-1763481333);
            dd4Var.f0(167726411);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = dk9.x(new x13(f2));
                dd4Var.p0(objQ);
            }
            dd4Var.q(false);
            dd4Var.q(false);
            j1a.a(ou6Var, t89Var, j2, j3, 0.0f, ((x13) ((a07) objQ).getValue()).a, (wm0) null, jf0.G(-97109725, new tb0(rj1Var, i4), dd4Var), dd4Var, (i3 & 14) | 12582912 | (i3 & Token.ASSIGN_MOD) | 1572864, 16);
            qy0Var2 = qy0Var3;
        } else {
            dd4Var.Y();
            qy0Var2 = qy0Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(ou6Var, t89Var, qy0Var2, ry0Var, rj1Var, i2);
        }
    }

    public static final void f(String str, String str2, bi5 bi5Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        long j2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(736249800);
        int i4 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.f(bi5Var) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var) ? 16384 : 8192);
        if (dd4Var2.V(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = (57344 & i4) == 16384;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new mj(9, kb4Var);
                dd4Var2.p0(objQ);
            }
            aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ, dd4Var2, 0);
            boolean z2 = (i4 & Token.ASSIGN_MOD) == 32;
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                lc1 lc1Var = new lc1(kf0.H(str2));
                dd4Var2.p0(lc1Var);
                objQ2 = lc1Var;
            }
            long j3 = ((lc1) objQ2).a;
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
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
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.j;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            nha.c(str, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).e(new hmb(bv4.x)), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i4 & 14, 0, 130044);
            dd4Var2 = dd4Var;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarG = fw.G(t96.w(tg9.h(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 40.0f), ((q96) dd4Var2.j(ur9Var)).c.b), 1.0f, ((q96) dd4Var2.j(ur9Var)).a.a, ((q96) dd4Var2.j(ur9Var)).c.b);
            boolean zF = dd4Var2.f(aw3VarC0);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new k51(aw3VarC0, 10);
                dd4Var2.p0(objQ3);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ3, ou6VarG, false, 15);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarJ);
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
            boolean zE = dd4Var2.e(j3);
            Object objQ4 = dd4Var2.Q();
            if (zE || objQ4 == obj) {
                objQ4 = new lc1(kf0.I(j3) ? lc1.b : lc1.e);
                dd4Var2.p0(objQ4);
            }
            long j4 = ((lc1) objQ4).a;
            lu6 lu6Var = lu6.a;
            zn0 zn0Var = zn0.a;
            if (bi5Var != null) {
                dd4Var2.f0(-1144536123);
                w15 w15Var = new w15((Context) dd4Var2.j(he.b));
                w15Var.c = bi5Var;
                uw0 uw0Var = uw0.c;
                w15Var.j = uw0Var;
                w15Var.i = uw0Var;
                f25.a(w15Var, false);
                gc1.c(w15Var.a(), (b15) dd4Var2.j(w05.a), tg9.c, dd4Var2, 12586032);
                dd4Var2.q(false);
                j2 = j4;
                i3 = 0;
            } else {
                dd4Var2.f0(-1143937885);
                i3 = 0;
                nha.c(wn9.K((pv9) zt9.Y.getValue(), dd4Var2), zn0Var.a(lu6Var, bv4.f), j4, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var2, 0, 0, 131064);
                j2 = j4;
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            }
            i12.f(i25.c((m53) a53.P.getValue(), dd4Var2, i3), gjb.p0(zn0Var.a(lu6Var, bv4.s), 0.0f, 0.0f, 8.0f, 0.0f, 11), new gh0(j2, 5), dd4Var2, 48, 56);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(str, str2, bi5Var, ou6Var, kb4Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r62, java.lang.String r63, ou6 r64, defpackage.kb4 r65, dd4 r66, int r67) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc5.g(java.lang.String, java.lang.String, ou6, kb4, dd4, int):void");
    }

    public static final void h(boolean z, boolean z2, List list, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var4;
        int i4;
        dd4Var.h0(1480844034);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(list) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            kb4Var4 = kb4Var3;
            i3 |= dd4Var.h(kb4Var4) ? 8388608 : 4194304;
        } else {
            kb4Var4 = kb4Var3;
        }
        if (dd4Var.V(i3 & 1, (i3 & 4793491) != 4793490)) {
            boolean zF = dd4Var.f(list);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = dk9.x(list);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            szb szbVarW = yib.w(yib.w(pj7Var, yib.d(14, dd4Var, false)), gjb.q(0.0f, 0.0f, 0.0f, 12.0f, 7));
            int i5 = 0;
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                i4 = i3;
                objQ2 = new xs1(a07Var, null, i5);
                dd4Var.p0(objQ2);
            } else {
                i4 = i3;
            }
            pj8 pj8VarU0 = lx1.u0(st5VarA, szbVarW, (ac4) objQ2, dd4Var);
            szb szbVarW2 = yib.w(szbVarW, gjb.o(2, 16.0f));
            szb szbVarW3 = yib.w(szbVarW, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zF3 = dd4Var.f(pj8VarU0) | ((i4 & 14) == 4) | ((i4 & 458752) == 131072) | ((i4 & Token.ASSIGN_MOD) == 32) | ((i4 & 3670016) == 1048576) | dd4Var.f(a07Var) | ((i4 & 29360128) == 8388608);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj) {
                rs1 rs1Var = new rs1(pj8VarU0, z2, kb4Var2, z, kb4Var, a07Var, kb4Var4);
                dd4Var.p0(rs1Var);
                objQ3 = rs1Var;
            }
            gx1.h(ou6Var, st5VarA, szbVarW2, mvVar, null, null, false, szbVarW3, 0L, 0L, 0.0f, (kb4) objQ3, dd4Var, ((i4 >> 12) & 14) | 24576, 0, 3816);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ss1(z, z2, list, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, i2);
        }
    }

    public static final void i(boolean z, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(990135047);
        int i3 = i2 | (dd4Var2.g(z) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
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
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var) {
                String[] strArr = {"#F2C24F", "#EE7950", "#97C15C", "#60C3D7"};
                dd4Var2.p0(strArr);
                obj = strArr;
            }
            String[] strArr2 = (String[]) obj;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, lu6Var);
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
            dd4Var2.f0(78477272);
            int length = strArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                String str = strArr2[i4];
                int i6 = i5 + 1;
                boolean zF = dd4Var2.f(str);
                Object objQ2 = dd4Var2.Q();
                if (zF || objQ2 == fu6Var) {
                    lc1 lc1Var = new lc1(kf0.H(str));
                    dd4Var2.p0(lc1Var);
                    objQ2 = lc1Var;
                }
                long j2 = ((lc1) objQ2).a;
                ou6 ou6VarN = tg9.n(gjb.p0(lu6Var, 20.0f * i5, 0.0f, 0.0f, 0.0f, 14), 28.0f);
                rp8 rp8Var = tp8.a;
                ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
                long j3 = ((q96) dd4Var2.j(s96.a)).a.p;
                lp4 lp4Var = jf0.G;
                pn0.a(fe.L(t96.w(gjb.l0(fe.L(ou6VarW, j3, lp4Var), 2.0f), rp8Var), j2, lp4Var), dd4Var2, 0);
                i4++;
                i5 = i6;
            }
            dd4Var2.q(false);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            String strK = wn9.K((pv9) iu9.m.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 0, 0, 131064);
            dd4Var2 = dd4Var;
            zk9.g(z, false, null, kb4Var, dd4Var2, (i3 & 14) | ((i3 << 3) & 7168));
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i41(z, ou6Var, kb4Var, i2, 2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bd A[PHI: r7
  0x03bd: PHI (r7v28 boolean) = 
  (r7v17 boolean)
  (r7v18 boolean)
  (r7v19 boolean)
  (r7v20 boolean)
  (r7v21 boolean)
  (r7v22 boolean)
  (r7v23 boolean)
  (r7v24 boolean)
  (r7v29 boolean)
 binds: [B:129:0x03bb, B:125:0x0398, B:121:0x0375, B:117:0x0354, B:113:0x0332, B:109:0x0311, B:105:0x02f0, B:101:0x02cf, B:94:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022f A[PHI: r7
  0x022f: PHI (r7v30 ??) = (r7v6 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??), (r7v10 ??), (r7v11 ??), (r7v12 ??), (r7v13 ??), (r7v31 ??) binds: [B:89:0x022d, B:85:0x020f, B:81:0x01f5, B:77:0x01d7, B:73:0x01b7, B:69:0x0197, B:65:0x0177, B:61:0x0157, B:55:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.xi8 r31, defpackage.js1 r32, ou6 r33, defpackage.ib4 r34, defpackage.kb4 r35, dd4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc5.j(xi8, js1, ou6, ib4, kb4, dd4, int):void");
    }

    public static final void k(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(1993084950);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ft1 ft1Var = (ft1) ((qtb) qx1.N(ug8.a(ft1.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.m0.getValue(), dd4Var), tg9.c, false, jf0.G(1929995154, new q41(t27Var, 9), dd4Var), null, jf0.G(167440864, new qs1(i4, ft1Var, bx1.B(ft1Var.d, dd4Var)), dd4Var), dd4Var2, 199728, 20);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 10, t27Var);
        }
    }

    public static final un2 l(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        k74 k74VarA = l74.a(f2);
        if (k74VarA == null) {
            k74VarA = new ky5(f2);
        }
        return new un2(f3, f2, k74VarA);
    }

    public static final void m(String str, t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-542215852);
        int i3 = 4;
        int i4 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        int i5 = 5;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            int i6 = 14;
            boolean z = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new wj0(str, i6);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            n83 n83Var = (n83) ((qtb) qx1.N(ug8.a(n83.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var));
            a07 a07VarB = bx1.B(n83Var.K, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = n83Var.L;
            boolean zF = dd4Var.f(m8Var);
            Object objQ2 = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ2 == obj) {
                objQ2 = new xa(m8Var, jt1Var, i5);
                dd4Var.p0(objQ2);
            }
            wx1.e(pp1Var, null, (zb4) objQ2, dd4Var, 0);
            gx1.p(((m83) a07VarB.getValue()).b, tg9.c, false, jf0.G(-1313283376, new q41(t27Var, 19), dd4Var), null, jf0.G(2035927070, new ak0(i3, a07VarB, (Object) str, (Object) n83Var), dd4Var), dd4Var, 199728, 20);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(p35 r24, java.lang.String r25, boolean r26, defpackage.bs0 r27, ou6 r28, pj7 r29, uka r30, t89 r31, defpackage.ib4 r32, dd4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc5.n(p35, java.lang.String, boolean, bs0, ou6, pj7, uka, t89, ib4, dd4, int, int):void");
    }

    public static final void o(boolean z, bs0 bs0Var, ou6 ou6Var, pj7 pj7Var, t89 t89Var, yb4 yb4Var, yb4 yb4Var2, ib4 ib4Var, dd4 dd4Var, int i2) {
        yb4 yb4Var3;
        boolean z2;
        bs0 bs0Var2;
        pj7 pj7Var2;
        t89 t89Var2;
        int i3;
        bs0 bs0VarB;
        boolean z3;
        pj7 rj7Var;
        t89 t89Var3;
        bs0 bs0Var3;
        wm0 wm0Var;
        ib4Var.getClass();
        dd4Var.h0(-85926926);
        int i4 = i2 | 22;
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        int i5 = i4 | 11264 | (dd4Var.h(ib4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i5 & 1, (4793491 & i5) != 4793490)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                rj7 rj7Var2 = cs0.a;
                i3 = i5 & (-57457);
                bs0VarB = cs0.b(((q96) dd4Var.j(s96.a)).a);
                z3 = true;
                rj7Var = new rj7(16.0f, 8.0f, 16.0f, 8.0f);
                t89Var3 = tp8.a;
            } else {
                dd4Var.Y();
                i3 = i5 & (-57457);
                z3 = z;
                bs0VarB = bs0Var;
                rj7Var = pj7Var;
                t89Var3 = t89Var;
            }
            int i6 = i3;
            dd4Var.r();
            boolean zB = ((c73) dd4Var.j(b73.a)).b();
            if (zB) {
                dd4Var.f0(-47917011);
                rj7 rj7Var3 = cs0.a;
                ur9 ur9Var = s96.a;
                bs0 bs0VarA = cs0.a(((q96) dd4Var.j(ur9Var)).a.p, ((q96) dd4Var.j(ur9Var)).a.q, 0L, 0L, dd4Var, 12);
                dd4Var.q(false);
                bs0Var3 = bs0VarA;
            } else {
                dd4Var.f0(-47743566);
                dd4Var.q(false);
                bs0Var3 = bs0VarB;
            }
            if (zB) {
                dd4Var.f0(-47675862);
                wm0Var = new wm0(1.0f, new xk9(((q96) dd4Var.j(s96.a)).a.q));
                dd4Var.q(false);
            } else {
                dd4Var.f0(-47540268);
                dd4Var.q(false);
                wm0Var = null;
            }
            wm0 wm0Var2 = wm0Var;
            yb4Var3 = yb4Var;
            boolean z4 = z3;
            pj7 pj7Var3 = rj7Var;
            t89 t89Var4 = t89Var3;
            lc5.d(ib4Var, ou6Var, z4, t89Var4, bs0Var3, null, wm0Var2, pj7Var3, jf0.G(-1127137310, new qz0(5, yb4Var3, yb4Var2), dd4Var), dd4Var, ((i6 >> 21) & 14) | 805306368 | ((i6 >> 3) & Token.ASSIGN_MOD) | 12583296, 288);
            z2 = z4;
            t89Var2 = t89Var4;
            pj7Var2 = pj7Var3;
            bs0Var2 = bs0VarB;
        } else {
            yb4Var3 = yb4Var;
            dd4Var.Y();
            z2 = z;
            bs0Var2 = bs0Var;
            pj7Var2 = pj7Var;
            t89Var2 = t89Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new is0(z2, bs0Var2, ou6Var, pj7Var2, t89Var2, yb4Var3, yb4Var2, ib4Var, i2);
        }
    }

    public static final void p(boolean z, zd1 zd1Var, kb4 kb4Var, zb4 zb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        zd1Var.getClass();
        kb4Var.getClass();
        zb4Var.getClass();
        dd4Var.h0(2097222481);
        int i3 = i2 | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(zd1Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(zb4Var) ? 2048 : 1024);
        if (!dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-534091900);
            fw.q(z, kb4Var, null, true, null, null, ((q96) dd4Var.j(s96.a)).a.p, 0L, 0.0f, 0L, null, jf0.G(-1593321656, new qz0(15, zd1Var, zb4Var), dd4Var), dd4Var, (i3 & 14) | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD), 48, 1972);
            dd4Var2 = dd4Var;
            dd4Var2.q(false);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.f0(-533593699);
            z8.d(z, kb4Var, null, null, null, null, null, null, 0L, 0L, 0.0f, false, false, jf0.G(805383113, new xp5(8, zd1Var, zb4Var), dd4Var2), dd4Var2, (i3 & 14) | ((i3 >> 3) & Token.ASSIGN_MOD), 8188);
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z, zd1Var, kb4Var, zb4Var, i2, 8);
        }
    }

    public static long q() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = r;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i2], Token.EXPORT);
                bArr2[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j2 = jCurrentTimeMillis / 1000;
                    long j3 = jCurrentTimeMillis - (j2 * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j4 = j2 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j4 >> 24);
                    bArr[41] = (byte) (j4 >> 16);
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j6 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i4 = bArr3[1] & 255;
                    long jI = I(24, bArr3);
                    long jI2 = I(32, bArr3);
                    long jI3 = I(40, bArr3);
                    if (b5 == 3) {
                        sy3.m("SNTP: Unsynchronized server");
                    } else if (b6 != 4 && b6 != 5) {
                        sy3.m(dx1.f(b6, "SNTP: Untrusted mode: "));
                    } else if (i4 == 0 || i4 > 15) {
                        sy3.m(dx1.f(i4, "SNTP: Untrusted stratum: "));
                    } else if (jI3 == 0) {
                        sy3.m("SNTP: Zero transmitTime");
                    }
                    long j7 = (j6 + (((jI3 - j6) + (jI2 - jI)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j7;
                } catch (SocketTimeoutException e2) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e2;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e2);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i2++;
                    i3 = i5;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static final htb r(sn5 sn5Var) {
        htb htbVar = sn5Var.B;
        if (htbVar != null) {
            return htbVar;
        }
        throw dx1.c("Required value was null.");
    }

    public static final Set s(m39 m39Var) {
        m39Var.getClass();
        if (m39Var instanceof cx0) {
            return ((cx0) m39Var).b();
        }
        HashSet hashSet = new HashSet(m39Var.f());
        int iF = m39Var.f();
        for (int i2 = 0; i2 < iF; i2++) {
            hashSet.add(m39Var.g(i2));
        }
        return hashSet;
    }

    public static final byte t(char c2) {
        if (c2 < '~') {
            return s21.b[c2];
        }
        return (byte) 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String u(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final m39[] v(List list) {
        m39[] m39VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (m39VarArr = (m39[]) list.toArray(new m39[0])) == null) ? p : m39VarArr;
    }

    public static final ib4 w(kb4 kb4Var, dd4 dd4Var, int i2) {
        int iHashCode = Long.hashCode(dd4Var.T);
        Context context = (Context) dd4Var.j(he.b);
        bd4 bd4VarH0 = fe.h0(dd4Var);
        rs8 rs8Var = (rs8) dd4Var.j(ts8.a);
        View view = (View) dd4Var.j(he.f);
        boolean zH = ((((i2 & 14) ^ 6) > 4 && dd4Var.f(kb4Var)) || (i2 & 6) == 4) | dd4Var.h(context) | dd4Var.h(bd4VarH0) | dd4Var.h(rs8Var) | dd4Var.d(iHashCode) | dd4Var.h(view);
        Object objQ = dd4Var.Q();
        if (zH || objQ == vl1.a) {
            lm lmVar = new lm(context, kb4Var, bd4VarH0, rs8Var, iHashCode, view);
            dd4Var.p0(lmVar);
            objQ = lmVar;
        }
        return (ib4) objQ;
    }

    public static final int x(int i2, int i3, int i4) {
        return (i2 >>> i3) & ((1 << i4) - 1);
    }

    public static final ou6 y(ou6 ou6Var, boolean z, yy6 yy6Var) {
        return ou6Var.e(z ? new l54(yy6Var) : lu6.a);
    }

    public static Drawable z(Context context, int i2) {
        return rl8.c().d(context, i2);
    }
}
