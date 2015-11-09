<%@ page import="com.qb9.examen.Item" %>



<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'desc', 'error')} required">
	<label for="desc">
		<g:message code="item.desc.label" default="Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="desc" required="" value="${itemInstance?.desc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'valor', 'error')} required">
	<label for="valor">
		<g:message code="item.valor.label" default="Valor" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="valor" type="number" value="${itemInstance.valor}" required=""/>

</div>

