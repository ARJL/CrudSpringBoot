<h1>Add new Person form</h1>
<form action="" method="post" action="/persons/create">
    Name:
    <@spring.bind "person.name" />
    <#--<input type="text"  name="${spring.status.expression}"  value="${spring.status.value?default("")}" />-->
    <input type="text"  name="name"  value=" " />
    <br>
    <#--<#list spring.status.errorMessages as error> <b>${error}</b> <br> </#list>-->
    <br>

    <input type="submit" value="submit" />
</form>