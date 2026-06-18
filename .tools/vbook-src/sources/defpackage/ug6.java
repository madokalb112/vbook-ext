package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ug6 extends dj0 {
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final LinkedHashSet i = new LinkedHashSet();
    public final LinkedHashSet j = new LinkedHashSet();
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final LinkedHashSet o = new LinkedHashSet();
    public final LinkedHashSet p = new LinkedHashSet();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final LinkedHashSet s = new LinkedHashSet();
    public final LinkedHashSet t = new LinkedHashSet();
    public final LinkedHashSet u = new LinkedHashSet();
    public final LinkedHashSet v = new LinkedHashSet();
    public final LinkedHashSet w = new LinkedHashSet();
    public final LinkedHashSet x = new LinkedHashSet();
    public final LinkedHashSet y = new LinkedHashSet();
    public final LinkedHashSet z = new LinkedHashSet();

    @Override // defpackage.dj0
    public final Map j() {
        return y86.V(y86.V(super.j(), y86.P(new xl7("parameters", this.g), new xl7("parametersNot", this.h), new xl7("parametersCondition", null), new xl7("parameterCount", null), new xl7("parameterCountCondition", null), new xl7("typeParameters", this.i), new xl7("typeParametersNot", this.j), new xl7("exceptionTypes", this.k), new xl7("exceptionTypesNot", this.l), new xl7("genericExceptionTypes", this.m), new xl7("genericExceptionTypesNot", this.n), new xl7("genericParameters", this.o), new xl7("genericParametersNot", this.p), new xl7("isVarArgs", null), new xl7("isVarArgsNot", null), new xl7("parameterAnnotations", this.q), new xl7("parameterAnnotationsNot", this.r), new xl7("annotatedReturnType", this.s), new xl7("annotatedReturnTypeNot", this.t), new xl7("annotatedReceiverType", this.u), new xl7("annotatedReceiverTypeNot", this.v), new xl7("annotatedParameterTypes", this.w), new xl7("annotatedParameterTypesNot", this.x), new xl7("annotatedExceptionTypes", this.y), new xl7("annotatedExceptionTypesNot", this.z))), y86.P(new xl7("returnType", null), new xl7("returnTypeCondition", null), new xl7("isBridge", null), new xl7("isBridgeNot", null), new xl7("isDefault", null), new xl7("isDefaultNot", null)));
    }

    public final List q() throws NoSuchFieldException, NoSuchMethodException {
        ie6 ie6Var = (ie6) this.a;
        if (ie6Var == null) {
            gp.l("You must provide a configuration to resolve the member use build(configuration).");
            return null;
        }
        List listO = ne6.o(this, ie6Var, ie6Var.a, new yq3(17, this, ie6Var));
        listO.getClass();
        return listO;
    }

    public final void r(Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = this.g;
        arrayList.getClass();
        List listAsList = Arrays.asList(objArrCopyOf);
        listAsList.getClass();
        arrayList.addAll(listAsList);
    }
}
