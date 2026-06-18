package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z81 {
    public static final int E;
    public static final int F;
    public static final boolean G;
    public ArrayList A;
    public ArrayList B;
    public final String d;
    public yh3[] e;
    public int f;
    public int[] g;
    public int h;
    public int j;
    public final ep1 k;
    public u81 l;
    public int m;
    public int n;
    public int o;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public int[] w;
    public int x;
    public long[] y;
    public int z;
    public int[] a = null;
    public int b = 0;
    public HashMap c = null;
    public byte[] i = new byte[256];
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public int C = 0;
    public char[] D = new char[64];

    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    static {
        /*
            r0 = 1
            r1 = 50
            r2 = 0
            r3 = 48
            java.lang.Class<z81> r4 = defpackage.z81.class
            java.lang.String r5 = "ClassFileWriter.class"
            java.io.InputStream r4 = r4.getResourceAsStream(r5)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            if (r4 != 0) goto L16
            java.lang.String r4 = "org/mozilla/classfile/ClassFileWriter.class"
            java.io.InputStream r4 = java.lang.ClassLoader.getSystemResourceAsStream(r4)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
        L16:
            if (r4 == 0) goto L4a
            r5 = 8
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L2f
            r7 = r2
        L1d:
            if (r7 >= r5) goto L32
            int r8 = 8 - r7
            int r8 = r4.read(r6, r7, r8)     // Catch: java.lang.Throwable -> L2f
            if (r8 < 0) goto L29
            int r7 = r7 + r8
            goto L1d
        L29:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f
            r5.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L2f:
            r5 = move-exception
            r7 = r2
            goto L65
        L32:
            r7 = 4
            r7 = r6[r7]     // Catch: java.lang.Throwable -> L2f
            int r7 = r7 << r5
            r8 = 5
            r8 = r6[r8]     // Catch: java.lang.Throwable -> L2f
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            r8 = 6
            r8 = r6[r8]     // Catch: java.lang.Throwable -> L48
            int r5 = r8 << 8
            r8 = 7
            r3 = r6[r8]     // Catch: java.lang.Throwable -> L48
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            goto L52
        L48:
            r5 = move-exception
            goto L65
        L4a:
            java.io.PrintStream r5 = java.lang.System.err     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "Warning: Unable to read ClassFileWriter.class, using default bytecode version"
            r5.println(r6)     // Catch: java.lang.Throwable -> L2f
            r7 = r2
        L52:
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L74
            goto L5a
        L58:
            r4 = move-exception
            goto L7c
        L5a:
            defpackage.z81.F = r7
            defpackage.z81.E = r3
            if (r3 < r1) goto L61
            goto L62
        L61:
            r0 = r2
        L62:
            defpackage.z81.G = r0
            return
        L65:
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L74
        L6f:
            throw r5     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L74
        L70:
            r4 = move-exception
            r7 = r2
            goto L7c
        L73:
            r7 = r2
        L74:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "Can't read ClassFileWriter.class to get bytecode version"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L58
            throw r4     // Catch: java.lang.Throwable -> L58
        L7c:
            defpackage.z81.F = r7
            defpackage.z81.E = r3
            if (r3 < r1) goto L83
            goto L84
        L83:
            r0 = r2
        L84:
            defpackage.z81.G = r0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.<clinit>():void");
    }

    public z81(String str, String str2, String str3) {
        this.d = str;
        ep1 ep1Var = new ep1(this);
        this.k = ep1Var;
        this.t = ep1Var.a(str);
        this.u = ep1Var.a(str2);
        if (str3 != null) {
            this.v = ep1Var.i(str3);
        }
        this.s = 33;
    }

    public static void A(int i) {
        throw new IllegalStateException(i < 0 ? dx1.f(i, "Stack underflow: ") : dx1.f(i, "Too big stack: "));
    }

    public static String B(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return str;
        }
        if (cCharAt == 'L') {
            return str.substring(1, str.length() - 1);
        }
        if (cCharAt == 'S' || cCharAt == 'V' || cCharAt == 'I' || cCharAt == 'J' || cCharAt == 'Z' || cCharAt == '[') {
            return str;
        }
        switch (cCharAt) {
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
                return str;
            default:
                gp.l("bad descriptor:".concat(str));
                return null;
        }
    }

    public static int I(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        return i2 + 2;
    }

    public static int J(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        return i2 + 4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[FALL_THROUGH, PHI: r6
  0x00ba: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v6 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:48:0x00a1, B:49:0x00a3, B:50:0x00a5, B:53:0x00ab, B:59:0x00b8, B:55:0x00af, B:56:0x00b1, B:57:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[PHI: r6
  0x00ba: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v6 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:48:0x00a1, B:49:0x00a3, B:50:0x00a5, B:53:0x00ab, B:59:0x00b8, B:55:0x00af, B:56:0x00b1, B:57:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int L(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.L(java.lang.String):int");
    }

    public static int M(int i) {
        if (i == 254 || i == 255) {
            return 0;
        }
        switch (i) {
            case 0:
            case Token.NULL /* 47 */:
            case Token.FALSE /* 49 */:
            case Token.RC /* 95 */:
            case Token.COLON /* 116 */:
            case Token.OR /* 117 */:
            case Token.AND /* 118 */:
            case Token.INC /* 119 */:
            case Token.FOR /* 132 */:
            case Token.CONTINUE /* 134 */:
            case Token.FINALLY /* 138 */:
            case Token.VOID /* 139 */:
            case Token.BLOCK /* 143 */:
            case Token.TARGET /* 145 */:
            case Token.LOOP /* 146 */:
            case Token.EXPR_VOID /* 147 */:
            case Token.LET /* 167 */:
            case Token.SETCONST /* 169 */:
            case Token.METHOD /* 177 */:
            case Token.ARROW /* 178 */:
            case Token.YIELD_STAR /* 179 */:
            case Token.DOTDOTDOT /* 184 */:
            case Token.QUESTION_DOT /* 186 */:
            case 188:
            case 189:
            case 190:
            case 192:
            case 193:
            case 196:
            case Context.VERSION_ES6 /* 200 */:
            case 202:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Token.GETPROPNOWARN /* 34 */:
            case Token.GETPROP_SUPER /* 35 */:
            case Token.GETPROPNOWARN_SUPER /* 36 */:
            case Token.SETPROP /* 37 */:
            case Token.SETELEM_SUPER /* 42 */:
            case Token.CALL /* 43 */:
            case Token.NAME /* 44 */:
            case Token.NUMBER /* 45 */:
            case 89:
            case Token.TRY /* 90 */:
            case Token.SEMI /* 91 */:
            case Token.BREAK /* 133 */:
            case Token.VAR /* 135 */:
            case 140:
            case Token.EMPTY /* 141 */:
            case Token.CONST /* 168 */:
            case Token.LAST_TOKEN /* 187 */:
            case 197:
            case 201:
                return 1;
            case 9:
            case 10:
            case 14:
            case 15:
            case 20:
            case 22:
            case 24:
            case 30:
            case 31:
            case 32:
            case Token.GETPROP /* 33 */:
            case Token.SETPROP_SUPER /* 38 */:
            case Token.GETELEM /* 39 */:
            case Token.GETELEM_SUPER /* 40 */:
            case Token.SETELEM /* 41 */:
            case Token.LB /* 92 */:
            case Token.RB /* 93 */:
            case Token.LC /* 94 */:
                return 2;
            case Token.STRING /* 46 */:
            case Token.THIS /* 48 */:
            case Token.TRUE /* 50 */:
            case Token.SHEQ /* 51 */:
            case Token.SHNE /* 52 */:
            case Token.REGEXP /* 53 */:
            case Token.BINDNAME /* 54 */:
            case Token.RETHROW /* 56 */:
            case Token.INSTANCEOF /* 58 */:
            case Token.LOCAL_LOAD /* 59 */:
            case Token.GETVAR /* 60 */:
            case Token.SETVAR /* 61 */:
            case Token.CATCH_SCOPE /* 62 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
            case Token.THISFN /* 69 */:
            case Token.RETURN_RESULT /* 70 */:
            case Token.DEL_REF /* 75 */:
            case Token.REF_CALL /* 76 */:
            case Token.REF_SPECIAL /* 77 */:
            case Token.YIELD /* 78 */:
            case Token.REF_NAME /* 87 */:
            case Token.LP /* 96 */:
            case Token.COMMA /* 98 */:
            case 100:
            case Token.ASSIGN_BITXOR /* 102 */:
            case Token.ASSIGN_LOGICAL_AND /* 104 */:
            case Token.ASSIGN_RSH /* 106 */:
            case Token.ASSIGN_ADD /* 108 */:
            case 110:
            case Token.ASSIGN_MOD /* 112 */:
            case 114:
            case 120:
            case Token.DOT /* 121 */:
            case Token.FUNCTION /* 122 */:
            case Token.EXPORT /* 123 */:
            case Token.IMPORT /* 124 */:
            case Token.IF /* 125 */:
            case Token.ELSE /* 126 */:
            case Token.CASE /* 128 */:
            case 130:
            case Token.WITH /* 136 */:
            case Token.CATCH /* 137 */:
            case Token.COMPUTED_PROPERTY /* 142 */:
            case Token.LABEL /* 144 */:
            case Token.JSR /* 149 */:
            case 150:
            case Token.SETPROP_OP /* 153 */:
            case Token.SETELEM_OP /* 154 */:
            case Token.LOCAL_BLOCK /* 155 */:
            case Token.SET_REF_OP /* 156 */:
            case Token.DOTDOT /* 157 */:
            case Token.COLONCOLON /* 158 */:
            case 170:
            case Token.ARRAYCOMP /* 171 */:
            case Token.LETEXPR /* 172 */:
            case Token.DEBUGGER /* 174 */:
            case Token.GENEXPR /* 176 */:
            case 180:
            case Token.TEMPLATE_CHARS /* 181 */:
            case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
            case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
            case Token.NULLISH_COALESCING /* 185 */:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                return -1;
            case Token.THROW /* 55 */:
            case Token.IN /* 57 */:
            case Token.ENUM_INIT_KEYS /* 63 */:
            case Token.ENUM_INIT_VALUES /* 64 */:
            case Token.ENUM_INIT_ARRAY /* 65 */:
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ARRAYLIT /* 71 */:
            case Token.OBJECTLIT /* 72 */:
            case Token.GET_REF /* 73 */:
            case Token.SET_REF /* 74 */:
            case Token.REF_NS_NAME /* 88 */:
            case Token.RP /* 97 */:
            case 99:
            case Token.ASSIGN_LOGICAL_OR /* 101 */:
            case Token.ASSIGN_BITAND /* 103 */:
            case Token.ASSIGN_LSH /* 105 */:
            case Token.ASSIGN_URSH /* 107 */:
            case Token.ASSIGN_SUB /* 109 */:
            case Token.ASSIGN_DIV /* 111 */:
            case Token.ASSIGN_EXP /* 113 */:
            case Token.HOOK /* 115 */:
            case Token.SWITCH /* 127 */:
            case Token.DEFAULT /* 129 */:
            case Token.DO /* 131 */:
            case Token.XML /* 159 */:
            case 160:
            case Token.XMLATTR /* 161 */:
            case Token.XMLEND /* 162 */:
            case Token.TO_OBJECT /* 163 */:
            case Token.TO_DOUBLE /* 164 */:
            case Token.GET /* 165 */:
            case Token.SET /* 166 */:
            case Token.WITHEXPR /* 173 */:
            case Token.COMMENT /* 175 */:
                return -2;
            case Token.SUPER /* 79 */:
            case Token.EXP /* 81 */:
            case Token.ESCXMLATTR /* 83 */:
            case Token.ESCXMLTEXT /* 84 */:
            case Token.REF_MEMBER /* 85 */:
            case Token.REF_NS_MEMBER /* 86 */:
            case Token.EXPR_RESULT /* 148 */:
            case Token.TYPEOFNAME /* 151 */:
            case Token.USE_STACK /* 152 */:
                return -3;
            case Token.STRICT_SETNAME /* 80 */:
            case Token.DEFAULTNAMESPACE /* 82 */:
                return -4;
            default:
                gp.l(dx1.f(i, "Bad opcode: "));
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(defpackage.z81 r10) {
        /*
            int r0 = r10.o
            int[] r0 = new int[r0]
            u81 r1 = r10.l
            short r2 = r1.e
            r2 = r2 & 8
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L26
            java.lang.String r2 = "<init>"
            java.lang.String r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1d
            r1 = 6
            r0[r4] = r1
        L1b:
            r1 = r3
            goto L27
        L1d:
            int r1 = r10.t
            int r1 = yib.b(r1)
            r0[r4] = r1
            goto L1b
        L26:
            r1 = r4
        L27:
            u81 r2 = r10.l
            java.lang.String r2 = r2.b
            r5 = 40
            int r5 = r2.indexOf(r5)
            r6 = 41
            int r6 = r2.indexOf(r6)
            if (r5 != 0) goto La7
            if (r6 < 0) goto La7
            int r5 = r5 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L41:
            if (r5 >= r6) goto La6
            char r8 = r2.charAt(r5)
            r9 = 70
            if (r8 == r9) goto L7d
            r9 = 76
            if (r8 == r9) goto L6d
            r9 = 83
            if (r8 == r9) goto L7d
            r9 = 73
            if (r8 == r9) goto L7d
            r9 = 74
            if (r8 == r9) goto L7d
            r9 = 90
            if (r8 == r9) goto L7d
            r9 = 91
            if (r8 == r9) goto L67
            switch(r8) {
                case 66: goto L7d;
                case 67: goto L7d;
                case 68: goto L7d;
                default: goto L66;
            }
        L66:
            goto L86
        L67:
            r7.append(r9)
            int r5 = r5 + 1
            goto L41
        L6d:
            r8 = 59
            int r8 = r2.indexOf(r8, r5)
            int r8 = r8 + r3
            java.lang.String r5 = r2.substring(r5, r8)
            r7.append(r5)
            r5 = r8
            goto L86
        L7d:
            char r8 = r2.charAt(r5)
            r7.append(r8)
            int r5 = r5 + 1
        L86:
            java.lang.String r8 = r7.toString()
            java.lang.String r8 = B(r8)
            ep1 r9 = r10.k
            int r8 = yib.r(r8, r9)
            int r9 = r1 + 1
            r0[r1] = r8
            boolean r8 = yib.u(r8)
            if (r8 == 0) goto La1
            int r1 = r1 + 2
            goto La2
        La1:
            r1 = r9
        La2:
            r7.setLength(r4)
            goto L41
        La6:
            return r0
        La7:
            java.lang.String r10 = "bad method type"
            gp.l(r10)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.a(z81):int[]");
    }

    public final int C(int i) {
        if (i >= 0) {
            gp.l("Bad label, no biscuit");
            return 0;
        }
        int i2 = i & Integer.MAX_VALUE;
        if (i2 < this.x) {
            return this.w[i2];
        }
        gp.l("Bad label");
        return 0;
    }

    public final void D(int i) {
        if (i >= 0) {
            gp.l("Bad label, no biscuit");
            return;
        }
        int i2 = i & Integer.MAX_VALUE;
        if (i2 > this.x) {
            gp.l("Bad label");
            return;
        }
        int[] iArr = this.w;
        if (iArr[i2] == -1) {
            iArr[i2] = this.j;
        } else {
            gp.j("Can only mark label once");
        }
    }

    public final void E(int i, int i2) {
        D(i);
        this.m = i2;
    }

    public final void F(int i, int i2) {
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, i2, this.j);
    }

    public final void G(int i, int i2, int i3) {
        if (i3 < 0 || i3 > this.n) {
            gp.l(dx1.f(i3, "Bad stack index: "));
            return;
        }
        this.m = (short) i3;
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, i2, this.j);
    }

    public final void H(int i) {
        v(this.j);
        this.c.put(Integer.valueOf(this.j), Integer.valueOf(i));
        K(i, -1, this.j);
    }

    public final void K(int i, int i2, int i3) {
        int i4;
        if (i3 < 0 || (i4 = this.j) < i3) {
            gp.l(dx1.f(i3, "Bad jump target: "));
            return;
        }
        if (i2 < -1) {
            gp.l(dx1.f(i2, "Bad case index: "));
            return;
        }
        int i5 = (~i) & 3;
        int i6 = i2 < 0 ? i + 1 + i5 : i + 1 + i5 + ((i2 + 3) * 4);
        if (i < 0 || ((i4 - 16) - i5) - 1 < i) {
            throw new IllegalArgumentException(i + " is outside a possible range of tableswitch in already generated code");
        }
        byte[] bArr = this.i;
        if ((bArr[i] & 255) != 170) {
            throw new IllegalArgumentException(i + " is not offset of tableswitch statement");
        }
        if (i6 < 0 || i4 < i6 + 4) {
            throw new w81(dx1.f(i2, "Too big case index: "));
        }
        J(bArr, i3 - i, i6);
    }

    public final void N(String str, String str2, short s) {
        ep1 ep1Var = this.k;
        short sI = ep1Var.i(str);
        short sI2 = ep1Var.i(str2);
        u81 u81Var = new u81();
        u81Var.a = str;
        u81Var.c = sI;
        u81Var.b = str2;
        u81Var.d = sI2;
        u81Var.e = s;
        this.l = u81Var;
        this.c = new HashMap();
        this.p.add(this.l);
        v(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0480  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(int r20) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.O(int):void");
    }

    public final byte[] P() {
        short sI;
        int i;
        short sI2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.B;
        ep1 ep1Var = this.k;
        if (arrayList3 != null) {
            sI = ep1Var.i("BootstrapMethods");
            i = 1;
        } else {
            sI = 0;
            i = 0;
        }
        int i2 = this.v;
        if (i2 != 0) {
            i++;
            sI2 = ep1Var.i("SourceFile");
        } else {
            sI2 = 0;
        }
        if (i2 != 0) {
            ep1Var.i("SourceFile");
        }
        int i3 = ep1Var.h + 18;
        ArrayList arrayList4 = this.r;
        int size = (arrayList4.size() * 2) + i3 + 2;
        int i4 = 0;
        while (true) {
            arrayList = this.q;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((t81) arrayList.get(i4)).getClass();
            size += 8;
            i4++;
        }
        int length = size + 2;
        int i5 = 0;
        while (true) {
            arrayList2 = this.p;
            if (i5 >= arrayList2.size()) {
                break;
            }
            length += ((u81) arrayList2.get(i5)).f.length + 8;
            i5++;
        }
        int i6 = length + 2;
        if (i2 != 0) {
            i6 = length + 10;
        }
        if (this.B != null) {
            i6 = i6 + 8 + this.C;
        }
        byte[] bArr = new byte[i6];
        int I = I(bArr, (short) ep1Var.i, I(bArr, E, I(bArr, F, J(bArr, -889275714, 0))));
        System.arraycopy(ep1Var.l, 0, bArr, I, ep1Var.h);
        int I2 = I(bArr, arrayList4.size(), I(bArr, this.u, I(bArr, this.t, I(bArr, this.s, I + ep1Var.h))));
        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
            I2 = I(bArr, ((Short) arrayList4.get(i7)).shortValue(), I2);
        }
        int I3 = I(bArr, arrayList.size(), I2);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            t81 t81Var = (t81) arrayList.get(i8);
            I3 = I(bArr, 0, I(bArr, t81Var.b, I(bArr, t81Var.a, I(bArr, t81Var.c, I3))));
        }
        int I4 = I(bArr, arrayList2.size(), I3);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            u81 u81Var = (u81) arrayList2.get(i9);
            int I5 = I(bArr, 1, I(bArr, u81Var.d, I(bArr, u81Var.c, I(bArr, u81Var.e, I4))));
            byte[] bArr2 = u81Var.f;
            System.arraycopy(bArr2, 0, bArr, I5, bArr2.length);
            I4 = I5 + u81Var.f.length;
        }
        int I6 = I(bArr, i, I4);
        if (this.B != null) {
            I6 = I(bArr, this.B.size(), J(bArr, this.C + 2, I(bArr, sI, I6)));
            for (int i10 = 0; i10 < this.B.size(); i10++) {
                v81 v81Var = (v81) this.B.get(i10);
                byte[] bArr3 = v81Var.a;
                System.arraycopy(bArr3, 0, bArr, I6, bArr3.length);
                I6 += v81Var.a.length;
            }
        }
        if (i2 != 0) {
            I6 = I(bArr, i2, J(bArr, 2, I(bArr, sI2, I6)));
        }
        if (I6 == i6) {
            return bArr;
        }
        throw new RuntimeException();
    }

    public final void Q(int i, int i2, int i3) {
        if (i3 == 0) {
            c(i);
            return;
        }
        if (i3 == 1) {
            c(i + 1);
            return;
        }
        if (i3 == 2) {
            c(i + 2);
        } else if (i3 != 3) {
            d(i2, i3);
        } else {
            c(i + 3);
        }
    }

    public final int b() {
        int i = this.x;
        int[] iArr = this.w;
        if (iArr == null || i == iArr.length) {
            if (iArr == null) {
                this.w = new int[32];
            } else {
                int[] iArr2 = new int[iArr.length * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                this.w = iArr2;
            }
        }
        this.x = i + 1;
        this.w[i] = -1;
        return Integer.MIN_VALUE | i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r4) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.c(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.d(int, int):void");
    }

    public final void e(int i, String str) {
        int iM = M(i) + this.m;
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        if (i != 187 && i != 189 && i != 192 && i != 193) {
            gp.l("bad opcode for class reference");
            return;
        }
        short sA = this.k.a(str);
        x(i);
        y(sA);
        short s = (short) iM;
        this.m = s;
        if (iM > this.n) {
            this.n = s;
        }
    }

    public final void f(String str, String str2, int i, String str3) {
        int i2;
        int iM = M(i) + this.m;
        char cCharAt = str3.charAt(0);
        int i3 = (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
        switch (i) {
            case Token.ARROW /* 178 */:
            case 180:
                i2 = iM + i3;
                break;
            case Token.YIELD_STAR /* 179 */:
            case Token.TEMPLATE_CHARS /* 181 */:
                i2 = iM - i3;
                break;
            default:
                gp.l("bad opcode for field reference");
                return;
        }
        if (i2 < 0 || 32767 < i2) {
            A(i2);
            throw null;
        }
        ep1 ep1Var = this.k;
        ep1Var.getClass();
        tu3 tu3Var = new tu3(str, str2, str3);
        HashMap map = ep1Var.d;
        int iIntValue = ((Integer) map.getOrDefault(tu3Var, -1)).intValue();
        if (iIntValue == -1) {
            short sH = ep1Var.h(str2, str3);
            short sA = ep1Var.a(str);
            ep1Var.j(5);
            byte[] bArr = ep1Var.l;
            int i4 = ep1Var.h;
            int i5 = i4 + 1;
            ep1Var.h = i5;
            bArr[i4] = 9;
            int I = I(bArr, sA, i5);
            ep1Var.h = I;
            ep1Var.h = I(ep1Var.l, sH, I);
            iIntValue = ep1Var.i;
            ep1Var.i = iIntValue + 1;
            map.put(tu3Var, Integer.valueOf(iIntValue));
        }
        ep1Var.m(iIntValue, tu3Var);
        ep1Var.k.put(Integer.valueOf(iIntValue), (byte) 9);
        x(i);
        y((short) iIntValue);
        short s = (short) i2;
        this.m = s;
        if (i2 > this.n) {
            this.n = s;
        }
    }

    public final void g(int i) {
        Q(42, 25, i);
    }

    public final void h(int i) {
        Q(75, 58, i);
    }

    public final void i(int i) {
        Q(38, 24, i);
    }

    public final void j(int i, String str, int i2, int i3) {
        if ((i & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            gp.l("Bad startLabel");
            return;
        }
        if ((i2 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            gp.l("Bad endLabel");
            return;
        }
        if ((i3 & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
            gp.l("Bad handlerLabel");
            return;
        }
        short sA = str == null ? (short) 0 : this.k.a(str);
        yh3 yh3Var = new yh3();
        yh3Var.a = i;
        yh3Var.b = i2;
        yh3Var.c = i3;
        yh3Var.d = sA;
        int i4 = this.f;
        if (i4 == 0) {
            this.e = new yh3[4];
        } else {
            yh3[] yh3VarArr = this.e;
            if (i4 == yh3VarArr.length) {
                yh3[] yh3VarArr2 = new yh3[i4 * 2];
                System.arraycopy(yh3VarArr, 0, yh3VarArr2, 0, i4);
                this.e = yh3VarArr2;
            }
        }
        this.e[i4] = yh3Var;
        this.f = i4 + 1;
    }

    public final void k(String str, String str2, short s) {
        ep1 ep1Var = this.k;
        short sI = ep1Var.i(str);
        short sI2 = ep1Var.i(str2);
        t81 t81Var = new t81();
        t81Var.a = sI;
        t81Var.b = sI2;
        t81Var.c = s;
        this.q.add(t81Var);
    }

    public final void l(int i) {
        Q(26, 21, i);
    }

    public final void m(String str, String str2, int i, String str3) {
        int iL = L(str3);
        int i2 = iL >>> 16;
        int iM = M(i) + this.m + ((short) iL);
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        switch (i) {
            case Token.TEMPLATE_LITERAL_SUBST /* 182 */:
            case Token.TAGGED_TEMPLATE_LITERAL /* 183 */:
            case Token.DOTDOTDOT /* 184 */:
            case Token.NULLISH_COALESCING /* 185 */:
                x(i);
                ep1 ep1Var = this.k;
                if (i == 185) {
                    short sH = ep1Var.h(str2, str3);
                    short sA = ep1Var.a(str);
                    ep1Var.j(5);
                    byte[] bArr = ep1Var.l;
                    int i3 = ep1Var.h;
                    int i4 = i3 + 1;
                    ep1Var.h = i4;
                    bArr[i3] = 11;
                    int I = I(bArr, sA, i4);
                    ep1Var.h = I;
                    ep1Var.h = I(ep1Var.l, sH, I);
                    ep1Var.m(ep1Var.i, new tu3(str, str2, str3));
                    ep1Var.k.put(Integer.valueOf(ep1Var.i), (byte) 11);
                    int i5 = ep1Var.i;
                    ep1Var.i = i5 + 1;
                    y((short) i5);
                    x(i2 + 1);
                    x(0);
                } else {
                    y(ep1Var.g(str, str2, str3));
                }
                short s = (short) iM;
                this.m = s;
                if (iM > this.n) {
                    this.n = s;
                    return;
                }
                return;
            default:
                gp.l("bad opcode for method reference");
                return;
        }
    }

    public final void n(short s) {
        if (this.l == null) {
            gp.l("No method to stop");
            return;
        }
        int i = this.h;
        if (i == 0) {
            this.g = new int[16];
        } else {
            int[] iArr = this.g;
            if (i == iArr.length) {
                int[] iArr2 = new int[i * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                this.g = iArr2;
            }
        }
        this.g[i] = (this.j << 16) + s;
        this.h = i + 1;
    }

    public final void o(int i) {
        if (i == 0) {
            c(3);
            return;
        }
        if (i == 1) {
            c(4);
            return;
        }
        if (i == 2) {
            c(5);
            return;
        }
        if (i == 3) {
            c(6);
            return;
        }
        if (i == 4) {
            c(7);
        } else if (i != 5) {
            d(18, this.k.c(i));
        } else {
            c(8);
        }
    }

    public final void p() {
        c(42);
    }

    public final void q(double d) {
        if (d == 0.0d) {
            c(14);
            if (1.0d / d < 0.0d) {
                c(Token.INC);
                return;
            }
            return;
        }
        if (d != 1.0d && d != -1.0d) {
            d(20, this.k.b(d));
            return;
        }
        c(15);
        if (d < 0.0d) {
            c(Token.INC);
        }
    }

    public final void r(int i) {
        byte b = (byte) i;
        if (b != i) {
            short s = (short) i;
            if (s == i) {
                d(17, s);
                return;
            } else {
                o(i);
                return;
            }
        }
        if (i == -1) {
            c(2);
        } else if (i < 0 || i > 5) {
            d(16, b);
        } else {
            c((byte) (i + 3));
        }
    }

    public final void s(String str) {
        int length = str.length();
        ep1 ep1Var = this.k;
        ep1Var.getClass();
        int i = 0;
        int iL = ep1.l(0, length, str);
        if (iL == length) {
            d(18, ep1Var.e(str));
            return;
        }
        e(Token.LAST_TOKEN, "java/lang/StringBuilder");
        c(89);
        r(length);
        m("java/lang/StringBuilder", "<init>", Token.TAGGED_TEMPLATE_LITERAL, "(I)V");
        while (true) {
            c(89);
            d(18, ep1Var.e(str.substring(i, iL)));
            m("java/lang/StringBuilder", "append", Token.TEMPLATE_LITERAL_SUBST, "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
            c(87);
            if (iL == length) {
                m("java/lang/StringBuilder", "toString", Token.TEMPLATE_LITERAL_SUBST, "()Ljava/lang/String;");
                return;
            } else {
                int i2 = iL;
                iL = ep1.l(iL, length, str);
                i = i2;
            }
        }
    }

    public final void t(boolean z) {
        c(z ? 4 : 3);
    }

    public final int u(int i) {
        if (this.l == null) {
            gp.l("No method to add to");
            return 0;
        }
        int i2 = this.j;
        int i3 = i + i2;
        byte[] bArr = this.i;
        if (i3 > bArr.length) {
            int length = bArr.length * 2;
            if (i3 > length) {
                length = i3;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.i = bArr2;
        }
        this.j = i3;
        return i2;
    }

    public final void v(int i) {
        if (G) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[4];
            } else {
                int length = iArr.length;
                int i2 = this.b;
                if (length == i2) {
                    int[] iArr2 = new int[i2 * 2];
                    System.arraycopy(iArr, 0, iArr2, 0, i2);
                    this.a = iArr2;
                }
            }
            int[] iArr3 = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            iArr3[i3] = i;
        }
    }

    public final int w(int i, int i2) {
        byte[] bArr;
        if (i > i2) {
            throw new w81(xv5.o("Bad bounds: ", i, i2, " "));
        }
        int iM = M(170) + this.m;
        if (iM < 0 || 32767 < iM) {
            A(iM);
            throw null;
        }
        int i3 = (~this.j) & 3;
        int iU = u((((i2 - i) + 4) * 4) + i3 + 1);
        int i4 = iU + 1;
        this.i[iU] = -86;
        while (true) {
            bArr = this.i;
            if (i3 == 0) {
                break;
            }
            bArr[i4] = 0;
            i3--;
            i4++;
        }
        J(this.i, i2, J(bArr, i, i4 + 4));
        short s = (short) iM;
        this.m = s;
        if (iM > this.n) {
            this.n = s;
        }
        return iU;
    }

    public final void x(int i) {
        this.i[u(1)] = (byte) i;
    }

    public final void y(int i) {
        I(this.i, i, u(2));
    }

    public final void z() {
        int i = this.m - 1;
        if (i < 0 || 32767 < i) {
            A(i);
            throw null;
        }
        short s = (short) i;
        this.m = s;
        if (i > this.n) {
            this.n = s;
        }
    }
}
