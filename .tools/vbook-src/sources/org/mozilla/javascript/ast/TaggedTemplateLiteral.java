package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class TaggedTemplateLiteral extends AstNode {
    private AstNode target;
    private AstNode templateLiteral;

    public TaggedTemplateLiteral() {
        this.type = Token.TAGGED_TEMPLATE_LITERAL;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public AstNode getTemplateLiteral() {
        return this.templateLiteral;
    }

    public void setTarget(AstNode astNode) {
        this.target = astNode;
        astNode.setParent(this);
    }

    public void setTemplateLiteral(AstNode astNode) {
        this.templateLiteral = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + this.target.toSource(0) + this.templateLiteral.toSource(0);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            this.templateLiteral.visit(nodeVisitor);
        }
    }

    public TaggedTemplateLiteral(int i) {
        super(i);
        this.type = Token.TAGGED_TEMPLATE_LITERAL;
    }

    public TaggedTemplateLiteral(int i, int i2) {
        super(i, i2);
        this.type = Token.TAGGED_TEMPLATE_LITERAL;
    }
}
