package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class GlobData {
    Scriptable arrayobj;
    StringBuilder charBuf;
    int dollar = -1;
    boolean global;
    Function lambda;
    int leftIndex;
    int mode;
    String repstr;
    String str;
}
