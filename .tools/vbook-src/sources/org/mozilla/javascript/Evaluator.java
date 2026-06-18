package org.mozilla.javascript;

import java.util.List;
import org.mozilla.javascript.ast.ScriptNode;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface Evaluator {
    void captureStackInfo(RhinoException rhinoException);

    Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z);

    Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2);

    Script createScriptObject(Object obj, Object obj2);

    String getPatchedStack(RhinoException rhinoException, String str);

    List<String> getScriptStack(RhinoException rhinoException);

    String getSourcePositionFromStack(Context context, int[] iArr);

    void setEvalScriptFlag(Script script);
}
