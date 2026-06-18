package org.mozilla.javascript;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ast.AstNode;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class c implements Parser.Transformer {
    public final /* synthetic */ IRFactory a;

    public /* synthetic */ c(IRFactory iRFactory) {
        this.a = iRFactory;
    }

    @Override // org.mozilla.javascript.Parser.Transformer
    public final Node transform(AstNode astNode) {
        return this.a.transform(astNode);
    }
}
