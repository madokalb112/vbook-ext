package org.mozilla.javascript.ast;

import defpackage.j39;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ArrayComprehensionLoop extends ForInLoop {
    public ArrayComprehensionLoop() {
    }

    @Override // org.mozilla.javascript.ast.Loop
    public AstNode getBody() {
        return null;
    }

    @Override // org.mozilla.javascript.ast.Loop
    public void setBody(AstNode astNode) {
        throw new UnsupportedOperationException("this node type has no body");
    }

    @Override // org.mozilla.javascript.ast.ForInLoop, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        String str = isForEach() ? "each " : "";
        String source = this.iterator.toSource(0);
        String str2 = isForOf() ? " of " : " in ";
        String source2 = this.iteratedObject.toSource(0);
        StringBuilder sb = new StringBuilder();
        sb.append(strMakeIndent);
        sb.append(" for ");
        sb.append(str);
        sb.append("(");
        sb.append(source);
        return j39.n(sb, str2, source2, ")");
    }

    @Override // org.mozilla.javascript.ast.ForInLoop, org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.iterator.visit(nodeVisitor);
            this.iteratedObject.visit(nodeVisitor);
        }
    }

    public ArrayComprehensionLoop(int i) {
        super(i);
    }

    public ArrayComprehensionLoop(int i, int i2) {
        super(i, i2);
    }
}
