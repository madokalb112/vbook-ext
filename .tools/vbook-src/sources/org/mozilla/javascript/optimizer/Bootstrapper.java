package org.mozilla.javascript.optimizer;

import defpackage.x81;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.regex.Pattern;
import jdk.dynalink.CallSiteDescriptor;
import jdk.dynalink.DynamicLinker;
import jdk.dynalink.DynamicLinkerFactory;
import jdk.dynalink.linker.GuardingDynamicLinker;
import jdk.dynalink.linker.support.CompositeTypeBasedGuardingDynamicLinker;
import jdk.dynalink.support.ChainedCallSite;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class Bootstrapper {
    private static final DynamicLinker linker;
    private static final Pattern SEPARATOR = Pattern.compile(":");
    public static final x81 BOOTSTRAP_HANDLE = new x81();

    static {
        DynamicLinkerFactory dynamicLinkerFactory = new DynamicLinkerFactory();
        dynamicLinkerFactory.setPrioritizedLinkers(new GuardingDynamicLinker[]{new CompositeTypeBasedGuardingDynamicLinker(Arrays.asList(new ConstAwareLinker(), new BooleanLinker(), new IntegerLinker(), new DoubleLinker(), new StringLinker(), new ConsStringLinker(), new NativeArrayLinker(), new BaseFunctionLinker())), new DefaultLinker()});
        linker = dynamicLinkerFactory.createLinker();
    }

    public static CallSite bootstrap(MethodHandles.Lookup lookup, String str, MethodType methodType) throws NoSuchMethodException {
        return linker.link(new ChainedCallSite(new CallSiteDescriptor(lookup, parseOperation(str), methodType)));
    }

    private static String getNameSegment(String[] strArr, String str, int i) {
        return i >= strArr.length ? "" : strArr[i].intern();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static jdk.dynalink.Operation parseOperation(java.lang.String r20) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.Bootstrapper.parseOperation(java.lang.String):jdk.dynalink.Operation");
    }
}
