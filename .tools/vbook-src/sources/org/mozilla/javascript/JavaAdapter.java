package org.mozilla.javascript;

import defpackage.dx1;
import defpackage.k27;
import defpackage.y5;
import defpackage.z81;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.optimizer.Signatures;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class JavaAdapter implements IdFunctionCall {
    private static final Object FTAG = "JavaAdapter";
    private static final int Id_JavaAdapter = 1;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static class JavaAdapterSignature {
        Class<?>[] interfaces;
        Map<String, Integer> names;
        Class<?> superClass;

        public JavaAdapterSignature(Class<?> cls, Class<?>[] clsArr, Map<String, Integer> map) {
            this.superClass = cls;
            this.interfaces = clsArr;
            this.names = map;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof JavaAdapterSignature)) {
                return false;
            }
            JavaAdapterSignature javaAdapterSignature = (JavaAdapterSignature) obj;
            if (this.superClass != javaAdapterSignature.superClass) {
                return false;
            }
            Class<?>[] clsArr = this.interfaces;
            Class<?>[] clsArr2 = javaAdapterSignature.interfaces;
            if (clsArr != clsArr2) {
                if (clsArr.length != clsArr2.length) {
                    return false;
                }
                int i = 0;
                while (true) {
                    Class<?>[] clsArr3 = this.interfaces;
                    if (i >= clsArr3.length) {
                        break;
                    }
                    if (clsArr3[i] != javaAdapterSignature.interfaces[i]) {
                        return false;
                    }
                    i++;
                }
            }
            if (this.names.size() != javaAdapterSignature.names.size()) {
                return false;
            }
            for (Map.Entry<String, Integer> entry : this.names.entrySet()) {
                String key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                if (iIntValue != javaAdapterSignature.names.getOrDefault(key, Integer.valueOf(iIntValue + 1)).intValue()) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.names.size() ^ (this.superClass.hashCode() + Arrays.hashCode(this.interfaces));
        }
    }

    public static int appendMethodSignature(Class<?>[] clsArr, Class<?> cls, StringBuilder sb) {
        sb.append('(');
        int length = clsArr.length + 1;
        for (Class<?> cls2 : clsArr) {
            appendTypeString(sb, cls2);
            if (cls2 == Long.TYPE || cls2 == Double.TYPE) {
                length++;
            }
        }
        sb.append(')');
        appendTypeString(sb, cls);
        return length;
    }

    private static void appendOverridableMethods(Class<?> cls, List<Method> list, Set<String> set) {
        for (Method method : cls.isInterface() ? cls.getMethods() : cls.getDeclaredMethods()) {
            String strN = tw2.n(method.getName(), getMethodSignature(method, method.getParameterTypes()));
            if (!set.contains(strN)) {
                int modifiers = method.getModifiers();
                if (!Modifier.isStatic(modifiers)) {
                    if (Modifier.isFinal(modifiers)) {
                        set.add(strN);
                    } else if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                        list.add(method);
                        set.add(strN);
                    }
                }
            }
        }
    }

    private static StringBuilder appendTypeString(StringBuilder sb, Class<?> cls) {
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            sb.append(cls == Boolean.TYPE ? 'Z' : cls == Long.TYPE ? 'J' : Character.toUpperCase(cls.getName().charAt(0)));
            return sb;
        }
        sb.append('L');
        sb.append(cls.getName().replace('.', '/'));
        sb.append(';');
        return sb;
    }

    public static Object callMethod(ContextFactory contextFactory, final Scriptable scriptable, final Function function, final Object[] objArr, final long j) {
        if (function == null) {
            return null;
        }
        if (contextFactory == null) {
            contextFactory = ContextFactory.getGlobal();
        }
        final Scriptable parentScope = function.getParentScope();
        if (j == 0) {
            return Context.call(contextFactory, function, parentScope, scriptable, objArr);
        }
        Context currentContext = Context.getCurrentContext();
        return currentContext != null ? doCall(currentContext, parentScope, scriptable, function, objArr, j) : contextFactory.call(new ContextAction() { // from class: nd5
            @Override // org.mozilla.javascript.ContextAction
            public final Object run(Context context) {
                return JavaAdapter.lambda$callMethod$0(parentScope, scriptable, function, objArr, j, context);
            }
        });
    }

    public static Object convertResult(Object obj, Class<?> cls) {
        if (obj != Undefined.instance || cls == ScriptRuntime.ObjectClass || cls == ScriptRuntime.StringClass) {
            return Context.jsToJava(obj, cls);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] createAdapterCode(java.util.Map<java.lang.String, java.lang.Integer> r19, java.lang.String r20, java.lang.Class<?> r21, java.lang.Class<?>[] r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaAdapter.createAdapterCode(java.util.Map, java.lang.String, java.lang.Class, java.lang.Class[], java.lang.String):byte[]");
    }

    public static Scriptable createAdapterWrapper(Scriptable scriptable, Object obj) {
        NativeJavaObject nativeJavaObject = new NativeJavaObject(ScriptableObject.getTopLevelScope(scriptable), obj, null, true);
        nativeJavaObject.setPrototype(scriptable);
        return nativeJavaObject;
    }

    private static Object doCall(Context context, Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objArr, long j) {
        for (int i = 0; i != objArr.length; i++) {
            if (0 != (((long) (1 << i)) & j)) {
                Object obj = objArr[i];
                if (!(obj instanceof Scriptable)) {
                    objArr[i] = context.getWrapFactory().wrap(context, scriptable, obj, null);
                }
            }
        }
        return function.call(context, scriptable, scriptable2, objArr);
    }

    private static void generateCtor(z81 z81Var, String str, String str2, Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int iGeneratePushParam = 3;
        if (parameterTypes.length == 0) {
            z81Var.N("<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;)V", (short) 1);
            z81Var.c(42);
            z81Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        } else {
            StringBuilder sb = new StringBuilder("(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;");
            int length = sb.length();
            for (Class<?> cls : parameterTypes) {
                appendTypeString(sb, cls);
            }
            sb.append(")V");
            z81Var.N("<init>", sb.toString(), (short) 1);
            z81Var.c(42);
            for (Class<?> cls2 : parameterTypes) {
                iGeneratePushParam += generatePushParam(z81Var, iGeneratePushParam, cls2);
            }
            sb.delete(1, length);
            z81Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, sb.toString());
        }
        z81Var.c(42);
        z81Var.c(43);
        z81Var.f(str, "delegee", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(42);
        z81Var.c(44);
        z81Var.f(str, "factory", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/ContextFactory;");
        z81Var.c(42);
        z81Var.c(43);
        z81Var.c(42);
        z81Var.m("org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        z81Var.f(str, "self", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(Token.METHOD);
        z81Var.O(iGeneratePushParam);
    }

    private static void generateEmptyCtor(z81 z81Var, String str, String str2, String str3) {
        z81Var.N("<init>", "()V", (short) 1);
        z81Var.c(42);
        z81Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        z81Var.c(42);
        z81Var.c(1);
        z81Var.f(str, "factory", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/ContextFactory;");
        z81Var.e(Token.LAST_TOKEN, str3);
        z81Var.c(89);
        z81Var.m(str3, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        z81Var.m("org/mozilla/javascript/JavaAdapter", "runScript", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Script;)Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(76);
        z81Var.c(42);
        z81Var.c(43);
        z81Var.f(str, "delegee", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(42);
        z81Var.c(43);
        z81Var.c(42);
        z81Var.m("org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
        z81Var.f(str, "self", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(Token.METHOD);
        z81Var.O(2);
    }

    private static void generateMethod(z81 z81Var, String str, String str2, Class<?>[] clsArr, Class<?> cls, boolean z) {
        StringBuilder sb = new StringBuilder();
        int iAppendMethodSignature = appendMethodSignature(clsArr, cls, sb);
        z81Var.N(str2, sb.toString(), (short) 1);
        z81Var.c(42);
        z81Var.f(str, "factory", 180, "Lorg/mozilla/javascript/ContextFactory;");
        z81Var.c(42);
        z81Var.f(str, "self", 180, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(42);
        z81Var.f(str, "delegee", 180, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.s(str2);
        z81Var.m("org/mozilla/javascript/JavaAdapter", "getFunction", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Lorg/mozilla/javascript/Function;");
        generatePushWrappedArgs(z81Var, clsArr, clsArr.length);
        if (clsArr.length > 64) {
            throw Context.reportRuntimeErrorById("JavaAdapter can not subclass methods with more then 64 arguments.", new Object[0]);
        }
        long j = 0;
        for (int i = 0; i != clsArr.length; i++) {
            if (!clsArr[i].isPrimitive()) {
                j |= (long) (1 << i);
            }
        }
        int i2 = (int) j;
        if (i2 == j) {
            z81Var.r(i2);
            z81Var.c(Token.BREAK);
        } else {
            z81Var.d(20, z81Var.k.d(j));
        }
        z81Var.m("org/mozilla/javascript/JavaAdapter", "callMethod", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Function;[Ljava/lang/Object;J)Ljava/lang/Object;");
        generateReturnResult(z81Var, cls, z);
        z81Var.O((short) iAppendMethodSignature);
    }

    private static void generatePopResult(z81 z81Var, Class<?> cls) {
        if (!cls.isPrimitive()) {
            z81Var.c(Token.GENEXPR);
            return;
        }
        char cCharAt = cls.getName().charAt(0);
        if (cCharAt == 'f') {
            z81Var.c(Token.DEBUGGER);
            return;
        }
        if (cCharAt != 'i') {
            if (cCharAt == 'l') {
                z81Var.c(Token.WITHEXPR);
                return;
            } else if (cCharAt != 's' && cCharAt != 'z') {
                switch (cCharAt) {
                    case 'd':
                        z81Var.c(Token.COMMENT);
                        break;
                }
                return;
            }
        }
        z81Var.c(Token.LETEXPR);
    }

    private static int generatePushParam(z81 z81Var, int i, Class<?> cls) {
        if (!cls.isPrimitive()) {
            z81Var.g(i);
            return 1;
        }
        char cCharAt = cls.getName().charAt(0);
        if (cCharAt == 'f') {
            z81Var.Q(34, 23, i);
            return 1;
        }
        if (cCharAt != 'i') {
            if (cCharAt == 'l') {
                z81Var.Q(30, 22, i);
                return 2;
            }
            if (cCharAt != 's' && cCharAt != 'z') {
                switch (cCharAt) {
                    case Token.COMMA /* 98 */:
                    case 'c':
                        break;
                    case 'd':
                        z81Var.i(i);
                        return 2;
                    default:
                        throw Kit.codeBug();
                }
            }
        }
        z81Var.l(i);
        return 1;
    }

    public static void generatePushWrappedArgs(z81 z81Var, Class<?>[] clsArr, int i) {
        z81Var.r(i);
        z81Var.e(189, "java/lang/Object");
        int iGenerateWrapArg = 1;
        for (int i2 = 0; i2 != clsArr.length; i2++) {
            z81Var.c(89);
            z81Var.r(i2);
            iGenerateWrapArg += generateWrapArg(z81Var, iGenerateWrapArg, clsArr[i2]);
            z81Var.c(83);
        }
    }

    public static void generateReturnResult(z81 z81Var, Class<?> cls, boolean z) {
        if (cls == Void.TYPE) {
            z81Var.c(87);
            z81Var.c(Token.METHOD);
            return;
        }
        if (cls == Boolean.TYPE) {
            z81Var.m("org/mozilla/javascript/Context", "toBoolean", Token.DOTDOTDOT, Signatures.MATH_TO_BOOLEAN);
            z81Var.c(Token.LETEXPR);
            return;
        }
        if (cls == Character.TYPE) {
            z81Var.m("org/mozilla/javascript/Context", "toString", Token.DOTDOTDOT, "(Ljava/lang/Object;)Ljava/lang/String;");
            z81Var.c(3);
            z81Var.m("java/lang/String", "charAt", Token.TEMPLATE_LITERAL_SUBST, "(I)C");
            z81Var.c(Token.LETEXPR);
            return;
        }
        if (!cls.isPrimitive()) {
            String name = cls.getName();
            if (z) {
                z81Var.d(18, z81Var.k.e(name));
                z81Var.m("java/lang/Class", "forName", Token.DOTDOTDOT, "(Ljava/lang/String;)Ljava/lang/Class;");
                z81Var.m("org/mozilla/javascript/JavaAdapter", "convertResult", Token.DOTDOTDOT, "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
            }
            z81Var.e(192, name);
            z81Var.c(Token.GENEXPR);
            return;
        }
        z81Var.m("org/mozilla/javascript/Context", "toNumber", Token.DOTDOTDOT, Signatures.MATH_TO_NUMBER);
        char cCharAt = cls.getName().charAt(0);
        if (cCharAt != 'b') {
            if (cCharAt == 'd') {
                z81Var.c(Token.COMMENT);
                return;
            }
            if (cCharAt == 'f') {
                z81Var.c(Token.LABEL);
                z81Var.c(Token.DEBUGGER);
                return;
            } else if (cCharAt != 'i') {
                if (cCharAt == 'l') {
                    z81Var.c(Token.BLOCK);
                    z81Var.c(Token.WITHEXPR);
                    return;
                } else if (cCharAt != 's') {
                    k27.i("Unexpected return type ".concat(String.valueOf(cls)));
                    return;
                }
            }
        }
        z81Var.c(Token.COMPUTED_PROPERTY);
        z81Var.c(Token.LETEXPR);
    }

    private static void generateSerialCtor(z81 z81Var, String str, String str2) {
        z81Var.N("<init>", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)V", (short) 1);
        z81Var.c(42);
        z81Var.m(str2, "<init>", Token.TAGGED_TEMPLATE_LITERAL, "()V");
        z81Var.c(42);
        z81Var.c(43);
        z81Var.f(str, "factory", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/ContextFactory;");
        z81Var.c(42);
        z81Var.c(44);
        z81Var.f(str, "delegee", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(42);
        z81Var.c(45);
        z81Var.f(str, "self", Token.TEMPLATE_CHARS, "Lorg/mozilla/javascript/Scriptable;");
        z81Var.c(Token.METHOD);
        z81Var.O(4);
    }

    private static void generateSuper(z81 z81Var, String str, String str2, String str3, String str4, Class<?>[] clsArr, Class<?> cls) {
        z81Var.N("super$" + str3, str4, (short) 1);
        z81Var.d(25, 0);
        int iGeneratePushParam = 1;
        for (Class<?> cls2 : clsArr) {
            iGeneratePushParam += generatePushParam(z81Var, iGeneratePushParam, cls2);
        }
        z81Var.m(str2, str3, Token.TAGGED_TEMPLATE_LITERAL, str4);
        if (cls.equals(Void.TYPE)) {
            z81Var.c(Token.METHOD);
        } else {
            generatePopResult(z81Var, cls);
        }
        z81Var.O((short) (iGeneratePushParam + 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int generateWrapArg(defpackage.z81 r7, int r8, java.lang.Class<?> r9) {
        /*
            boolean r0 = r9.isPrimitive()
            r1 = 1
            if (r0 != 0) goto Ld
            r9 = 25
            r7.d(r9, r8)
            return r1
        Ld:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.String r2 = "<init>"
            r3 = 183(0xb7, float:2.56E-43)
            r4 = 89
            r5 = 187(0xbb, float:2.62E-43)
            r6 = 21
            if (r9 != r0) goto L2c
            java.lang.String r9 = "java/lang/Boolean"
            r7.e(r5, r9)
            r7.c(r4)
            r7.d(r6, r8)
            java.lang.String r8 = "(Z)V"
            r7.m(r9, r2, r3, r8)
            return r1
        L2c:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r9 != r0) goto L3f
            r7.d(r6, r8)
            java.lang.String r8 = "valueOf"
            java.lang.String r9 = "(C)Ljava/lang/String;"
            java.lang.String r0 = "java/lang/String"
            r2 = 184(0xb8, float:2.58E-43)
            r7.m(r0, r8, r2, r9)
            return r1
        L3f:
            java.lang.String r0 = "java/lang/Double"
            r7.e(r5, r0)
            r7.c(r4)
            java.lang.String r9 = r9.getName()
            r4 = 0
            char r9 = r9.charAt(r4)
            r4 = 98
            if (r9 == r4) goto L87
            r4 = 100
            r5 = 2
            if (r9 == r4) goto L81
            r4 = 102(0x66, float:1.43E-43)
            if (r9 == r4) goto L76
            r4 = 105(0x69, float:1.47E-43)
            if (r9 == r4) goto L87
            r4 = 108(0x6c, float:1.51E-43)
            if (r9 == r4) goto L6a
            r4 = 115(0x73, float:1.61E-43)
            if (r9 == r4) goto L87
            goto L8f
        L6a:
            r9 = 22
            r7.d(r9, r8)
            r8 = 138(0x8a, float:1.93E-43)
            r7.c(r8)
        L74:
            r1 = r5
            goto L8f
        L76:
            r9 = 23
            r7.d(r9, r8)
            r8 = 141(0x8d, float:1.98E-43)
            r7.c(r8)
            goto L8f
        L81:
            r9 = 24
            r7.d(r9, r8)
            goto L74
        L87:
            r7.d(r6, r8)
            r8 = 135(0x87, float:1.89E-43)
            r7.c(r8)
        L8f:
            java.lang.String r8 = "(D)V"
            r7.m(r0, r2, r3, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaAdapter.generateWrapArg(z81, int, java.lang.Class):int");
    }

    private static Class<?> getAdapterClass(Scriptable scriptable, Class<?> cls, Class<?>[] clsArr, Scriptable scriptable2) {
        ClassCache classCache = ClassCache.get(scriptable);
        Map<JavaAdapterSignature, Class<?>> interfaceAdapterCacheMap = classCache.getInterfaceAdapterCacheMap();
        Map<String, Integer> objectFunctionNames = getObjectFunctionNames(scriptable2);
        JavaAdapterSignature javaAdapterSignature = new JavaAdapterSignature(cls, clsArr, objectFunctionNames);
        Class<?> cls2 = interfaceAdapterCacheMap.get(javaAdapterSignature);
        if (cls2 != null) {
            return cls2;
        }
        String strF = dx1.f(classCache.newClassSerialNumber(), "adapter");
        Class<?> clsLoadAdapterClass = loadAdapterClass(strF, createAdapterCode(objectFunctionNames, strF, cls, clsArr, null));
        if (classCache.isCachingEnabled()) {
            interfaceAdapterCacheMap.put(javaAdapterSignature, clsLoadAdapterClass);
        }
        return clsLoadAdapterClass;
    }

    public static Object getAdapterSelf(Class<?> cls, Object obj) {
        return cls.getDeclaredField("self").get(obj);
    }

    public static int[] getArgsToConvert(Class<?>[] clsArr) {
        int i = 0;
        for (int i2 = 0; i2 != clsArr.length; i2++) {
            if (!clsArr[i2].isPrimitive()) {
                i++;
            }
        }
        if (i == 0) {
            return null;
        }
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 != clsArr.length; i4++) {
            if (!clsArr[i4].isPrimitive()) {
                iArr[i3] = i4;
                i3++;
            }
        }
        return iArr;
    }

    public static Function getFunction(Scriptable scriptable, String str) {
        Object property = ScriptableObject.getProperty(scriptable, str);
        if (property == Scriptable.NOT_FOUND) {
            return null;
        }
        if (property instanceof Function) {
            return (Function) property;
        }
        throw ScriptRuntime.notFunctionError(property, str);
    }

    private static String getMethodSignature(Method method, Class<?>[] clsArr) {
        StringBuilder sb = new StringBuilder();
        appendMethodSignature(clsArr, method.getReturnType(), sb);
        return sb.toString();
    }

    private static Map<String, Integer> getObjectFunctionNames(Scriptable scriptable) {
        Object[] propertyIds = ScriptableObject.getPropertyIds(scriptable);
        HashMap map = new HashMap();
        for (int i = 0; i != propertyIds.length; i++) {
            Object obj = propertyIds[i];
            if (obj instanceof String) {
                String str = (String) obj;
                Object property = ScriptableObject.getProperty(scriptable, str);
                if (property instanceof Function) {
                    int int32 = ScriptRuntime.toInt32(ScriptableObject.getProperty((Function) property, "length"));
                    if (int32 < 0) {
                        int32 = 0;
                    }
                    map.put(str, Integer.valueOf(int32));
                }
            }
        }
        return map;
    }

    public static Method[] getOverridableMethods(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            appendOverridableMethods(superclass, arrayList, hashSet);
        }
        while (true) {
            if (cls == null) {
                return (Method[]) arrayList.toArray(new Method[0]);
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                appendOverridableMethods(cls2, arrayList, hashSet);
            }
            cls = cls.getSuperclass();
        }
    }

    public static void init(Context context, Scriptable scriptable, boolean z) {
        IdFunctionObject idFunctionObject = new IdFunctionObject(new JavaAdapter(), FTAG, 1, "JavaAdapter", 1, scriptable);
        idFunctionObject.markAsConstructor(null);
        if (z) {
            idFunctionObject.sealObject();
        }
        idFunctionObject.exportAsScopeProperty();
    }

    public static Object js_createAdapter(Context context, Scriptable scriptable, Object[] objArr) {
        Object objNewInstance;
        int length = objArr.length;
        if (length == 0) {
            throw ScriptRuntime.typeErrorById("msg.adapter.zero.args", new Object[0]);
        }
        int i = 0;
        while (i < length - 1) {
            Object obj = objArr[i];
            if (obj instanceof NativeObject) {
                break;
            }
            if (!(obj instanceof NativeJavaClass)) {
                throw ScriptRuntime.typeErrorById("msg.not.java.class.arg", String.valueOf(i), ScriptRuntime.toString(obj));
            }
            i++;
        }
        Class[] clsArr = new Class[i];
        Class<?> cls = null;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Class<?> classObject = ((NativeJavaClass) objArr[i3]).getClassObject();
            if (classObject.isInterface()) {
                clsArr[i2] = classObject;
                i2++;
            } else {
                if (cls != null) {
                    throw ScriptRuntime.typeErrorById("msg.only.one.super", cls.getName(), classObject.getName());
                }
                cls = classObject;
            }
        }
        if (cls == null) {
            cls = ScriptRuntime.ObjectClass;
        }
        Class[] clsArr2 = new Class[i2];
        System.arraycopy(clsArr, 0, clsArr2, 0, i2);
        Scriptable scriptableEnsureScriptable = ScriptableObject.ensureScriptable(objArr[i]);
        Class<?> adapterClass = getAdapterClass(scriptable, cls, clsArr2, scriptableEnsureScriptable);
        int i4 = length - i;
        int i5 = i4 - 1;
        try {
            if (i5 > 0) {
                Object[] objArr2 = new Object[i4 + 1];
                objArr2[0] = scriptableEnsureScriptable;
                objArr2[1] = context.getFactory();
                System.arraycopy(objArr, i + 1, objArr2, 2, i5);
                NativeJavaMethod nativeJavaMethod = new NativeJavaClass(scriptable, adapterClass, true).members.ctors;
                int iFindCachedFunction = nativeJavaMethod.findCachedFunction(context, objArr2);
                if (iFindCachedFunction < 0) {
                    throw Context.reportRuntimeErrorById("msg.no.java.ctor", adapterClass.getName(), NativeJavaMethod.scriptSignature(objArr));
                }
                objNewInstance = NativeJavaClass.constructInternal(objArr2, nativeJavaMethod.methods[iFindCachedFunction]);
            } else {
                objNewInstance = adapterClass.getConstructor(ScriptRuntime.ScriptableClass, ScriptRuntime.ContextFactoryClass).newInstance(scriptableEnsureScriptable, context.getFactory());
            }
            Object adapterSelf = getAdapterSelf(adapterClass, objNewInstance);
            if (adapterSelf instanceof Wrapper) {
                Object objUnwrap = ((Wrapper) adapterSelf).unwrap();
                if (objUnwrap instanceof Scriptable) {
                    if (objUnwrap instanceof ScriptableObject) {
                        ScriptRuntime.setObjectProtoAndParent((ScriptableObject) objUnwrap, scriptable);
                    }
                    return objUnwrap;
                }
            }
            return adapterSelf;
        } catch (Exception e) {
            throw Context.throwAsScriptRuntimeEx(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$callMethod$0(Scriptable scriptable, Scriptable scriptable2, Function function, Object[] objArr, long j, Context context) {
        return doCall(context, scriptable, scriptable2, function, objArr, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScriptableObject lambda$runScript$1(Script script, Context context) {
        ScriptableObject global = ScriptRuntime.getGlobal(context);
        script.exec(context, global);
        return global;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class<?> loadAdapterClass(java.lang.String r4, byte[] r5) {
        /*
            java.lang.Class r0 = org.mozilla.javascript.SecurityController.getStaticSecurityDomainClass()
            r1 = 0
            java.lang.Class<java.security.CodeSource> r2 = java.security.CodeSource.class
            if (r0 == r2) goto L10
            java.lang.Class<java.security.ProtectionDomain> r3 = java.security.ProtectionDomain.class
            if (r0 != r3) goto Le
            goto L10
        Le:
            r3 = r1
            goto L26
        L10:
            java.security.ProtectionDomain r3 = org.mozilla.javascript.SecurityUtilities.getScriptProtectionDomain()
            if (r3 != 0) goto L1c
            java.lang.Class<org.mozilla.javascript.JavaAdapter> r3 = org.mozilla.javascript.JavaAdapter.class
            java.security.ProtectionDomain r3 = r3.getProtectionDomain()
        L1c:
            if (r0 != r2) goto L26
            if (r3 != 0) goto L21
            goto Le
        L21:
            java.security.CodeSource r0 = r3.getCodeSource()
            r3 = r0
        L26:
            org.mozilla.javascript.GeneratedClassLoader r0 = org.mozilla.javascript.SecurityController.createLoader(r1, r3)
            java.lang.Class r4 = r0.defineClass(r4, r5)
            r0.linkClass(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.JavaAdapter.loadAdapterClass(java.lang.String, byte[]):java.lang.Class");
    }

    public static Object readAdapterObject(Scriptable scriptable, ObjectInputStream objectInputStream) throws ClassNotFoundException {
        Context currentContext = Context.getCurrentContext();
        ContextFactory factory = currentContext != null ? currentContext.getFactory() : null;
        Class<?> cls = Class.forName((String) objectInputStream.readObject());
        String[] strArr = (String[]) objectInputStream.readObject();
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = Class.forName(strArr[i]);
        }
        Scriptable scriptable2 = (Scriptable) objectInputStream.readObject();
        Class<?> adapterClass = getAdapterClass(scriptable, cls, clsArr, scriptable2);
        Class<?> cls2 = ScriptRuntime.ContextFactoryClass;
        Class<Scriptable> cls3 = ScriptRuntime.ScriptableClass;
        try {
            return adapterClass.getConstructor(cls2, cls3, cls3).newInstance(factory, scriptable2, scriptable);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            throw new ClassNotFoundException("adapter");
        }
    }

    public static Scriptable runScript(Script script) {
        return (Scriptable) ContextFactory.getGlobal().call(new y5(script, 26));
    }

    public static void writeAdapterObject(Object obj, ObjectOutputStream objectOutputStream) throws IOException {
        Class<?> cls = obj.getClass();
        objectOutputStream.writeObject(cls.getSuperclass().getName());
        Class<?>[] interfaces = cls.getInterfaces();
        String[] strArr = new String[interfaces.length];
        for (int i = 0; i < interfaces.length; i++) {
            strArr[i] = interfaces[i].getName();
        }
        objectOutputStream.writeObject(strArr);
        try {
            objectOutputStream.writeObject(cls.getField("delegee").get(obj));
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            throw new IOException();
        }
    }

    @Override // org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1) {
            return js_createAdapter(context, scriptable, objArr);
        }
        throw idFunctionObject.unknown();
    }
}
