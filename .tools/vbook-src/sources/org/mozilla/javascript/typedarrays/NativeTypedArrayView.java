package org.mozilla.javascript.typedarrays;

import defpackage.g27;
import defpackage.mn5;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.RandomAccess;
import java.util.function.Function;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.ArrayLikeAbstractOperations;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ExternalArrayData;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class NativeTypedArrayView<T> extends NativeArrayBufferView implements List<T>, RandomAccess, ExternalArrayData {
    private static final long serialVersionUID = -4963053773152251274L;
    protected final int length;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface RealThis {
        NativeTypedArrayView<?> realThis(Scriptable scriptable);
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface TypedArrayConstructable {
        NativeTypedArrayView<?> construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2);
    }

    public NativeTypedArrayView() {
        this.length = 0;
    }

    private Object getElemForToString(Context context, Scriptable scriptable, int i, boolean z) {
        Object objJs_get = js_get(i);
        return z ? ScriptRuntime.getPropFunctionAndThis(objJs_get, "toLocaleString", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs) : objJs_get;
    }

    public static void init(Context context, Scriptable scriptable, LambdaConstructor lambdaConstructor, final RealThis realThis) {
        final int i = 1;
        final int i2 = 3;
        lambdaConstructor.definePrototypeProperty(context, "buffer", new Function() { // from class: i27
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i3 = i;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i3) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                    case 1:
                        return NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                    case 2:
                        return NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                    default:
                        return NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                }
            }
        }, 3);
        final int i3 = 0;
        lambdaConstructor.definePrototypeProperty(context, "byteLength", new Function() { // from class: i27
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i32 = i3;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i32) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                    case 1:
                        return NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                    case 2:
                        return NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                    default:
                        return NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                }
            }
        }, 3);
        final int i4 = 2;
        lambdaConstructor.definePrototypeProperty(context, "byteOffset", new Function() { // from class: i27
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i32 = i4;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i32) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                    case 1:
                        return NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                    case 2:
                        return NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                    default:
                        return NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                }
            }
        }, 3);
        lambdaConstructor.definePrototypeProperty(context, "length", new Function() { // from class: i27
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i32 = i2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                Scriptable scriptable2 = (Scriptable) obj;
                switch (i32) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$1(realThis2, scriptable2);
                    case 1:
                        return NativeTypedArrayView.lambda$init$0(realThis2, scriptable2);
                    case 2:
                        return NativeTypedArrayView.lambda$init$2(realThis2, scriptable2);
                    default:
                        return NativeTypedArrayView.lambda$init$3(realThis2, scriptable2);
                }
            }
        }, 3);
        final int i5 = 19;
        lambdaConstructor.definePrototypeMethod(scriptable, "at", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i6 = i5;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i6) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i6 = 20;
        lambdaConstructor.definePrototypeMethod(scriptable, "copyWithin", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i6;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i7 = 21;
        lambdaConstructor.definePrototypeMethod(scriptable, "entries", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i7;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i8 = 22;
        lambdaConstructor.definePrototypeMethod(scriptable, "every", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i8;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i9 = 23;
        lambdaConstructor.definePrototypeMethod(scriptable, "fill", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i9;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i10 = 24;
        lambdaConstructor.definePrototypeMethod(scriptable, "filter", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i10;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i11 = 18;
        lambdaConstructor.definePrototypeMethod(scriptable, "find", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i11;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i12 = 25;
        lambdaConstructor.definePrototypeMethod(scriptable, "findIndex", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i12;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i13 = 26;
        lambdaConstructor.definePrototypeMethod(scriptable, "findLast", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i13;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i14 = 27;
        lambdaConstructor.definePrototypeMethod(scriptable, "findLastIndex", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i14;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i15 = 28;
        lambdaConstructor.definePrototypeMethod(scriptable, "forEach", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i15;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i16 = 29;
        lambdaConstructor.definePrototypeMethod(scriptable, "includes", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i16;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "indexOf", 1, new Callable() { // from class: j27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i17 = i3;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i17) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$16(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$17(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "join", 1, new Callable() { // from class: j27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i17 = i;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i17) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$16(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$17(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "keys", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i3;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "lastIndexOf", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "map", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i4;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        lambdaConstructor.definePrototypeMethod(scriptable, "reduce", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i2;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i17 = 4;
        lambdaConstructor.definePrototypeMethod(scriptable, "reduceRight", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i17;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i18 = 5;
        lambdaConstructor.definePrototypeMethod(scriptable, "reverse", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i18;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i19 = 6;
        lambdaConstructor.definePrototypeMethod(scriptable, "set", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i19;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i20 = 7;
        lambdaConstructor.definePrototypeMethod(scriptable, "slice", 2, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i20;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i21 = 8;
        lambdaConstructor.definePrototypeMethod(scriptable, "some", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i21;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i22 = 9;
        lambdaConstructor.definePrototypeMethod(scriptable, "sort", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i22;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i23 = 10;
        lambdaConstructor.definePrototypeMethod(scriptable, "subarray", 2, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i23;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i24 = 11;
        lambdaConstructor.definePrototypeMethod(scriptable, "toLocaleString", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i24;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i25 = 12;
        lambdaConstructor.definePrototypeMethod(scriptable, "toReversed", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i25;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i26 = 13;
        lambdaConstructor.definePrototypeMethod(scriptable, "toSorted", 1, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i26;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i27 = 14;
        lambdaConstructor.definePrototypeMethod(scriptable, "toString", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i27;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i28 = 15;
        lambdaConstructor.definePrototypeMethod(scriptable, "values", 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i28;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i29 = 16;
        lambdaConstructor.definePrototypeMethod(scriptable, "with", 2, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i29;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
        final int i30 = 17;
        lambdaConstructor.definePrototypeMethod(scriptable, SymbolKey.ITERATOR, 0, new Callable() { // from class: h27
            @Override // org.mozilla.javascript.Callable
            public final Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                int i62 = i30;
                NativeTypedArrayView.RealThis realThis2 = realThis;
                switch (i62) {
                    case 0:
                        return NativeTypedArrayView.lambda$init$18(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 1:
                        return NativeTypedArrayView.lambda$init$19(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 2:
                        return NativeTypedArrayView.lambda$init$20(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 3:
                        return NativeTypedArrayView.lambda$init$21(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 4:
                        return NativeTypedArrayView.lambda$init$22(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 5:
                        return NativeTypedArrayView.lambda$init$23(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 6:
                        return NativeTypedArrayView.lambda$init$24(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 7:
                        return NativeTypedArrayView.lambda$init$25(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 8:
                        return NativeTypedArrayView.lambda$init$26(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 9:
                        return NativeTypedArrayView.lambda$init$27(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 10:
                        return NativeTypedArrayView.lambda$init$28(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 11:
                        return NativeTypedArrayView.lambda$init$29(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 12:
                        return NativeTypedArrayView.lambda$init$30(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 13:
                        return NativeTypedArrayView.lambda$init$31(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 14:
                        return NativeTypedArrayView.lambda$init$32(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 15:
                        return NativeTypedArrayView.lambda$init$33(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 16:
                        return NativeTypedArrayView.lambda$init$34(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 17:
                        return NativeTypedArrayView.lambda$init$35(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 18:
                        return NativeTypedArrayView.lambda$init$10(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 19:
                        return NativeTypedArrayView.lambda$init$4(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 20:
                        return NativeTypedArrayView.lambda$init$5(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 21:
                        return NativeTypedArrayView.lambda$init$6(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 22:
                        return NativeTypedArrayView.lambda$init$7(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 23:
                        return NativeTypedArrayView.lambda$init$8(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 24:
                        return NativeTypedArrayView.lambda$init$9(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 25:
                        return NativeTypedArrayView.lambda$init$11(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 26:
                        return NativeTypedArrayView.lambda$init$12(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 27:
                        return NativeTypedArrayView.lambda$init$13(realThis2, context2, scriptable2, scriptable3, objArr);
                    case 28:
                        return NativeTypedArrayView.lambda$init$14(realThis2, context2, scriptable2, scriptable3, objArr);
                    default:
                        return NativeTypedArrayView.lambda$init$15(realThis2, context2, scriptable2, scriptable3, objArr);
                }
            }
        }, 2, 3);
    }

    private static Object js_at(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        long integer = objArr.length >= 1 ? (long) ScriptRuntime.toInteger(objArr[0]) : 0L;
        if (integer < 0) {
            integer += (long) nativeTypedArrayViewRealThis.length;
        }
        return (integer < 0 || integer >= ((long) nativeTypedArrayViewRealThis.length)) ? Undefined.instance : ScriptableObject.getProperty(scriptable2, (int) integer);
    }

    private static Object js_buffer(Scriptable scriptable, RealThis realThis) {
        return realThis.realThis(scriptable).arrayBuffer;
    }

    private static Object js_byteLength(Scriptable scriptable, RealThis realThis) {
        return Integer.valueOf(realThis.realThis(scriptable).byteLength);
    }

    private static Object js_byteOffset(Scriptable scriptable, RealThis realThis) {
        return Integer.valueOf(realThis.realThis(scriptable).offset);
    }

    public static NativeTypedArrayView<?> js_constructor(Context context, Scriptable scriptable, Object[] objArr, TypedArrayConstructable typedArrayConstructable, int i) {
        if (!NativeArrayBufferView.isArg(objArr, 0)) {
            return typedArrayConstructable.construct(new NativeArrayBuffer(), 0, 0);
        }
        Object obj = objArr[0];
        if (obj == null) {
            return typedArrayConstructable.construct(new NativeArrayBuffer(), 0, 0);
        }
        if ((obj instanceof Number) || (obj instanceof String)) {
            int int32 = ScriptRuntime.toInt32(obj);
            return typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, int32, i), 0, int32);
        }
        if (obj instanceof NativeTypedArrayView) {
            NativeTypedArrayView nativeTypedArrayView = (NativeTypedArrayView) obj;
            NativeTypedArrayView<?> nativeTypedArrayViewConstruct = typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, nativeTypedArrayView.length, i), 0, nativeTypedArrayView.length);
            while (int32 < nativeTypedArrayView.length) {
                nativeTypedArrayViewConstruct.js_set(int32, nativeTypedArrayView.js_get(int32));
                int32++;
            }
            return nativeTypedArrayViewConstruct;
        }
        if (obj instanceof NativeArrayBuffer) {
            NativeArrayBuffer nativeArrayBuffer = (NativeArrayBuffer) obj;
            int32 = NativeArrayBufferView.isArg(objArr, 1) ? ScriptRuntime.toInt32(objArr[1]) : 0;
            int int322 = NativeArrayBufferView.isArg(objArr, 2) ? ScriptRuntime.toInt32(objArr[2]) * i : nativeArrayBuffer.getLength() - int32;
            if (int32 < 0 || int32 > nativeArrayBuffer.getLength()) {
                throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset", Integer.valueOf(int32)));
            }
            if (int322 < 0 || int32 + int322 > nativeArrayBuffer.getLength()) {
                throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.length", Integer.valueOf(int322)));
            }
            if (int32 % i != 0) {
                throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset.byte.size", Integer.valueOf(int32), Integer.valueOf(i)));
            }
            if (int322 % i == 0) {
                return typedArrayConstructable.construct(nativeArrayBuffer, int32, int322 / i);
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.buffer.length.byte.size", Integer.valueOf(int322), Integer.valueOf(i)));
        }
        if (!(obj instanceof NativeArray)) {
            if (!ScriptRuntime.isArrayObject(obj)) {
                throw ScriptRuntime.constructError("Error", "invalid argument");
            }
            Object[] arrayElements = ScriptRuntime.getArrayElements((Scriptable) obj);
            NativeTypedArrayView<?> nativeTypedArrayViewConstruct2 = typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, arrayElements.length, i), 0, arrayElements.length);
            while (int32 < arrayElements.length) {
                nativeTypedArrayViewConstruct2.js_set(int32, arrayElements[int32]);
                int32++;
            }
            return nativeTypedArrayViewConstruct2;
        }
        NativeArray nativeArray = (NativeArray) obj;
        NativeTypedArrayView<?> nativeTypedArrayViewConstruct3 = typedArrayConstructable.construct(makeArrayBuffer(context, scriptable, nativeArray.size(), i), 0, nativeArray.size());
        while (int32 < nativeArray.size()) {
            Object obj2 = nativeArray.get(int32, nativeArray);
            if (obj2 == Scriptable.NOT_FOUND || obj2 == Undefined.instance) {
                nativeTypedArrayViewConstruct3.js_set(int32, ScriptRuntime.NaNobj);
            } else if (obj2 instanceof Wrapper) {
                nativeTypedArrayViewConstruct3.js_set(int32, ((Wrapper) obj2).unwrap());
            } else {
                nativeTypedArrayViewConstruct3.js_set(int32, obj2);
            }
            int32++;
        }
        return nativeTypedArrayViewConstruct3;
    }

    private static Object js_copyWithin(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        int i = 1;
        long integer = (long) ScriptRuntime.toInteger(objArr.length >= 1 ? objArr[0] : Undefined.instance);
        long jMax = integer < 0 ? Math.max(((long) nativeTypedArrayViewRealThis.length) + integer, 0L) : Math.min(integer, nativeTypedArrayViewRealThis.length);
        long integer2 = (long) ScriptRuntime.toInteger(objArr.length >= 2 ? objArr[1] : Undefined.instance);
        long jMax2 = integer2 < 0 ? Math.max(((long) nativeTypedArrayViewRealThis.length) + integer2, 0L) : Math.min(integer2, nativeTypedArrayViewRealThis.length);
        long integer3 = nativeTypedArrayViewRealThis.length;
        if (objArr.length >= 3 && !Undefined.isUndefined(objArr[2])) {
            integer3 = (long) ScriptRuntime.toInteger(objArr[2]);
        }
        int i2 = nativeTypedArrayViewRealThis.length;
        long jMin = Math.min((integer3 < 0 ? Math.max(((long) i2) + integer3, 0L) : Math.min(integer3, i2)) - jMax2, ((long) nativeTypedArrayViewRealThis.length) - jMax);
        if (jMax2 < jMax) {
            long j = jMax2 + jMin;
            if (jMax < j) {
                jMax2 = j - 1;
                jMax = (jMax + jMin) - 1;
                i = -1;
            }
        }
        while (jMin > 0) {
            nativeTypedArrayViewRealThis.js_set((int) jMax, nativeTypedArrayViewRealThis.js_get((int) jMax2));
            long j2 = i;
            jMax2 += j2;
            jMax += j2;
            jMin--;
        }
        return nativeTypedArrayViewRealThis;
    }

    private static NativeTypedArrayView<?> js_fill(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        long integer = objArr.length >= 2 ? (long) ScriptRuntime.toInteger(objArr[1]) : 0L;
        long jMax = integer < 0 ? Math.max(((long) nativeTypedArrayViewRealThis.length) + integer, 0L) : Math.min(integer, nativeTypedArrayViewRealThis.length);
        long integer2 = nativeTypedArrayViewRealThis.length;
        if (objArr.length >= 3 && !Undefined.isUndefined(objArr[2])) {
            integer2 = (long) ScriptRuntime.toInteger(objArr[2]);
        }
        int i = nativeTypedArrayViewRealThis.length;
        long jMax2 = integer2 < 0 ? Math.max(((long) i) + integer2, 0L) : Math.min(integer2, i);
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        for (int i2 = (int) jMax; i2 < jMax2; i2++) {
            nativeTypedArrayViewRealThis.js_set(i2, obj);
        }
        return nativeTypedArrayViewRealThis;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[PHI: r7
  0x0030: PHI (r7v7 long) = (r7v6 long), (r7v10 long) binds: [B:14:0x0025, B:16:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean js_includes(org.mozilla.javascript.Context r4, org.mozilla.javascript.Scriptable r5, org.mozilla.javascript.Scriptable r6, java.lang.Object[] r7, org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis r8) {
        /*
            org.mozilla.javascript.typedarrays.NativeTypedArrayView r4 = r8.realThis(r6)
            int r5 = r7.length
            if (r5 <= 0) goto Lb
            r5 = 0
            r5 = r7[r5]
            goto Ld
        Lb:
            java.lang.Object r5 = org.mozilla.javascript.Undefined.instance
        Ld:
            int r6 = r4.length
            if (r6 != 0) goto L14
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L14:
            int r6 = r7.length
            r8 = 2
            r0 = 0
            if (r6 >= r8) goto L1b
            goto L3c
        L1b:
            r6 = 1
            r7 = r7[r6]
            double r7 = org.mozilla.javascript.ScriptRuntime.toInteger(r7)
            long r7 = (long) r7
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L30
            int r2 = r4.length
            long r2 = (long) r2
            long r7 = r7 + r2
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L30
            goto L31
        L30:
            r0 = r7
        L31:
            int r7 = r4.length
            int r7 = r7 - r6
            long r6 = (long) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L3c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3c:
            int r6 = (int) r0
        L3d:
            int r7 = r4.length
            if (r6 >= r7) goto L51
            java.lang.Object r7 = r4.js_get(r6)
            boolean r7 = org.mozilla.javascript.ScriptRuntime.sameZero(r7, r5)
            if (r7 == 0) goto L4e
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L4e:
            int r6 = r6 + 1
            goto L3d
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.typedarrays.NativeTypedArrayView.js_includes(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.typedarrays.NativeTypedArrayView$RealThis):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[PHI: r3
  0x0033: PHI (r3v2 long) = (r3v1 long), (r3v3 long) binds: [B:13:0x0028, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[PHI: r1
  0x003d: PHI (r1v1 long) = (r1v0 long), (r1v3 long) binds: [B:10:0x001b, B:19:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object js_indexOf(org.mozilla.javascript.Context r7, org.mozilla.javascript.Scriptable r8, org.mozilla.javascript.Scriptable r9, java.lang.Object[] r10, org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis r11) {
        /*
            r7 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            org.mozilla.javascript.typedarrays.NativeTypedArrayView r8 = r11.realThis(r9)
            int r9 = r10.length
            if (r9 <= 0) goto L10
            r9 = 0
            r9 = r10[r9]
            goto L12
        L10:
            java.lang.Object r9 = org.mozilla.javascript.Undefined.instance
        L12:
            int r11 = r8.length
            if (r11 != 0) goto L17
            goto L59
        L17:
            int r11 = r10.length
            r0 = 2
            r1 = 0
            if (r11 >= r0) goto L1e
            goto L3d
        L1e:
            r11 = 1
            r10 = r10[r11]
            double r3 = org.mozilla.javascript.ScriptRuntime.toInteger(r10)
            long r3 = (long) r3
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L33
            int r10 = r8.length
            long r5 = (long) r10
            long r3 = r3 + r5
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L33
            goto L34
        L33:
            r1 = r3
        L34:
            int r10 = r8.length
            int r10 = r10 - r11
            long r10 = (long) r10
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 <= 0) goto L3d
            goto L59
        L3d:
            int r10 = (int) r1
        L3e:
            int r11 = r8.length
            if (r10 >= r11) goto L59
            java.lang.Object r11 = r8.js_get(r10)
            java.lang.Object r0 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r11 == r0) goto L56
            boolean r11 = org.mozilla.javascript.ScriptRuntime.shallowEq(r11, r9)
            if (r11 == 0) goto L56
            long r7 = (long) r10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
        L56:
            int r10 = r10 + 1
            goto L3e
        L59:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.typedarrays.NativeTypedArrayView.js_indexOf(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.typedarrays.NativeTypedArrayView$RealThis):java.lang.Object");
    }

    private static String js_join(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        int i;
        Object obj;
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        String string = (objArr.length < 1 || (obj = objArr[0]) == Undefined.instance) ? "," : ScriptRuntime.toString(obj);
        int i2 = nativeTypedArrayViewRealThis.length;
        if (i2 == 0) {
            return "";
        }
        String[] strArr = new String[i2];
        int i3 = 0;
        int length = 0;
        while (true) {
            i = nativeTypedArrayViewRealThis.length;
            if (i3 == i) {
                break;
            }
            Object objJs_get = nativeTypedArrayViewRealThis.js_get(i3);
            if (objJs_get != null && objJs_get != Undefined.instance) {
                String string2 = ScriptRuntime.toString(objJs_get);
                length += string2.length();
                strArr[i3] = string2;
            }
            i3++;
        }
        StringBuilder sb = new StringBuilder((string.length() * (i - 1)) + length);
        for (int i4 = 0; i4 != nativeTypedArrayViewRealThis.length; i4++) {
            if (i4 != 0) {
                sb.append(string);
            }
            String str = strArr[i4];
            if (str != null) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    private static Object js_lastIndexOf(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        long integer;
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        int i = nativeTypedArrayViewRealThis.length;
        if (i != 0) {
            if (objArr.length < 2) {
                integer = ((long) i) - 1;
            } else {
                integer = (long) ScriptRuntime.toInteger(objArr[1]);
                long j = nativeTypedArrayViewRealThis.length;
                if (integer >= j) {
                    integer = j - 1;
                } else if (integer < 0) {
                    integer += j;
                }
                if (integer >= 0) {
                }
            }
            for (int i2 = (int) integer; i2 >= 0; i2--) {
                Object objJs_get = nativeTypedArrayViewRealThis.js_get(i2);
                if (objJs_get != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(objJs_get, obj)) {
                    return Long.valueOf(i2);
                }
            }
        }
        return -1;
    }

    private static Object js_length(Scriptable scriptable, RealThis realThis) {
        return Integer.valueOf(realThis.realThis(scriptable).length);
    }

    private static NativeTypedArrayView<?> js_reverse(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        int i = 0;
        for (int i2 = nativeTypedArrayViewRealThis.length - 1; i < i2; i2--) {
            Object objJs_get = nativeTypedArrayViewRealThis.js_get(i);
            nativeTypedArrayViewRealThis.js_set(i, nativeTypedArrayViewRealThis.js_get(i2));
            nativeTypedArrayViewRealThis.js_set(i2, objJs_get);
            i++;
        }
        return nativeTypedArrayViewRealThis;
    }

    private static Object js_set(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof NativeTypedArrayView) {
                nativeTypedArrayViewRealThis.setRange((NativeTypedArrayView<?>) objArr[0], NativeArrayBufferView.isArg(objArr, 1) ? ScriptRuntime.toInt32(objArr[1]) : 0);
                return Undefined.instance;
            }
            if (obj instanceof NativeArray) {
                nativeTypedArrayViewRealThis.setRange((NativeArray) objArr[0], NativeArrayBufferView.isArg(objArr, 1) ? ScriptRuntime.toInt32(objArr[1]) : 0);
                return Undefined.instance;
            }
            if (obj instanceof Scriptable) {
                return Undefined.instance;
            }
            if (NativeArrayBufferView.isArg(objArr, 2)) {
                return nativeTypedArrayViewRealThis.js_set(ScriptRuntime.toInt32(objArr[0]), objArr[1]);
            }
        }
        throw ScriptRuntime.constructError("Error", "invalid arguments");
    }

    private static Scriptable js_slice(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        long sliceIndex;
        long sliceIndex2;
        Object obj;
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        if (objArr.length == 0) {
            sliceIndex2 = nativeTypedArrayViewRealThis.length;
            sliceIndex = 0;
        } else {
            sliceIndex = ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(objArr[0]), nativeTypedArrayViewRealThis.length);
            sliceIndex2 = (objArr.length == 1 || (obj = objArr[1]) == Undefined.instance) ? nativeTypedArrayViewRealThis.length : ArrayLikeAbstractOperations.toSliceIndex(ScriptRuntime.toInteger(obj), nativeTypedArrayViewRealThis.length);
        }
        long j = sliceIndex2 - sliceIndex;
        if (j > 2147483647L) {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.arraylength.bad", new Object[0]));
        }
        Math.max(j, 0L);
        return nativeTypedArrayViewRealThis.typedArraySpeciesCreate(context, scriptable, new Object[]{nativeTypedArrayViewRealThis.arrayBuffer, Long.valueOf(sliceIndex * ((long) nativeTypedArrayViewRealThis.getBytesPerElement())), Long.valueOf(Math.max(0L, j))}, "slice");
    }

    private static Scriptable js_sort(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        if (NativeArrayBufferView.isArg(objArr, 0) && !(objArr[0] instanceof Callable)) {
            throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
        }
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        Object[] objArrSortTemporaryArray = nativeTypedArrayViewRealThis.sortTemporaryArray(context, scriptable, objArr);
        for (int i = 0; i < nativeTypedArrayViewRealThis.length; i++) {
            nativeTypedArrayViewRealThis.js_set(i, objArrSortTemporaryArray[i]);
        }
        return nativeTypedArrayViewRealThis;
    }

    private static Object js_subarray(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        int int32 = NativeArrayBufferView.isArg(objArr, 0) ? ScriptRuntime.toInt32(objArr[0]) : 0;
        int int322 = NativeArrayBufferView.isArg(objArr, 1) ? ScriptRuntime.toInt32(objArr[1]) : nativeTypedArrayViewRealThis.length;
        if (context.getLanguageVersion() < 200 && objArr.length <= 0) {
            throw ScriptRuntime.constructError("Error", "invalid arguments");
        }
        if (int32 < 0) {
            int32 += nativeTypedArrayViewRealThis.length;
        }
        if (int322 < 0) {
            int322 += nativeTypedArrayViewRealThis.length;
        }
        int iMax = Math.max(0, int32);
        return context.newObject(scriptable, nativeTypedArrayViewRealThis.getClassName(), new Object[]{nativeTypedArrayViewRealThis.arrayBuffer, Integer.valueOf(Math.min((nativeTypedArrayViewRealThis.getBytesPerElement() * iMax) + nativeTypedArrayViewRealThis.getByteOffset(), nativeTypedArrayViewRealThis.arrayBuffer.getLength())), Integer.valueOf(Math.max(0, Math.min(nativeTypedArrayViewRealThis.length, int322) - iMax))});
    }

    private static Object js_toReversed(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        int i = 0;
        Scriptable scriptableNewObject = context.newObject(scriptable, nativeTypedArrayViewRealThis.getClassName(), new Object[]{new NativeArrayBuffer(nativeTypedArrayViewRealThis.getBytesPerElement() * nativeTypedArrayViewRealThis.length), 0, Integer.valueOf(nativeTypedArrayViewRealThis.length), Integer.valueOf(nativeTypedArrayViewRealThis.getBytesPerElement())});
        while (true) {
            if (i >= nativeTypedArrayViewRealThis.length) {
                return scriptableNewObject;
            }
            scriptableNewObject.put(i, scriptableNewObject, nativeTypedArrayViewRealThis.js_get((r5 - i) - 1));
            i++;
        }
    }

    private static Object js_toSorted(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        Object[] objArrSortTemporaryArray = nativeTypedArrayViewRealThis.sortTemporaryArray(context, scriptable, objArr);
        Scriptable scriptableNewObject = context.newObject(scriptable, nativeTypedArrayViewRealThis.getClassName(), new Object[]{new NativeArrayBuffer(nativeTypedArrayViewRealThis.getBytesPerElement() * nativeTypedArrayViewRealThis.length), 0, Integer.valueOf(nativeTypedArrayViewRealThis.length), Integer.valueOf(nativeTypedArrayViewRealThis.getBytesPerElement())});
        for (int i = 0; i < nativeTypedArrayViewRealThis.length; i++) {
            scriptableNewObject.put(i, scriptableNewObject, objArrSortTemporaryArray[i]);
        }
        return scriptableNewObject;
    }

    private static String js_toString(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis, boolean z) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        StringBuilder sb = new StringBuilder();
        if (nativeTypedArrayViewRealThis.length > 0) {
            sb.append(ScriptRuntime.toString(nativeTypedArrayViewRealThis.getElemForToString(context, scriptable, 0, z)));
        }
        for (int i = 1; i < nativeTypedArrayViewRealThis.length; i++) {
            sb.append(',');
            sb.append(ScriptRuntime.toString(nativeTypedArrayViewRealThis.getElemForToString(context, scriptable, i, z)));
        }
        return sb.toString();
    }

    private static Object js_with(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, RealThis realThis) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        long integer = objArr.length > 0 ? (int) ScriptRuntime.toInteger(objArr[0]) : 0L;
        long j = integer >= 0 ? integer : ((long) nativeTypedArrayViewRealThis.length) + integer;
        Double dValueOf = Double.valueOf(objArr.length > 1 ? ScriptRuntime.toNumber(objArr[1]) : 0.0d);
        if (j >= 0) {
            if (j < nativeTypedArrayViewRealThis.length) {
                Scriptable scriptableNewObject = context.newObject(scriptable, nativeTypedArrayViewRealThis.getClassName(), new Object[]{new NativeArrayBuffer(nativeTypedArrayViewRealThis.getBytesPerElement() * r12), 0, Integer.valueOf(nativeTypedArrayViewRealThis.length), Integer.valueOf(nativeTypedArrayViewRealThis.getBytesPerElement())});
                for (int i = 0; i < nativeTypedArrayViewRealThis.length; i++) {
                    scriptableNewObject.put(i, scriptableNewObject, ((long) i) == j ? dValueOf : nativeTypedArrayViewRealThis.js_get(i));
                }
                return scriptableNewObject;
            }
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.index.out.of.bounds", Long.valueOf(integer), Integer.valueOf(nativeTypedArrayViewRealThis.length * (-1)), Integer.valueOf(nativeTypedArrayViewRealThis.length - 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$0(RealThis realThis, Scriptable scriptable) {
        return js_buffer(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$1(RealThis realThis, Scriptable scriptable) {
        return js_byteLength(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$10(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$11(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND_INDEX, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$12(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND_LAST, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$13(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FIND_LAST_INDEX, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$14(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FOR_EACH, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$15(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_includes(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$16(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_indexOf(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$17(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_join(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$18(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.KEYS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$19(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_lastIndexOf(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$2(RealThis realThis, Scriptable scriptable) {
        return js_byteOffset(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$20(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return realThis.realThis(scriptable2).typedArraySpeciesCreate(context, scriptable, new Object[]{ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.MAP, scriptable, scriptable2, objArr)}, "map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$21(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.reduceMethod(context, ArrayLikeAbstractOperations.ReduceOperation.REDUCE, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$22(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.reduceMethod(context, ArrayLikeAbstractOperations.ReduceOperation.REDUCE_RIGHT, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$23(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_reverse(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$24(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_set(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$25(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_slice(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$26(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.SOME, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$27(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_sort(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$28(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_subarray(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$29(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toString(context, scriptable, scriptable2, objArr, realThis, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$3(RealThis realThis, Scriptable scriptable) {
        return js_length(scriptable, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$30(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toReversed(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$31(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toSorted(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$32(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_toString(context, scriptable, scriptable2, objArr, realThis, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$33(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.VALUES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$34(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_with(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$35(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.VALUES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$4(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_at(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$5(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_copyWithin(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$6(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return new NativeArrayIterator(scriptable, realThis.realThis(scriptable2), NativeArrayIterator.ARRAY_ITERATOR_TYPE.ENTRIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$7(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.EVERY, scriptable, realThis.realThis(scriptable2), objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$8(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return js_fill(context, scriptable, scriptable2, objArr, realThis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$init$9(RealThis realThis, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        NativeTypedArrayView<?> nativeTypedArrayViewRealThis = realThis.realThis(scriptable2);
        return nativeTypedArrayViewRealThis.typedArraySpeciesCreate(context, scriptable, new Object[]{ArrayLikeAbstractOperations.iterativeMethod(context, ArrayLikeAbstractOperations.IterativeOperation.FILTER, scriptable, nativeTypedArrayViewRealThis, objArr)}, "filter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ double lambda$sortTemporaryArray$36(Object obj) {
        return ((Number) obj).doubleValue();
    }

    private static NativeArrayBuffer makeArrayBuffer(Context context, Scriptable scriptable, int i, int i2) {
        return (NativeArrayBuffer) context.newObject(scriptable, NativeArrayBuffer.CLASS_NAME, new Object[]{Double.valueOf(((double) i) * ((double) i2))});
    }

    private void setRange(NativeTypedArrayView<?> nativeTypedArrayView, int i) {
        int i2;
        if (i < 0 || i > (i2 = this.length)) {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset", Integer.valueOf(i)));
        }
        int i3 = nativeTypedArrayView.length;
        int i4 = 0;
        if (i3 > i2 - i) {
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.source.array", new Object[0]));
        }
        if (nativeTypedArrayView.arrayBuffer != this.arrayBuffer) {
            while (i4 < nativeTypedArrayView.length) {
                js_set(i4 + i, nativeTypedArrayView.js_get(i4));
                i4++;
            }
            return;
        }
        Object[] objArr = new Object[i3];
        for (int i5 = 0; i5 < nativeTypedArrayView.length; i5++) {
            objArr[i5] = nativeTypedArrayView.js_get(i5);
        }
        while (i4 < nativeTypedArrayView.length) {
            js_set(i4 + i, objArr[i4]);
            i4++;
        }
    }

    private Object[] sortTemporaryArray(Context context, Scriptable scriptable, Object[] objArr) {
        Comparator<Object> comparatorComparingDouble = (objArr.length <= 0 || Undefined.instance == objArr[0]) ? Comparator.comparingDouble(new g27()) : ArrayLikeAbstractOperations.getSortComparator(context, scriptable, objArr);
        Object[] array = toArray();
        Arrays.sort(array, comparatorComparingDouble);
        return array;
    }

    private static int toIndex(double d) {
        int i = (int) d;
        if (i != d || i < 0) {
            return -1;
        }
        return i;
    }

    private Scriptable typedArraySpeciesCreate(Context context, Scriptable scriptable, Object[] objArr, String str) {
        Scriptable scriptableConstruct = AbstractEcmaObjectOperations.speciesConstructor(context, this, ScriptRuntime.getExistingCtor(context, ScriptableObject.getTopLevelScope(scriptable), getClassName())).construct(context, scriptable, objArr);
        if (scriptableConstruct instanceof NativeTypedArrayView) {
            return scriptableConstruct;
        }
        throw ScriptRuntime.typeErrorById("msg.typed.array.ctor.incompatible", str);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean checkIndex(int i) {
        return i < 0 || i >= this.length;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        if (ScriptRuntime.canonicalNumericIndexString(str).isPresent()) {
            return;
        }
        super.delete(str);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NativeTypedArrayView)) {
            return false;
        }
        NativeTypedArrayView nativeTypedArrayView = (NativeTypedArrayView) obj;
        if (this.length != nativeTypedArrayView.length) {
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            if (!js_get(i).equals(nativeTypedArrayView.js_get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        int index;
        Optional<Double> optionalCanonicalNumericIndexString = ScriptRuntime.canonicalNumericIndexString(str);
        return (!optionalCanonicalNumericIndexString.isPresent() || (index = toIndex(optionalCanonicalNumericIndexString.get().doubleValue())) < 0) ? super.get(str, scriptable) : js_get(index);
    }

    @Override // org.mozilla.javascript.ExternalArrayData
    public Object getArrayElement(int i) {
        return js_get(i);
    }

    @Override // org.mozilla.javascript.ExternalArrayData
    public int getArrayLength() {
        return this.length;
    }

    public abstract int getBytesPerElement();

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        Object[] objArr = new Object[this.length];
        for (int i = 0; i < this.length; i++) {
            objArr[i] = Integer.valueOf(i);
        }
        return objArr;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        int index;
        Optional<Double> optionalCanonicalNumericIndexString = ScriptRuntime.canonicalNumericIndexString(str);
        return (!optionalCanonicalNumericIndexString.isPresent() || (index = toIndex(optionalCanonicalNumericIndexString.get().doubleValue())) < 0) ? super.has(str, scriptable) : !checkIndex(index);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int iHashCode = 0;
        for (int i = 0; i < this.length; i++) {
            iHashCode += js_get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (obj.equals(js_get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new NativeTypedArrayIterator(this, 0);
    }

    public abstract Object js_get(int i);

    public abstract Object js_set(int i, Object obj);

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (obj.equals(js_get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        if (!checkIndex(i)) {
            return new NativeTypedArrayIterator(this, i);
        }
        mn5.o();
        return null;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        Optional<Double> optionalCanonicalNumericIndexString = ScriptRuntime.canonicalNumericIndexString(str);
        if (!optionalCanonicalNumericIndexString.isPresent()) {
            super.put(str, scriptable, obj);
            return;
        }
        int index = toIndex(optionalCanonicalNumericIndexString.get().doubleValue());
        if (index >= 0) {
            js_set(index, obj);
        }
    }

    @Override // java.util.List
    public T remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.ExternalArrayData
    public void setArrayElement(int i, Object obj) {
        js_set(i, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public int size() {
        return this.length;
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public <U> U[] toArray(U[] uArr) {
        if (uArr.length < this.length) {
            uArr = (U[]) ((Object[]) Array.newInstance(uArr.getClass().getComponentType(), this.length));
        }
        for (int i = 0; i < this.length; i++) {
            try {
                uArr[i] = js_get(i);
            } catch (ClassCastException unused) {
                throw new ArrayStoreException();
            }
        }
        return uArr;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public NativeTypedArrayView(NativeArrayBuffer nativeArrayBuffer, int i, int i2, int i3) {
        super(nativeArrayBuffer, i, i3);
        this.length = i2;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i) {
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new NativeTypedArrayIterator(this, 0);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i, Scriptable scriptable, Object obj) {
        js_set(i, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i, Scriptable scriptable) {
        return js_get(i);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i, Scriptable scriptable) {
        return !checkIndex(i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.length];
        for (int i = 0; i < this.length; i++) {
            objArr[i] = js_get(i);
        }
        return objArr;
    }

    private void setRange(NativeArray nativeArray, int i) {
        if (i >= 0 && i <= this.length) {
            if (nativeArray.size() + i <= this.length) {
                Iterator it = nativeArray.iterator();
                while (it.hasNext()) {
                    js_set(i, it.next());
                    i++;
                }
                return;
            }
            throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.source.array", new Object[0]));
        }
        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.typed.array.bad.offset", Integer.valueOf(i)));
    }
}
