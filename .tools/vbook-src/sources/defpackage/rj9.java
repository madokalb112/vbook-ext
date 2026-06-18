package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import java.io.EOFException;
import java.io.Serializable;
import java.util.ArrayList;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rj9 {
    public static p35 a;

    public static int A(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static t90 B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new t90(h10.m(view));
        }
        return null;
    }

    public static boolean C(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static p0a D(p0a p0aVar) {
        return ((p0aVar instanceof r0a) || (p0aVar instanceof q0a)) ? p0aVar : p0aVar instanceof Serializable ? new q0a(p0aVar) : new r0a(p0aVar);
    }

    public static final String E(jl9 jl9Var) {
        jl9Var.getClass();
        jl9Var.request(Long.MAX_VALUE);
        return y(jl9Var.b(), jl9Var.b().c);
    }

    public static final a95 F(s85 s85Var) {
        return new a95(s85Var.a, s85Var.b, s85Var.c, s85Var.d);
    }

    public static String G(int i) {
        return i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(so9 r4, defpackage.b69 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cva
            if (r0 == 0) goto L13
            r0 = r6
            cva r0 = (defpackage.cva) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cva r0 = new cva
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            b69 r5 = r0.a
            defpackage.e11.e0(r6)     // Catch: defpackage.wua -> L28
            return r6
        L28:
            r4 = move-exception
            goto L47
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L30:
            defpackage.e11.e0(r6)
            r0.a = r5     // Catch: defpackage.wua -> L28
            r0.c = r3     // Catch: defpackage.wua -> L28
            bva r6 = new bva     // Catch: defpackage.wua -> L28
            r1 = 0
            r6.<init>(r5, r4, r2, r1)     // Catch: defpackage.wua -> L28
            java.lang.Object r4 = defpackage.wx1.a0(r6, r0)     // Catch: defpackage.wua -> L28
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L46
            return r5
        L46:
            return r4
        L47:
            int r6 = r4.b
            int r5 = r5.hashCode()
            if (r6 != r5) goto L50
            return r2
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj9.H(so9, b69, kt1):java.lang.Object");
    }

    public static final void I(qe8 qe8Var, int i) {
        String strY;
        wq0 wq0Var = qe8Var.c;
        if (i < 0 || i > 1114111) {
            StringBuilder sb = new StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
            if (i != 0) {
                char[] cArr = kl8.B;
                int i2 = 0;
                char c = cArr[0];
                char[] cArr2 = {c, c, c, c, c, c, cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i2 < 8 && cArr2[i2] == '0') {
                    i2++;
                }
                strY = iw9.y(cArr2, i2, 8);
            } else {
                strY = "0";
            }
            sb.append(strY);
            sb.append(" (");
            sb.append(i);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        }
        if (i < 128) {
            wq0Var.M((byte) i);
        } else if (i < 2048) {
            nz8 nz8VarA0 = wq0Var.a0(2);
            byte[] bArr = nz8VarA0.a;
            int i3 = nz8VarA0.c;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i & 63) | Token.CASE);
            nz8VarA0.c = i3 + 2;
            wq0Var.c += 2;
        } else if (55296 <= i && i < 57344) {
            wq0Var.M((byte) 63);
        } else if (i < 65536) {
            nz8 nz8VarA02 = wq0Var.a0(3);
            byte[] bArr2 = nz8VarA02.a;
            int i4 = nz8VarA02.c;
            bArr2[i4] = -32;
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | Token.CASE);
            bArr2[i4 + 2] = (byte) ((i & 63) | Token.CASE);
            nz8VarA02.c = i4 + 3;
            wq0Var.c += 3;
        } else {
            nz8 nz8VarA03 = wq0Var.a0(4);
            byte[] bArr3 = nz8VarA03.a;
            int i5 = nz8VarA03.c;
            bArr3[i5] = -16;
            bArr3[i5 + 1] = -128;
            bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | Token.CASE);
            bArr3[i5 + 3] = (byte) ((i & 63) | Token.CASE);
            nz8VarA03.c = i5 + 4;
            wq0Var.c += 4;
        }
        qe8Var.t0();
    }

    public static final void J(bg9 bg9Var, String str, int i, int i2) {
        char cCharAt;
        long j;
        long j2;
        str.getClass();
        kl8.Q(str.length(), i, i2);
        wq0 wq0VarB = bg9Var.b();
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                nz8 nz8VarA0 = wq0VarB.a0(1);
                byte[] bArr = nz8VarA0.a;
                int i3 = -i;
                int iMin = Math.min(i2, nz8VarA0.a() + i);
                int i4 = i + 1;
                bArr[nz8VarA0.c + i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[nz8VarA0.c + i + i3] = (byte) cCharAt;
                }
                int i5 = i3 + i;
                if (i5 == 1) {
                    nz8VarA0.c += i5;
                    wq0VarB.c += (long) i5;
                } else {
                    if (i5 < 0 || i5 > nz8VarA0.a()) {
                        StringBuilder sbU = xv5.u(i5, "Invalid number of bytes written: ", ". Should be in 0..");
                        sbU.append(nz8VarA0.a());
                        throw new IllegalStateException(sbU.toString().toString());
                    }
                    if (i5 != 0) {
                        nz8VarA0.c += i5;
                        wq0VarB.c += (long) i5;
                    } else if (i12.T(nz8VarA0)) {
                        wq0VarB.N();
                    }
                }
            } else {
                if (cCharAt2 < 2048) {
                    nz8 nz8VarA02 = wq0VarB.a0(2);
                    byte b = (byte) ((cCharAt2 >> 6) | 192);
                    byte b2 = (byte) ((cCharAt2 & '?') | Token.CASE);
                    byte[] bArr2 = nz8VarA02.a;
                    int i6 = nz8VarA02.c;
                    bArr2[i6] = b;
                    bArr2[i6 + 1] = b2;
                    nz8VarA02.c = i6 + 2;
                    j = wq0VarB.c;
                    j2 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    nz8 nz8VarA03 = wq0VarB.a0(3);
                    byte b3 = (byte) ((cCharAt2 >> '\f') | 224);
                    byte b4 = (byte) ((63 & (cCharAt2 >> 6)) | Token.CASE);
                    byte b5 = (byte) ((cCharAt2 & '?') | Token.CASE);
                    byte[] bArr3 = nz8VarA03.a;
                    int i7 = nz8VarA03.c;
                    bArr3[i7] = b3;
                    bArr3[i7 + 1] = b4;
                    bArr3[i7 + 2] = b5;
                    nz8VarA03.c = i7 + 3;
                    j = wq0VarB.c;
                    j2 = 3;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        wq0VarB.M((byte) 63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + Parser.ARGC_LIMIT;
                        nz8 nz8VarA04 = wq0VarB.a0(4);
                        byte b6 = (byte) ((i9 >> 18) | 240);
                        byte b7 = (byte) (((i9 >> 12) & 63) | Token.CASE);
                        byte b8 = (byte) (((i9 >> 6) & 63) | Token.CASE);
                        byte b9 = (byte) ((i9 & 63) | Token.CASE);
                        byte[] bArr4 = nz8VarA04.a;
                        int i10 = nz8VarA04.c;
                        bArr4[i10] = b6;
                        bArr4[i10 + 1] = b7;
                        bArr4[i10 + 2] = b8;
                        bArr4[i10 + 3] = b9;
                        nz8VarA04.c = i10 + 4;
                        wq0VarB.c += 4;
                        i += 2;
                    }
                }
                wq0VarB.c = j + j2;
                i++;
            }
        }
        bg9Var.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:1003:0x1728  */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x173c  */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x173e  */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x174c  */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x1791  */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x17a1  */
    /* JADX WARN: Removed duplicated region for block: B:1021:0x17a3  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x17ad  */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x17c0  */
    /* JADX WARN: Removed duplicated region for block: B:1029:0x17c2  */
    /* JADX WARN: Removed duplicated region for block: B:1035:0x17d8  */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x17ea  */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x17ec  */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x1803  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x1828  */
    /* JADX WARN: Removed duplicated region for block: B:1054:0x183f  */
    /* JADX WARN: Removed duplicated region for block: B:1055:0x1841  */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x185a  */
    /* JADX WARN: Removed duplicated region for block: B:1064:0x186d  */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x186f  */
    /* JADX WARN: Removed duplicated region for block: B:1069:0x187a  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x188f  */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x1891  */
    /* JADX WARN: Removed duplicated region for block: B:1077:0x189c  */
    /* JADX WARN: Removed duplicated region for block: B:1080:0x18cf  */
    /* JADX WARN: Removed duplicated region for block: B:1083:0x1902  */
    /* JADX WARN: Removed duplicated region for block: B:1084:0x1905  */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x1914  */
    /* JADX WARN: Removed duplicated region for block: B:1093:0x1927  */
    /* JADX WARN: Removed duplicated region for block: B:1096:0x1937  */
    /* JADX WARN: Removed duplicated region for block: B:1097:0x193a  */
    /* JADX WARN: Removed duplicated region for block: B:1101:0x1944  */
    /* JADX WARN: Removed duplicated region for block: B:1104:0x1954  */
    /* JADX WARN: Removed duplicated region for block: B:1105:0x1957  */
    /* JADX WARN: Removed duplicated region for block: B:1109:0x1961  */
    /* JADX WARN: Removed duplicated region for block: B:1112:0x1971  */
    /* JADX WARN: Removed duplicated region for block: B:1113:0x1974  */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x197e  */
    /* JADX WARN: Removed duplicated region for block: B:1120:0x1990  */
    /* JADX WARN: Removed duplicated region for block: B:1122:0x1995  */
    /* JADX WARN: Removed duplicated region for block: B:1126:0x19a0  */
    /* JADX WARN: Removed duplicated region for block: B:1129:0x19b2  */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x19b7  */
    /* JADX WARN: Removed duplicated region for block: B:1135:0x19c2  */
    /* JADX WARN: Removed duplicated region for block: B:1138:0x19dd  */
    /* JADX WARN: Removed duplicated region for block: B:1139:0x19e0  */
    /* JADX WARN: Removed duplicated region for block: B:1145:0x19ef  */
    /* JADX WARN: Removed duplicated region for block: B:1148:0x1a1d  */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x1a20  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x1a38  */
    /* JADX WARN: Removed duplicated region for block: B:1155:0x1a4a  */
    /* JADX WARN: Removed duplicated region for block: B:1156:0x1a4d  */
    /* JADX WARN: Removed duplicated region for block: B:1162:0x1a5b  */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x1a6c  */
    /* JADX WARN: Removed duplicated region for block: B:1169:0x1a76  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0c8a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0cab  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0cc0  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0d8b  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0d9c  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0dd7  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0dd9  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0dfe  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0e08  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0e62  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0e7c  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0e9b  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0ee4  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0ef5  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0ef7  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0f00  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0f10  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0f1c  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0f26  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0f51  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0f70  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0f7b  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0f8b  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0f8f  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0fbf  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0ff1  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0ffa  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x100a  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x100c  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x1015  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x1028  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x1048  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x104c  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x1056  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x1066  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x106a  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x1074  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x1084  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x10a5  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x10af  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x1128  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x113d  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x113f  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1154  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x116b  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x116d  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x118d  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x1190  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x11af  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x11b3  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x11de  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x1200  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x1218  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x121a  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x1224  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x1242  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x1251  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x1255  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x1262  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x1271  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x1275  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x1282  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x12cb  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x12cd  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x12db  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x1302  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x1312  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x1314  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x131d  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x132c  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x132e  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x1337  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x1346  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x1348  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x1351  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x1365  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x1367  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x1375  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x13c1  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x13d5  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x13d7  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x13e1  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x141b  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x142b  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x142d  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x1436  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x1471  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x149d  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x14c3  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x14c5  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x14cf  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x14df  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x14e1  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x14ea  */
    /* JADX WARN: Removed duplicated region for block: B:878:0x1504  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x1506  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1510  */
    /* JADX WARN: Removed duplicated region for block: B:886:0x1527  */
    /* JADX WARN: Removed duplicated region for block: B:887:0x1529  */
    /* JADX WARN: Removed duplicated region for block: B:891:0x1532  */
    /* JADX WARN: Removed duplicated region for block: B:894:0x1546  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x1548  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x1551  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x1565  */
    /* JADX WARN: Removed duplicated region for block: B:904:0x1569  */
    /* JADX WARN: Removed duplicated region for block: B:908:0x1578  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x1589  */
    /* JADX WARN: Removed duplicated region for block: B:912:0x158b  */
    /* JADX WARN: Removed duplicated region for block: B:916:0x1594  */
    /* JADX WARN: Removed duplicated region for block: B:920:0x15c3  */
    /* JADX WARN: Removed duplicated region for block: B:923:0x15d3  */
    /* JADX WARN: Removed duplicated region for block: B:924:0x15d5  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x15de  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x15ee  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x15f0  */
    /* JADX WARN: Removed duplicated region for block: B:936:0x15f9  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x1608  */
    /* JADX WARN: Removed duplicated region for block: B:940:0x160a  */
    /* JADX WARN: Removed duplicated region for block: B:944:0x1613  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x1622  */
    /* JADX WARN: Removed duplicated region for block: B:948:0x1624  */
    /* JADX WARN: Removed duplicated region for block: B:952:0x162d  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x1641  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x1643  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x164d  */
    /* JADX WARN: Removed duplicated region for block: B:963:0x165c  */
    /* JADX WARN: Removed duplicated region for block: B:965:0x1660  */
    /* JADX WARN: Removed duplicated region for block: B:969:0x166a  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x167e  */
    /* JADX WARN: Removed duplicated region for block: B:973:0x1680  */
    /* JADX WARN: Removed duplicated region for block: B:977:0x168a  */
    /* JADX WARN: Removed duplicated region for block: B:981:0x16c4  */
    /* JADX WARN: Removed duplicated region for block: B:984:0x16d5  */
    /* JADX WARN: Removed duplicated region for block: B:985:0x16d7  */
    /* JADX WARN: Removed duplicated region for block: B:989:0x16e0  */
    /* JADX WARN: Removed duplicated region for block: B:992:0x16f1  */
    /* JADX WARN: Removed duplicated region for block: B:993:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:999:0x16ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.t27 r99, final defpackage.hra r100, defpackage.xga r101, defpackage.yba r102, defpackage.lra r103, defpackage.aoa r104, pj7 r105, ou6 r106, dd4 r107, int r108) {
        /*
            Method dump skipped, instruction units count: 6833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj9.a(t27, hra, xga, yba, lra, aoa, pj7, ou6, dd4, int):void");
    }

    public static final boolean b(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final void c(a07 a07Var, boolean z) {
        a07Var.setValue(Boolean.valueOf(z));
    }

    public static final boolean d(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean e(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final void f(a07 a07Var, boolean z) {
        a07Var.setValue(Boolean.valueOf(z));
    }

    public static final boolean g(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean h(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean i(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean j(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean k(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean l(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final fba m(a07 a07Var) {
        return (fba) a07Var.getValue();
    }

    public static final nca n(a07 a07Var) {
        return (nca) a07Var.getValue();
    }

    public static final zja o(a07 a07Var) {
        return (zja) a07Var.getValue();
    }

    public static final eda p(a07 a07Var) {
        return (eda) a07Var.getValue();
    }

    public static final bha q(a07 a07Var) {
        return (bha) a07Var.getValue();
    }

    public static final fia r(a07 a07Var) {
        return (fia) a07Var.getValue();
    }

    public static final epa s(a07 a07Var) {
        return (epa) a07Var.getValue();
    }

    public static final String t(a07 a07Var) {
        return (String) a07Var.getValue();
    }

    public static final oja u(a07 a07Var) {
        return (oja) a07Var.getValue();
    }

    public static final void v(int i, nba nbaVar, nca ncaVar, xja xjaVar, sw8 sw8Var, lra lraVar, jka jkaVar, aoa aoaVar, zja zjaVar, kba kbaVar, u4b u4bVar, pj7 pj7Var, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2, int i3) {
        int i4;
        nba nbaVar2;
        nca ncaVar2;
        xja xjaVar2;
        sw8 sw8Var2;
        int i5;
        ou6 ou6Var2;
        dd4Var.h0(-909576630);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            nbaVar2 = nbaVar;
            i4 |= dd4Var.f(nbaVar2) ? 32 : 16;
        } else {
            nbaVar2 = nbaVar;
        }
        if ((i2 & 384) == 0) {
            ncaVar2 = ncaVar;
            i4 |= dd4Var.f(ncaVar2) ? 256 : Token.CASE;
        } else {
            ncaVar2 = ncaVar;
        }
        if ((i2 & 3072) == 0) {
            xjaVar2 = xjaVar;
            i4 |= dd4Var.f(xjaVar2) ? 2048 : 1024;
        } else {
            xjaVar2 = xjaVar;
        }
        if ((i2 & 24576) == 0) {
            sw8Var2 = sw8Var;
            i4 |= dd4Var.f(sw8Var2) ? 16384 : 8192;
        } else {
            sw8Var2 = sw8Var;
        }
        int i6 = i2 & 196608;
        int i7 = Parser.ARGC_LIMIT;
        if (i6 == 0) {
            i4 |= dd4Var.f(lraVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.f(jkaVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.f(aoaVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.f(zjaVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.f(kbaVar) ? 536870912 : 268435456;
        }
        if ((i3 & 48) == 0) {
            i5 = i3 | (dd4Var.f(pj7Var) ? 32 : 16);
        } else {
            i5 = i3;
        }
        if ((i3 & 384) == 0) {
            ou6Var2 = ou6Var;
            i5 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dd4Var.h(kb4Var2)) {
                i7 = 131072;
            }
            i5 |= i7;
        }
        if (!dd4Var.V(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 74897) == 74896) ? false : true)) {
            dd4Var.Y();
        } else if (i == 0) {
            dd4Var.f0(-248011993);
            pu1.c(nbaVar2, ncaVar2, xjaVar2, sw8Var2, lraVar, jkaVar, aoaVar, zjaVar, kbaVar, pj7Var, ou6Var2, ib4Var, kb4Var, kb4Var2, dd4Var, ((i4 >> 3) & 268435454) | ((i5 << 24) & 1879048192), (i5 >> 6) & 8190);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-247246045);
            p7c.y(i, nbaVar, ncaVar, xjaVar, sw8Var, lraVar, jkaVar, aoaVar, zjaVar, kbaVar, pj7Var, ou6Var, ib4Var, kb4Var, kb4Var2, dd4Var, i4 & 2147483646, (i5 >> 3) & 65534);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il7(i, nbaVar, ncaVar, xjaVar, sw8Var, lraVar, jkaVar, aoaVar, zjaVar, kbaVar, u4bVar, pj7Var, ou6Var, ib4Var, kb4Var, kb4Var2, i2, i3);
        }
    }

    public static final ArrayList w(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e8c e8cVar = (e8c) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", e8cVar.a);
            bundle.putLong("event_timestamp", e8cVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final String y(wq0 wq0Var, long j) {
        if (j == 0) {
            return "";
        }
        nz8 nz8Var = wq0Var.a;
        if (nz8Var == null) {
            gp.j("Unreacheable");
            return null;
        }
        if (nz8Var.b() < j) {
            byte[] bArrS = qn9.s(wq0Var, (int) j);
            return zib.d(bArrS, 0, bArrS.length);
        }
        byte[] bArr = nz8Var.a;
        int i = nz8Var.b;
        String strD = zib.d(bArr, i, Math.min(nz8Var.c, ((int) j) + i));
        wq0Var.skip(j);
        return strD;
    }

    public static final int z(wq0 wq0Var) throws EOFException {
        int i;
        int i2;
        int i3;
        wq0Var.v(1L);
        byte bP = wq0Var.p(0L);
        if ((bP & 128) == 0) {
            i = bP & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bP & 224) == 192) {
            i = bP & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bP & 240) == 224) {
            i = bP & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bP & 248) != 240) {
                wq0Var.skip(1L);
                return 65533;
            }
            i = bP & 7;
            i2 = 4;
            i3 = Parser.ARGC_LIMIT;
        }
        long j = i2;
        if (wq0Var.c < j) {
            StringBuilder sbU = xv5.u(i2, "size < ", ": ");
            sbU.append(wq0Var.c);
            sbU.append(" (to read code point prefixed 0x");
            char[] cArr = kl8.B;
            sbU.append(new String(new char[]{cArr[(bP >> 4) & 15], cArr[bP & 15]}));
            sbU.append(')');
            throw new EOFException(sbU.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bP2 = wq0Var.p(j2);
            if ((bP2 & 192) != 128) {
                wq0Var.skip(j2);
                return 65533;
            }
            i = (i << 6) | (bP2 & 63);
        }
        wq0Var.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public abstract void x();
}
