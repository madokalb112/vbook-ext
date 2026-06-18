package org.mozilla.javascript.optimizer;

import defpackage.dx1;
import defpackage.k27;
import defpackage.ky0;
import defpackage.xv5;
import defpackage.z81;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.TemplateCharacters;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class Codegen implements Evaluator {
    static final String DEFAULT_MAIN_METHOD_CLASS = "org.mozilla.javascript.optimizer.OptRuntime";
    static final String FUNCTION_CONSTRUCTOR_SIGNATURE = "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V";
    static final String FUNCTION_INIT_SIGNATURE = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V";
    static final String ID_FIELD_NAME = "_id";
    static final String REGEXP_INIT_METHOD_NAME = "_reInit";
    static final String REGEXP_INIT_METHOD_SIGNATURE = "(Lorg/mozilla/javascript/Context;)V";
    private static final String SUPER_CLASS_NAME = "org.mozilla.javascript.NativeFunction";
    static final String TEMPLATE_LITERAL_INIT_METHOD_NAME = "_qInit";
    static final String TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE = "()V";
    private static final Object globalLock = new Object();
    private static int globalSerialClassCounter;
    private CompilerEnvirons compilerEnv;
    private List<OptFunctionNode> directCallTargets;
    private double[] itsConstantList;
    private int itsConstantListSize;
    String mainClassName;
    String mainClassSignature;
    private String mainMethodClass = DEFAULT_MAIN_METHOD_CLASS;
    private HashMap<ScriptNode, Integer> scriptOrFnIndexes;
    ScriptNode[] scriptOrFnNodes;

    private static void addDoubleWrap(z81 z81Var) {
        z81Var.m("org/mozilla/javascript/optimizer/OptRuntime", "wrapDouble", Token.DOTDOTDOT, "(D)Ljava/lang/Double;");
    }

    public static RuntimeException badTree() {
        throw new RuntimeException("Bad tree in codegen");
    }

    private static void collectScriptNodes_r(ScriptNode scriptNode, List<ScriptNode> list) {
        list.add(scriptNode);
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            collectScriptNodes_r(scriptNode.getFunctionNode(i), list);
        }
    }

    private Class<?> defineClass(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        String str = (String) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        GeneratedClassLoader generatedClassLoaderCreateLoader = SecurityController.createLoader(getClass().getClassLoader(), obj2);
        try {
            Class<?> clsDefineClass = generatedClassLoaderCreateLoader.defineClass(str, bArr);
            generatedClassLoaderCreateLoader.linkClass(clsDefineClass);
            return clsDefineClass;
        } catch (IllegalArgumentException | SecurityException e) {
            k27.i("Malformed optimizer package ".concat(String.valueOf(e)));
            return null;
        }
    }

    private void emitConstantDudeInitializers(z81 z81Var) {
        int i = this.itsConstantListSize;
        if (i == 0) {
            return;
        }
        z81Var.N("<clinit>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 24);
        double[] dArr = this.itsConstantList;
        for (int i2 = 0; i2 != i; i2++) {
            double d = dArr[i2];
            String strF = dx1.f(i2, "_k");
            String staticConstantWrapperType = getStaticConstantWrapperType(d);
            z81Var.k(strF, staticConstantWrapperType, (short) 10);
            int i3 = (int) d;
            if (i3 == d) {
                z81Var.r(i3);
                z81Var.m("java/lang/Integer", "valueOf", Token.DOTDOTDOT, "(I)Ljava/lang/Integer;");
            } else {
                z81Var.q(d);
                addDoubleWrap(z81Var);
            }
            z81Var.f(this.mainClassName, strF, Token.YIELD_STAR, staticConstantWrapperType);
        }
        z81Var.c(Token.METHOD);
        z81Var.O(0);
    }

    private void emitDirectConstructor(z81 z81Var, OptFunctionNode optFunctionNode) {
        z81Var.N(getDirectCtorName(optFunctionNode.fnode), getBodyMethodSignature(optFunctionNode.fnode), (short) 10);
        int paramCount = optFunctionNode.fnode.getParamCount();
        int i = paramCount * 3;
        int i2 = i + 4;
        int i3 = i + 5;
        z81Var.g(0);
        z81Var.g(1);
        z81Var.g(2);
        z81Var.m("org/mozilla/javascript/BaseFunction", "createObject", Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        z81Var.h(i3);
        z81Var.g(0);
        z81Var.g(1);
        z81Var.g(2);
        z81Var.g(i3);
        for (int i4 = 0; i4 < paramCount; i4++) {
            int i5 = i4 * 3;
            z81Var.g(i5 + 4);
            z81Var.i(i5 + 5);
        }
        z81Var.g(i2);
        z81Var.m(this.mainClassName, getBodyMethodName(optFunctionNode.fnode), Token.DOTDOTDOT, getBodyMethodSignature(optFunctionNode.fnode));
        int iB = z81Var.b();
        z81Var.c(89);
        z81Var.e(193, "org/mozilla/javascript/Scriptable");
        z81Var.d(Token.SETPROP_OP, iB);
        z81Var.e(192, "org/mozilla/javascript/Scriptable");
        z81Var.c(Token.GENEXPR);
        z81Var.D(iB);
        z81Var.g(i3);
        z81Var.c(Token.GENEXPR);
        z81Var.O((short) (i + 6));
    }

    private void emitRegExpInit(z81 z81Var) {
        int i = 0;
        int i2 = 0;
        int regexpCount = 0;
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i2 == scriptNodeArr.length) {
                break;
            }
            regexpCount += scriptNodeArr[i2].getRegexpCount();
            i2++;
        }
        if (regexpCount == 0) {
            return;
        }
        short s = 10;
        z81Var.N(REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE, (short) 10);
        z81Var.k("_reInitDone", "Z", (short) 74);
        z81Var.f(this.mainClassName, "_reInitDone", Token.ARROW, "Z");
        int iB = z81Var.b();
        z81Var.d(Token.SETPROP_OP, iB);
        z81Var.c(Token.METHOD);
        z81Var.D(iB);
        z81Var.g(0);
        z81Var.m("org/mozilla/javascript/ScriptRuntime", "checkRegExpProxy", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        z81Var.h(1);
        int i3 = 0;
        while (true) {
            ScriptNode[] scriptNodeArr2 = this.scriptOrFnNodes;
            if (i3 == scriptNodeArr2.length) {
                z81Var.r(1);
                z81Var.f(this.mainClassName, "_reInitDone", Token.YIELD_STAR, "Z");
                z81Var.c(Token.METHOD);
                z81Var.O(2);
                return;
            }
            ScriptNode scriptNode = scriptNodeArr2[i3];
            int regexpCount2 = scriptNode.getRegexpCount();
            int i4 = i;
            while (i4 != regexpCount2) {
                String compiledRegexpName = getCompiledRegexpName(scriptNode, i4);
                String regexpString = scriptNode.getRegexpString(i4);
                String regexpFlags = scriptNode.getRegexpFlags(i4);
                z81Var.k(compiledRegexpName, "Ljava/lang/Object;", s);
                z81Var.g(1);
                z81Var.g(i);
                z81Var.s(regexpString);
                if (regexpFlags == null) {
                    z81Var.c(1);
                } else {
                    z81Var.s(regexpFlags);
                }
                z81Var.m("org/mozilla/javascript/RegExpProxy", "compileRegExp", Token.NULLISH_COALESCING, "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
                z81Var.f(this.mainClassName, compiledRegexpName, Token.YIELD_STAR, "Ljava/lang/Object;");
                i4++;
                i = 0;
                s = 10;
            }
            i3++;
            i = 0;
            s = 10;
        }
    }

    private void emitTemplateLiteralInit(z81 z81Var) {
        int templateLiteralCount = 0;
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            templateLiteralCount += scriptNode.getTemplateLiteralCount();
        }
        if (templateLiteralCount == 0) {
            return;
        }
        short s = 10;
        z81Var.N(TEMPLATE_LITERAL_INIT_METHOD_NAME, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 10);
        z81Var.k("_qInitDone", "Z", (short) 74);
        z81Var.f(this.mainClassName, "_qInitDone", Token.ARROW, "Z");
        int iB = z81Var.b();
        z81Var.d(Token.SETPROP_OP, iB);
        z81Var.c(Token.METHOD);
        z81Var.D(iB);
        ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
        int length = scriptNodeArr.length;
        int i = 0;
        while (i < length) {
            ScriptNode scriptNode2 = scriptNodeArr[i];
            int templateLiteralCount2 = scriptNode2.getTemplateLiteralCount();
            if (templateLiteralCount2 != 0) {
                String templateLiteralName = getTemplateLiteralName(scriptNode2);
                z81Var.k(templateLiteralName, "[Ljava/lang/Object;", s);
                z81Var.r(templateLiteralCount2);
                int i2 = 189;
                z81Var.e(189, "java/lang/Object");
                int i3 = 0;
                while (i3 < templateLiteralCount2) {
                    List<TemplateCharacters> templateLiteralStrings = scriptNode2.getTemplateLiteralStrings(i3);
                    int i4 = 89;
                    z81Var.c(89);
                    z81Var.r(i3);
                    z81Var.r(templateLiteralStrings.size() * 2);
                    z81Var.e(i2, "java/lang/String");
                    int i5 = 0;
                    for (TemplateCharacters templateCharacters : templateLiteralStrings) {
                        z81Var.c(i4);
                        int i6 = i5 + 1;
                        z81Var.r(i5);
                        if (templateCharacters.getValue() != null) {
                            z81Var.s(templateCharacters.getValue());
                        } else {
                            z81Var.c(1);
                        }
                        z81Var.c(83);
                        z81Var.c(89);
                        i5 += 2;
                        z81Var.r(i6);
                        z81Var.s(templateCharacters.getRawValue());
                        z81Var.c(83);
                        i4 = 89;
                    }
                    z81Var.c(83);
                    i3++;
                    i2 = 189;
                }
                z81Var.f(this.mainClassName, templateLiteralName, Token.YIELD_STAR, "[Ljava/lang/Object;");
            }
            i++;
            s = 10;
        }
        z81Var.t(true);
        z81Var.f(this.mainClassName, "_qInitDone", Token.YIELD_STAR, "Z");
        z81Var.c(Token.METHOD);
        z81Var.O(0);
    }

    private void generateCallMethod(z81 z81Var, boolean z) {
        int iW;
        int paramCount;
        z81Var.N("call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        int iB = z81Var.b();
        z81Var.g(1);
        z81Var.m("org/mozilla/javascript/ScriptRuntime", "hasTopCall", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Context;)Z");
        z81Var.d(Token.SETELEM_OP, iB);
        int i = 0;
        z81Var.g(0);
        z81Var.g(1);
        z81Var.g(2);
        z81Var.g(3);
        z81Var.g(4);
        z81Var.t(z);
        z81Var.m("org/mozilla/javascript/ScriptRuntime", "doTopCall", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Z)Ljava/lang/Object;");
        z81Var.c(Token.GENEXPR);
        z81Var.D(iB);
        z81Var.g(0);
        z81Var.g(1);
        z81Var.g(2);
        z81Var.g(3);
        z81Var.g(4);
        int length = this.scriptOrFnNodes.length;
        boolean z2 = 2 <= length;
        if (z2) {
            z81Var.p();
            z81Var.f(z81Var.d, ID_FIELD_NAME, 180, "I");
            iW = z81Var.w(1, length - 1);
        } else {
            iW = 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 != length) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i2];
            if (z2) {
                if (i2 == 0) {
                    z81Var.H(iW);
                    i3 = z81Var.m;
                } else {
                    z81Var.G(iW, i2 - 1, i3);
                }
            }
            if (scriptNode.getType() == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                if (optFunctionNode.isTargetOfDirectCall() && (paramCount = optFunctionNode.fnode.getParamCount()) != 0) {
                    for (int i4 = i; i4 != paramCount; i4++) {
                        z81Var.c(190);
                        z81Var.r(i4);
                        int iB2 = z81Var.b();
                        int iB3 = z81Var.b();
                        z81Var.d(Token.TO_DOUBLE, iB2);
                        z81Var.g(4);
                        z81Var.r(i4);
                        z81Var.c(50);
                        z81Var.d(Token.LET, iB3);
                        z81Var.D(iB2);
                        pushUndefined(z81Var);
                        z81Var.D(iB3);
                        z81Var.z();
                        z81Var.q(0.0d);
                        z81Var.g(4);
                    }
                }
            }
            z81Var.m(this.mainClassName, getBodyMethodName(scriptNode), Token.DOTDOTDOT, getBodyMethodSignature(scriptNode));
            z81Var.c(Token.GENEXPR);
            i2++;
            i = 0;
        }
        z81Var.O(5);
    }

    private byte[] generateCode(String str) {
        boolean z = true;
        boolean z2 = this.scriptOrFnNodes[0].getType() == 150;
        ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
        if (scriptNodeArr.length <= 1 && z2) {
            z = false;
        }
        boolean zIsInStrictMode = scriptNodeArr[0].isInStrictMode();
        z81 z81Var = new z81(this.mainClassName, SUPER_CLASS_NAME, this.scriptOrFnNodes[0].getSourceName());
        z81Var.k(ID_FIELD_NAME, "I", (short) 2);
        if (z) {
            generateFunctionConstructor(z81Var);
        }
        if (z2) {
            z81Var.r.add(Short.valueOf(z81Var.k.a("org/mozilla/javascript/Script")));
            generateScriptCtor(z81Var);
            generateMain(z81Var);
            generateExecute(z81Var);
        }
        generateCallMethod(z81Var, zIsInStrictMode);
        generateResumeGenerator(z81Var);
        generateNativeFunctionOverrides(z81Var, str);
        int length = this.scriptOrFnNodes.length;
        for (int i = 0; i != length; i++) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i];
            BodyCodegen bodyCodegen = new BodyCodegen();
            bodyCodegen.cfw = z81Var;
            bodyCodegen.codegen = this;
            bodyCodegen.compilerEnv = this.compilerEnv;
            bodyCodegen.scriptOrFn = scriptNode;
            bodyCodegen.scriptOrFnIndex = i;
            bodyCodegen.generateBodyCode();
            if (scriptNode.getType() == 122) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                generateFunctionInit(z81Var, optFunctionNode);
                if (optFunctionNode.isTargetOfDirectCall()) {
                    emitDirectConstructor(z81Var, optFunctionNode);
                }
            }
        }
        emitRegExpInit(z81Var);
        emitTemplateLiteralInit(z81Var);
        emitConstantDudeInitializers(z81Var);
        return z81Var.P();
    }

    private static void generateExecute(z81 z81Var) {
        z81Var.N("exec", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;", (short) 17);
        z81Var.p();
        z81Var.g(1);
        z81Var.g(2);
        z81Var.c(89);
        z81Var.c(1);
        z81Var.m(z81Var.d, "call", Token.TEMPLATE_LITERAL_SUBST, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        z81Var.g(1);
        z81Var.m("org.mozilla.javascript.Context", "processMicrotasks", Token.TEMPLATE_LITERAL_SUBST, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        z81Var.c(Token.GENEXPR);
        z81Var.O(3);
    }

    private void generateFunctionConstructor(z81 z81Var) {
        int iW;
        z81Var.N("<init>", FUNCTION_CONSTRUCTOR_SIGNATURE, (short) 1);
        int i = 0;
        z81Var.g(0);
        z81Var.m(SUPER_CLASS_NAME, "<init>", Token.TAGGED_TEMPLATE_LITERAL, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        z81Var.p();
        z81Var.l(3);
        z81Var.f(z81Var.d, ID_FIELD_NAME, Token.TEMPLATE_CHARS, "I");
        z81Var.p();
        z81Var.g(2);
        z81Var.g(1);
        int i2 = this.scriptOrFnNodes[0].getType() == 150 ? 1 : 0;
        int length = this.scriptOrFnNodes.length;
        if (i2 == length) {
            throw badTree();
        }
        boolean z = 2 <= length - i2;
        if (z) {
            z81Var.l(3);
            iW = z81Var.w(i2 + 1, length - 1);
        } else {
            iW = 0;
        }
        for (int i3 = i2; i3 != length; i3++) {
            if (z) {
                if (i3 == i2) {
                    z81Var.H(iW);
                    i = z81Var.m;
                } else {
                    z81Var.G(iW, (i3 - 1) - i2, i);
                }
            }
            z81Var.m(this.mainClassName, getFunctionInitMethodName(OptFunctionNode.get(this.scriptOrFnNodes[i3])), Token.TAGGED_TEMPLATE_LITERAL, FUNCTION_INIT_SIGNATURE);
            z81Var.c(Token.METHOD);
        }
        z81Var.O(4);
    }

    private void generateFunctionInit(z81 z81Var, OptFunctionNode optFunctionNode) {
        z81Var.N(getFunctionInitMethodName(optFunctionNode), FUNCTION_INIT_SIGNATURE, (short) 18);
        z81Var.p();
        z81Var.g(1);
        z81Var.g(2);
        z81Var.m("org/mozilla/javascript/NativeFunction", "initScriptFunction", Token.TEMPLATE_LITERAL_SUBST, FUNCTION_INIT_SIGNATURE);
        if (optFunctionNode.fnode.getRegexpCount() != 0) {
            z81Var.g(1);
            z81Var.m(this.mainClassName, REGEXP_INIT_METHOD_NAME, Token.DOTDOTDOT, REGEXP_INIT_METHOD_SIGNATURE);
        }
        if (optFunctionNode.fnode.getTemplateLiteralCount() != 0) {
            z81Var.m(this.mainClassName, TEMPLATE_LITERAL_INIT_METHOD_NAME, Token.DOTDOTDOT, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        }
        z81Var.c(Token.METHOD);
        z81Var.O(3);
    }

    private void generateMain(z81 z81Var) {
        z81Var.N("main", "([Ljava/lang/String;)V", (short) 9);
        String str = z81Var.d;
        z81Var.e(Token.LAST_TOKEN, str);
        z81Var.c(89);
        z81Var.m(str, "<init>", Token.TAGGED_TEMPLATE_LITERAL, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        z81Var.c(42);
        z81Var.m(this.mainMethodClass, "main", Token.DOTDOTDOT, "(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V");
        z81Var.c(Token.METHOD);
        z81Var.O(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void generateNativeFunctionOverrides(defpackage.z81 r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.Codegen.generateNativeFunctionOverrides(z81, java.lang.String):void");
    }

    private void generateResumeGenerator(z81 z81Var) {
        int i = 0;
        boolean z = false;
        for (ScriptNode scriptNode : this.scriptOrFnNodes) {
            if (isGenerator(scriptNode)) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        z81Var.N("resumeGenerator", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        z81Var.g(0);
        z81Var.g(1);
        z81Var.g(2);
        z81Var.g(4);
        z81Var.g(5);
        z81Var.l(3);
        z81Var.p();
        z81Var.f(z81Var.d, ID_FIELD_NAME, 180, "I");
        int iW = z81Var.w(0, this.scriptOrFnNodes.length - 1);
        z81Var.H(iW);
        int iB = z81Var.b();
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i >= scriptNodeArr.length) {
                z81Var.D(iB);
                pushUndefined(z81Var);
                z81Var.c(Token.GENEXPR);
                z81Var.O(6);
                return;
            }
            ScriptNode scriptNode2 = scriptNodeArr[i];
            z81Var.G(iW, i, 6);
            if (isGenerator(scriptNode2)) {
                z81Var.m(this.mainClassName, tw2.n(getBodyMethodName(scriptNode2), "_gen"), Token.DOTDOTDOT, xv5.p("(", this.mainClassSignature, "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;"));
                z81Var.c(Token.GENEXPR);
            } else {
                z81Var.d(Token.LET, iB);
            }
            i++;
        }
    }

    private static void generateScriptCtor(z81 z81Var) {
        z81Var.N("<init>", TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE, (short) 1);
        z81Var.p();
        z81Var.m(SUPER_CLASS_NAME, "<init>", Token.TAGGED_TEMPLATE_LITERAL, TEMPLATE_LITERAL_INIT_METHOD_SIGNATURE);
        z81Var.p();
        z81Var.r(0);
        z81Var.f(z81Var.d, ID_FIELD_NAME, Token.TEMPLATE_CHARS, "I");
        z81Var.c(Token.METHOD);
        z81Var.O(1);
    }

    private static String getStaticConstantWrapperType(double d) {
        return ((double) ((int) d)) == d ? "Ljava/lang/Integer;" : "Ljava/lang/Double;";
    }

    private static void initOptFunctions_r(ScriptNode scriptNode) {
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            FunctionNode functionNode = scriptNode.getFunctionNode(i);
            new OptFunctionNode(functionNode);
            initOptFunctions_r(functionNode);
        }
    }

    private void initScriptNodesData(ScriptNode scriptNode) {
        ArrayList arrayList = new ArrayList();
        collectScriptNodes_r(scriptNode, arrayList);
        int size = arrayList.size();
        ScriptNode[] scriptNodeArr = new ScriptNode[size];
        this.scriptOrFnNodes = scriptNodeArr;
        arrayList.toArray(scriptNodeArr);
        this.scriptOrFnIndexes = new HashMap<>();
        for (int i = 0; i != size; i++) {
            this.scriptOrFnIndexes.put(this.scriptOrFnNodes[i], Integer.valueOf(i));
        }
    }

    public static boolean isGenerator(ScriptNode scriptNode) {
        return scriptNode.getType() == 122 && ((FunctionNode) scriptNode).isGenerator();
    }

    public static void pushUndefined(z81 z81Var) {
        z81Var.f("org/mozilla/javascript/Undefined", "instance", Token.ARROW, "Ljava/lang/Object;");
    }

    private void transform(ScriptNode scriptNode) {
        initOptFunctions_r(scriptNode);
        boolean zIsInterpretedMode = this.compilerEnv.isInterpretedMode();
        HashMap map = null;
        if (!zIsInterpretedMode && scriptNode.getType() == 150) {
            int functionCount = scriptNode.getFunctionCount();
            for (int i = 0; i != functionCount; i++) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode, i);
                if (optFunctionNode.fnode.getFunctionType() == 1) {
                    String name = optFunctionNode.fnode.getName();
                    if (name.length() != 0) {
                        if (map == null) {
                            map = new HashMap();
                        }
                        map.put(name, optFunctionNode);
                    }
                }
            }
        }
        if (map != null) {
            this.directCallTargets = new ArrayList();
        }
        new OptTransformer(map, this.directCallTargets).transform(scriptNode, this.compilerEnv);
        if (zIsInterpretedMode) {
            return;
        }
        new Optimizer().optimize(scriptNode);
    }

    @Override // org.mozilla.javascript.Evaluator
    public void captureStackInfo(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    public String cleanName(ScriptNode scriptNode) {
        if (!(scriptNode instanceof FunctionNode)) {
            return "script";
        }
        Name functionName = ((FunctionNode) scriptNode).getFunctionName();
        return functionName == null ? "anonymous" : functionName.getIdentifier();
    }

    @Override // org.mozilla.javascript.Evaluator
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z) {
        int i;
        synchronized (globalLock) {
            i = globalSerialClassCounter + 1;
            globalSerialClassCounter = i;
        }
        String strReplaceAll = "c";
        if (scriptNode.getSourceName().length() > 0) {
            strReplaceAll = scriptNode.getSourceName().replaceAll("\\W", "_");
            if (!Character.isJavaIdentifierStart(strReplaceAll.charAt(0))) {
                strReplaceAll = "_".concat(strReplaceAll);
            }
        }
        String str2 = "org.mozilla.javascript.gen." + strReplaceAll + "_" + i;
        return new Object[]{str2, compileToClassFile(compilerEnvirons, str2, scriptNode, str, z)};
    }

    public byte[] compileToClassFile(CompilerEnvirons compilerEnvirons, String str, ScriptNode scriptNode, String str2, boolean z) {
        this.compilerEnv = compilerEnvirons;
        transform(scriptNode);
        if (z) {
            scriptNode = scriptNode.getFunctionNode(0);
        }
        initScriptNodesData(scriptNode);
        this.mainClassName = str;
        int i = z81.E;
        int length = str.length();
        int i2 = length + 1;
        int i3 = length + 2;
        char[] cArr = new char[i3];
        cArr[0] = 'L';
        cArr[i2] = ';';
        str.getChars(0, length, cArr, 1);
        for (int i4 = 1; i4 != i2; i4++) {
            if (cArr[i4] == '.') {
                cArr[i4] = '/';
            }
        }
        this.mainClassSignature = new String(cArr, 0, i3);
        return generateCode(str2);
    }

    @Override // org.mozilla.javascript.Evaluator
    public Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2) {
        try {
            return (NativeFunction) defineClass(obj, obj2).getConstructors()[0].newInstance(scriptable, context, 0);
        } catch (Exception e) {
            k27.i(ky0.r("Unable to instantiate compiled class:", e.toString()));
            return null;
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public Script createScriptObject(Object obj, Object obj2) {
        try {
            return (Script) defineClass(obj, obj2).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            k27.i(ky0.r("Unable to instantiate compiled class:", e.toString()));
            return null;
        }
    }

    public String getBodyMethodName(ScriptNode scriptNode) {
        return "_c_" + cleanName(scriptNode) + "_" + getIndex(scriptNode);
    }

    public String getBodyMethodSignature(ScriptNode scriptNode) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.mainClassSignature);
        sb.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;");
        if (scriptNode.getType() == 122) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
            if (optFunctionNode.isTargetOfDirectCall()) {
                int paramCount = optFunctionNode.fnode.getParamCount();
                for (int i = 0; i != paramCount; i++) {
                    sb.append("Ljava/lang/Object;D");
                }
            }
        }
        sb.append("[Ljava/lang/Object;)Ljava/lang/Object;");
        return sb.toString();
    }

    public String getCompiledRegexpName(ScriptNode scriptNode, int i) {
        return xv5.o("_re", getIndex(scriptNode), i, "_");
    }

    public String getDirectCtorName(ScriptNode scriptNode) {
        return dx1.f(getIndex(scriptNode), "_n");
    }

    public String getFunctionInitMethodName(OptFunctionNode optFunctionNode) {
        return dx1.f(getIndex(optFunctionNode.fnode), "_i");
    }

    public int getIndex(ScriptNode scriptNode) {
        return this.scriptOrFnIndexes.get(scriptNode).intValue();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getPatchedStack(RhinoException rhinoException, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public List<String> getScriptStack(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getSourcePositionFromStack(Context context, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public String getTemplateLiteralName(ScriptNode scriptNode) {
        return dx1.f(getIndex(scriptNode), "_q");
    }

    public void pushNumberAsObject(z81 z81Var, double d) {
        if (d == 0.0d) {
            if (1.0d / d > 0.0d) {
                z81Var.f("org/mozilla/javascript/ScriptRuntime", "zeroObj", Token.ARROW, "Ljava/lang/Integer;");
                return;
            } else {
                z81Var.q(d);
                addDoubleWrap(z81Var);
                return;
            }
        }
        if (d == 1.0d) {
            z81Var.f("org/mozilla/javascript/optimizer/OptRuntime", "oneObj", Token.ARROW, "Ljava/lang/Integer;");
            return;
        }
        if (d == -1.0d) {
            z81Var.f("org/mozilla/javascript/optimizer/OptRuntime", "minusOneObj", Token.ARROW, "Ljava/lang/Integer;");
            return;
        }
        if (Double.isNaN(d)) {
            z81Var.f("org/mozilla/javascript/ScriptRuntime", "NaNobj", Token.ARROW, "Ljava/lang/Double;");
            return;
        }
        int i = this.itsConstantListSize;
        if (i >= 2000) {
            z81Var.q(d);
            addDoubleWrap(z81Var);
            return;
        }
        int i2 = 0;
        if (i == 0) {
            this.itsConstantList = new double[64];
        } else {
            double[] dArr = this.itsConstantList;
            int i3 = 0;
            while (i3 != i && dArr[i3] != d) {
                i3++;
            }
            if (i == dArr.length) {
                double[] dArr2 = new double[i * 2];
                System.arraycopy(this.itsConstantList, 0, dArr2, 0, i);
                this.itsConstantList = dArr2;
            }
            i2 = i3;
        }
        if (i2 == i) {
            this.itsConstantList[i] = d;
            this.itsConstantListSize = i + 1;
        }
        z81Var.f(this.mainClassName, dx1.f(i2, "_k"), Token.ARROW, getStaticConstantWrapperType(d));
    }

    @Override // org.mozilla.javascript.Evaluator
    public void setEvalScriptFlag(Script script) {
        throw new UnsupportedOperationException();
    }

    public void setMainMethodClass(String str) {
        this.mainMethodClass = str;
    }
}
