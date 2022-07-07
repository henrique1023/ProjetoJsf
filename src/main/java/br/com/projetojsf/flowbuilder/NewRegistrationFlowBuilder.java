package br.com.projetojsf.flowbuilder;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import java.io.Serializable;

public class NewRegistrationFlowBuilder implements Serializable {
    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
        String flowId = "newregistration";
        flowBuilder.id("",flowId);
        
        flowBuilder.viewNode(flowId,"/newregistration/newregistration.xhtml").markAsStartNode();
        flowBuilder.viewNode(flowId,"/newregistration/newregistration2.xhtml");
        flowBuilder.viewNode(flowId,"/newregistration/newregistration3.xhtml");

        flowBuilder.flowCallNode("callnewpendencies").flowReference("","newpendencies")
                .outboundParameter("userName", "#{testeFlowBuilderBean.nome}")
                .outboundParameter("userSurname", "#{testeFlowBuilderBean.sobrenome}");

        flowBuilder.switchNode("itempassado").switchCase()
                .condition("#{not empty testeFlowBuilderBean.nome and not empty testeFlowBuilderBean.sobrenome}")
                .fromOutcome("registration2");

        flowBuilder.returnNode("exitToInicio").fromOutcome("/inicioflow.xhtml");
        flowBuilder.finalizer("#{testeFlowBuilderBean.salvar()}");
        return flowBuilder.getFlow();
    }
}
